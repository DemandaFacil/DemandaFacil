/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.empresa;

import controllers.banco.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import models.usuario.Usuario;
import models.usuario.UsuarioDAO;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author akira
 */
public class EmpresaDAO {
    
    Connection con;

    public EmpresaDAO() {
        this.con = ConnectionFactory.getConnection();
    }

    
    public boolean create(Empresa empresa){
        
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String sqlEmpresa = "INSERT INTO Empresa (CNPJ, nome) VALUES (?,?)";
        String sqlQuery = "SELECT MAX(idEmpresa) id FROM Empresa WHERE CNPJ like concat(?,'%')";
        String sqlEmpresaUsuario = "INSERT INTO Empresa_has_Usuario (Empresa_idEmpresa, Usuario_idUsuario) VALUES (?,?)";
        
        try {
            stmt = con.prepareStatement(sqlEmpresa);
            stmt.setString(1, empresa.getCNPJ());
            stmt.setString(2, empresa.getNome());
            
            stmt.executeUpdate();
            
            int id;
            stmt = con.prepareStatement(sqlQuery);
            stmt.setString(1, empresa.getCNPJ());
            rs = stmt.executeQuery();
            rs.first();
            id = rs.getInt("id");
            empresa.setIdEmpresa(id);
            
            stmt = con.prepareStatement(sqlEmpresaUsuario);
            stmt.setInt(1, empresa.getIdEmpresa());
            stmt.setInt(2, empresa.getUsuario().getIdUsuario());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Criado com Sucesso!");
            return true;

        } catch (SQLException ex) {
            System.err.println("Erro ao Criar: "+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
    }
    
    
    public boolean delete(Empresa empresa){
        
        PreparedStatement stmt = null;
        String sqlEmpresa = "DELETE FROM Empresa WHERE idEmpresa = ?";
        String sqlEmpresaUsuario = "DELETE FROM Empresa_has_Usuario WHERE Empresa_idEmpresa = ?";
        
        try {
            stmt = con.prepareStatement(sqlEmpresa);
            stmt.setInt(1, empresa.getIdEmpresa());
            
            stmt.executeUpdate();
            
            stmt = con.prepareStatement(sqlEmpresaUsuario);
            stmt.setInt(1, empresa.getIdEmpresa());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Excluído com Sucesso!");
            return true;

        } catch (SQLException ex) {
            System.err.println("Erro ao Excluir: "+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void findEmpresa(String pesquisa, JTable tabela, Usuario usuario) {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT e.CNPJ, e.nome FROM Empresa e INNER JOIN Empresa_has_Usuario eu on e.idEmpresa = eu.Empresa_idEmpresa INNER JOIN Usuario u on eu.Usuario_idUsuario = u.idUsuario WHERE e.nome LIKE CONCAT('%',?, '%') AND u.idUsuario = ? GROUP BY idEmpresa, e.nome ASC";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, pesquisa);
            stmt.setInt(2, usuario.getIdUsuario());
            rs = stmt.executeQuery();
            tabela.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            System.err.println("Erro ao pesquisar empresas: "+ ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }
    
    public void findAll(JTable tabela, Usuario usuario){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT e.CNPJ, e.nome FROM Empresa e INNER JOIN Empresa_has_Usuario eu on e.idEmpresa = eu.Empresa_idEmpresa INNER JOIN Usuario u on eu.Usuario_idUsuario = u.idUsuario WHERE u.idUsuario = ? GROUP BY idEmpresa, e.nome ASC";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, usuario.getIdUsuario());
            rs = stmt.executeQuery();
            tabela.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException ex) {
            System.err.println("Erro ao pesquisar empresas: "+ ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }

    
    public boolean update(Empresa empresa){
        PreparedStatement stmt = null;
        String sql= "UPDATE Empresa SET nome = ? WHERE idEmpresa = ?";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, empresa.getNome());
            stmt.setInt(2, empresa.getIdEmpresa());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao Atualizar: "+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public boolean findCNPJ(String pesquisa) {
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT CNPJ FROM Empresa WHERE CNPJ LIKE '?'";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, pesquisa);
            rs = stmt.executeQuery();
            
            return rs.first();
        } catch (SQLException ex) {
            System.err.println("Erro ao pesquisar empresas: "+ ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return false;
    }

    public Empresa leEmpresaCNPJ(String cnpj) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Empresa empresa = new Empresa();
        try{
            stmt = con.prepareStatement("SELECT * FROM Empresa WHERE CNPJ like concat(?,'%')");
            stmt.setString(1, cnpj);
            rs = stmt.executeQuery();
            while(rs.next()){
                empresa.setIdEmpresa(rs.getInt(1));
                empresa.setCNPJ(rs.getString(2));
                empresa.setNome(rs.getString(3));
            }
            return empresa;
        }catch(SQLException ex){
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return null;
    }
    
    public Empresa leEmpresa(int id) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Empresa empresa = new Empresa();
        
        try{
            stmt = con.prepareStatement("SELECT * FROM Empresa WHERE idEmpresa = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while(rs.next()){
                empresa.setIdEmpresa(rs.getInt(1));
                empresa.setCNPJ(rs.getString(2));
                empresa.setNome(rs.getString(3));
            }
            
            return empresa;
        }catch(SQLException ex){
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return null;
    }
}

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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
        String sqlQuery = "SELECT MAX(idEmpresa) id FROM Empresa";
        String sqlEmpresaUsuario = "INSERT INTO Empresa_has_Usuario (Empresa_idEmpresa, Usuario_idUsuario) VALUES (?,?)";
        
        try {
            stmt = con.prepareStatement(sqlEmpresa);
            stmt.setString(1, empresa.getCNPJ());
            stmt.setString(2, empresa.getNome());
            
            stmt.executeUpdate();
            
            int id;
            stmt = con.prepareStatement(sqlQuery);
            rs = stmt.executeQuery();
            rs.first();
            id = rs.getInt("id");
            empresa.setIdEmpresa(id);

            /*stmt = con.prepareStatement(sqlEmpresaUsuario);
            stmt.setInt(1, empresa.getIdEmpresa());
            stmt.setInt(2, empresa.getUsuario().getIdUsuario());
            
            stmt.executeUpdate();*/
            
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
    
    public ResultSet findEmpresa(String pesquisa) {
        
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql;
        sql = "SELECT * FROM Empresa" 
               + "INNER JOIN Empresa_has_Usuario on Empresa.idEmpresa = Empresa_has_Usuario.Empresa_idEmpresa" 
               + "INNER JOIN Usuario on Usuario.idUsuario = Empresa_has_Usuario.Usuario_idUsuario" 
               + "WHERE Empresa.nome LIKE CONCAT('?', '%') AND Usuario.idUsuario = ?";
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, pesquisa);
            stmt.setInt(2, 2);
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            System.err.println("Erro ao pesquisar empresas: "+ ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return rs;
    }
    
    public List<Empresa> findAll(){
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql;
        sql = "SELECT Empresa.idEmpresa, Empresa.CNPJ, Empresa.nome FROM Empresa" 
               + "INNER JOIN Empresa_has_Usuario on Empresa.idEmpresa = Empresa_has_Usuario.Empresa_idEmpresa" 
               + "INNER JOIN Usuario on Usuario.idUsuario = Empresa_has_Usuario.Usuario_idUsuario" 
               + "WHERE Usuario.idUsuario = ?";
        List<Empresa> empresas = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, usuario.getIdUsuario());
            rs = stmt.executeQuery();
            
            saveInListEmpresas(rs, empresas);

        } catch (SQLException ex) {
            System.err.println("Erro: "+ ex);
        } finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return empresas;
    }

    private void saveInListEmpresas(ResultSet rs, List<Empresa> empresas) throws SQLException {
        while(rs.next()){
            Empresa empresa = new Empresa();
            empresa.setIdEmpresa(rs.getInt("idEmpresa"));
            empresa.setCNPJ(rs.getString("CNPJ"));
            empresa.setNome(rs.getString("nome"));
            
            empresas.add(empresa);
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
    
}

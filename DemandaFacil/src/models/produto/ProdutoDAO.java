/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.produto;

import controllers.banco.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import models.empresa.Empresa;
import models.empresa.EmpresaDAO;
import net.proteanit.sql.DbUtils;

/* *
 *  @author nicolas
 */
public class ProdutoDAO {
    
    Connection con;

    public ProdutoDAO() {
        this.con = ConnectionFactory.getConnection();
    }
    
    public boolean cadastraProduto(Produto produto){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sqlQuery = "SELECT MAX(idProduto) id FROM Produto WHERE nome like concat(?,'%')";
        String sql = "INSERT INTO Produto(idProduto, nome, periodo_de_reposicao, Empresa_idEmpresa) values(?,?,?,?)";
        try{
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, produto.getIdProduto());
            stmt.setString(2, produto.getNome());
            stmt.setInt(3, produto.getPeriodo_de_reposicao());
            stmt.setInt(4, produto.getEmpresa().getIdEmpresa());
            stmt.executeUpdate();
            
            int id;
            stmt = con.prepareStatement(sqlQuery);
            stmt.setString(1, produto.getNome());
            rs = stmt.executeQuery();
            rs.first();
            id = rs.getInt("id");
            produto.setIdProduto(id);
            
            return true;
        }catch(SQLException ex){
            System.err.println("Erro ao Criar: "+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }
    
    public boolean excluiProduto(Produto produto){
        PreparedStatement stmt = null;
        String sql = "DELETE from Produto WHERE idProduto = ?";
        try{            
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, produto.getIdProduto());
            stmt.executeUpdate();
            
            return true;
        }catch(SQLException ex){
            System.err.println("Erro ao Excluir: "+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public void procuraProduto(String nome, JTable jt, Empresa empresa){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT idProduto id, Produto.nome nome FROM Produto, Empresa WHERE Empresa_idEmpresa = ? AND Produto.nome like concat('%',?, '%') GROUP BY id";
        try{
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, empresa.getIdEmpresa());
            stmt.setString(2, nome);
            rs = stmt.executeQuery();
            jt.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(SQLException ex){
            System.out.println(ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }
    
    public Produto leProduto(int id){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Produto produto = new Produto();
        EmpresaDAO dao = new EmpresaDAO();
        try{
            stmt = con.prepareStatement("SELECT * FROM Produto WHERE idProduto = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while(rs.next()){
                produto.setIdProduto(rs.getInt(1));
                produto.setNome(rs.getString(2));
                produto.setEmpresa(dao.leEmpresa(rs.getInt(3)));
                produto.setPeriodo_de_reposicao(rs.getInt(4));
            }
            return produto;
        }catch(SQLException ex){
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return null;
    }
    
    public boolean update(Produto produto){
        PreparedStatement stmt = null;
        String sql= "UPDATE Produto SET nome = ? WHERE idProduto = ?";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getIdProduto());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao Atualizar: "+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.usuario;

import controllers.banco.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Matheus
 */
public class UsuarioDAO {
    
    Connection con;

    public UsuarioDAO() {
        this.con = ConnectionFactory.getConnection();
    }
    
    public boolean create (Usuario usuario){
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("INSERT INTO Usuario (nome, login, senha) values(?,?,?)");
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getLogin());
            stmt.setString(3, usuario.getSenha());
            stmt.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao Criar: "+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    public Usuario findUsuario(String login){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = new Usuario();
        try{
            stmt = con.prepareStatement("SELECT idUsuario, nome, login, senha FROM Usuario WHERE login = ?");
            stmt.setString(1, login);
            rs = stmt.executeQuery();
            while(rs.next()){
                usuario.setIdUsuario(rs.getInt(1)); // enviar pro objeto o valor do banco
                usuario.setNome(rs.getString(2));
                usuario.setLogin(rs.getString(3));
                usuario.setSenha(rs.getString(4));
            }
            return usuario;
        }catch(SQLException ex){
            System.err.println("Erro ao Encontrar Usuario: "+ ex);
            return null;
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }
    
    public Usuario leUsuario(int id){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = new Usuario();
        try{
            stmt = con.prepareStatement("SELECT idUsuario, nome, login, senha FROM Usuario WHERE idUsuario = ?");
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while(rs.next()){
                usuario.setIdUsuario(rs.getInt(1));
                usuario.setNome(rs.getString(2)); // enviar pro objeto o valor do banco
                usuario.setLogin(rs.getString(3));
                usuario.setSenha(rs.getString(4));
            }
            return usuario;
        }catch(SQLException ex){
            System.err.println("Erro ao ler: "+ ex);
            return usuario;
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }
    
    
    public boolean update(Usuario usuario){
        PreparedStatement stmt = null;
        String sql= "UPDATE Usuario SET nome = ?, login = ?, senha = ? WHERE idUsuario = ?";

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getLogin());
            stmt.setString(3, usuario.getSenha());
            stmt.setInt(4, usuario.getIdUsuario());
            
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
    
    
    public boolean delete(Usuario usuario){
        PreparedStatement stmt = null;
        try{
            stmt = con.prepareStatement("DELETE FROM Usuario WHERE idUsuario = ?");
            stmt.setInt(1, usuario.getIdUsuario());
            stmt.executeUpdate();
            
            return true;
        } catch (SQLException ex) {
            System.err.println("Erro ao Excluir: "+ ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
}


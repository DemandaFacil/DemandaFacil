/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Usuario;

import controllers.banco.ConnectionFactory;
import controllers.conexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import models.Usuario.Usuario;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author Matheus
 */
public class DAOUsuario {
    public boolean CriaUsuario (Usuario usuario){
        PreparedStatement p = null;
        try{
            Connection c = conexaoBanco.getConnection();
            p = c.prepareStatement("INSERT INTO usuario (nome, senha ) values(?,?)");
            p.setString(1, usuario.getNome());
            p.setString(2, usuario.getSenha());
            p.execute();
            ConnectionFactory.closeConnection(c, p);
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }    
    public Usuario leUsuario(String nome) throws Exception{
        PreparedStatement p = null;
        ResultSet rs = null;
        Usuario usuario = new Usuario();
        try{
            Connection c = ConnectionFactory.getConnection();
            p = c.prepareStatement("SELECT nome, senha FROM usuario WHERE nome = ?");
            p.setString(1, nome);
            rs = p.executeQuery();
            while(rs.next()){
                usuario.setNome(rs.getString(1)); // enviar pro objeto o valor do banco
                usuario.setSenha(rs.getString(2));
            }
            ConnectionFactory.closeConnection(c, p, rs);
            return usuario;
        }catch(Exception e){
            System.out.println(e);
            return usuario;
        }
    }
    public boolean atualizaUsuario(Usuario userAtual,String NovoNome,String NovaSenha) throws Exception{
        PreparedStatement p = null;
        ResultSet rs = null;
        int idAux = -1;
        try{
            Connection c = ConnectionFactory.getConnection();
            p = c.prepareStatement("SELECT idUsuario FROM usuario WHERE nome like ?"); //pega id do usuario com o nome atual do objeto
            p.setString(1, userAtual.getNome()); 
            rs = p.executeQuery();
            while(rs.next()){
                idAux = rs.getInt(1);
            }
            p = null;
            p = c.prepareStatement("UPDATE usuario SET nome = ?, senha = ? WHERE idUsuario = ?");
            p.setString(1, NovoNome);
            p.setString(2, NovaSenha);
            p.setInt(3, idAux);
            p.execute();
            ConnectionFactory.closeConnection(c, p, rs);
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    public boolean deletaUsuario(String nome) throws Exception{
        PreparedStatement p = null;
        try{
            Connection c = ConnectionFactory.getConnection();
            p = c.prepareStatement("DELETE FROM usuario WHERE nome like ?");
            p.setString(1,nome);
            p.execute();
            ConnectionFactory.closeConnection(c, p);
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    
    
}


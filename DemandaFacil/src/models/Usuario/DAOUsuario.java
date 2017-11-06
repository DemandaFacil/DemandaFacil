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
    
    
}


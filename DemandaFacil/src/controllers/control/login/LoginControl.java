/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.control.login;

import javax.swing.JOptionPane;
import models.usuario.Usuario;
import models.usuario.UsuarioDAO;
import views.core.Home;
/**
 *
 * @author akira
 */
public class LoginControl {
    
    private Usuario usuario;
    
    public boolean login(String login, String senha){
        UsuarioDAO dao = new UsuarioDAO();
        
        if(!login.isEmpty()){
            usuario = dao.findUsuario(login);
            if(usuario != null){
                setUsuario(usuario);
                if(checkLogin(login, senha)){
                    Home home = new Home();
                    home.setUsuario(getUsuario());
                    home.setVisible(true);
                    return true;
                }else{
                    JOptionPane.showMessageDialog(null, "Dados Inválidos! Tente Novamente.", "Erro Login", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Usuario Inválido! Tente Novamente.", "Erro Login", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Login Inválido! Tente Novamente.", "Erro Login", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    public boolean checkLogin(String login, String senha){
        return login.equals(getUsuario().getLogin()) && checkSenha(senha);
    }
    
    public boolean checkSenha(String senha){
        if(!senha.equals(getUsuario().getSenha())){
            JOptionPane.showMessageDialog(null, "Senha Inválida! Tente Novamente.", "Erro Login", JOptionPane.ERROR_MESSAGE);
        }
        return senha.equals(getUsuario().getSenha());
    }
    
    private Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}

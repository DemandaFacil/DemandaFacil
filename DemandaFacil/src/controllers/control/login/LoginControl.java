/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.control.login;

import javax.swing.JOptionPane;
import models.usuario.Usuario;
/**
 *
 * @author akira
 */
public class LoginControl {
    
    private Usuario usuario;
    
    public boolean login(String login, String senha){
        //UsuarioDAO dao = new UsuarioDAO();
        //setUsuario(dao.findUsuario(login));
        if(!login.isEmpty()){
            if(checkLogin(login, senha)){
                //returnHome();
                return true;
            }else{
                //mensagemDadosInvalidos();
            }
        }else{
            //mensagemNomeInvalido();
        }
        return false;
    }
    
    public boolean checkLogin(String login, String senha){
        return login.equals(getUsuario().getLogin()) && checkSenha(senha);
    }
    
    public boolean checkSenha(String senha){
        if(!senha.equals(getUsuario().getSenha())){
            mensagemSenhaInvalida();
        }
        return senha.equals(getUsuario().getSenha());
    }
    
    public void mensagemSenhaInvalida(){
        JOptionPane.showMessageDialog(null, "Senha Inválida! Tente Novamente.");
    }

    private Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
}

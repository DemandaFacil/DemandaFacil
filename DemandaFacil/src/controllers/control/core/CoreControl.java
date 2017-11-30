/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.control.core;

import models.usuario.Usuario;
import views.core.Home;
import views.core.Login;
import views.empresa.ListaDeEmpresas;
import views.usuario.PerfilUsuario;

/**
 *
 * @author akira
 */
public class CoreControl {

    private Usuario usuario;

    public CoreControl() {
    }
    
    public CoreControl(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public void returnHome(){
        Home home = new Home();
        home.setUsuario(usuario);
        home.setVisible(true);
    }
    
    public void returnPerfil(){
        PerfilUsuario perfilUsuario = new PerfilUsuario();
        perfilUsuario.setUsuario(usuario);
        perfilUsuario.setVisible(true);
    }
    
    public void returnEmpresas(){
        ListaDeEmpresas listaEmpresas = new ListaDeEmpresas();
        listaEmpresas.setUsuario(usuario);
        listaEmpresas.setVisible(true);
    }
    
    public void returnLogin(){
        Login login = new Login();
        login.setVisible(true);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.empresa;

import models.usuario.Usuario;

/**
 *
 * @author akira
 */
public class Empresa {
    
    private int idEmpresa;
    private String nome;
    private String CNPJ;
    private Usuario usuario;
    
    
    public Empresa() {
    }
    
    
    public Empresa(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
    }

    
    public int getIdEmpresa() {
        return idEmpresa;
    }

    
    public void setIdEmpresa(int id) {
        this.idEmpresa = id;
    }

    
    public String getNome() {
        return nome;
    }
    

    public void setNome(String nome) {
        this.nome = nome;
    }
    

    public String getCNPJ() {
        return CNPJ;
    }
    

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}

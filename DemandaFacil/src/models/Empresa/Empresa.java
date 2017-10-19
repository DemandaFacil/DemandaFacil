/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.Empresa;

/**
 *
 * @author akira
 */
public class Empresa {
    
    private int id;
    private String nome;
    private String CNPJ;

    
    public Empresa() {
    }
    
    
    public Empresa(String nome, String CNPJ) {
        this.nome = nome;
        this.CNPJ = CNPJ;
    }

    
    public int getIdEmpresa() {
        return id;
    }

    
    public void setIdEmpresa(int id) {
        this.id = id;
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
    
    
}

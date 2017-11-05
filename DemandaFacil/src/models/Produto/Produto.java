/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author nicolas
 */
public class Produto {
    private int idProduto;
    private String nome;
    private int periodo_de_reposicao;

    public Produto(String nome, int periodo_de_reposicao) {
        this.nome = nome;
        this.periodo_de_reposicao = periodo_de_reposicao;
    }
    public Produto(){
    }
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeriodo_de_reposicao() {
        return periodo_de_reposicao;
    }

    public void setPeriodo_de_reposicao(int periodo_de_reposicao) {
        this.periodo_de_reposicao = periodo_de_reposicao;
    }
    
    
}

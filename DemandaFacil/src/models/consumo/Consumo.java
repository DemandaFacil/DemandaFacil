/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models.consumo;

import java.text.SimpleDateFormat;
import java.util.Date;
import models.produto.Produto;

/**
 *
 * @author akira
 */
public class Consumo {
    
    private int idConsumo;
    private int quantidade;
    private Date data;
    private String periodo;
    private Produto produto;

    public Consumo() {
        this.data = new Date();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getIdConsumo() {
        return idConsumo;
    }

    public void setIdConsumo(int idConsumo) {
        this.idConsumo = idConsumo;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    
    public void proximoPeriodo(){
        ConsumoDAO dao = new ConsumoDAO();
        setPeriodo(new SimpleDateFormat("MM/yyyy").format(data));
        if(dao.haveConsumo(produto)){
            if(dao.findPeriodoAnterior(produto) != null){
                int valor = Integer.parseInt(dao.findPeriodoAnterior(produto).substring(0, 2));
                valor = valor + produto.getPeriodo_de_reposicao();
                if(valor >= 12){
                    valor = valor % 12;
                    if(valor < 10){
                        setPeriodo("0"+ valor + "/");
                    }else{
                        setPeriodo(valor + "/");
                    }
                    int ano = Integer.parseInt(new SimpleDateFormat("yyyy").format(data)) + 1;
                    setPeriodo(getPeriodo() + ano);
                }else if(valor < 10){
                    setPeriodo("0"+ valor + "/" + new SimpleDateFormat("yyyy").format(data));
                }else{
                    setPeriodo(valor + "/" + new SimpleDateFormat("yyyy").format(data));
                }
            }
        }
    }

    public boolean periodoExato() {
        ConsumoDAO dao = new ConsumoDAO();
        proximoPeriodo();
        int proximo = Integer.parseInt(periodo.substring(0, 2));
        int proximoAno = Integer.parseInt(periodo.substring(3, 7));
        int atual = Integer.parseInt(new SimpleDateFormat("MM").format(data));
        int atualAno = Integer.parseInt(new SimpleDateFormat("yyyy").format(data));
        
        if(atual > proximo && atualAno < proximoAno){
            return false;
        }else if(atual >= proximo && atualAno == proximoAno){
            return true;
        }else if(atual < proximo && atualAno == proximoAno){
           return false;
        }else if(atual < proximo && atualAno > proximoAno){
            return true;
        }else{
            return false;
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.estimativa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author akira
 */
public class Consumo {
    private int quantidade;
    private Calendar data;

    public Consumo() {
        this.data = GregorianCalendar.getInstance();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
    
    public ArrayList<Consumo> buscaConsumosRecentes(ArrayList<Consumo> consumos, int tempo){
        ArrayList<Consumo> consumosRecentes = new ArrayList();
        for(int i = 1; i <= tempo; i++){
            consumosRecentes.add(consumos.get(consumos.size() - i));
        }
        return consumosRecentes;
    }
}

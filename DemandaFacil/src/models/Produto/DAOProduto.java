/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.conexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;

/* *
 *  @author nicolas
 */
public class DAOProduto {
    public boolean CadastraProduto(Produto produto) throws Exception{
        PreparedStatement p = null;
        try{
            Connection c = conexaoBanco.getConnection();
            p = c.prepareStatement("INSERT INTO produto(id, nome, periodo_de_reposicao) values(?,?,?)");
            p.setInt(1, produto.getIdProduto());
            p.setString(2, produto.getNome());
            p.setInt(3, produto.getPeriodo_de_reposicao());
            p.execute();
            c.close();
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    public boolean ExcluiProduto(Produto produto) throws Exception{
        PreparedStatement p = null;
        try{
            Connection c = conexaoBanco.getConnection();
            p = c.prepareStatement("DELETE from Produto WHERE id =(?);");
            p.setInt(1, produto.getIdProduto());
            p.execute();
            c.close();
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
}

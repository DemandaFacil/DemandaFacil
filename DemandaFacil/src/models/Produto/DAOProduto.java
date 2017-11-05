/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import controllers.banco.ConnectionFactory;
import controllers.conexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

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
    public void procuraProduto(String nome,JTable jt)throws Exception{
       PreparedStatement p = null;
       try{
           Connection c = ConnectionFactory.getConnection();
           p = c.prepareStatement("SELECT id, nome FROM Produto WHERE nome like ?");
           p.setString(1, nome);
           ResultSet rs = p.executeQuery();
           jt.setModel(DbUtils.resultSetToTableModel(rs));
           ConnectionFactory.closeConnection(c, p, rs);
       }catch(Exception e){
           System.out.println(e);
       }
    }
     public Produto leProduto(int id) throws Exception{
        PreparedStatement p = null;
        ResultSet rs = null;
        Produto prod = new Produto();
        try{
            Connection c = ConnectionFactory.getConnection();
            p = c.prepareStatement("SELECT descricao,preco FROM produto WHERE idProduto = ?");
            p.setInt(1, id);
            rs = p.executeQuery();
            while(rs.next()){
                prod.setNome(rs.getString(1)); // enviar pro objeto o valor do banco
                prod.setPeriodo_de_reposicao(rs.getInt(2));
            }
            ConnectionFactory.closeConnection(c, p, rs);
            return prod;
        }catch(Exception e){
            System.out.println(e);
            return prod;
        }
    }
}

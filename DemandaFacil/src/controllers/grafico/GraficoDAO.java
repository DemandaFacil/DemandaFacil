package controllers.grafico;

import controllers.banco.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GraficoDAO {
    Connection con;
    
    public GraficoDAO(){
        this.con = ConnectionFactory.getConnection();
    }
    
    public String procuraNomeProduto(int id){
       PreparedStatement stmt = null;
       ResultSet rs = null;
       String nomeProduto = null;
       String sql = "select p.nome as nome from Produto p join Consumo c on(p.idProduto = c.Produto_idProduto) where c.Produto_idProduto = "+id;
        try{
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            while(rs.next()){
                nomeProduto = rs.getString("nome");
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return nomeProduto;
    }
    
    public int getIdProduto(String nomeProduto){
       PreparedStatement stmt = null;
       ResultSet rs = null;
       int id=0;
       String query = "SELECT c.Produto_idProduto FROM Consumo c JOIN Produto p where p.nome = '"+nomeProduto+"' ";
       try{
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
            while(rs.next()){
                id = rs.getInt("Produto_idProduto");
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return id;
    }
    
}

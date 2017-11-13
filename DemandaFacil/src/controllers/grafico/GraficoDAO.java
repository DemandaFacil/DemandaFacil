package controllers.grafico;

import controllers.banco.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class GraficoDAO {
    Connection con;
    
    public GraficoDAO(){
        this.con = ConnectionFactory.getConnection();
    }
    
    public String procuraNomeProduto(int id){
       PreparedStatement stmt = null;
       ResultSet rs = null;
       String nomeProduto = null;
       String sql = "select p.nome as nome from produto p join consumo c on(p.idProduto = c.Produto_idProduto) where c.Produto_idProduto = "+id;
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
    
}

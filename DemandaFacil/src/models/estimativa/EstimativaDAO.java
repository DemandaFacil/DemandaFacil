
package models.estimativa;

import controllers.banco.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import models.empresa.Empresa;

public class EstimativaDAO {
   Connection con; 
   
   public EstimativaDAO(){
       this.con = ConnectionFactory.getConnection();
   }
   
   public void insert(Estimativas estimativa){
        
        ResultSet rs = null;
        PreparedStatement stmt = null;
        String sqlEstimativa = "INSERT INTO estimativa (data, Produto_idProduto,valorCalculado) VALUES (?,?,?)";
        try {
            stmt = con.prepareStatement(sqlEstimativa);
            stmt.setString(1, estimativa.getData());
            stmt.setInt(2, estimativa.getProduto_IdProduto());
            stmt.setDouble(3, estimativa.getValorCalculado());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Salvar no Banco: "+ ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
    }
   
   
   
}

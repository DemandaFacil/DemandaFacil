package controllers.grafico;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.jfree.ui.RefineryUtilities;


public class Main {
    
    public static void main( String[ ] args ) throws SQLException {
       
       //NÃO DELETAR
      /*ConexaoDB db = new ConexaoDB();
      Connection conn = db.getConnection();
      
      //Gambiarra pra rodar buscando a quantidade do produto e suas respectivas datas
      int n = 4;
      int qtde1[] = new int[n];
      String sql = "select * from consumo where Produto_idProduto= 1 and data = '2017-10-10'";
        int x;
        try{
           PreparedStatement cmd = conn.prepareStatement(sql);
           ResultSet rs = cmd.executeQuery();
           while(rs.next()){
               x = rs.getInt("quantidade");
               qtde1[0] = x;
           }
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Não foi encontrado nenhuma classe!"+ex);
        }
        
        String sql2 = "select * from consumo where Produto_idProduto= 1 and data = '2017-10-11'";
        int x2;
        try{
           PreparedStatement cmd = conn.prepareStatement(sql2);
           ResultSet rs = cmd.executeQuery();
           while(rs.next()){
               x2 = rs.getInt("quantidade");
               qtde1[1] = x2;
           }
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Não foi encontrado nenhuma classe!"+ex);
        }
        
        String sql3 = "select * from consumo where Produto_idProduto= 1 and data = '2017-10-12'";
        int x3;
        try{
           PreparedStatement cmd = conn.prepareStatement(sql3);
           ResultSet rs = cmd.executeQuery();
           while(rs.next()){
               x3 = rs.getInt("quantidade");
               qtde1[2] = x3;
           }
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Não foi encontrado nenhuma classe!"+ex);
        }
        String sql4 = "select * from consumo where Produto_idProduto= 1 and data = '2017-10-09'";
        int x4;
        try{
           PreparedStatement cmd = conn.prepareStatement(sql4);
           ResultSet rs = cmd.executeQuery();
           while(rs.next()){
               x4 = rs.getInt("quantidade");
               qtde1[3] = x4;
           }
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Não foi encontrado nenhuma classe!"+ex);
        }
        
        
      int n1 = 4;
      int qtde2[] = new int[n1];
      String sql5 = "select * from consumo where Produto_idProduto= 4 and data = '2017-10-10'";
        int x5;
        try{
           PreparedStatement cmd = conn.prepareStatement(sql5);
           ResultSet rs = cmd.executeQuery();
           while(rs.next()){
               x5 = rs.getInt("quantidade");
               qtde2[0] = x5;
           }
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Não foi encontrado nenhuma classe!"+ex);
        }
        
        String sql6 = "select * from consumo where Produto_idProduto= 4 and data = '2017-10-11'";
        int x6;
        try{
           PreparedStatement cmd = conn.prepareStatement(sql6);
           ResultSet rs = cmd.executeQuery();
           while(rs.next()){
               x6 = rs.getInt("quantidade");
               qtde2[1] = x6;
           }
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Não foi encontrado nenhuma classe!"+ex);
        }
        
        String sql7 = "select * from consumo where Produto_idProduto= 4 and data = '2017-10-12'";
        int x7;
        try{
           PreparedStatement cmd = conn.prepareStatement(sql7);
           ResultSet rs = cmd.executeQuery();
           while(rs.next()){
               x7 = rs.getInt("quantidade");
               qtde2[2] = x7;
           }
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Não foi encontrado nenhuma classe!"+ex);
        }
        String sql8 = "select * from consumo where Produto_idProduto= 4 and data = '2017-10-09'";
        int x8;
        try{
           PreparedStatement cmd = conn.prepareStatement(sql8);
           ResultSet rs = cmd.executeQuery();
           while(rs.next()){
               x8 = rs.getInt("quantidade");
               qtde2[3] = x8;
           }
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Não foi encontrado nenhuma classe!"+ex);
        }  
      db.closeConnection();
      
      //Chama a classe do grafíco informando o vetor de quantidades e o inicio e fim do período para plotar no gráfico
      //Aqui no caso utilizei de 1 a 4...sendo referente de Janeiro a Abril...achei mais facil trabalhar com inteiros
      Grafico graf = new Grafico(qtde1,qtde2,1,4);
      //Cria os dados das qtdes informadas
      graf.criaDados();
      //Cria os dados do consumo
      graf.criaDados2();
           
      //Aqui cria o frame mostrando o gráfico plotado
      JFrame frame = new JFrame("Estimativas");
      frame.add(graf.getPanel());
      //frame.add(graf2.getPanel());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);*/
      
     Teste teste = new Teste();
     teste.setVisible(true);

     
   }
           
}


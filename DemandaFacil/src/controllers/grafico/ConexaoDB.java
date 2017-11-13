package controllers.grafico;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexaoDB {
    
    public Connection conn;
    
    public ConexaoDB() {
        conn = null;        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_DemandaFacil","root","root");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(
                     null,
                    "Erro no Banco de Dados!\n\nContate seu Administrador do Sistema!",
                    "Erro...",
                    JOptionPane.WARNING_MESSAGE
            );
            e.printStackTrace();
        }
    }
    
    public Connection getConnection(){
      return conn;
    }
    
    public void closeConnection() {
        try                { 
        conn.close(); 
        }
        catch(Exception e) { 
        e.printStackTrace(); 
        }
    } 
    
}

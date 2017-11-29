package controllers.grafico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CalculoGrafico {
   private int periodo;
   private int[] qtdeproduto;
   
   
   public CalculoGrafico(){     
   }
   
   public CalculoGrafico(int periodo, int[] qtdeproduto) {
    this.periodo = periodo;
    this.qtdeproduto = qtdeproduto;
   }
      
   //Mostrara a String referente ao período informado
   public String periodo(int i){
       String periodo =null;
       switch(i){
            case 1:
                periodo = "Jan";
                break;
            case 2:
                periodo = "Fev";
                break;
            case 3:
                periodo = "Mar";
                break;
            case 4:
                periodo = "Abr";
                break;
            case 5:
                periodo = "Mai";
                break;
            case 6:
                periodo = "Jun";
                break;
            case 7:
                periodo = "Jul";
                break;
            case 8:
                periodo = "Ago";
                break;
            case 9:
                periodo = "Set";
                break;
            case 10:
                periodo = "Out";
                break;
            case 11:
                periodo = "Nov";
                break; 
            case 12:
                periodo = "Dez";
                break;
       }
       return periodo;
   }
   
}

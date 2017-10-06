
package controllers;


public class CalculoGrafico {
   private int periodo;
   private int[] qtdeproduto;
   
   public CalculoGrafico(){     
   }
   
   public CalculoGrafico(int periodo, int[] qtdeproduto) {
    this.periodo = periodo;
    this.qtdeproduto = qtdeproduto;
   }
   
   
   //Nesssa classe será feita o calculo das quantidades do produto pelo período
   //Ela que plotará os dados no gráfico
   public double geraDados(int periodo, int[] qtdeproduto){
      switch(periodo){
          case 1:
              return qtdeproduto[0];
          case 2:
              return qtdeproduto[1];
          case 3:
              return qtdeproduto[2];
          case 4:
              return qtdeproduto[3];
          case 5:
              return qtdeproduto[4];
          case 6:
              return qtdeproduto[5];
          case 7:
              return qtdeproduto[6];
          case 8:
              return qtdeproduto[7];
          case 9:
              return qtdeproduto[8];
          case 10:
              return qtdeproduto[9];
          case 11:
              return qtdeproduto[10];
          case 12:
              return qtdeproduto[11];
          default:
              return 0;
      }
   }
   
}

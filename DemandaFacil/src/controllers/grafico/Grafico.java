package controllers.grafico;

import javafx.scene.chart.XYChart;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.RefineryUtilities;

public class Grafico {
   private int qtde[];
   private int comeco;
   private int fim;
   private DefaultCategoryDataset dados;
   private JFreeChart grafico;
 
   
   public Grafico(int[] qtde, int comeco, int fim) {
     this.qtde=qtde;
     this.comeco = comeco;
     this.fim = fim;
     this.dados = new DefaultCategoryDataset();
     this.grafico = ChartFactory.createLineChart("Médias de Produtos Meses", 
                       "Meses", "Quantidade", dados, 
                       PlotOrientation.VERTICAL, 
                         true, true, false);
   }
   
   //Quando os dados forem calculados eles serão inseridos no método que insere os dados no gráfico
   public void criaDados() {
     CalculoGrafico x = new CalculoGrafico();
     for (int i = comeco; i <= fim; i++) {
       double valor = x.geraDados(i, qtde);
       switch(i){
           case 0:
              dados.addValue(valor, "Banana", "Jan"); 
           case 1:
              dados.addValue(valor, "Banana", "Fev");
           case 2:
              dados.addValue(valor, "Banana", "Mar");
           case 3:
              dados.addValue(valor, "Banana", "Abr");
           case 4:
              dados.addValue(valor, "Banana", "Mai");
           case 5:
              dados.addValue(valor, "Banana", "Jun");
           case 6:
              dados.addValue(valor, "Banana", "Jul");
           case 7:
              dados.addValue(valor, "Banana", "Ago");
           case 8:
              dados.addValue(valor, "Banana", "Set");
           case 9:
              dados.addValue(valor, "Banana", "Out");
           case 10:
              dados.addValue(valor, "Banana", "Nov");
           case 11:
              dados.addValue(valor, "Banana", "Dez");
       }
     }
   }
   
   //Cria o painel do gráfico.
   public JPanel getPanel() {
        return new ChartPanel(grafico);
}
}   
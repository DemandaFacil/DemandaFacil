package controllers.grafico;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import javafx.scene.chart.Chart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.event.ChartChangeListener;
import org.jfree.chart.event.ChartProgressListener;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DrawingSupplier;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.function.Function2D;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.RefineryUtilities;

public class Grafico {
   private int qtde1[];
   private int qtde2[];
   private double qtde3[];
   private int comeco;
   private int fim;
   private DefaultCategoryDataset dados;
   private DefaultCategoryDataset dados2;
   private static JFreeChart grafico;
 
   public Grafico(int[] qtde1,int[]qtde2, int comeco, int fim) {

     this.qtde1=qtde1;
     this.qtde2=qtde2;
     this.comeco = comeco;
     this.fim = fim;
     
     //Inserção de dados no gráfico
     this.dados = new DefaultCategoryDataset();
     this.dados2 = new DefaultCategoryDataset();
     this.grafico = ChartFactory.createLineChart("Estimativas", 
                       "Período", "Quantidade", dados,
                       PlotOrientation.VERTICAL, 
                         true, true, false);     
   }
   
   public Grafico(int[] qtde1,double[]qtde3, int comeco, int fim) {

     this.qtde1=qtde1;
     this.qtde3=qtde3;
     this.comeco = comeco;
     this.fim = fim;
     
     //Inserção de dados no gráfico
     this.dados = new DefaultCategoryDataset();
     this.dados2 = new DefaultCategoryDataset();
     this.grafico = ChartFactory.createLineChart("Desvios", 
                       "Período", "Quantidade", dados,
                       PlotOrientation.VERTICAL, 
                         true, true, false);     
   }
   //Cria os dados para inserir no gráfico apartir da quantidade e período informados
   //Passar um código de produto
   public void criaDados(int id) {
      
      String nomeProduto;
      GraficoDAO dao = new GraficoDAO();
      CalculoGrafico x = new CalculoGrafico();
      nomeProduto = dao.procuraNomeProduto(id);
      for (int i = comeco; i <= fim; i++) {
       //Chama a função para obter a quantidade referente a tal periodo
       int valor = x.geraDados(i, qtde1);
       //Chama a função para obter o periodo que foi informado
       String periodo = x.periodo(i);
       dados.addValue(valor,nomeProduto,periodo); 
     }
     } 
   //Cria os dados para inserir no gráfico apartir da quantidade e período informados sendo dados de outra tabela
   //Passar um código de produto
   public void criaDados2(int id) {
     
     String nomeProduto = null;
     GraficoDAO dao = new GraficoDAO();
     CalculoGrafico x = new CalculoGrafico();
     nomeProduto = dao.procuraNomeProduto(id);
     for (int i = comeco; i <= fim; i++) {
       //Chama a função para obter a quantidade referente a tal periodo
       int valor = x.geraDados(i, qtde2);
       //Chama a função para obter o periodo que foi informado
       String periodo = x.periodo(i);
       dados2.addValue(valor,nomeProduto,periodo); 
     }  
     } 
   
   //Recebe o valor dos desvios
   public void criaDadosDesvio(int id) {
    
     String nomeProduto;
     GraficoDAO dao = new GraficoDAO();
     CalculoGrafico x = new CalculoGrafico();
     nomeProduto = dao.procuraNomeProduto(id);
     for (int i = comeco; i <= fim; i++) {
       //Chama a função para obter a quantidade referente a tal periodo
       double valor = x.geraDadosDesvio(i, qtde3);
       //Chama a função para obter o periodo que foi informado
       String periodo = x.periodo(i);
       dados2.addValue(valor,nomeProduto,periodo); 
     }  
    } 
   //Cria o painel do gráfico.
   public ChartPanel getPanel() {
        //Recupera o gráfico com somente um dado inserido
        final CategoryPlot plot = grafico.getCategoryPlot();
        //Plota a cor de fundo para branco
        plot.setBackgroundPaint(Color.WHITE);
        //Recupera os dados da linha do gráfico
        final LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
        
        //Mostra o ponto no gráfico
        renderer.setBaseShapesVisible(true);
        
        //Mostra a posição(Quantidade no caso) do item
        renderer.setBaseItemLabelsVisible(true);
        
        //Formatação caso o número decimal e tiver mais que duas casas decimais
        final DecimalFormat format = new DecimalFormat("#0.##");
        renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator("{2}", format));
        
        //Plota a segunda linha de dados
        plot.setDataset(1, dados2);
        renderer.setSeriesPaint(1, Color.BLUE);
        plot.setRenderer(renderer);
        return new ChartPanel(grafico);
}
   
}   
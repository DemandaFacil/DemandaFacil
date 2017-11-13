package controllers.grafico;

import java.awt.BorderLayout;
import static java.lang.Math.sqrt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

public class Teste extends javax.swing.JFrame {

    public Teste() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGrafico = new javax.swing.JPanel();
        btn_media1 = new javax.swing.JButton();
        btn_salvarMedia = new javax.swing.JButton();
        btn_desvio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelGrafico.setLayout(new java.awt.BorderLayout());

        btn_media1.setText("Media 1");
        btn_media1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_media1ActionPerformed(evt);
            }
        });

        btn_salvarMedia.setText("Salvar");
        btn_salvarMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarMediaActionPerformed(evt);
            }
        });

        btn_desvio.setText("Desvio");
        btn_desvio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_desvioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_media1)
                        .addComponent(btn_salvarMedia))
                    .addComponent(btn_desvio))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btn_media1)
                        .addGap(29, 29, 29)
                        .addComponent(btn_desvio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 339, Short.MAX_VALUE)
                        .addComponent(btn_salvarMedia))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(painelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salvarMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarMediaActionPerformed
      
      
    }//GEN-LAST:event_btn_salvarMediaActionPerformed

    private void btn_media1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_media1ActionPerformed
      //plotar as médias
        
      int[] q1 = geraArray1();
      int[] q2 = geraArray2();
      
      //Insere os array de quantidades e o periodo informado, transformando eles em inteiros
      Grafico graf = new Grafico(q1,q2,1,5);
      graf.criaDados(1);  
      graf.criaDados2(1);
      painelGrafico.removeAll();
      painelGrafico.add(graf.getPanel());
      this.pack();
      painelGrafico.validate();
      painelGrafico.repaint();
    }//GEN-LAST:event_btn_media1ActionPerformed

    private void btn_desvioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_desvioActionPerformed
      int[] q1 = geraArray1();
      int[] auxiliar = q1;
      int n = q1.length;
      int[] repetidos = new int[n];
      double[] desvio = new double[n];
      int[] auxiliar2 = new int[n];
      
      int media;
      int soma=0;
      int soma2=0;
      int num;
      int aux;
      int maior =0;
      int amostra = 0;
      int numeroRepetido=0;
      double variancia;
      double desvioPadrao;
      
      //obtendo a média
      for(int i = 0; i < q1.length ;i++){
          soma = soma+ q1[i];
      }
      media = soma/q1.length;
      
      //ordenando o vetor auxiliar
      for (int i = auxiliar.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                if (auxiliar[j - 1] > auxiliar[j]) {
                    aux = auxiliar[j];
                    auxiliar[j] = auxiliar[j - 1];
                    auxiliar[j - 1] = aux;
                }
            }
      }
      //Atribuindo uma soma para os valores que se repetem
      int cont=1;
      for(int i=0; i<auxiliar.length; i++){
	cont=0;
	for(int j=0; j<auxiliar.length; j++){
		if (auxiliar[j] == auxiliar[i]){
			cont++;
			repetidos[i] = cont;
		}
		num = auxiliar[i];
		}
      }
      //Verifica qual é o numero que se repete mais vezes e obtem o numero da amostra;
      for(int i = 0; i< auxiliar.length ;i++){
          if(repetidos[i] > maior){
              numeroRepetido = repetidos[i];
              maior=repetidos[i];
              amostra=auxiliar[i];
          }   
      }
      //Subtrai todos os elementos do vetor pela amostra
      for(int i= 0; i <q1.length;i++){
          auxiliar2[i]= q1[i]-amostra;
      }
      //Elevar ao quadrado todos os elementos subtraidos pela amostra e somar o total;
      for(int i =0;i <auxiliar2.length;i++){
          auxiliar2[i]= auxiliar2[i]*auxiliar2[i];
          soma2=soma2+auxiliar2[i];
      }
      //Fazendo o calculo da variancia -- Soma dos elemesntos subtraidos divido pela quantidade do vetor
      variancia = soma2/(q1.length-1);
      desvioPadrao = sqrt(variancia);
      
      for(int i = 0; i < q1.length;i++){
          desvio[i] = desvioPadrao;
      }
      
      Grafico graf = new Grafico(q1,desvio,1,5);
      graf.criaDados(1);  
      graf.criaDadosDesvio(1);
      painelGrafico.removeAll();
      painelGrafico.add(graf.getPanel());
      this.pack();
      painelGrafico.validate();
      painelGrafico.repaint();
      
    }//GEN-LAST:event_btn_desvioActionPerformed
    
    public int[] geraArray1(){
      ConexaoDB db = new ConexaoDB();
      Connection conn = db.getConnection();   
      int n = 5;
      int qtde1[]  = new int[n];
      String sql = "select * from consumo where Produto_idProduto= 1 and data = '2017-11-12'";
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
        
        String sql2 = "select * from consumo where Produto_idProduto= 1 and data = '2017-10-10'";
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
        
        String sql3 = "select * from consumo where Produto_idProduto= 1 and data = '2017-09-06'";
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
        String sql4 = "select * from consumo where Produto_idProduto= 1 and data = '2017-09-13'";
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
        String sql5 = "select * from consumo where Produto_idProduto= 1 and data = '2017-08-98'";
        int x5;
        try{
           PreparedStatement cmd = conn.prepareStatement(sql5);
           ResultSet rs = cmd.executeQuery();
           while(rs.next()){
               x5 = rs.getInt("quantidade");
               qtde1[4] = x5;
           }
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Não foi encontrado nenhuma classe!"+ex);
        }
        
      db.closeConnection(); 
      return qtde1;  
    }
    
    public int[] geraArray2(){
      ConexaoDB db = new ConexaoDB();
      Connection conn = db.getConnection();
      int n1 = 5;
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
        String sql9 = "select * from consumo where Produto_idProduto= 4 and data = '2017-10-08'";
        int x9;
        try{
           PreparedStatement cmd = conn.prepareStatement(sql9);
           ResultSet rs = cmd.executeQuery();
           while(rs.next()){
               x9 = rs.getInt("quantidade");
               qtde2[4] = x9;
           }
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Não foi encontrado nenhuma classe!"+ex);
        }
        db.closeConnection();
        return qtde2;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_desvio;
    private javax.swing.JButton btn_media1;
    private javax.swing.JButton btn_salvarMedia;
    private javax.swing.JPanel painelGrafico;
    // End of variables declaration//GEN-END:variables
    private int[] qtde1,qtde2;
}

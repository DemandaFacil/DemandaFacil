
package views.estimativa;

import controllers.banco.ConnectionFactory;
import controllers.grafico.Grafico;
import controllers.grafico.GraficoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import models.consumo.Consumo;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import static java.lang.Math.sqrt;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import models.estimativa.EstimativaDAO;
import models.estimativa.Estimativas;

public class EstimativaGraficos extends javax.swing.JFrame {
    
    private Consumo con;
    private Estimativas es;
    private Connection conn;
    private String produtoNome;
    private String datas;
    private String select;
    private int Produto_idProduto;
    private double valores;
    
    public EstimativaGraficos() {
        initComponents();
        this.conn = ConnectionFactory.getConnection();
    }
    
    public EstimativaGraficos(String nomeProduto, String data){
       initComponents();
       produtoNome=nomeProduto;
       datas=data;
       this.conn = ConnectionFactory.getConnection();
       this.comboMedias.setSelectedIndex(1);
       btn_gerar_grafico.doClick();
       this.comboMedias.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menuLateral = new javax.swing.JPanel();
        linhaDivisoria = new javax.swing.JPanel();
        opcaoMenu = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        opcaoMenu1 = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        nome1 = new javax.swing.JLabel();
        opcaoMenu2 = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        nome2 = new javax.swing.JLabel();
        opcaoMenu3 = new javax.swing.JPanel();
        icon3 = new javax.swing.JLabel();
        nome3 = new javax.swing.JLabel();
        iconLogo = new javax.swing.JLabel();
        faixaTitulo = new javax.swing.JPanel();
        subTitulo = new javax.swing.JLabel();
        nomePagina = new javax.swing.JLabel();
        painelBackgroundForm = new javax.swing.JPanel();
        painelForm = new javax.swing.JPanel();
        btn_gerar_grafico = new javax.swing.JButton();
        comboMedias = new javax.swing.JComboBox<>();
        painelGrafico = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_salvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(178, 242, 236));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuLateral.setBackground(new java.awt.Color(47, 79, 79));

        javax.swing.GroupLayout linhaDivisoriaLayout = new javax.swing.GroupLayout(linhaDivisoria);
        linhaDivisoria.setLayout(linhaDivisoriaLayout);
        linhaDivisoriaLayout.setHorizontalGroup(
            linhaDivisoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        linhaDivisoriaLayout.setVerticalGroup(
            linhaDivisoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        opcaoMenu.setBackground(new java.awt.Color(57, 95, 95));
        opcaoMenu.setLayout(new javax.swing.BoxLayout(opcaoMenu, javax.swing.BoxLayout.LINE_AXIS));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Home.png"))); // NOI18N
        opcaoMenu.add(icon);

        nome.setFont(new java.awt.Font("Merriweather Light", 1, 24)); // NOI18N
        nome.setForeground(java.awt.Color.white);
        nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome.setText("Home");
        nome.setMaximumSize(new java.awt.Dimension(80, 24));
        nome.setMinimumSize(new java.awt.Dimension(58, 24));
        opcaoMenu.add(nome);

        opcaoMenu1.setBackground(new java.awt.Color(57, 95, 95));
        opcaoMenu1.setLayout(new javax.swing.BoxLayout(opcaoMenu1, javax.swing.BoxLayout.LINE_AXIS));

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Exit.png"))); // NOI18N
        opcaoMenu1.add(icon1);

        nome1.setFont(new java.awt.Font("Merriweather Light", 1, 24)); // NOI18N
        nome1.setForeground(java.awt.Color.white);
        nome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome1.setText("Sair");
        nome1.setMaximumSize(new java.awt.Dimension(70, 24));
        nome1.setMinimumSize(new java.awt.Dimension(46, 24));
        opcaoMenu1.add(nome1);

        opcaoMenu2.setBackground(new java.awt.Color(57, 95, 95));
        opcaoMenu2.setLayout(new javax.swing.BoxLayout(opcaoMenu2, javax.swing.BoxLayout.LINE_AXIS));

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Business.png"))); // NOI18N
        opcaoMenu2.add(icon2);

        nome2.setFont(new java.awt.Font("Merriweather Light", 1, 24)); // NOI18N
        nome2.setForeground(java.awt.Color.white);
        nome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome2.setText("Empresas");
        nome2.setMaximumSize(new java.awt.Dimension(130, 32));
        nome2.setMinimumSize(new java.awt.Dimension(95, 24));
        opcaoMenu2.add(nome2);

        opcaoMenu3.setBackground(new java.awt.Color(57, 95, 95));
        opcaoMenu3.setLayout(new javax.swing.BoxLayout(opcaoMenu3, javax.swing.BoxLayout.LINE_AXIS));

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-More Info.png"))); // NOI18N
        opcaoMenu3.add(icon3);

        nome3.setFont(new java.awt.Font("Merriweather Light", 1, 24)); // NOI18N
        nome3.setForeground(java.awt.Color.white);
        nome3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome3.setText("Perfil");
        nome3.setMaximumSize(new java.awt.Dimension(80, 24));
        nome3.setMinimumSize(new java.awt.Dimension(65, 24));
        opcaoMenu3.add(nome3);

        iconLogo.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        iconLogo.setForeground(java.awt.Color.white);
        iconLogo.setText("Logo");

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(linhaDivisoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opcaoMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opcaoMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opcaoMenu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opcaoMenu3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(iconLogo)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(iconLogo)
                .addGap(40, 40, 40)
                .addComponent(linhaDivisoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(opcaoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcaoMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcaoMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(opcaoMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        background.add(menuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 509));

        faixaTitulo.setBackground(new java.awt.Color(0, 128, 128));

        subTitulo.setFont(new java.awt.Font("Merriweather Light", 1, 24)); // NOI18N
        subTitulo.setForeground(java.awt.Color.white);
        subTitulo.setText("Nome Empresa");
        subTitulo.setMaximumSize(new java.awt.Dimension(90, 24));
        subTitulo.setMinimumSize(new java.awt.Dimension(90, 24));

        nomePagina.setFont(new java.awt.Font("Merriweather Light", 1, 36)); // NOI18N
        nomePagina.setForeground(java.awt.Color.white);
        nomePagina.setText("Gráfico");

        javax.swing.GroupLayout faixaTituloLayout = new javax.swing.GroupLayout(faixaTitulo);
        faixaTitulo.setLayout(faixaTituloLayout);
        faixaTituloLayout.setHorizontalGroup(
            faixaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faixaTituloLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(faixaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomePagina, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(225, Short.MAX_VALUE))
        );
        faixaTituloLayout.setVerticalGroup(
            faixaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faixaTituloLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(subTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomePagina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        background.add(faixaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 600, 110));

        painelBackgroundForm.setBackground(java.awt.Color.lightGray);

        btn_gerar_grafico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Combo Chart.png"))); // NOI18N
        btn_gerar_grafico.setText("Gerar outro Gráfico");
        btn_gerar_grafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerar_graficoActionPerformed(evt);
            }
        });

        comboMedias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Média Móvel", "Média Ponderada", "Desvios", "Previsão de Demanda" }));

        painelGrafico.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Estimativas");

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Salvar-26.png"))); // NOI18N
        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFormLayout = new javax.swing.GroupLayout(painelForm);
        painelForm.setLayout(painelFormLayout);
        painelFormLayout.setHorizontalGroup(
            painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btn_gerar_grafico)
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboMedias, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btn_salvar)
                .addGap(53, 53, 53))
            .addComponent(painelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelFormLayout.setVerticalGroup(
            painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormLayout.createSequentialGroup()
                .addComponent(painelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboMedias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGroup(painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_gerar_grafico, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_salvar)))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelBackgroundFormLayout = new javax.swing.GroupLayout(painelBackgroundForm);
        painelBackgroundForm.setLayout(painelBackgroundFormLayout);
        painelBackgroundFormLayout.setHorizontalGroup(
            painelBackgroundFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBackgroundFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelBackgroundFormLayout.setVerticalGroup(
            painelBackgroundFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBackgroundFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        background.add(painelBackgroundForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 580, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gerar_graficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerar_graficoActionPerformed
        if(comboMedias.getSelectedIndex()==0){
            mediaMovel();
            btn_salvar.setEnabled(true);
        }else if(comboMedias.getSelectedIndex()==1){
            mediaPonderada();
            btn_salvar.setEnabled(true);
        }else if(comboMedias.getSelectedIndex()==2){
            desvio();
            btn_salvar.setEnabled(false);
        }else if(comboMedias.getSelectedIndex()==3){
            btn_salvar.setEnabled(false);
        }
    }//GEN-LAST:event_btn_gerar_graficoActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        //Salvando a estimativa selecionada pelo usuário no banco
        Date data = new Date(System.currentTimeMillis());
        SimpleDateFormat formatarDate = new SimpleDateFormat("yyyy-MM-dd");
        String dataFormatada = formatarDate.format(data);
        if(select.equals("mediaMovel")){
            Estimativas e = new Estimativas();
            EstimativaDAO dao = new EstimativaDAO();
            e.setData(dataFormatada);
            e.setProduto_IdProduto(Produto_idProduto);
            e.setValorCalculado(valores);
            dao.insert(e);
       }else if(select.equals("mediaPonderada")){
            Estimativas e = new Estimativas();
            EstimativaDAO dao = new EstimativaDAO();
            e.setData(dataFormatada);
            e.setProduto_IdProduto(Produto_idProduto);
            e.setValorCalculado(valores);
            dao.insert(e);   
       }
    }//GEN-LAST:event_btn_salvarActionPerformed
    
    
    public void demanda(){
        
      GraficoDAO dao = new GraficoDAO();
      Produto_idProduto = dao.getIdProduto(produtoNome);
      ArrayList<Estimativas> dadosEstimativas = new ArrayList<Estimativas>();
      dadosEstimativas = getDadosEstimativas(Produto_idProduto, datas);
      int tamanho;
      tamanho = dadosEstimativas.size();
      
      Vector<Integer> meses = new Vector<>(dadosEstimativas.size());
      Vector<Double> valor = new Vector<>(dadosEstimativas.size());
      int qtde[] = new int[tamanho];
      int mes[] = new int[tamanho];
      
      for(Estimativas e : dadosEstimativas){
        meses.add(Integer.parseInt(e.getData()));
        valor.add(e.getValorCalculado());
      }    
      
    }
    
    public void mediaMovel(){
      select="mediaMovel";
      GraficoDAO dao = new GraficoDAO();
      Produto_idProduto = dao.getIdProduto(produtoNome);
      ArrayList<Consumo> dadosConsumo = new ArrayList<Consumo>();
      dadosConsumo = getDados(Produto_idProduto, datas);
      int tamanho;
      tamanho = dadosConsumo.size()+1;

      Vector<Integer> meses = new Vector<>(dadosConsumo.size());
      Vector<Integer> quantidade = new Vector<>(dadosConsumo.size());
      int qtde[] = new int[tamanho];
      int mes[] = new int[tamanho];
      int[]media = new int[tamanho];
      int soma=0;
      int valorCalculado;
      
      for(Consumo c : dadosConsumo){
        meses.add(Integer.parseInt(c.getPeriodo().substring(0,2)));
        quantidade.add(c.getQuantidade());
        soma+=c.getQuantidade();
      }    
      valorCalculado=soma/tamanho;
      valores=valorCalculado;
      
      for(int x = 0;x<tamanho;x++){
          qtde[x]=quantidade.elementAt(x);
          mes[x]=meses.elementAt(x);
      } 
      for(int i=0;i<media.length;i++){
          media[i]=0;
          media[i]=valorCalculado;
      }
      int fim = meses.lastElement();
      int inicio= meses.firstElement();
      //Insere os array de quantidades e o periodo informado, transformando eles em inteiros
      Grafico graf = new Grafico(qtde,media,inicio,fim);
      graf.criaDados(Produto_idProduto);
      graf.criaDados2(Produto_idProduto);
      painelGrafico.removeAll();
      painelGrafico.add(graf.getPanel());
      this.pack();
      painelGrafico.validate();
      painelGrafico.repaint();
    }
    
    public void mediaPonderada(){
      select="mediaPonderada";
      GraficoDAO dao = new GraficoDAO();
      Produto_idProduto = dao.getIdProduto(produtoNome);
      ArrayList<Consumo> dadosConsumo = new ArrayList<Consumo>();
      dadosConsumo = getDados(Produto_idProduto,datas);
      int tamanho;
      tamanho = dadosConsumo.size();
      
      Vector<Integer> meses = new Vector<>(dadosConsumo.size());
      Vector<Integer> quantidade = new Vector<>(dadosConsumo.size());
      int mes[] = new int[tamanho];
      int qtde[] = new int[tamanho];
      int[] mediaPonderada = new int[tamanho];
      int soma=0;
      float peso, valor=0;
      
      for(Consumo c : dadosConsumo){
        meses.add(Integer.parseInt(c.getPeriodo().substring(0,2)));
        quantidade.add(c.getQuantidade());
        soma+=c.getQuantidade();
      }
      for(int x = 0;x<tamanho;x++){
          qtde[x]=quantidade.elementAt(x);
          mes[x]=meses.elementAt(x);
      }
      
      for(Consumo c: dadosConsumo){
          peso = (float) ((double) c.getQuantidade()/soma); //identifica peso daquele valor
          valor = valor+peso*c.getQuantidade(); //soma todos os valores com os pesos ajustados
      }  
      valores=valor;
      for(int i=0;i<mediaPonderada.length;i++){
          mediaPonderada[i]=0;
          mediaPonderada[i]=(int) valor;
      }
      
      int fim = meses.lastElement();
      int inicio= meses.firstElement();
 
      Grafico graf = new Grafico(qtde,mediaPonderada,inicio,fim);
      graf.criaDados(Produto_idProduto);
      graf.criaDados2(Produto_idProduto);
      painelGrafico.removeAll();
      painelGrafico.add(graf.getPanel());
      this.pack();
      painelGrafico.validate();
      painelGrafico.repaint();  
    }
    
    public void desvio(){
      GraficoDAO dao = new GraficoDAO();
      Produto_idProduto = dao.getIdProduto(produtoNome);
      ArrayList<Consumo> dadosConsumo = new ArrayList<Consumo>();
      dadosConsumo = getDados(Produto_idProduto,datas);
      int tamanho;
      tamanho = dadosConsumo.size();
      
      Vector<Integer> meses = new Vector<>(dadosConsumo.size());
      Vector<Integer> quantidade = new Vector<>(dadosConsumo.size());
      int qtde[] = new int[tamanho];
      int mes[] = new int[tamanho];
      for(Consumo c : dadosConsumo){
        meses.add(Integer.parseInt(c.getPeriodo().substring(0,2)));
        quantidade.add(c.getQuantidade());
      }    
      for(int x = 0;x<tamanho;x++){
          qtde[x]=quantidade.elementAt(x);
          mes[x]=meses.elementAt(x);
      }
         
      int n = qtde.length;
      int[] auxiliar = new int[n];
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
      
      for(int i=0;i<n;i++){
         auxiliar[i]=qtde[i]; 
      }
      //obtendo a média
      for(int i = 0; i < n ;i++){
          soma = soma+ auxiliar[i];
      }
      media = soma/n;
      
      //ordenando o vetor auxiliar pelo bubble sort
      for (int i = n; i >= 1; i--) {
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
      for(int i=0; i<n; i++){
	cont=0;
	for(int j=0; j<n; j++){
		if (auxiliar[j] == auxiliar[i]){
			cont++;
			repetidos[i] = cont;
		}
		num = auxiliar[i];
		}
      }
      //Verifica qual é o numero que se repete mais vezes e obtem o numero da amostra;
      for(int i = 0; i< n ;i++){
          if(repetidos[i] > maior){
              numeroRepetido = repetidos[i];
              maior=repetidos[i];
              amostra=auxiliar[i];
          }   
      }
      //Subtrai todos os elementos do vetor pela amostra
      for(int i= 0; i <n;i++){
          auxiliar2[i]= auxiliar[i]-amostra;
      }
      //Elevar ao quadrado todos os elementos subtraidos pela amostra e somar o total;
      for(int i =0;i <n;i++){
          auxiliar2[i]= auxiliar2[i]*auxiliar2[i];
          soma2=soma2+auxiliar2[i];
      }
      //Fazendo o calculo da variancia -- Soma dos elemesntos subtraidos divido pela quantidade do vetor
      variancia = soma2/(n);
      desvioPadrao = sqrt(variancia);
      
      for(int i = 0; i <n;i++){
          desvio[i] = desvioPadrao;
      }
      
      int fim = meses.lastElement();
      int inicio= meses.firstElement();
      
      Grafico graf = new Grafico(qtde,desvio,inicio,fim);
      graf.criaDados(Produto_idProduto);  
      graf.criaDadosDesvio(Produto_idProduto);
      painelGrafico.removeAll();
      painelGrafico.add(graf.getPanel());
      this.pack();
      painelGrafico.validate();
      painelGrafico.repaint();
        
    }
    
    public ArrayList<Consumo> getDados(int idProduto, String datas){
      ArrayList<Consumo> listaConsumo = new ArrayList<Consumo>(); 
      String query = "SELECT quantidade as qtde, SUBSTRING(periodo,0,2) as data FROM consumo where Produto_idProduto="+idProduto+" and data like '"+datas+"%' order by data";              
      try {
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                con = new Consumo();
                int qtde = rs.getInt("qtde");
                String data = rs.getString("data");
                
                if(data == "08"){
                    data = "8";
                }
                if(data== "09"){
                    data="9";
                }
                con.setQuantidade(qtde);
                con.setPeriodo(data);
		listaConsumo.add(con);
            }
            stmt.close();
	}
	catch(SQLException e){
		e.printStackTrace();
	}
       return listaConsumo;
    } 
    
    public ArrayList<Estimativas> getDadosEstimativas(int idProduto, String datas){
        ArrayList<Estimativas> listaEstimativas = new ArrayList<Estimativas>();
        String query = "SELECT valorCalculado as valorCalculado, SUBSTRING(data,6,2) as data FROM estimativas where Produto_idProduto="+idProduto+" and data like '"+datas+"%' order by data";
         try {
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                es = new Estimativas();
                String data = rs.getString("data");
                int valor = rs.getInt("valorCalculado");
                
                if(data == "08"){
                    data = "8";
                }
                if(data== "09"){
                    data="9";
                }
                es.setProduto_IdProduto(Produto_idProduto);
                es.setValorCalculado(valor);
                es.setData(data);
		listaEstimativas.add(es);
            }
            stmt.close();
	}
	catch(SQLException e){
		e.printStackTrace();
	}
       return listaEstimativas;
    }
    
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EstimativaGraficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EstimativaGraficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EstimativaGraficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EstimativaGraficos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
   



        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EstimativaGraficos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_gerar_grafico;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JComboBox<String> comboMedias;
    private javax.swing.JPanel faixaTitulo;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel iconLogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel linhaDivisoria;
    private javax.swing.JPanel menuLateral;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel nome1;
    private javax.swing.JLabel nome2;
    private javax.swing.JLabel nome3;
    private javax.swing.JLabel nomePagina;
    private javax.swing.JPanel opcaoMenu;
    private javax.swing.JPanel opcaoMenu1;
    private javax.swing.JPanel opcaoMenu2;
    private javax.swing.JPanel opcaoMenu3;
    private javax.swing.JPanel painelBackgroundForm;
    private javax.swing.JPanel painelForm;
    private javax.swing.JPanel painelGrafico;
    private javax.swing.JLabel subTitulo;
    // End of variables declaration//GEN-END:variables
}

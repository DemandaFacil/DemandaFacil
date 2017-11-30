
package views.estimativa;

import controllers.banco.ConnectionFactory;
import controllers.control.core.CoreControl;
import controllers.grafico.Grafico;
import controllers.grafico.GraficoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import models.consumo.Consumo;
import static java.lang.Math.sqrt;
import java.sql.Date;
import java.text.SimpleDateFormat;
import models.estimativa.EstimativaDAO;
import models.estimativa.Estimativas;
import models.usuario.Usuario;

public class EstimativaGraficos extends javax.swing.JFrame {
    
    private Usuario usuario;
    private Consumo con;
    private Estimativas es;
    private Connection conn;
    private String produtoNome;
    private int reposicao;
    private String datas;
    private String select;
    private int Produto_idProduto;
    private double valores;
    private int Start,End;
    
    public EstimativaGraficos() {
        initComponents();
        this.conn = ConnectionFactory.getConnection();
    }
    
    public EstimativaGraficos(String nomeProduto, String data,String periodoReposicao){
       initComponents();
       produtoNome=nomeProduto;
       datas=data;
       reposicao=Integer.parseInt(periodoReposicao);
       this.conn = ConnectionFactory.getConnection();
       this.comboMedias.setSelectedIndex(1);
       btn_gerar_grafico.doClick();
       this.comboMedias.setSelectedIndex(0);
       setarGrafico();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menuLateral = new javax.swing.JPanel();
        linhaDivisoria = new javax.swing.JPanel();
        opcaoMenuHome = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        opcaoMenuSair = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        nome1 = new javax.swing.JLabel();
        opcaoMenuEmpresas = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        nome2 = new javax.swing.JLabel();
        opcaoMenuPerfil = new javax.swing.JPanel();
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

        opcaoMenuHome.setBackground(new java.awt.Color(57, 95, 95));
        opcaoMenuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                opcaoMenuHomeMouseReleased(evt);
            }
        });
        opcaoMenuHome.setLayout(new javax.swing.BoxLayout(opcaoMenuHome, javax.swing.BoxLayout.LINE_AXIS));

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Home.png"))); // NOI18N
        opcaoMenuHome.add(icon);

        nome.setFont(new java.awt.Font("Merriweather Light", 1, 24)); // NOI18N
        nome.setForeground(java.awt.Color.white);
        nome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome.setText("Home");
        nome.setMaximumSize(new java.awt.Dimension(80, 24));
        nome.setMinimumSize(new java.awt.Dimension(58, 24));
        opcaoMenuHome.add(nome);

        opcaoMenuSair.setBackground(new java.awt.Color(57, 95, 95));
        opcaoMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                opcaoMenuSairMouseReleased(evt);
            }
        });
        opcaoMenuSair.setLayout(new javax.swing.BoxLayout(opcaoMenuSair, javax.swing.BoxLayout.LINE_AXIS));

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Exit.png"))); // NOI18N
        opcaoMenuSair.add(icon1);

        nome1.setFont(new java.awt.Font("Merriweather Light", 1, 24)); // NOI18N
        nome1.setForeground(java.awt.Color.white);
        nome1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome1.setText("Sair");
        nome1.setMaximumSize(new java.awt.Dimension(70, 24));
        nome1.setMinimumSize(new java.awt.Dimension(46, 24));
        opcaoMenuSair.add(nome1);

        opcaoMenuEmpresas.setBackground(new java.awt.Color(57, 95, 95));
        opcaoMenuEmpresas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                opcaoMenuEmpresasMouseReleased(evt);
            }
        });
        opcaoMenuEmpresas.setLayout(new javax.swing.BoxLayout(opcaoMenuEmpresas, javax.swing.BoxLayout.LINE_AXIS));

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Business.png"))); // NOI18N
        opcaoMenuEmpresas.add(icon2);

        nome2.setFont(new java.awt.Font("Merriweather Light", 1, 24)); // NOI18N
        nome2.setForeground(java.awt.Color.white);
        nome2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome2.setText("Empresas");
        nome2.setMaximumSize(new java.awt.Dimension(130, 32));
        nome2.setMinimumSize(new java.awt.Dimension(95, 24));
        opcaoMenuEmpresas.add(nome2);

        opcaoMenuPerfil.setBackground(new java.awt.Color(57, 95, 95));
        opcaoMenuPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                opcaoMenuPerfilMouseReleased(evt);
            }
        });
        opcaoMenuPerfil.setLayout(new javax.swing.BoxLayout(opcaoMenuPerfil, javax.swing.BoxLayout.LINE_AXIS));

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-More Info.png"))); // NOI18N
        opcaoMenuPerfil.add(icon3);

        nome3.setFont(new java.awt.Font("Merriweather Light", 1, 24)); // NOI18N
        nome3.setForeground(java.awt.Color.white);
        nome3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nome3.setText("Perfil");
        nome3.setMaximumSize(new java.awt.Dimension(80, 24));
        nome3.setMinimumSize(new java.awt.Dimension(65, 24));
        opcaoMenuPerfil.add(nome3);

        iconLogo.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        iconLogo.setForeground(java.awt.Color.white);
        iconLogo.setText("Logo");

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(linhaDivisoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opcaoMenuHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opcaoMenuEmpresas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opcaoMenuSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opcaoMenuPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(opcaoMenuHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcaoMenuPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcaoMenuEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(opcaoMenuSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        btn_gerar_grafico.setText("Gerar Gráfico");
        btn_gerar_grafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerar_graficoActionPerformed(evt);
            }
        });

        comboMedias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Média Móvel", "Média Ponderada", "Desvios", "Previsão de Demanda", "Média Móvel Exponencial", " " }));

        painelGrafico.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Estimativas");

        btn_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Salvar-26.png"))); // NOI18N
        btn_salvar.setText("Salvar Estimativa");
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
                .addComponent(btn_gerar_grafico)
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboMedias, 0, 155, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btn_salvar))
            .addGroup(painelFormLayout.createSequentialGroup()
                .addComponent(painelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelFormLayout.setVerticalGroup(
            painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormLayout.createSequentialGroup()
                .addComponent(painelGrafico, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(comboMedias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(btn_gerar_grafico, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salvar))
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

        background.add(painelBackgroundForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 570, 390));

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
            demanda();
            btn_salvar.setEnabled(false);
        }else if(comboMedias.getSelectedIndex()==4){
            mediaMovelExponencial();
            btn_salvar.setEnabled(false);
        }
    }//GEN-LAST:event_btn_gerar_graficoActionPerformed

    private void setarGrafico() {
        switch (comboMedias.getSelectedIndex()) {
            case 0:
                mediaMovel();
                btn_salvar.setEnabled(true);
                break;
            case 1:
                mediaPonderada();
                btn_salvar.setEnabled(true);
                break;
            case 2:
                desvio();
                btn_salvar.setEnabled(false);
                break;
            case 3:
                demanda();
                btn_salvar.setEnabled(false);
                break;
            default:
                break;
        }
    }

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
            e.setValorCalculado((int) valores);
            dao.insert(e);
       }else if(select.equals("mediaPonderada")){
            Estimativas e = new Estimativas();
            EstimativaDAO dao = new EstimativaDAO();
            e.setData(dataFormatada);
            e.setProduto_IdProduto(Produto_idProduto);
            e.setValorCalculado((int) valores);
            dao.insert(e);   
       }
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void opcaoMenuHomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoMenuHomeMouseReleased
        // TODO add your handling code here:
        CoreControl core = new CoreControl(usuario);
        core.returnHome();
        this.setVisible(false);
    }//GEN-LAST:event_opcaoMenuHomeMouseReleased

    private void opcaoMenuPerfilMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoMenuPerfilMouseReleased
        // TODO add your handling code here:
        CoreControl core = new CoreControl(usuario);
        core.returnPerfil();
        this.setVisible(false);
    }//GEN-LAST:event_opcaoMenuPerfilMouseReleased

    private void opcaoMenuEmpresasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoMenuEmpresasMouseReleased
        // TODO add your handling code here:
        CoreControl core = new CoreControl(usuario);
        core.returnEmpresas();
        this.setVisible(false);
    }//GEN-LAST:event_opcaoMenuEmpresasMouseReleased

    private void opcaoMenuSairMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoMenuSairMouseReleased
        // TODO add your handling code here:
        CoreControl core = new CoreControl(usuario);
        core.returnLogin();
        this.setVisible(false);
    }//GEN-LAST:event_opcaoMenuSairMouseReleased
    
    public void demanda(){
        
      GraficoDAO dao = new GraficoDAO();
      Produto_idProduto = dao.getIdProduto(produtoNome);
      ArrayList<Estimativas> dadosEstimativas = new ArrayList<Estimativas>();
      ArrayList<Consumo> dadosConsumo = new ArrayList<Consumo>();
      dadosEstimativas = getDadosEstimativas(Produto_idProduto, datas);
      dadosConsumo = getDados(Produto_idProduto, datas);
      
      int tamanho;
      tamanho = dadosEstimativas.size();
      
      Vector<Integer> quantidade = new Vector<Integer>(dadosConsumo.size());
      Vector<Integer> valorEstimativa = new Vector<Integer>(dadosEstimativas.size());
      Vector<Integer> mesesReposicao = new Vector<>(dadosConsumo.size());
      int valorEstimativas[] = new int[tamanho];
      int mes[] = new int[tamanho];
      int qtde[] = new int[tamanho];
      for(Estimativas e : dadosEstimativas){
        valorEstimativa.add(e.getValorCalculado());
      }
      for(int x = 0;x<tamanho;x++){
          valorEstimativas[x]=valorEstimativa.elementAt(x);
      }
      //
      for(Consumo c : dadosConsumo){
        mesesReposicao.add(Integer.parseInt(c.getPeriodo().substring(0,2)));
        quantidade.add(c.getQuantidade());
      }
      for(int x = 0;x<tamanho-1;x++){
          mes[x]=mesesReposicao.elementAt(x);
          qtde[x]=quantidade.elementAt(x);
      }
      
      //Calculando o inicio da previsão
      if((mes[(mes.length-1)]+reposicao)>12){
         Start = (mes[(mes.length-1)]+reposicao) -12;  
      }else{
         Start = (mes[(mes.length-1)]+reposicao); 
      }
      
      //Calculando o fim da previsão
      for(int i=1;i<=mes.length;i++){
          End = Start*i;
          if(End>12){
            End = End-12;
          }
      }
      
      Grafico graf = new Grafico(valorEstimativas,Start,End+reposicao);
      graf.criaDados(Produto_idProduto,reposicao);
      //graf.criaDados2(Produto_idProduto, reposicao);
      painelGrafico.removeAll();
      painelGrafico.add(graf.getPanel());
      this.pack();
      painelGrafico.validate();
      painelGrafico.repaint();
    }
   
    public void mediaMovel(){
      select="mediaMovel";
      GraficoDAO dao = new GraficoDAO();
      Produto_idProduto = dao.getIdProduto(produtoNome);
      ArrayList<Consumo> dadosConsumo = new ArrayList<Consumo>();
      dadosConsumo = getDados(Produto_idProduto, datas);
      int tamanho;
      tamanho = dadosConsumo.size();

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
      graf.criaDados(Produto_idProduto,reposicao);
      graf.criaDados2(Produto_idProduto, reposicao);
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
      graf.criaDados(Produto_idProduto,reposicao);
      graf.criaDados2(Produto_idProduto,reposicao);
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
      
      ArrayList<Estimativas> dadosEstimativas = new ArrayList<Estimativas>();
      dadosEstimativas = getDadosEstimativas(Produto_idProduto, datas);
      Vector<Integer> valorEstimativa = new Vector<Integer>(dadosEstimativas.size());
      
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
      
      int valorEstimativas[] = new int[tamanho];
      for(Estimativas e : dadosEstimativas){
        valorEstimativa.add(e.getValorCalculado());
      }
      for(int x = 0;x<tamanho-1;x++){
          valorEstimativas[x]=valorEstimativa.elementAt(x);
      }
      
      
      int n = qtde.length;
      int[] auxiliar = new int[n];
      int[] repetidos = new int[n];
      double[] desvio = new double[n];
      double[] desvio2 = new double[n];
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
          desvio2[i] = desvioPadrao+media;
      }
      
      int fim = meses.lastElement();
      int inicio= meses.firstElement();
      
      Grafico graf = new Grafico(qtde,desvio,desvio2,inicio,fim);
      graf.criaDados(Produto_idProduto, reposicao);
      graf.criaDadosDesvio(Produto_idProduto,reposicao);
      graf.criaDadosDesvio2(Produto_idProduto,reposicao);
      painelGrafico.removeAll();
      painelGrafico.add(graf.getPanelDesvio());
      this.pack();
      painelGrafico.validate();
      painelGrafico.repaint();
        
    }
    
    public void mediaMovelExponencial(){
      GraficoDAO dao = new GraficoDAO();
      Produto_idProduto = dao.getIdProduto(produtoNome);
      ArrayList<Consumo> dadosConsumo = new ArrayList<Consumo>();
      dadosConsumo = getDadosEspecifico(Produto_idProduto,datas);
      
      Vector<Integer> meses = new Vector<>(dadosConsumo.size());
      Vector<Integer> quantidade = new Vector<>(dadosConsumo.size());
      double alfa = 0.3;
      int mes[] = new int[dadosConsumo.size()];
      int qtde[] = new int[dadosConsumo.size()];
      int media[] = new int[dadosConsumo.size()];
      
      for(Consumo c : dadosConsumo){
        meses.add(Integer.parseInt(c.getPeriodo().substring(0,2)));
        quantidade.add(c.getQuantidade());
      }
      for(int i=0;i<dadosConsumo.size();i++){
          qtde[i]=quantidade.get(i);
          mes[i]=meses.get(i);
      }
      for(int x=0;x<dadosConsumo.size();x++){
          System.out.println(qtde[x]);
          System.out.println(mes[x]);
      }
        
      int anoAnterior = quantidade.firstElement();
      anoAnterior = (int) (anoAnterior*alfa);
      int ultimo = quantidade.lastElement();
      int atual = (int) ((1-alfa)*ultimo);
      
      int mediaExp= anoAnterior+atual;
      
      for(int i=0;i<dadosConsumo.size();i++){
          media[i]=mediaExp;
      }
      
      int inicio=meses.firstElement();
      int fim = meses.lastElement();

      Grafico graf = new Grafico(qtde,media,inicio,fim);
      graf.criaDados(Produto_idProduto,reposicao);
      graf.criaDados2(Produto_idProduto,reposicao);
      painelGrafico.removeAll();
      painelGrafico.add(graf.getPanel());
      this.pack();
      painelGrafico.validate();
      painelGrafico.repaint();

    }
    
    public ArrayList<Consumo> getDados(int idProduto, String datas){
      ArrayList<Consumo> listaConsumo = new ArrayList<Consumo>(); 

      String query = "SELECT quantidade as qtde, periodo as p FROM consumo where Produto_idProduto="+idProduto+" and periodo like '%"+datas+"' order by periodo";              
      int qtde=0;
      String periodo=null;
      try {
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                con = new Consumo();
                qtde = rs.getInt("qtde");
                periodo = rs.getString("p");
                /*
                if(periodo == "08"){
                    periodo = "8";
                }
                if(periodo== "09"){
                    periodo="9";
                }*/
                con.setQuantidade(qtde);
                con.setPeriodo(periodo);
		listaConsumo.add(con);
            }
            stmt.close();
	}
	catch(SQLException e){
		e.printStackTrace();
	}
       return listaConsumo;
    } 
    
    public ArrayList<Consumo> getDadosEspecifico(int idProduto, String datas){
      ArrayList<Consumo> listaConsumo = new ArrayList<Consumo>(); 
      String query = "SELECT quantidade as qtde, periodo as p FROM consumo WHERE Produto_idProduto="+idProduto+" and periodo like '%"+datas+"' order by periodo ";              
      int qtde=0;
      String periodo=null;
      try {
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                con = new Consumo();
                qtde = rs.getInt("qtde");
                periodo = rs.getString("p");
                /*
                if(periodo == "08"){
                    periodo = "8";
                }
                if(periodo== "09"){
                    periodo="9";
                }*/
                con.setQuantidade(qtde);
                con.setPeriodo(periodo);
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
        String query = "SELECT valorCalculado FROM Estimativa where Produto_idProduto="+idProduto+" and data like '"+datas+"%' order by data";
         try {
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                es = new Estimativas();
                int valor = rs.getInt("valorCalculado");   
                
                es.setValorCalculado(valor);
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
    private javax.swing.JPanel opcaoMenuEmpresas;
    private javax.swing.JPanel opcaoMenuHome;
    private javax.swing.JPanel opcaoMenuPerfil;
    private javax.swing.JPanel opcaoMenuSair;
    private javax.swing.JPanel painelBackgroundForm;
    private javax.swing.JPanel painelForm;
    private javax.swing.JPanel painelGrafico;
    private javax.swing.JLabel subTitulo;
    // End of variables declaration//GEN-END:variables

    public void setUsuario(Usuario usuario){
        if(usuario != null){
            this.usuario = usuario;
        }
    }
}

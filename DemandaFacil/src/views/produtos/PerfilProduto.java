/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.produtos;

import controllers.control.core.CoreControl;
import javax.swing.JOptionPane;
import models.consumo.Consumo;
import models.consumo.ConsumoDAO;
import models.empresa.Empresa;
import models.produto.ProdutoDAO;
import models.produto.Produto;
import models.usuario.Usuario;
import views.estimativa.Estimativa;


public class PerfilProduto extends javax.swing.JFrame {

    private Empresa empresa;
    private Usuario usuario;
    private Produto produto;
    private Consumo consumo;
    
    public PerfilProduto() {
        initComponents();
    }
    public PerfilProduto(int id){
        initComponents();
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
        jbl_nome = new javax.swing.JLabel();
        jbl_periodo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_consumo = new javax.swing.JTable();
        jbl_consumo = new javax.swing.JLabel();
        btn_voltar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_consumo = new javax.swing.JButton();
        btn_estatisticas = new javax.swing.JButton();
        jbl_campo_nome = new javax.swing.JLabel();
        jbl_campo_periodo = new javax.swing.JLabel();
        jbl_campo_tipo = new javax.swing.JLabel();
        btn_editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Perfil do Produto - DemandaFácil 1.0");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                opcaoMenuHomeMouseClicked(evt);
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        nomePagina.setText("Produto");

        javax.swing.GroupLayout faixaTituloLayout = new javax.swing.GroupLayout(faixaTitulo);
        faixaTitulo.setLayout(faixaTituloLayout);
        faixaTituloLayout.setHorizontalGroup(
            faixaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faixaTituloLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(faixaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomePagina, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(248, Short.MAX_VALUE))
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

        jbl_nome.setText("Nome");

        jbl_periodo.setText("Período de Reposição");

        tbl_consumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Consumo", "Periodo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_consumo);

        jbl_consumo.setText("Consumo do Produto");

        btn_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Chevron Esquerda-26.png"))); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        btn_excluir.setForeground(java.awt.Color.red);
        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Excluir-26.png"))); // NOI18N
        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_consumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Mais-26.png"))); // NOI18N
        btn_consumo.setText("Inserir Consumo");
        btn_consumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consumoActionPerformed(evt);
            }
        });

        btn_estatisticas.setForeground(java.awt.Color.green);
        btn_estatisticas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Estatísticas-26.png"))); // NOI18N
        btn_estatisticas.setText("Estatísticas");
        btn_estatisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_estatisticasActionPerformed(evt);
            }
        });

        jbl_campo_nome.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jbl_campo_nome.setText("Nome Produto");

        jbl_campo_periodo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jbl_campo_periodo.setText("periodo");

        jbl_campo_tipo.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jbl_campo_tipo.setText("tipo");

        btn_editar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Editar propriedade-26.png"))); // NOI18N
        btn_editar.setText("Editar Produto");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelFormLayout = new javax.swing.GroupLayout(painelForm);
        painelForm.setLayout(painelFormLayout);
        painelFormLayout.setHorizontalGroup(
            painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelFormLayout.createSequentialGroup()
                        .addGroup(painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelFormLayout.createSequentialGroup()
                                .addGroup(painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbl_nome)
                                    .addGroup(painelFormLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jbl_campo_nome)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_estatisticas))
                            .addGroup(painelFormLayout.createSequentialGroup()
                                .addComponent(btn_voltar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_editar))
                            .addGroup(painelFormLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_consumo, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addGap(6, 6, 6)))
                        .addGap(34, 34, 34))
                    .addGroup(painelFormLayout.createSequentialGroup()
                        .addGroup(painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbl_consumo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelFormLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jbl_campo_periodo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbl_campo_tipo))
                            .addComponent(jbl_periodo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        painelFormLayout.setVerticalGroup(
            painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFormLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_estatisticas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(painelFormLayout.createSequentialGroup()
                        .addComponent(jbl_nome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbl_campo_nome)))
                .addGap(18, 18, 18)
                .addComponent(jbl_periodo)
                .addGap(13, 13, 13)
                .addGroup(painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbl_campo_periodo)
                    .addComponent(jbl_campo_tipo))
                .addGap(24, 24, 24)
                .addComponent(jbl_consumo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFormLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_editar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, Short.MAX_VALUE)))
                    .addComponent(btn_consumo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
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

        background.add(painelBackgroundForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 570, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        ListaDeProdutos listaProdutos = new ListaDeProdutos();
        listaProdutos.setEmpresa(empresa);
        listaProdutos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        // TODO add your handling code here:
        ProdutoDAO dao = new ProdutoDAO();
        if(dao.excluiProduto(produto)){
            ListaDeProdutos listaProdutos = new ListaDeProdutos();
            listaProdutos.setEmpresa(empresa);
            listaProdutos.setVisible(true);
            this.setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao Excluir, Tente Novamente!");
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_consumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consumoActionPerformed

        // TODO add your handling code here:
        String valor = "";
        int v = 0;
        consumo = new Consumo();
        consumo.setProduto(produto);
        ConsumoDAO dao = new ConsumoDAO();
        if(consumo.periodoExato()){
            do{
            valor = JOptionPane.showInputDialog(null, "Insira o Consumo: ", "Consumo", JOptionPane.PLAIN_MESSAGE);
                if (valor.equals("")) {
                    JOptionPane.showMessageDialog(null, "Digite um consumo válido.", "Valor inválido", JOptionPane.ERROR_MESSAGE);
                }else{
                    try{
                        v = Integer.parseInt(valor);
                    }catch(NumberFormatException ex){
                        System.err.println("Erro ao inserir: " + ex);
                        JOptionPane.showMessageDialog(null, "Formato de número inválido!", "Entrada Inválida", JOptionPane.ERROR_MESSAGE);
                    }
                    consumo.setQuantidade(v);
                    dao.create(consumo, tbl_consumo);
                }
            }while (valor.equals("") || v == 0);
        }else{
            JOptionPane.showMessageDialog(null, "Não é possível adicionar um consumo! Volte quando for "+ consumo.getPeriodo(), "Erro no Consumo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_consumoActionPerformed

    private void btn_estatisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_estatisticasActionPerformed
        String nomeProduto = jbl_campo_nome.getText();
        /*Teste teste = new Teste(nomeProduto);
        teste.setLocationRelativeTo(null);
        teste.setVisible(true);*/
        String reposicao = jbl_campo_periodo.getText();
        Estimativa estimativa = new Estimativa(nomeProduto, reposicao);
        estimativa.setUsuario(usuario);
        estimativa.setLocationRelativeTo(null);
        estimativa.setVisible(true);
    }//GEN-LAST:event_btn_estatisticasActionPerformed

    private void opcaoMenuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoMenuHomeMouseClicked
        
    }//GEN-LAST:event_opcaoMenuHomeMouseClicked

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed
        EditarProduto editarEmpresa = new EditarProduto();
        editarEmpresa.setProduto(produto);
        editarEmpresa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_editarActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        jbl_campo_nome.setText(produto.getNome());
        jbl_campo_periodo.setText(Integer.toString(produto.getPeriodo_de_reposicao()));
        jbl_campo_tipo.setText("Mês");
        ConsumoDAO dao = new ConsumoDAO();
        consumo = new Consumo();
        consumo.setProduto(produto);
        dao.listaConsumo(tbl_consumo, consumo);
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(PerfilProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerfilProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerfilProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerfilProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerfilProduto().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_consumo;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_estatisticas;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JPanel faixaTitulo;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel iconLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jbl_campo_nome;
    private javax.swing.JLabel jbl_campo_periodo;
    private javax.swing.JLabel jbl_campo_tipo;
    private javax.swing.JLabel jbl_consumo;
    private javax.swing.JLabel jbl_nome;
    private javax.swing.JLabel jbl_periodo;
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
    private javax.swing.JLabel subTitulo;
    private javax.swing.JTable tbl_consumo;
    // End of variables declaration//GEN-END:variables
    public void setProduto(Produto produto) {
        if(produto != null){
            this.produto = produto;
            this.empresa = produto.getEmpresa();
            this.usuario = empresa.getUsuario();
        }
    }

    public Produto getProduto() {
        return produto;
    }
}

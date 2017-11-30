
package views.empresa;

import controllers.control.core.CoreControl;
import javax.swing.JOptionPane;
import models.empresa.Empresa;
import models.empresa.EmpresaDAO;
import models.usuario.Usuario;


public class CadastroEmpresa extends javax.swing.JFrame {

    private Usuario usuario;
    
    public CadastroEmpresa() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelFundo = new javax.swing.JPanel();
        menuLateral = new javax.swing.JPanel();
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
        linhaDivisoria = new javax.swing.JPanel();
        faixaTitulo = new javax.swing.JPanel();
        subTitulo = new javax.swing.JLabel();
        nomePagina = new javax.swing.JLabel();
        painelBackgroundForm = new javax.swing.JPanel();
        painelForm = new javax.swing.JPanel();
        jPanelCadastro = new javax.swing.JPanel();
        lbl_numCnpj = new javax.swing.JLabel();
        lbl_nomeFantasia = new javax.swing.JLabel();
        txt_CNPJ = new javax.swing.JFormattedTextField();
        txt_nome = new javax.swing.JTextField();
        btn_cadastrar = new javax.swing.JButton();
        btn_voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar Empresa - DemandaFácil 1.0");
        setResizable(false);

        JPanelFundo.setBackground(new java.awt.Color(178, 242, 236));
        JPanelFundo.setPreferredSize(new java.awt.Dimension(820, 509));
        JPanelFundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuLateral.setBackground(new java.awt.Color(47, 79, 79));

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
        iconLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/logo/logotipo.png"))); // NOI18N

        linhaDivisoria.setBackground(new java.awt.Color(178, 242, 236));

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

        javax.swing.GroupLayout menuLateralLayout = new javax.swing.GroupLayout(menuLateral);
        menuLateral.setLayout(menuLateralLayout);
        menuLateralLayout.setHorizontalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcaoMenuHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opcaoMenuEmpresas, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
            .addComponent(opcaoMenuSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opcaoMenuPerfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(linhaDivisoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(iconLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLateralLayout.setVerticalGroup(
            menuLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLateralLayout.createSequentialGroup()
                .addComponent(iconLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(linhaDivisoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(opcaoMenuHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcaoMenuPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcaoMenuEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(opcaoMenuSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        JPanelFundo.add(menuLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 500));

        faixaTitulo.setBackground(new java.awt.Color(0, 128, 128));

        subTitulo.setFont(new java.awt.Font("Merriweather Light", 1, 24)); // NOI18N
        subTitulo.setForeground(java.awt.Color.white);
        subTitulo.setText("Empresa");
        subTitulo.setMaximumSize(new java.awt.Dimension(90, 24));
        subTitulo.setMinimumSize(new java.awt.Dimension(90, 24));

        nomePagina.setFont(new java.awt.Font("Merriweather Light", 1, 36)); // NOI18N
        nomePagina.setForeground(java.awt.Color.white);
        nomePagina.setText("Cadastrar Empresa");

        javax.swing.GroupLayout faixaTituloLayout = new javax.swing.GroupLayout(faixaTitulo);
        faixaTitulo.setLayout(faixaTituloLayout);
        faixaTituloLayout.setHorizontalGroup(
            faixaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faixaTituloLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(faixaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomePagina, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(214, Short.MAX_VALUE))
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

        JPanelFundo.add(faixaTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 0, 610, -1));

        painelBackgroundForm.setBackground(java.awt.Color.lightGray);

        lbl_numCnpj.setText("Informe o número do CNPJ ");

        lbl_nomeFantasia.setText("Informe o nome fantasia");

        try {
            txt_CNPJ.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txt_CNPJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_CNPJActionPerformed(evt);
            }
        });

        txt_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomeActionPerformed(evt);
            }
        });

        btn_cadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Adicionar propriedade-26.png"))); // NOI18N
        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Chevron Esquerda-26.png"))); // NOI18N
        btn_voltar.setText("Voltar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCadastroLayout = new javax.swing.GroupLayout(jPanelCadastro);
        jPanelCadastro.setLayout(jPanelCadastroLayout);
        jPanelCadastroLayout.setHorizontalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_numCnpj)
                            .addComponent(lbl_nomeFantasia))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addComponent(btn_voltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 280, Short.MAX_VALUE)
                        .addComponent(btn_cadastrar)
                        .addGap(24, 24, 24))
                    .addGroup(jPanelCadastroLayout.createSequentialGroup()
                        .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_CNPJ, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(txt_nome, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelCadastroLayout.setVerticalGroup(
            jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCadastroLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lbl_nomeFantasia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lbl_numCnpj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_CNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addGroup(jPanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout painelFormLayout = new javax.swing.GroupLayout(painelForm);
        painelForm.setLayout(painelFormLayout);
        painelFormLayout.setHorizontalGroup(
            painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelFormLayout.setVerticalGroup(
            painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelBackgroundFormLayout = new javax.swing.GroupLayout(painelBackgroundForm);
        painelBackgroundForm.setLayout(painelBackgroundFormLayout);
        painelBackgroundFormLayout.setHorizontalGroup(
            painelBackgroundFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelBackgroundFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelBackgroundFormLayout.setVerticalGroup(
            painelBackgroundFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBackgroundFormLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        JPanelFundo.add(painelBackgroundForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(249, 119, 570, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelFundo, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelFundo, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_CNPJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_CNPJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_CNPJActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed

        Empresa empresa = new Empresa();
        EmpresaDAO dao = new EmpresaDAO();
        
        empresa.setNome(txt_nome.getText());
        empresa.setCNPJ(txt_CNPJ.getText());
        empresa.setUsuario(usuario);
        if(!empresa.getNome().isEmpty() && !empresa.getCNPJ().isEmpty()){
            if(dao.create(empresa)){
                PerfilEmpresa perfilEmpresa = new PerfilEmpresa();
                perfilEmpresa.setEmpresa(empresa);
                perfilEmpresa.setVisible(true);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao Criar Empresa, Tente Novamente!", "Erro Cadastro Empresa", JOptionPane.ERROR_MESSAGE);
                txt_nome.setText("");
                txt_CNPJ.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Existe algum campo de inserção de dados vazio! Insira um valor válido!", "Erro Cadastro Empresa", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
        ListaDeEmpresas listaEmpresas = new ListaDeEmpresas();
        listaEmpresas.setUsuario(usuario);
        listaEmpresas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void txt_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomeActionPerformed

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

    private void opcaoMenuSairMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoMenuSairMouseReleased
        // TODO add your handling code here:
        CoreControl core = new CoreControl(usuario);
        core.returnLogin();
        this.setVisible(false);
    }//GEN-LAST:event_opcaoMenuSairMouseReleased

    private void opcaoMenuEmpresasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_opcaoMenuEmpresasMouseReleased
        // TODO add your handling code here:
        CoreControl core = new CoreControl(usuario);
        core.returnEmpresas();
        this.setVisible(false);
    }//GEN-LAST:event_opcaoMenuEmpresasMouseReleased

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
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelFundo;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JPanel faixaTitulo;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel iconLogo;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JLabel lbl_nomeFantasia;
    private javax.swing.JLabel lbl_numCnpj;
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
    private javax.swing.JFormattedTextField txt_CNPJ;
    private javax.swing.JTextField txt_nome;
    // End of variables declaration//GEN-END:variables

    public void setUsuario(Usuario usuario) {
        if(usuario != null){
            this.usuario = usuario;
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

}

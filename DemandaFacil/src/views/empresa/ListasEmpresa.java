
package views.empresa;

public class ListasEmpresa extends javax.swing.JFrame {

    public ListasEmpresa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        faixaTitulo = new javax.swing.JPanel();
        subTitulo = new javax.swing.JLabel();
        nomePagina = new javax.swing.JLabel();
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
        painelBackgroundForm = new javax.swing.JPanel();
        painelForm = new javax.swing.JPanel();
        jPanel_Lista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Lista_Empresa = new javax.swing.JTable();
        txt_busca_empresa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(178, 242, 236));

        faixaTitulo.setBackground(new java.awt.Color(0, 128, 128));

        subTitulo.setFont(new java.awt.Font("Merriweather Light", 1, 24)); // NOI18N
        subTitulo.setForeground(java.awt.Color.white);
        subTitulo.setText("Listas");
        subTitulo.setMaximumSize(new java.awt.Dimension(90, 24));
        subTitulo.setMinimumSize(new java.awt.Dimension(90, 24));

        nomePagina.setFont(new java.awt.Font("Merriweather Light", 1, 36)); // NOI18N
        nomePagina.setForeground(java.awt.Color.white);
        nomePagina.setText("Empresa");

        javax.swing.GroupLayout faixaTituloLayout = new javax.swing.GroupLayout(faixaTitulo);
        faixaTitulo.setLayout(faixaTituloLayout);
        faixaTituloLayout.setHorizontalGroup(
            faixaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(faixaTituloLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(faixaTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(faixaTituloLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(nomePagina, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(subTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        menuLateral.setBackground(new java.awt.Color(47, 79, 79));

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
            .addComponent(opcaoMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
            .addComponent(opcaoMenu1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(opcaoMenu3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(opcaoMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcaoMenu3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcaoMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(opcaoMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        painelBackgroundForm.setBackground(java.awt.Color.lightGray);

        JTable_Lista_Empresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTable_Lista_Empresa);

        txt_busca_empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_busca_empresaActionPerformed(evt);
            }
        });

        jLabel2.setText("Informe o nome da empresa");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icones/icons8-Chevron Esquerda-26.png"))); // NOI18N
        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Empresas");

        javax.swing.GroupLayout jPanel_ListaLayout = new javax.swing.GroupLayout(jPanel_Lista);
        jPanel_Lista.setLayout(jPanel_ListaLayout);
        jPanel_ListaLayout.setHorizontalGroup(
            jPanel_ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ListaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel_ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 483, Short.MAX_VALUE)
                    .addGroup(jPanel_ListaLayout.createSequentialGroup()
                        .addGroup(jPanel_ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton3)
                            .addComponent(jLabel2)
                            .addComponent(txt_busca_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_ListaLayout.setVerticalGroup(
            jPanel_ListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_ListaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_busca_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelFormLayout = new javax.swing.GroupLayout(painelForm);
        painelForm.setLayout(painelFormLayout);
        painelFormLayout.setHorizontalGroup(
            painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Lista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        painelFormLayout.setVerticalGroup(
            painelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Lista, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(painelBackgroundForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(faixaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(faixaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(painelBackgroundForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(menuLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_busca_empresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_busca_empresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_busca_empresaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


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
            java.util.logging.Logger.getLogger(ListasEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListasEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListasEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListasEmpresa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListasEmpresa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable_Lista_Empresa;
    private javax.swing.JPanel faixaTitulo;
    private javax.swing.JLabel icon;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel iconLogo;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel_Lista;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JLabel subTitulo;
    private javax.swing.JTextField txt_busca_empresa;
    // End of variables declaration//GEN-END:variables
}

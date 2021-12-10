package vision;

import javax.swing.JOptionPane;

public class ClienteOuFuncionario extends javax.swing.JFrame {

    public ClienteOuFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        clienteOuFuncionarioClienteBtn = new javax.swing.JRadioButton();
        clienteOuFuncionarioFuncionarioBtn = new javax.swing.JRadioButton();
        clienteOuFuncionarioAvancarBtn = new javax.swing.JButton();
        clienteOuFuncionarioVoltarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecione o Cadastro");
        setBackground(new java.awt.Color(153, 153, 153));
        setForeground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel3.setText("Selecione o Cadastro");
        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));

        clienteOuFuncionarioClienteBtn.setText("Cliente");
        clienteOuFuncionarioClienteBtn.setBackground(new java.awt.Color(153, 153, 153));
        clienteOuFuncionarioClienteBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clienteOuFuncionarioClienteBtn.setForeground(new java.awt.Color(0, 0, 0));
        clienteOuFuncionarioClienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteOuFuncionarioClienteBtnActionPerformed(evt);
            }
        });

        clienteOuFuncionarioFuncionarioBtn.setText("Funcionário");
        clienteOuFuncionarioFuncionarioBtn.setBackground(new java.awt.Color(153, 153, 153));
        clienteOuFuncionarioFuncionarioBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clienteOuFuncionarioFuncionarioBtn.setForeground(new java.awt.Color(0, 0, 0));
        clienteOuFuncionarioFuncionarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteOuFuncionarioFuncionarioBtnActionPerformed(evt);
            }
        });

        clienteOuFuncionarioAvancarBtn.setBackground(new java.awt.Color(204, 204, 204));
        clienteOuFuncionarioAvancarBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clienteOuFuncionarioAvancarBtn.setForeground(new java.awt.Color(0, 0, 0));
        clienteOuFuncionarioAvancarBtn.setText("Avançar");
        clienteOuFuncionarioAvancarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteOuFuncionarioAvancarBtnActionPerformed(evt);
            }
        });

        clienteOuFuncionarioVoltarBtn.setText("Voltar");
        clienteOuFuncionarioVoltarBtn.setBackground(new java.awt.Color(204, 204, 204));
        clienteOuFuncionarioVoltarBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        clienteOuFuncionarioVoltarBtn.setForeground(new java.awt.Color(0, 0, 0));
        clienteOuFuncionarioVoltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteOuFuncionarioVoltarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clienteOuFuncionarioFuncionarioBtn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(clienteOuFuncionarioClienteBtn))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clienteOuFuncionarioVoltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clienteOuFuncionarioAvancarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clienteOuFuncionarioClienteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clienteOuFuncionarioFuncionarioBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteOuFuncionarioAvancarBtn)
                    .addComponent(clienteOuFuncionarioVoltarBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clienteOuFuncionarioFuncionarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteOuFuncionarioFuncionarioBtnActionPerformed
        //Selecionado funcionario;
        clienteOuFuncionarioClienteBtn.setSelected(false);
    }//GEN-LAST:event_clienteOuFuncionarioFuncionarioBtnActionPerformed

    private void clienteOuFuncionarioClienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteOuFuncionarioClienteBtnActionPerformed
        //Selecionado cliente;
        clienteOuFuncionarioFuncionarioBtn.setSelected(false);
    }//GEN-LAST:event_clienteOuFuncionarioClienteBtnActionPerformed

    private void clienteOuFuncionarioAvancarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteOuFuncionarioAvancarBtnActionPerformed
        //Váriaveis para verificar seleção do usuario;
        boolean cliente = clienteOuFuncionarioClienteBtn.isSelected();
        boolean funcionario = clienteOuFuncionarioFuncionarioBtn.isSelected();

        //Abrindo tela de cadastro de cliente, caso seja selecionado cliente;
        if (clienteOuFuncionarioClienteBtn.isSelected()) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new CadastroCliente().setVisible(true);
                }
            });
            dispose();
        }

        //Abrindo aviso do RH, caso seja selecionado funcionario;
        if (clienteOuFuncionarioFuncionarioBtn.isSelected()) {
            JOptionPane.showMessageDialog(null, "Entre em contato com o RH para efetuar seu cadastro!", "Atenção", JOptionPane.WARNING_MESSAGE);
            dispose();
        }

        //Verificando se o usuário não marcou nenhuma opçao;
        if (funcionario == false && cliente == false) {
            JOptionPane.showMessageDialog(null, "Selecione alguma opção!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_clienteOuFuncionarioAvancarBtnActionPerformed

    private void clienteOuFuncionarioVoltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteOuFuncionarioVoltarBtnActionPerformed
        dispose();
    }//GEN-LAST:event_clienteOuFuncionarioVoltarBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clienteOuFuncionarioAvancarBtn;
    private javax.swing.JRadioButton clienteOuFuncionarioClienteBtn;
    private javax.swing.JRadioButton clienteOuFuncionarioFuncionarioBtn;
    private javax.swing.JButton clienteOuFuncionarioVoltarBtn;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

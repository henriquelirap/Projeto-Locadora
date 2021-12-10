package vision;

import static dao.CaixaDAO.inserirMov;
import static dao.LocacaoDAO.Pagamento;
import static dao.LocacaoDAO.atualizarValorTotal;
import static dao.VeiculoDAO.atualizarStatusDisp;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Caixa;
import static vision.Login.total;

public class Pagamento extends javax.swing.JFrame {

    public static String formaPagamento;

    public Pagamento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        dinheiro = new javax.swing.JRadioButton();
        cartao = new javax.swing.JRadioButton();
        finalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Forma de Pagamento");
        setBackground(new java.awt.Color(153, 153, 153));
        setForeground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Forma de Pagamento");

        dinheiro.setBackground(new java.awt.Color(153, 153, 153));
        dinheiro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dinheiro.setForeground(new java.awt.Color(0, 0, 0));
        dinheiro.setText("Dinheiro");
        dinheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dinheiroActionPerformed(evt);
            }
        });

        cartao.setBackground(new java.awt.Color(153, 153, 153));
        cartao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cartao.setForeground(new java.awt.Color(0, 0, 0));
        cartao.setText("Cartão");
        cartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartaoActionPerformed(evt);
            }
        });

        finalizar.setBackground(new java.awt.Color(204, 204, 204));
        finalizar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        finalizar.setForeground(new java.awt.Color(0, 0, 0));
        finalizar.setText("Finalizar");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dinheiro))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3)))
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cartao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(finalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dinheiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cartao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalizar)
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

    private void cartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartaoActionPerformed
        //Selecionado dinheiro;
        dinheiro.setSelected(false);
    }//GEN-LAST:event_cartaoActionPerformed

    private void dinheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dinheiroActionPerformed
        //Selecionado cartao;
        cartao.setSelected(false);
    }//GEN-LAST:event_dinheiroActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        DateFormat formatUS = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat formatBR = new SimpleDateFormat("dd-MM-yyyy");

        //Váriaveis para verificar seleção do usuario;
        boolean dinheiroAux = dinheiro.isSelected();
        boolean cartaoAux = cartao.isSelected();
        String data = LocalDate.now().toString();

        //Verificando se o usuário não marcou nenhuma opçao;
        if (dinheiroAux == false && cartaoAux == false) {
            JOptionPane.showMessageDialog(null, "Selecione alguma opção!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        //Prenchendo a tabela locação com forma de pagamento dinheiro;
        if (dinheiro.isSelected()) {
            formaPagamento = "Dinheiro";
            try {
                Pagamento();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        //Prenchendo a tabela locação com forma de pagamento cartão;
        if (cartao.isSelected()) {
            formaPagamento = "Cartao";
            try {
                Pagamento();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        try {
            atualizarValorTotal();
            atualizarStatusDisp();
            Date d1 = formatUS.parse(data);
            data = formatBR.format(d1);
            Caixa caixa = new Caixa(data, total);
            inserirMov(caixa);
            JOptionPane.showMessageDialog(null, "Finalizado com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new MinhasLocacoesCliente().setVisible(true);
                }
            });
        } catch (SQLException ex) {
            Logger.getLogger(Pagamento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Pagamento.class.getName()).log(Level.SEVERE, null, ex);

    }//GEN-LAST:event_finalizarActionPerformed
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton cartao;
    private javax.swing.JRadioButton dinheiro;
    private javax.swing.JButton finalizar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

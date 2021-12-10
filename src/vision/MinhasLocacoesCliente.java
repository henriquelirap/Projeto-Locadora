package vision;

import static dao.LocacaoDAO.locacoesCliente;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Locacao;
import static vision.Login.diaria;
import static vision.Login.total;
import static vision.Login.veiculo_id_locado;
import static vision.Login.locacao_id;
import static vision.Login.locacao_id_caixa;

public class MinhasLocacoesCliente extends javax.swing.JFrame {

    public static String dataHoje;

    public MinhasLocacoesCliente() {
        initComponents();
        minhasLocacoes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        efetuarDevolucao = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLocacaoCliente = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Minhas Locações");

        efetuarDevolucao.setBackground(new java.awt.Color(204, 204, 204));
        efetuarDevolucao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        efetuarDevolucao.setForeground(new java.awt.Color(0, 0, 0));
        efetuarDevolucao.setText("Efetuar Devolução");
        efetuarDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                efetuarDevolucaoActionPerformed(evt);
            }
        });

        tabelaLocacaoCliente.setBackground(new java.awt.Color(204, 204, 204));
        tabelaLocacaoCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabelaLocacaoCliente.setForeground(new java.awt.Color(0, 0, 0));
        tabelaLocacaoCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Locação ID", "Veículo ID", "Veículo", "Valor Diária", "Data Locação", "Data Devolução", "Valor Total", "Status", "Forma de Pagamento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaLocacaoCliente.setRowHeight(35);
        jScrollPane1.setViewportView(tabelaLocacaoCliente);

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1120, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(efetuarDevolucao)
                .addGap(0, 950, Short.MAX_VALUE))
            .addComponent(jDesktopPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(efetuarDevolucao)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void efetuarDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_efetuarDevolucaoActionPerformed
        int linha = -1;
        linha = tabelaLocacaoCliente.getSelectedRow();
        Date d1 = null, d2 = null, d3 = null;

        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um veículo!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (tabelaLocacaoCliente.getValueAt(linha, 7).toString().contains("Finalizado")) {
            JOptionPane.showMessageDialog(null, "Locação já finalizada!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (linha != -1) {
            DateFormat formatUS = new SimpleDateFormat("yyyy-MM-dd");
            DateFormat formatBR = new SimpleDateFormat("dd-MM-yyyy");
            locacao_id_caixa = Integer.parseInt(tabelaLocacaoCliente.getValueAt(linha, 0).toString());
            String dataLoc = tabelaLocacaoCliente.getValueAt(linha, 4).toString();
            String dataDev = tabelaLocacaoCliente.getValueAt(linha, 5).toString();
            diaria = Double.parseDouble(tabelaLocacaoCliente.getValueAt(linha, 3).toString());
            veiculo_id_locado = Integer.parseInt(tabelaLocacaoCliente.getValueAt(linha, 1).toString());
            locacao_id = Integer.parseInt(tabelaLocacaoCliente.getValueAt(linha, 0).toString());
            dataHoje = LocalDate.now().toString();

            try {
                d1 = formatBR.parse(dataLoc);
                d2 = formatBR.parse(dataDev);
                d3 = formatUS.parse(dataHoje);
                dataHoje = formatBR.format(d3);
            } catch (Exception e) {
            }

            //Recalculando diarias usadas;
            if (!dataHoje.contains(dataDev)) {
                long diferencaTempo = d3.getTime() - d1.getTime();
                double diferencaEmDias = diferencaTempo / (double) TimeUnit.DAYS.toMillis(1);
                total = (diferencaEmDias * diaria) + diaria;
                total = Double.parseDouble(String.format("%.2f", total).toString().replaceAll("[,]", "."));
                JOptionPane.showMessageDialog(null, "Devido a data de devolução ser diferente do contratado, o valor final será recalculado!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Total Anterior: R$" + tabelaLocacaoCliente.getValueAt(linha, 6).toString() + "\n" + "Total Atualizado: R$" + total, "Atenção", JOptionPane.INFORMATION_MESSAGE);
            } else {
                total = Double.parseDouble(tabelaLocacaoCliente.getValueAt(linha, 6).toString());
            }

            //Executando janela de pagamento;
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Pagamento().setVisible(true);
                }
            });
            dispose();
        }

    }//GEN-LAST:event_efetuarDevolucaoActionPerformed

    //Método para listar as locações do usuário logado;
    private void minhasLocacoes() {
        ArrayList<Locacao> todasLocacoes = new ArrayList<Locacao>();
        try {
            todasLocacoes = locacoesCliente();
            DefaultTableModel model = (DefaultTableModel) tabelaLocacaoCliente.getModel();
            model.setNumRows(0);
            for (Locacao t : todasLocacoes) {
                model.addRow(new Object[]{t.getLocacao_id(), t.getVeiculo_id(), t.getNome_veiculo(), t.getValor_diaria(), t.getData_locacao(), t.getData_devolucao(), t.getValor_total(), t.getStatus(), t.getPagamento()});
            }
        } catch (SQLException ex) {
            Logger.getLogger(MinhasLocacoesCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton efetuarDevolucao;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaLocacaoCliente;
    // End of variables declaration//GEN-END:variables
}

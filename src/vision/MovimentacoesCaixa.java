package vision;

import static vision.Login.veiculo_id_locado;
import static dao.LocacaoDAO.removeLoc;
import static dao.CaixaDAO.todasMovCaixaAdm;
import static dao.LocacaoDAO.todasLocacoes;
import static dao.LocacaoDAO.todasLocacoesAbertas;
import static dao.LocacaoDAO.todasLocacoesAbertasData;
import static dao.LocacaoDAO.todasLocacoesData;
import static dao.LocacaoDAO.todasLocacoesFinalizadas;
import static dao.LocacaoDAO.todasLocacoesFinalizadasData;
import static dao.VeiculoDAO.atualizarStatusDisp;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Caixa;
import model.Locacao;

public class MovimentacoesCaixa extends javax.swing.JFrame {

    public static String dataMov;
    private int linha;

    public MovimentacoesCaixa() {
        initComponents();
        dataCaixa.setDateToToday();
        caixaMov();
        listarTodasLocacoesData();
        todosData.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaCaixa = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dinheirotxf = new javax.swing.JTextField();
        totaltxf = new javax.swing.JTextField();
        cartaotxf = new javax.swing.JTextField();
        dataCaixa = new com.github.lgooddatepicker.components.DatePicker();
        jLabel6 = new javax.swing.JLabel();
        abertoData = new javax.swing.JRadioButton();
        finalizadosData = new javax.swing.JRadioButton();
        todosData = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        todosGeral = new javax.swing.JRadioButton();
        abertoGeral = new javax.swing.JRadioButton();
        finalizadosGeral = new javax.swing.JRadioButton();
        removerBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Movimentações do Caixa");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        tabelaCaixa.setBackground(new java.awt.Color(204, 204, 204));
        tabelaCaixa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabelaCaixa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabelaCaixa.setForeground(new java.awt.Color(0, 0, 0));
        tabelaCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Locação ID", "Cliente ID", "Cliente", "Veículo ID", "Veiculo", "Data de Locação", "Data de Devolução", "Valor Total", "Forma de Pagamento", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaCaixa.setRowHeight(35);
        jScrollPane2.setViewportView(tabelaCaixa);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Data do Caixa/Movimentações");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setText("Cartão");
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setText("Dinheiro");
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setText("Total do Caixa Diário");
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));

        dinheirotxf.setEditable(false);
        dinheirotxf.setBackground(new java.awt.Color(204, 204, 204));
        dinheirotxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        totaltxf.setEditable(false);
        totaltxf.setBackground(new java.awt.Color(204, 204, 204));
        totaltxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        cartaotxf.setEditable(false);
        cartaotxf.setBackground(new java.awt.Color(204, 204, 204));
        cartaotxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        dataCaixa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setText("Filtro de Tabela por Dia ");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));

        abertoData.setText("Aberto");
        abertoData.setBackground(new java.awt.Color(153, 153, 153));
        abertoData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        abertoData.setForeground(new java.awt.Color(0, 0, 0));
        abertoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abertoDataActionPerformed(evt);
            }
        });

        finalizadosData.setText("Finalizados");
        finalizadosData.setBackground(new java.awt.Color(153, 153, 153));
        finalizadosData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        finalizadosData.setForeground(new java.awt.Color(0, 0, 0));
        finalizadosData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizadosDataActionPerformed(evt);
            }
        });

        todosData.setText("Todos");
        todosData.setBackground(new java.awt.Color(153, 153, 153));
        todosData.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        todosData.setForeground(new java.awt.Color(0, 0, 0));
        todosData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosDataActionPerformed(evt);
            }
        });

        jLabel7.setText("Filtro de Tabela Geral");
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));

        todosGeral.setText("Todos");
        todosGeral.setBackground(new java.awt.Color(153, 153, 153));
        todosGeral.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        todosGeral.setForeground(new java.awt.Color(255, 0, 0));
        todosGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosGeralActionPerformed(evt);
            }
        });

        abertoGeral.setText("Aberto");
        abertoGeral.setBackground(new java.awt.Color(153, 153, 153));
        abertoGeral.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        abertoGeral.setForeground(new java.awt.Color(255, 0, 0));
        abertoGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abertoGeralActionPerformed(evt);
            }
        });

        finalizadosGeral.setText("Finalizados");
        finalizadosGeral.setBackground(new java.awt.Color(153, 153, 153));
        finalizadosGeral.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        finalizadosGeral.setForeground(new java.awt.Color(255, 0, 0));
        finalizadosGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizadosGeralActionPerformed(evt);
            }
        });

        removerBtn.setBackground(new java.awt.Color(204, 204, 204));
        removerBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        removerBtn.setForeground(new java.awt.Color(0, 0, 0));
        removerBtn.setText("Remover Movimentação ");
        removerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBtnAction(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dataCaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(7, 7, 7))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dinheirotxf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cartaotxf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(totaltxf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(abertoData)
                            .addComponent(finalizadosData)
                            .addComponent(todosData)
                            .addComponent(jLabel6)
                            .addComponent(abertoGeral)
                            .addComponent(finalizadosGeral)
                            .addComponent(todosGeral)
                            .addComponent(jLabel7)
                            .addComponent(removerBtn))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dinheirotxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cartaotxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(totaltxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(todosData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abertoData)
                .addGap(5, 5, 5)
                .addComponent(finalizadosData)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(todosGeral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abertoGeral)
                .addGap(5, 5, 5)
                .addComponent(finalizadosGeral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removerBtn)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1220, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void abertoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abertoDataActionPerformed
        finalizadosData.setSelected(false);
        todosData.setSelected(false);
        todosGeral.setSelected(false);
        abertoGeral.setSelected(false);
        finalizadosGeral.setSelected(false);
        listarLocacoesAbertasData();
    }//GEN-LAST:event_abertoDataActionPerformed

    private void finalizadosDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizadosDataActionPerformed
        abertoData.setSelected(false);
        todosData.setSelected(false);
        todosGeral.setSelected(false);
        abertoGeral.setSelected(false);
        finalizadosGeral.setSelected(false);
        listarLocacoesFinalizadasData();
    }//GEN-LAST:event_finalizadosDataActionPerformed

    private void todosDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosDataActionPerformed
        finalizadosData.setSelected(false);
        abertoData.setSelected(false);
        todosGeral.setSelected(false);
        abertoGeral.setSelected(false);
        finalizadosGeral.setSelected(false);
        listarTodasLocacoesData();
    }//GEN-LAST:event_todosDataActionPerformed

    private void todosGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosGeralActionPerformed
        todosData.setSelected(false);
        finalizadosData.setSelected(false);
        abertoData.setSelected(false);
        abertoGeral.setSelected(false);
        finalizadosGeral.setSelected(false);
        listarTodasLocacoes();
    }//GEN-LAST:event_todosGeralActionPerformed

    private void abertoGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abertoGeralActionPerformed
        todosData.setSelected(false);
        finalizadosData.setSelected(false);
        abertoData.setSelected(false);
        todosGeral.setSelected(false);
        finalizadosGeral.setSelected(false);
        listarLocacoesAbertas();
    }//GEN-LAST:event_abertoGeralActionPerformed

    private void finalizadosGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizadosGeralActionPerformed
        todosData.setSelected(false);
        finalizadosData.setSelected(false);
        abertoData.setSelected(false);
        abertoGeral.setSelected(false);
        todosGeral.setSelected(false);
        listarLocacoesFinalizadas();
    }//GEN-LAST:event_finalizadosGeralActionPerformed

    private void removerBtnAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBtnAction
        linha = tabelaCaixa.getSelectedRow();
        veiculo_id_locado = Integer.parseInt(tabelaCaixa.getValueAt(linha, 3).toString());
        if (tabelaCaixa.getValueAt(linha, 9).toString().contentEquals("Aberto")) {
            int locId = Integer.parseInt(tabelaCaixa.getValueAt(linha, 0).toString());
            try {
                removeLoc(locId);
                atualizarStatusDisp();
                JOptionPane.showMessageDialog(null, "Removido com sucesso!", "Atenção", JOptionPane.WARNING_MESSAGE);
                dispose();
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new MovimentacoesCaixa().setVisible(true);
                    }
                });              
            } catch (SQLException ex) {
                Logger.getLogger(MovimentacoesCaixa.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não é possível remover uma movimentação finalizada!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_removerBtnAction

    //Método para caixa buscar a data selecionada em tabela;
    private void caixaMov() {
        dataMov = dataCaixa.getDate().toString();
        DateFormat formatUS = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat formatBR = new SimpleDateFormat("dd-MM-yyyy");
        Caixa caixaDiaAdm = null;

        try {
            Date d1 = formatUS.parse(dataMov);
            dataMov = formatBR.format(d1);
            caixaDiaAdm = todasMovCaixaAdm();
            dinheirotxf.setText(String.valueOf(caixaDiaAdm.getDinheiro()));
            cartaotxf.setText(String.valueOf(caixaDiaAdm.getCartao()));
            double tot = caixaDiaAdm.getDinheiro() + caixaDiaAdm.getCartao();
            totaltxf.setText(String.valueOf(tot));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Método para habilitar botão de remoção, caso seja transaçao em aberto;
    private void removerMovimentacao() {
        if (tabelaCaixa.getValueAt(linha, 9).toString().contentEquals("Aberto")) {
            removerBtn.setEnabled(true);
        } else {
            removerBtn.setEnabled(false);
        }
    }

    //Listando todas as locações de todos clientes por data selecionada;
    private void listarTodasLocacoesData() {
        ArrayList<Locacao> todasLoc = new ArrayList<Locacao>();
        try {
            todasLoc = todasLocacoesData();
            DefaultTableModel model = (DefaultTableModel) tabelaCaixa.getModel();
            model.setNumRows(0);
            for (Locacao t : todasLoc) {
                model.addRow(new Object[]{t.getLocacao_id(), t.getCliente_id(), t.getNome_cliente(), t.getVeiculo_id(), t.getNome_veiculo(), t.getData_locacao(), t.getData_devolucao(), t.getValor_total(), t.getPagamento(), t.getStatus()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Listando todas as locações abertas de todos clientes por data selecionada;
    private void listarLocacoesAbertasData() {
        ArrayList<Locacao> todasLoc = new ArrayList<Locacao>();
        try {
            todasLoc = todasLocacoesAbertasData();
            DefaultTableModel model = (DefaultTableModel) tabelaCaixa.getModel();
            model.setNumRows(0);
            for (Locacao t : todasLoc) {
                model.addRow(new Object[]{t.getLocacao_id(), t.getCliente_id(), t.getNome_cliente(), t.getVeiculo_id(), t.getNome_veiculo(), t.getData_locacao(), t.getData_devolucao(), t.getValor_total(), t.getPagamento(), t.getStatus()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Listando todas as locações abertas de todos clientes por data selecionada;
    private void listarLocacoesFinalizadasData() {
        ArrayList<Locacao> todasLoc = new ArrayList<Locacao>();
        try {
            todasLoc = todasLocacoesFinalizadasData();
            DefaultTableModel model = (DefaultTableModel) tabelaCaixa.getModel();
            model.setNumRows(0);
            for (Locacao t : todasLoc) {
                model.addRow(new Object[]{t.getLocacao_id(), t.getCliente_id(), t.getNome_cliente(), t.getVeiculo_id(), t.getNome_veiculo(), t.getData_locacao(), t.getData_devolucao(), t.getValor_total(), t.getPagamento(), t.getStatus()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Listando todas as locações de todos clientes;
    private void listarTodasLocacoes() {
        ArrayList<Locacao> todasLoc = new ArrayList<Locacao>();
        try {
            todasLoc = todasLocacoes();
            DefaultTableModel model = (DefaultTableModel) tabelaCaixa.getModel();
            model.setNumRows(0);
            for (Locacao t : todasLoc) {
                model.addRow(new Object[]{t.getLocacao_id(), t.getCliente_id(), t.getNome_cliente(), t.getVeiculo_id(), t.getNome_veiculo(), t.getData_locacao(), t.getData_devolucao(), t.getValor_total(), t.getPagamento(), t.getStatus()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Listando todas as locações abertas de todos clientes;
    private void listarLocacoesAbertas() {
        ArrayList<Locacao> todasLoc = new ArrayList<Locacao>();
        try {
            todasLoc = todasLocacoesAbertas();
            DefaultTableModel model = (DefaultTableModel) tabelaCaixa.getModel();
            model.setNumRows(0);
            for (Locacao t : todasLoc) {
                model.addRow(new Object[]{t.getLocacao_id(), t.getCliente_id(), t.getNome_cliente(), t.getVeiculo_id(), t.getNome_veiculo(), t.getData_locacao(), t.getData_devolucao(), t.getValor_total(), t.getPagamento(), t.getStatus()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Listando todas as locações abertas de todos clientes;
    private void listarLocacoesFinalizadas() {
        ArrayList<Locacao> todasLoc = new ArrayList<Locacao>();
        try {
            todasLoc = todasLocacoesFinalizadas();
            DefaultTableModel model = (DefaultTableModel) tabelaCaixa.getModel();
            model.setNumRows(0);
            for (Locacao t : todasLoc) {
                model.addRow(new Object[]{t.getLocacao_id(), t.getCliente_id(), t.getNome_cliente(), t.getVeiculo_id(), t.getNome_veiculo(), t.getData_locacao(), t.getData_devolucao(), t.getValor_total(), t.getPagamento(), t.getStatus()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton abertoData;
    private javax.swing.JRadioButton abertoGeral;
    private javax.swing.JTextField cartaotxf;
    private com.github.lgooddatepicker.components.DatePicker dataCaixa;
    private javax.swing.JTextField dinheirotxf;
    private javax.swing.JRadioButton finalizadosData;
    private javax.swing.JRadioButton finalizadosGeral;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton removerBtn;
    private javax.swing.JTable tabelaCaixa;
    private javax.swing.JRadioButton todosData;
    private javax.swing.JRadioButton todosGeral;
    private javax.swing.JTextField totaltxf;
    // End of variables declaration//GEN-END:variables
}

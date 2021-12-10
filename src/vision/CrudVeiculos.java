package vision;

import static dao.VeiculoDAO.listarTodosVeiculos;
import static dao.VeiculoDAO.listarVeiculosDisponiveis;
import static dao.VeiculoDAO.listarVeiculosNaoDisponiveis;
import static dao.VeiculoDAO.removerVeiculos;
import static vision.Login.veiculoidSelecionado;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Veiculo;
import static vision.Login.nivelAcessado;

public class CrudVeiculos extends javax.swing.JFrame {

    public CrudVeiculos() {
        initComponents();
        todosVeiculosCadastrados();
        verificaFunc();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVeiculos = new javax.swing.JTable();
        todos = new javax.swing.JRadioButton();
        naoDisponiveis = new javax.swing.JRadioButton();
        disponiveis = new javax.swing.JRadioButton();
        removerVeiculo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(550, 550));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Filtro");

        tabelaVeiculos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabelaVeiculos.setForeground(new java.awt.Color(0, 0, 0));
        tabelaVeiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Veículo ID", "Nome", "Modelo", "Marca", "Valor Diária", "Status", "Cliente em Posse"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaVeiculos.setRowHeight(35);
        jScrollPane1.setViewportView(tabelaVeiculos);

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1305, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 626, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        todos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        todos.setForeground(new java.awt.Color(0, 0, 0));
        todos.setText("Todos");
        todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                todosActionPerformed(evt);
            }
        });

        naoDisponiveis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        naoDisponiveis.setForeground(new java.awt.Color(0, 0, 0));
        naoDisponiveis.setText("Não Disponíveis");
        naoDisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                naoDisponiveisActionPerformed(evt);
            }
        });

        disponiveis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        disponiveis.setForeground(new java.awt.Color(0, 0, 0));
        disponiveis.setText("Disponíveis");
        disponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disponiveisActionPerformed(evt);
            }
        });

        removerVeiculo.setBackground(new java.awt.Color(204, 204, 204));
        removerVeiculo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        removerVeiculo.setForeground(new java.awt.Color(0, 0, 0));
        removerVeiculo.setText("Remover Selecionado");
        removerVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerVeiculoActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jDesktopPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(todos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(naoDisponiveis, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(disponiveis, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(removerVeiculo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDesktopPane1)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(todos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(disponiveis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(naoDisponiveis)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(removerVeiculo)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(todos)
                    .addComponent(disponiveis)
                    .addComponent(naoDisponiveis)
                    .addComponent(removerVeiculo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void disponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disponiveisActionPerformed
        todos.setSelected(false);
        naoDisponiveis.setSelected(false);
        todosVeiculosDisponiveis();
    }//GEN-LAST:event_disponiveisActionPerformed

    private void todosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_todosActionPerformed
        disponiveis.setSelected(false);
        naoDisponiveis.setSelected(false);
        todosVeiculosCadastrados();
    }//GEN-LAST:event_todosActionPerformed

    private void naoDisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_naoDisponiveisActionPerformed
        todos.setSelected(false);
        disponiveis.setSelected(false);
        todosVeiculosNaoDisponiveis();
    }//GEN-LAST:event_naoDisponiveisActionPerformed

    private void removerVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerVeiculoActionPerformed
        int linha = tabelaVeiculos.getSelectedRow();
        veiculoidSelecionado = Integer.parseInt(tabelaVeiculos.getValueAt(linha, 0).toString());
        if (!tabelaVeiculos.getValueAt(linha, 5).toString().contains("Não")) {
            try {
                removerVeiculos();
                JOptionPane.showMessageDialog(null, "Removido com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new CrudVeiculos().setVisible(true);
                    }
                });
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Não é possivel remover um veículo Não-Disponível!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_removerVeiculoActionPerformed

    //Método para mostrar todos os veículos cadastrados;
    private void todosVeiculosCadastrados() {
        ArrayList<Veiculo> todosVeiculos = new ArrayList<Veiculo>();
        try {
            todosVeiculos = listarTodosVeiculos();
            DefaultTableModel model = (DefaultTableModel) tabelaVeiculos.getModel();
            model.setNumRows(0);
            for (Veiculo t : todosVeiculos) {
                model.addRow(new Object[]{t.getVeiculo_id(), t.getNome(), t.getModelo(), t.getMarca(), t.getValor_diaria(), t.getStatus(), t.getCliente_em_posse()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Método para mostrar todos os veículos disponíveis;
    private void todosVeiculosDisponiveis() {
        ArrayList<Veiculo> todosVeiculosDisponiveis = new ArrayList<Veiculo>();
        try {
            todosVeiculosDisponiveis = listarVeiculosDisponiveis();
            DefaultTableModel model = (DefaultTableModel) tabelaVeiculos.getModel();
            model.setNumRows(0);
            for (Veiculo t : todosVeiculosDisponiveis) {
                model.addRow(new Object[]{t.getVeiculo_id(), t.getNome(), t.getModelo(), t.getMarca(), t.getValor_diaria(), t.getStatus(), t.getCliente_em_posse()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Método para mostrar todos os veículos não-disponíveis;
    private void todosVeiculosNaoDisponiveis() {
        ArrayList<Veiculo> todosVeiculosNaoDisponiveis = new ArrayList<Veiculo>();
        try {
            todosVeiculosNaoDisponiveis = listarVeiculosNaoDisponiveis();
            DefaultTableModel model = (DefaultTableModel) tabelaVeiculos.getModel();
            model.setNumRows(0);
            for (Veiculo t : todosVeiculosNaoDisponiveis) {
                model.addRow(new Object[]{t.getVeiculo_id(), t.getNome(), t.getModelo(), t.getMarca(), t.getValor_diaria(), t.getStatus(), t.getCliente_em_posse()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Método para verificar se funcionario está acessando;
    private void verificaFunc() {
        if (nivelAcessado.equalsIgnoreCase("Funcionario") || nivelAcessado.equalsIgnoreCase("Funcionário")) {
            removerVeiculo.setVisible(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton disponiveis;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton naoDisponiveis;
    public static javax.swing.JButton removerVeiculo;
    private javax.swing.JTable tabelaVeiculos;
    private javax.swing.JRadioButton todos;
    // End of variables declaration//GEN-END:variables
}

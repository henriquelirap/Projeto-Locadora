package vision;

import static dao.LocacaoDAO.novaLocacaoDAO;
import static dao.VeiculoDAO.atualizarStatusNaoDisp;
import static dao.VeiculoDAO.listarVeiculosDisponiveis;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Locacao;
import model.Veiculo;
import static vision.Login.veiculo_id_locado;
import static vision.Login.cliente_id_logado;
import static vision.Login.diaria;
import static vision.Login.nome_logado;
import static vision.Login.usuarioLogado;

public class NovaLocacao extends javax.swing.JFrame {

    Locacao novaLocacao = null;

    public NovaLocacao() {
        initComponents();
        listagemVeiculos();
        dataLocacao.setDateToToday();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        salvarLocacao = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        valorLocacao = new javax.swing.JFormattedTextField();
        calcularLocacao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLocacao = new javax.swing.JTable();
        dataLocacao = new com.github.lgooddatepicker.components.DatePicker();
        dataDevolucao = new com.github.lgooddatepicker.components.DatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova Locação");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setText("Data de Locação");
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setText("Data de Devolução");
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));

        salvarLocacao.setText("Salvar");
        salvarLocacao.setBackground(new java.awt.Color(204, 204, 204));
        salvarLocacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salvarLocacao.setForeground(new java.awt.Color(0, 0, 0));
        salvarLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarLocacaoActionPerformed(evt);
            }
        });

        jLabel7.setText("Valor Total");
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));

        valorLocacao.setEditable(false);
        valorLocacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        valorLocacao.setBackground(new java.awt.Color(204, 204, 204));
        valorLocacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        calcularLocacao.setText("Calcular");
        calcularLocacao.setBackground(new java.awt.Color(204, 204, 204));
        calcularLocacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        calcularLocacao.setForeground(new java.awt.Color(0, 0, 0));
        calcularLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularLocacaoActionPerformed(evt);
            }
        });

        tabelaLocacao.setBackground(new java.awt.Color(204, 204, 204));
        tabelaLocacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabelaLocacao.setForeground(new java.awt.Color(0, 0, 0));
        tabelaLocacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Modelo", "Ano", "Marca", "Valor Diária"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaLocacao.setRowHeight(35);
        jScrollPane1.setViewportView(tabelaLocacao);

        dataLocacao.setBackground(new java.awt.Color(204, 204, 204));
        dataLocacao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dataLocacao.setEnabled(false);
        dataLocacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        dataDevolucao.setBackground(new java.awt.Color(204, 204, 204));
        dataDevolucao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dataDevolucao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1745, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(valorLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(calcularLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(salvarLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 489, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(6, 6, 6)))
                .addComponent(dataLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dataDevolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valorLocacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularLocacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarLocacao)
                .addContainerGap())
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Método para calcular valor da locação;
    private void calcularLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularLocacaoActionPerformed
        int linha = -1;
        linha = tabelaLocacao.getSelectedRow();

        //Se não selecionou nenhum carro;
        if (linha == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um veículo!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        //Se selecionou algum carro;
        if (linha != -1) {
            DateFormat formatUS = new SimpleDateFormat("yyyy-MM-dd");
            DateFormat formatBR = new SimpleDateFormat("dd-MM-yyyy");
            String dataLoc = dataLocacao.toString();
            String dataDev = dataDevolucao.toString();
            double total = 0;
            diaria = Double.parseDouble(tabelaLocacao.getValueAt(linha, 5).toString());
            veiculo_id_locado = Integer.parseInt(tabelaLocacao.getValueAt(linha, 0).toString());
            String nome_veiculo = tabelaLocacao.getValueAt(linha, 1).toString();

            if (nome_veiculo.length() == 0) {
                JOptionPane.showMessageDialog(null, "Selecione um veículo!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            if (dataDev.length() <= 0) {
                JOptionPane.showMessageDialog(null, "Selecione uma data devolução!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                return;
            }

            try {
                Date d1 = formatUS.parse(dataLoc);
                Date d2 = formatUS.parse(dataDev);
                dataLoc = formatBR.format(d1);
                dataDev = formatBR.format(d2);
                long diferencaTempo = d2.getTime() - d1.getTime();
                double diferencaEmDias = diferencaTempo / (double) TimeUnit.DAYS.toMillis(1);
                total = (diferencaEmDias * diaria) + diaria;
                total = Double.parseDouble(String.format("%.2f", total).toString().replaceAll("[,]", "."));
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (total < 0) {
                JOptionPane.showMessageDialog(null, "Selecione uma data válida!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                valorLocacao.setText("");
                dataDevolucao.setText("");
                return;
            }

            valorLocacao.setText(String.valueOf(String.format("R$%.2f", total)));
            novaLocacao = new Locacao(cliente_id_logado, nome_logado, usuarioLogado, veiculo_id_locado, nome_veiculo, diaria, dataLoc, dataDev, total, "Aberto");
        }
    }//GEN-LAST:event_calcularLocacaoActionPerformed

    //Método para salvar locação no banco e mudar status de veículo para não-disponivel;
    private void salvarLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarLocacaoActionPerformed
        if (novaLocacao != null) {
            try {
                novaLocacaoDAO(novaLocacao);
                atualizarStatusNaoDisp();
                JOptionPane.showMessageDialog(null, "Locação salva com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                dispose();

            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Não foi possível salvar sua locação!", "Atenção", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (novaLocacao == null) {
            JOptionPane.showMessageDialog(null, "Selecione os campos corretamente, como veículo e data de devolução!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        if (valorLocacao.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Antes de realizar a locação, clique em calcular!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
    }//GEN-LAST:event_salvarLocacaoActionPerformed

    //Método para buscar todos veiculos disponiveis e listar nos campos de locação;
    private void listagemVeiculos() {
        ArrayList<Veiculo> veiculosDisponiveis = new ArrayList<Veiculo>();
        try {
            veiculosDisponiveis = listarVeiculosDisponiveis();
            DefaultTableModel model = (DefaultTableModel) tabelaLocacao.getModel();
            model.setNumRows(0);
            for (Veiculo v : veiculosDisponiveis) {
                model.addRow(new Object[]{v.getVeiculo_id(), v.getNome(), v.getModelo(), v.getAno(), v.getMarca(), v.getValor_diaria()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton calcularLocacao;
    private com.github.lgooddatepicker.components.DatePicker dataDevolucao;
    private com.github.lgooddatepicker.components.DatePicker dataLocacao;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton salvarLocacao;
    private javax.swing.JTable tabelaLocacao;
    private javax.swing.JFormattedTextField valorLocacao;
    // End of variables declaration//GEN-END:variables
}

package vision;

import static dao.ClienteDAO.atualizarClienteTabela;
import static dao.ClienteDAO.buscaNomeClientes;
import static dao.ClienteDAO.buscaTodosClientes;
import static dao.ClienteDAO.removerCliente;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Cliente;
import static vision.Login.nomeBuscado;
import static vision.Login.clienteidSelecionado;
import static vision.Login.controller;
import static vision.Login.nivelAcessado;

public class CrudClientes extends javax.swing.JFrame {

    public CrudClientes() {
        initComponents();
        mostrarTodosClientes(); //Mostrar todos os clientes ao inicilizar tela de clientes cadastrados;
        verificaFunc();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        salvarCliente = new javax.swing.JButton();
        removerCliente = new javax.swing.JButton();
        buscarNomeCliente = new javax.swing.JButton();
        buscaClientetxf = new javax.swing.JTextField();
        cadastroClienteTab = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listagem Clientes");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        salvarCliente.setText("Salvar Edições");
        salvarCliente.setBackground(new java.awt.Color(204, 204, 204));
        salvarCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salvarCliente.setForeground(new java.awt.Color(0, 0, 0));
        salvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarClienteActionPerformed(evt);
            }
        });

        removerCliente.setBackground(new java.awt.Color(204, 204, 204));
        removerCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        removerCliente.setForeground(new java.awt.Color(0, 0, 0));
        removerCliente.setText("Remover Selecionado");
        removerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerClienteActionPerformed(evt);
            }
        });

        buscarNomeCliente.setText("Buscar pelo Nome");
        buscarNomeCliente.setBackground(new java.awt.Color(204, 204, 204));
        buscarNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buscarNomeCliente.setForeground(new java.awt.Color(0, 0, 0));
        buscarNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNomeClienteActionPerformed(evt);
            }
        });

        buscaClientetxf.setBackground(new java.awt.Color(204, 204, 204));
        buscaClientetxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buscaClientetxf.setForeground(new java.awt.Color(0, 0, 0));

        cadastroClienteTab.setText("Cadastrar Novo Cliente");
        cadastroClienteTab.setBackground(new java.awt.Color(204, 204, 204));
        cadastroClienteTab.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cadastroClienteTab.setForeground(new java.awt.Color(0, 0, 0));
        cadastroClienteTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroClienteTabActionPerformed(evt);
            }
        });

        tabelaClientes.setBackground(new java.awt.Color(153, 153, 153));
        tabelaClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabelaClientes.setForeground(new java.awt.Color(0, 0, 0));
        tabelaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Telefone", "CPF", "RG", "Rua", "Nº", "Complemento", "Bairro", "CEP", "Cidade", "Estado", "Usuário", "Email", "Nível"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true, true, true, true, true, true, true, true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaClientes.setRowHeight(35);
        jScrollPane1.setViewportView(tabelaClientes);

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscaClientetxf, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroClienteTab, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(removerCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarNomeCliente)
                    .addComponent(buscaClientetxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salvarCliente)
                    .addComponent(removerCliente)
                    .addComponent(cadastroClienteTab))
                .addContainerGap())
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

    //Salvar cliente editado na tabela clientes;
    private void salvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarClienteActionPerformed
        int linha = tabelaClientes.getSelectedRow();
        clienteidSelecionado = Integer.parseInt(tabelaClientes.getValueAt(linha, 0).toString());
        //Nome                                                                             //Telefone                                                              //RG                                                                               //Rua                                         //Numero casa                                                   //Complemento                           //Bairro                                          //Cep                                                //Cidade                                     //Estado                                            //Usuario                                   //Email                                            //Nivel                                                                                                                                                                                                                                                                                    
        Cliente clienteEditar = new Cliente(tabelaClientes.getValueAt(linha, 1).toString().replaceAll("[0-9'~!@#$%¨¨&*(),.;?_+=-]", ""), tabelaClientes.getValueAt(linha, 2).toString().replaceAll("[^0-9]", ""), tabelaClientes.getValueAt(linha, 4).toString().replaceAll("[^0-9]", ""), tabelaClientes.getValueAt(linha, 5).toString(), Integer.parseInt(tabelaClientes.getValueAt(linha, 6).toString()), tabelaClientes.getValueAt(linha, 7).toString(), tabelaClientes.getValueAt(linha, 8).toString(), tabelaClientes.getValueAt(linha, 9).toString(), tabelaClientes.getValueAt(linha, 10).toString(), tabelaClientes.getValueAt(linha, 11).toString(), tabelaClientes.getValueAt(linha, 12).toString(), tabelaClientes.getValueAt(linha, 13).toString(), tabelaClientes.getValueAt(linha, 14).toString());

        //Validando informações editadas;
        if (clienteEditar.getNome().length() < 1) {
            JOptionPane.showMessageDialog(null, "Insira um nome válido!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (clienteEditar.getTelefone().length() < 11) {
            JOptionPane.showMessageDialog(null, "Insira um telefone válido! (Ex: 45984012020)", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (clienteEditar.getRg().length() < 5) {
            JOptionPane.showMessageDialog(null, "Insira um RG válido!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            atualizarClienteTabela(clienteEditar);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new CrudClientes().setVisible(true);
                }
            });
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível salvar os dados!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_salvarClienteActionPerformed

    //Remover cliente selecionado na tabela de clientes;
    private void removerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerClienteActionPerformed
        int linha = tabelaClientes.getSelectedRow();
        clienteidSelecionado = Integer.parseInt(tabelaClientes.getValueAt(linha, 0).toString());
        try {
            removerCliente();
            JOptionPane.showMessageDialog(null, "Removido com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new CrudClientes().setVisible(true);
                }
            });
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_removerClienteActionPerformed

    //Buscar cliente por nome na tabela de clientes;
    private void buscarNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarNomeClienteActionPerformed
        nomeBuscado = buscaClientetxf.getText();
        buscarClienteNome();
    }//GEN-LAST:event_buscarNomeClienteActionPerformed

    //Cadastrar cliente a partir da tela da tabela de todos os clientes;
    private void cadastroClienteTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroClienteTabActionPerformed
        controller = 0;
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }//GEN-LAST:event_cadastroClienteTabActionPerformed

    //Método para apresentar todos os clientes cadastrados;
    private void mostrarTodosClientes() {
        ArrayList<Cliente> todos = new ArrayList<Cliente>();
        try {
            todos = buscaTodosClientes();
            DefaultTableModel model = (DefaultTableModel) tabelaClientes.getModel();
            model.setNumRows(0);
            for (Cliente t : todos) {
                model.addRow(new Object[]{t.getCliente_id(), t.getNome(), t.getTelefone(), t.getCpf(), t.getRg(), t.getRua(), t.getNumero_residencia(), t.getComplemento(), t.getBairro(), t.getCep(), t.getCidade(), t.getEstado(), t.getUsuario(), t.getEmail(), t.getNivel()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Método para apresentar os clientes com o nome buscado;
    private void buscarClienteNome() {
        ArrayList<Cliente> clienteBuscaNome = new ArrayList<Cliente>();
        try {
            clienteBuscaNome = buscaNomeClientes();
            DefaultTableModel model = (DefaultTableModel) tabelaClientes.getModel();
            model.setNumRows(0);
            for (Cliente t : clienteBuscaNome) {
                model.addRow(new Object[]{t.getCliente_id(), t.getNome(), t.getTelefone(), t.getCpf(), t.getRg(), t.getRua(), t.getNumero_residencia(), t.getComplemento(), t.getBairro(), t.getCep(), t.getCidade(), t.getEstado(), t.getUsuario(), t.getEmail(), t.getNivel()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Método para verificar se funcionario está acessando;
    private void verificaFunc() {
        if (nivelAcessado.equalsIgnoreCase("Funcionario") || nivelAcessado.equalsIgnoreCase("Funcionário")) {
            removerCliente.setVisible(false);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscaClientetxf;
    private javax.swing.JButton buscarNomeCliente;
    private javax.swing.JButton cadastroClienteTab;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JButton removerCliente;
    private javax.swing.JButton salvarCliente;
    private javax.swing.JTable tabelaClientes;
    // End of variables declaration//GEN-END:variables
}

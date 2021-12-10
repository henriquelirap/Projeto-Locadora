package vision;

import static dao.FuncionarioDAO.atualizarFuncionarioTabela;
import static dao.FuncionarioDAO.buscaNomeFuncionarios;
import static dao.FuncionarioDAO.buscaTodosFuncionarios;
import static dao.FuncionarioDAO.removerFuncionario;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Funcionario;
import static vision.Login.funcionarioidSelecionado;
import static vision.Login.controller;
import static vision.Login.nomeBuscado;

public class CrudFuncionarios extends javax.swing.JFrame {

    public CrudFuncionarios() {
        initComponents();
        mostrarTodosFuncionarios();       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionarios = new javax.swing.JTable();
        salvarCrudFunc = new javax.swing.JButton();
        removerSelecionadoFunc = new javax.swing.JButton();
        buscarNomeFunc = new javax.swing.JButton();
        buscaFunctxf = new javax.swing.JTextField();
        cadastrarFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionários");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        tabelaFuncionarios.setBackground(new java.awt.Color(153, 153, 153));
        tabelaFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tabelaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
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
                "ID", "Nome", "Telefone", "CPF", "Usuário", "Email", "Nível"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaFuncionarios.setRowHeight(35);
        jScrollPane1.setViewportView(tabelaFuncionarios);

        salvarCrudFunc.setBackground(new java.awt.Color(204, 204, 204));
        salvarCrudFunc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salvarCrudFunc.setForeground(new java.awt.Color(0, 0, 0));
        salvarCrudFunc.setText("Salvar Edições");
        salvarCrudFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarCrudFuncActionPerformed(evt);
            }
        });

        removerSelecionadoFunc.setBackground(new java.awt.Color(204, 204, 204));
        removerSelecionadoFunc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        removerSelecionadoFunc.setForeground(new java.awt.Color(0, 0, 0));
        removerSelecionadoFunc.setText("Remover Selecionado");
        removerSelecionadoFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerSelecionadoFuncActionPerformed(evt);
            }
        });

        buscarNomeFunc.setBackground(new java.awt.Color(204, 204, 204));
        buscarNomeFunc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buscarNomeFunc.setForeground(new java.awt.Color(0, 0, 0));
        buscarNomeFunc.setText("Buscar pelo Nome");
        buscarNomeFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarNomeFuncActionPerformed(evt);
            }
        });

        buscaFunctxf.setBackground(new java.awt.Color(204, 204, 204));
        buscaFunctxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        buscaFunctxf.setForeground(new java.awt.Color(0, 0, 0));

        cadastrarFuncionario.setBackground(new java.awt.Color(204, 204, 204));
        cadastrarFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cadastrarFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        cadastrarFuncionario.setText("Cadastrar Funcionário");
        cadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buscaFunctxf, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(removerSelecionadoFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(buscarNomeFunc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarCrudFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1092, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarNomeFunc)
                    .addComponent(buscaFunctxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removerSelecionadoFunc)
                    .addComponent(salvarCrudFunc)
                    .addComponent(cadastrarFuncionario))
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

    //Editar dados de funcionários na tabela de funcionários;
    private void salvarCrudFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarCrudFuncActionPerformed
        int linha = tabelaFuncionarios.getSelectedRow();
        funcionarioidSelecionado = Integer.parseInt(tabelaFuncionarios.getValueAt(linha, 0).toString());

        //Guardando dados editados num objeto;
        Funcionario funcionarioEditar = new Funcionario(tabelaFuncionarios.getValueAt(linha, 1).toString().replaceAll("[0-9'~!@#$%¨¨&*(),.;?_+=-]", ""), tabelaFuncionarios.getValueAt(linha, 2).toString().replaceAll("[^0-9]", ""), tabelaFuncionarios.getValueAt(linha, 5).toString(), tabelaFuncionarios.getValueAt(linha, 6).toString());

        //Validando dados editados nos campos;
        if (funcionarioEditar.getNome().length() < 1) {
            JOptionPane.showMessageDialog(null, "Insira um nome válido!", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (funcionarioEditar.getTelefone().length() < 11) {
            JOptionPane.showMessageDialog(null, "Insira um telefone válido! (Ex: 45984012020)", "Atenção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            atualizarFuncionarioTabela(funcionarioEditar);
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new CrudFuncionarios().setVisible(true);
                }
            });
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Não foi possível salvar os dados!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_salvarCrudFuncActionPerformed

    //Chamando método para remoção do banco de funcionário selecionado;
    private void removerSelecionadoFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerSelecionadoFuncActionPerformed
        int linha = tabelaFuncionarios.getSelectedRow();
        funcionarioidSelecionado = Integer.parseInt(tabelaFuncionarios.getValueAt(linha, 0).toString());
        try {
            removerFuncionario();
            JOptionPane.showMessageDialog(null, "Removido com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new CrudFuncionarios().setVisible(true);
                }
            });
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_removerSelecionadoFuncActionPerformed

    //Chamando função de buscar pelo nome do funcionário na tabela de funcionários;
    private void buscarNomeFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarNomeFuncActionPerformed
        nomeBuscado = buscaFunctxf.getText();
        buscarFuncionarioNome();
    }//GEN-LAST:event_buscarNomeFuncActionPerformed

    //Chamando tela para cadastro de novo funcionário;
    private void cadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarFuncionarioActionPerformed
        controller = 0;
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionario().setVisible(true);
            }
        });
    }//GEN-LAST:event_cadastrarFuncionarioActionPerformed

    //Método para mostrar todos os funcionários na tabela geral de funcionários;
    private void mostrarTodosFuncionarios() {
        ArrayList<Funcionario> todos = new ArrayList<Funcionario>();
        try {
            todos = buscaTodosFuncionarios();
            DefaultTableModel model = (DefaultTableModel) tabelaFuncionarios.getModel();
            model.setNumRows(0);
            for (Funcionario t : todos) {
                model.addRow(new Object[]{t.getFuncionario_id(), t.getNome(), t.getTelefone(), t.getCpf(), t.getUsuario(), t.getEmail(), t.getNivel()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Método para apresentar os funcionários com o nome buscado;
    private void buscarFuncionarioNome() {
        ArrayList<Funcionario> funcionarioBuscaNome = new ArrayList<Funcionario>();
        try {
            funcionarioBuscaNome = buscaNomeFuncionarios();
            DefaultTableModel model = (DefaultTableModel) tabelaFuncionarios.getModel();
            model.setNumRows(0);
            for (Funcionario t : funcionarioBuscaNome) {
                model.addRow(new Object[]{t.getFuncionario_id(), t.getNome(), t.getTelefone(), t.getCpf(), t.getUsuario(), t.getEmail(), t.getNivel()});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField buscaFunctxf;
    private javax.swing.JButton buscarNomeFunc;
    private javax.swing.JButton cadastrarFuncionario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removerSelecionadoFunc;
    private javax.swing.JButton salvarCrudFunc;
    private javax.swing.JTable tabelaFuncionarios;
    // End of variables declaration//GEN-END:variables
}

package vision;

import static dao.FuncionarioDAO.atualizarMeusDadosFuncionario;
import static dao.FuncionarioDAO.cadastrarFuncionario;
import static dao.FuncionarioDAO.meusDadosFuncionario;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Funcionario;
import static vision.Login.controller;
import static vision.Login.nivelAcessado;
import static vision.Login.usuarioLogado;

public class CadastroFuncionario extends javax.swing.JFrame {

    private Funcionario funcionarioEditar;

    public CadastroFuncionario() {
        initComponents();

        if (controller == 1) {
            //Se for o próprio funcionario acessando, execute isso;
            //Verificando funcionário;
            if (nivelAcessado.equalsIgnoreCase("Funcionario") || nivelAcessado.equalsIgnoreCase("Funcionário") || nivelAcessado.equalsIgnoreCase("Admin")) {
                senhaLabel.setVisible(false);
                senhaFunctxf.setVisible(false);
                confirmeSenhaLabel.setVisible(false);
                confirmeSenhaFunctxf.setVisible(false);
                cpfFunctxf.setEditable(false);
                cpfFunctxf.setDisabledTextColor(Color.BLACK);
                usuarioFunctxf.setEditable(false);
                usuarioFunctxf.setDisabledTextColor(Color.BLACK);
                setSize(520, 310);
                System.out.println(usuarioLogado);
            }
            try {
                funcionarioEditar = meusDadosFuncionario();
                if (funcionarioEditar != null) {
                    nomeFunctxf.setText(funcionarioEditar.getNome());
                    telefoneFunctxf.setText(funcionarioEditar.getTelefone());
                    cpfFunctxf.setText(funcionarioEditar.getCpf());
                    usuarioFunctxf.setText(funcionarioEditar.getUsuario());
                    emailFunctxf.setText(funcionarioEditar.getEmail());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        painelCadastroCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nomeFunctxf = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cpfFunctxf = new javax.swing.JTextField();
        salvarCadastroFuncionario = new javax.swing.JButton();
        senhaFunctxf = new javax.swing.JPasswordField();
        confirmeSenhaFunctxf = new javax.swing.JPasswordField();
        senhaLabel = new javax.swing.JLabel();
        confirmeSenhaLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        telefoneFunctxf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        usuarioFunctxf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        emailFunctxf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Funcionário");

        painelCadastroCliente.setBackground(new java.awt.Color(153, 153, 153));
        painelCadastroCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelCadastroCliente.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome");

        nomeFunctxf.setBackground(new java.awt.Color(204, 204, 204));
        nomeFunctxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nomeFunctxf.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CPF");

        cpfFunctxf.setBackground(new java.awt.Color(204, 204, 204));
        cpfFunctxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpfFunctxf.setForeground(new java.awt.Color(0, 0, 0));

        salvarCadastroFuncionario.setBackground(new java.awt.Color(204, 204, 204));
        salvarCadastroFuncionario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salvarCadastroFuncionario.setForeground(new java.awt.Color(0, 0, 0));
        salvarCadastroFuncionario.setText("Salvar");
        salvarCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarCadastroFuncionarioActionPerformed(evt);
            }
        });

        senhaFunctxf.setBackground(new java.awt.Color(204, 204, 204));
        senhaFunctxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        confirmeSenhaFunctxf.setBackground(new java.awt.Color(204, 204, 204));
        confirmeSenhaFunctxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        senhaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(0, 0, 0));
        senhaLabel.setText("Senha");

        confirmeSenhaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmeSenhaLabel.setForeground(new java.awt.Color(0, 0, 0));
        confirmeSenhaLabel.setText("Confirme a Senha");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Telefone");

        telefoneFunctxf.setBackground(new java.awt.Color(204, 204, 204));
        telefoneFunctxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        telefoneFunctxf.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Usuário");

        usuarioFunctxf.setEditable(false);
        usuarioFunctxf.setBackground(new java.awt.Color(204, 204, 204));
        usuarioFunctxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usuarioFunctxf.setForeground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Email");

        emailFunctxf.setBackground(new java.awt.Color(204, 204, 204));
        emailFunctxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailFunctxf.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout painelCadastroClienteLayout = new javax.swing.GroupLayout(painelCadastroCliente);
        painelCadastroCliente.setLayout(painelCadastroClienteLayout);
        painelCadastroClienteLayout.setHorizontalGroup(
            painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salvarCadastroFuncionario)
                    .addComponent(jLabel13)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(jLabel1)
                    .addComponent(jLabel12)
                    .addComponent(senhaLabel)
                    .addComponent(confirmeSenhaLabel))
                .addGap(12, 12, 12)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telefoneFunctxf, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                    .addComponent(cpfFunctxf)
                    .addComponent(nomeFunctxf)
                    .addComponent(emailFunctxf)
                    .addComponent(confirmeSenhaFunctxf)
                    .addComponent(senhaFunctxf)
                    .addComponent(usuarioFunctxf, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        painelCadastroClienteLayout.setVerticalGroup(
            painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeFunctxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(telefoneFunctxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpfFunctxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioFunctxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhaFunctxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmeSenhaLabel)
                    .addComponent(confirmeSenhaFunctxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(emailFunctxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(salvarCadastroFuncionario)
                .addGap(216, 216, 216))
        );

        jDesktopPane1.setLayer(painelCadastroCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Salvar novo cadastro de funcionários;
    private void salvarCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarCadastroFuncionarioActionPerformed
        //Se for um funcionário execute isso;
        if (controller == 0) {
            //Guardando e formatando campos preenchidos;
            String nome = nomeFunctxf.getText().replaceAll("[0-9'~!@#$%¨¨&*(),.;?_+=-]", "");
            String telefone = telefoneFunctxf.getText().replaceAll("[^0-9-)( ]", "");
            String cpf = cpfFunctxf.getText().replaceAll("[^0-9.-]", "");
            String usuario = cpfFunctxf.getText().replaceAll("[^0-9]", "");
            String senha = String.valueOf(senhaFunctxf.getPassword());
            String confirmeSenha = String.valueOf(confirmeSenhaFunctxf.getPassword());
            String email = emailFunctxf.getText();
            String nivel = "Funcionário";
            Funcionario funcionario = null;

            //Validando dados informados nos campos;
            if (nome.length() < 1) {
                nomeFunctxf.setText("");
                JOptionPane.showMessageDialog(null, "Insira um nome válido!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (telefone.length() < 11) {
                telefoneFunctxf.setText("");
                JOptionPane.showMessageDialog(null, "Insira um telefone válido! (Ex: 45984012020)", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (cpf.length() < 11) {
                cpfFunctxf.setText("");
                JOptionPane.showMessageDialog(null, "Insira um CPF válido!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!senha.contentEquals(confirmeSenha)) {
                JOptionPane.showMessageDialog(null, "Senhas digitadas diferem uma da outra!", "Atenção", JOptionPane.WARNING_MESSAGE);
                senhaFunctxf.setText("");
                confirmeSenhaFunctxf.setText("");
                return;
            }

            if (senha == null || senha == "" || senha.contains(" ") || senha.isEmpty()) {
                senhaFunctxf.setText("");
                confirmeSenhaFunctxf.setText("");
                JOptionPane.showMessageDialog(null, "Não é possível usar essa senha!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            } else {
                funcionario = new Funcionario(nome, telefone, cpf, usuario.replaceAll("[^0-9]", ""), senha, email, nivel);
            }

            //Chamando método para guardar cadastro em banco;
            try {
                cadastrarFuncionario(funcionario);
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Utilize seu CPF cadastrado como usuário de login!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

        //Se o funcionário clicar em "Meus Dados" e quiser editar alguma informação, execute isso;
        if (controller == 1) {
            String nomeEditar = nomeFunctxf.getText().replaceAll("[0-9'~!@#$%¨¨&*(),.;?_+=-]", "");
            String telefoneEditar = telefoneFunctxf.getText().replaceAll("[^0-9-)( ]", "");
            String emailEditar = emailFunctxf.getText();
            Funcionario funcionarioEditar = null;

            if (nomeEditar.length() < 1) {
                JOptionPane.showMessageDialog(null, "Insira um nome válido!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (telefoneEditar.length() < 11) {
                JOptionPane.showMessageDialog(null, "Insira um telefone válido! (Ex: 45984012020)", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (emailEditar.length() < 1) {
                JOptionPane.showMessageDialog(null, "Insira um email válido!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;

            } else {
                funcionarioEditar = new Funcionario(nomeEditar, telefoneEditar, emailEditar);
            }

            //Guardando informações do novo preenchimento;
            try {
                atualizarMeusDadosFuncionario(funcionarioEditar);
                JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                dispose();

                //Atualizando tela;
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new CadastroFuncionario().setVisible(true);
                    }
                });
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_salvarCadastroFuncionarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmeSenhaFunctxf;
    private javax.swing.JLabel confirmeSenhaLabel;
    private javax.swing.JTextField cpfFunctxf;
    private javax.swing.JTextField emailFunctxf;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nomeFunctxf;
    private javax.swing.JPanel painelCadastroCliente;
    private javax.swing.JButton salvarCadastroFuncionario;
    private javax.swing.JPasswordField senhaFunctxf;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JTextField telefoneFunctxf;
    private javax.swing.JTextField usuarioFunctxf;
    // End of variables declaration//GEN-END:variables

}

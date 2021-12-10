package vision;

import com.sun.glass.events.KeyEvent;
import dao.ClienteDAO;
import dao.FuncionarioDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Funcionario;

public class Login extends javax.swing.JFrame {

    //Variáveis globais para armazenamento de dados importantes depois do sistema iniciado;    
    public static int controller = 0; //Armazenar de onde está sendo acessado o menu de cadastro de cliente;
    public static String usuarioLogado; //Armazenar usuario que logou e carregar informações para qualquer tela;
    public static String nome_logado; //Armazenar nome do usuário logado;
    public static int cliente_id_logado; //Armazenar ID do cliente que logou;
    public static int veiculo_id_locado; //Armazenar ID do carro alugado;
    public static String nivelAcessado; //Armazenar nível do usuário acessado; 
    public static String nomeBuscado; //Armazenar nome buscado na pesquisa;
    public static int clienteidSelecionado; //ID do cliente selecionado na tabela de clientes;
    public static int funcionarioidSelecionado; //ID do funcionário selecionado na tabela de funcionários;
    public static int veiculoidSelecionado; //ID do veículo selecionado na tabela de veículos;
    public static double total; //Armazenar total de uma locacao selecionada em tabela;
    public static double diaria;  //Armazenar diaria de um veiculo selecionado ou alugado;
    public static int locacao_id; //Armazenar id de uma locação selecionada em tabela;
    public static int locacao_id_caixa; //Armazenar id de uma locação que está sendo finalizada;

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        btnCadastrar = new javax.swing.JButton();
        btnEsqueci = new javax.swing.JButton();
        senhatxf = new javax.swing.JPasswordField();
        senhaLabel = new javax.swing.JLabel();
        logintxf = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        loginLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Login");
        setName("telaLogin"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        btnCadastrar.setBackground(new java.awt.Color(204, 204, 204));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnEsqueci.setBackground(new java.awt.Color(204, 204, 204));
        btnEsqueci.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEsqueci.setForeground(new java.awt.Color(0, 0, 0));
        btnEsqueci.setText("Esqueci a Senha");
        btnEsqueci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsqueciActionPerformed(evt);
            }
        });

        senhatxf.setBackground(new java.awt.Color(204, 204, 204));
        senhatxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        senhatxf.setForeground(new java.awt.Color(0, 0, 0));
        senhatxf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                senhatxfKeyPressed(evt);
            }
        });

        senhaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(0, 0, 0));
        senhaLabel.setText("Senha");

        logintxf.setBackground(new java.awt.Color(204, 204, 204));
        logintxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        logintxf.setForeground(new java.awt.Color(0, 0, 0));
        logintxf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logintxfActionPerformed(evt);
            }
        });
        logintxf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                logintxfKeyPressed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(204, 204, 204));
        btnLogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        loginLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(0, 0, 0));
        loginLabel.setText("Login");

        jDesktopPane1.setLayer(btnCadastrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnEsqueci, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(senhatxf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(senhaLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(logintxf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnLogin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(loginLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(loginLabel)
                            .addComponent(senhaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senhatxf)
                            .addComponent(logintxf)))
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnEsqueci))
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLabel)
                    .addComponent(logintxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senhatxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar)
                    .addComponent(btnEsqueci))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Cadastrar novo cliente;
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        //Chamando tela para escolher funcionario ou cliente;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClienteOuFuncionario().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnCadastrarActionPerformed

    //Fazer login no sistema;
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String usuario = logintxf.getText().replaceAll("[^0-9-A-z]", ""); //Armazenando usuario logado;
        String senha = String.valueOf(senhatxf.getPassword()); //Armazenando senha guardada;

        //Verficado se usuario e senha estão preenchidos, chamando o método para validar entrada do cliente;
        if (usuario.length() > 0 && senha.length() > 0) {
            ClienteDAO clienteDAO = new ClienteDAO();
            FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
            try {
                Cliente cliente = clienteDAO.login(usuario, senha);
                Funcionario funcionario = funcionarioDAO.loginFunc(usuario, senha);
                if (cliente == null && funcionario == null) {
                    JOptionPane.showMessageDialog(null, "Login ou senha inválidos!", "Atenção", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                dispose();

                //Login feito com sucesso, abrindo menu principal;
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new Locadora().setVisible(true);
                    }
                });

                //Não foi possível logar;    
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Não foi possível realizar o login!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }


    }//GEN-LAST:event_btnLoginActionPerformed

    //Recuperar senha esquecida;
    private void btnEsqueciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsqueciActionPerformed
        //Chamando tela para troca de senha;
        dispose();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EsqueciSenha().setVisible(true);
            }
        });
    }//GEN-LAST:event_btnEsqueciActionPerformed

    //Método pra tecla enter logar;
    private void logintxfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logintxfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnLogin.doClick();
        }
    }//GEN-LAST:event_logintxfKeyPressed

    //Método pra tecla enter logar;
    private void senhatxfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_senhatxfKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnLogin.doClick();
        }
    }//GEN-LAST:event_senhatxfKeyPressed

    private void logintxfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logintxfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logintxfActionPerformed

    //Método pra poder executar tela de login em primeiro lugar;
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEsqueci;
    private javax.swing.JButton btnLogin;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField logintxf;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JPasswordField senhatxf;
    // End of variables declaration//GEN-END:variables

}

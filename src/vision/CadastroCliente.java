package vision;

import dao.ClienteDAO;
import static dao.ClienteDAO.meusDadosCliente;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;
import static vision.Login.controller;

public class CadastroCliente extends javax.swing.JFrame {

    private ClienteDAO clienteDAO = new ClienteDAO();
    private Cliente clienteEditar;

    public CadastroCliente() {
        initComponents();

        // Buscando dados para editar no banco;
        if (controller == 1) {
            try {
                clienteEditar = meusDadosCliente();
                if (clienteEditar != null) {
                    nometxf.setText(clienteEditar.getNome());
                    telefonetxf.setText(clienteEditar.getTelefone());
                    cpftxf.setText(clienteEditar.getCpf());
                    rgtxf.setText(clienteEditar.getRg());
                    ruatxf.setText(clienteEditar.getRua());
                    numero_residenciatxf.setText(String.valueOf(clienteEditar.getNumero_residencia()));
                    complementotxf.setText(clienteEditar.getComplemento());
                    bairrotxf.setText(clienteEditar.getBairro());
                    ceptxf.setText(clienteEditar.getCep());
                    cidadetxf.setText(clienteEditar.getCidade());
                    estadotxf.setSelectedItem(clienteEditar.getEstado());
                    usuariotxf.setText(clienteEditar.getUsuario());
                    emailtxf.setText(clienteEditar.getEmail());
                    cpftxf.setEnabled(false);
                    cpftxf.setDisabledTextColor(Color.black);
                    senhatxf.setVisible(false);
                    confirmeSenhatxf.setVisible(false);
                    senhaLabel.setVisible(false);
                    confirmeSenhaLabel.setVisible(false);
                    nometxf.setEnabled(false);
                    nometxf.setDisabledTextColor(Color.black);
                    rgtxf.setEnabled(false);
                    rgtxf.setDisabledTextColor(Color.black);
                    setSize(500, 520);
                }

            } catch (SQLException ex) {
                Logger.getLogger(Locadora.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        painelCadastroCliente = new javax.swing.JPanel();
        estadotxf = new javax.swing.JComboBox<>();
        bairrotxf = new javax.swing.JTextField();
        complementotxf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nometxf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        numero_residenciatxf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ruatxf = new javax.swing.JTextField();
        rgtxf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cidadetxf = new javax.swing.JTextField();
        ceptxf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cpftxf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        salvarCadastroCliente = new javax.swing.JButton();
        senhatxf = new javax.swing.JPasswordField();
        confirmeSenhatxf = new javax.swing.JPasswordField();
        senhaLabel = new javax.swing.JLabel();
        confirmeSenhaLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        telefonetxf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        usuariotxf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        emailtxf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Cliente");

        painelCadastroCliente.setBackground(new java.awt.Color(153, 153, 153));
        painelCadastroCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        painelCadastroCliente.setForeground(new java.awt.Color(0, 0, 0));

        estadotxf.setBackground(new java.awt.Color(204, 204, 204));
        estadotxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        estadotxf.setForeground(new java.awt.Color(0, 0, 0));
        estadotxf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Acre (AC)", "Alagoas (AL)", "Amapá (AP)", "Amazonas (AM)", "Bahia (BA)", "Ceará (CE)", "Distrito Federal (DF)", "Espírito Santo (ES)", "Goiás (GO)", "Maranhão (MA)", "Mato Grosso (MT)", "Mato Grosso do Sul (MS)", "Minas Gerais (MG)", "Pará (PA)", "Paraíba (PB)", "Paraná (PR)", "Pernambuco (PE)", "Piauí (PI)", "Rio de Janeiro (RJ)", "Rio Grande do Norte (RN)", "Rio Grande do Sul (RS)", "Rondônia (RO)", "Roraima (RR)", "Santa Catarina (SC)", "São Paulo (SP)", "Sergipe (SE)", "Tocantins (TO)" }));

        bairrotxf.setBackground(new java.awt.Color(204, 204, 204));
        bairrotxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        bairrotxf.setForeground(new java.awt.Color(0, 0, 0));

        complementotxf.setBackground(new java.awt.Color(204, 204, 204));
        complementotxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        complementotxf.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nome");

        nometxf.setBackground(new java.awt.Color(204, 204, 204));
        nometxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        nometxf.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Rua");

        numero_residenciatxf.setBackground(new java.awt.Color(204, 204, 204));
        numero_residenciatxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        numero_residenciatxf.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("RG");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Estado");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CPF");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Complemento");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Bairro");

        ruatxf.setBackground(new java.awt.Color(204, 204, 204));
        ruatxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ruatxf.setForeground(new java.awt.Color(0, 0, 0));

        rgtxf.setBackground(new java.awt.Color(204, 204, 204));
        rgtxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rgtxf.setForeground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Cidade");

        cidadetxf.setBackground(new java.awt.Color(204, 204, 204));
        cidadetxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cidadetxf.setForeground(new java.awt.Color(0, 0, 0));

        ceptxf.setBackground(new java.awt.Color(204, 204, 204));
        ceptxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ceptxf.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("CEP");

        cpftxf.setBackground(new java.awt.Color(204, 204, 204));
        cpftxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cpftxf.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nº");

        salvarCadastroCliente.setBackground(new java.awt.Color(204, 204, 204));
        salvarCadastroCliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salvarCadastroCliente.setForeground(new java.awt.Color(0, 0, 0));
        salvarCadastroCliente.setText("Salvar");
        salvarCadastroCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarCadastroClienteActionPerformed(evt);
            }
        });

        senhatxf.setBackground(new java.awt.Color(204, 204, 204));
        senhatxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        confirmeSenhatxf.setBackground(new java.awt.Color(204, 204, 204));
        confirmeSenhatxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        senhaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        senhaLabel.setForeground(new java.awt.Color(0, 0, 0));
        senhaLabel.setText("Senha");

        confirmeSenhaLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirmeSenhaLabel.setForeground(new java.awt.Color(0, 0, 0));
        confirmeSenhaLabel.setText("Confirme a Senha");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Telefone");

        telefonetxf.setBackground(new java.awt.Color(204, 204, 204));
        telefonetxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        telefonetxf.setForeground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Usuário");

        usuariotxf.setEditable(false);
        usuariotxf.setBackground(new java.awt.Color(204, 204, 204));
        usuariotxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usuariotxf.setForeground(new java.awt.Color(0, 0, 0));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Email");

        emailtxf.setBackground(new java.awt.Color(204, 204, 204));
        emailtxf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        emailtxf.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout painelCadastroClienteLayout = new javax.swing.GroupLayout(painelCadastroCliente);
        painelCadastroCliente.setLayout(painelCadastroClienteLayout);
        painelCadastroClienteLayout.setHorizontalGroup(
            painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel12)
                            .addComponent(senhaLabel)
                            .addComponent(confirmeSenhaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                                .addComponent(cidadetxf, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                                .addComponent(numero_residenciatxf, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bairrotxf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                                .addComponent(ceptxf, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(complementotxf, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE))
                            .addComponent(nometxf)
                            .addComponent(telefonetxf)
                            .addComponent(cpftxf)
                            .addComponent(rgtxf)
                            .addComponent(ruatxf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(estadotxf, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailtxf)
                            .addComponent(confirmeSenhatxf)
                            .addComponent(usuariotxf)
                            .addComponent(senhatxf))
                        .addContainerGap())
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel13)
                            .addComponent(salvarCadastroCliente))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        painelCadastroClienteLayout.setVerticalGroup(
            painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nometxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(telefonetxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cpftxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rgtxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ruatxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(bairrotxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelCadastroClienteLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numero_residenciatxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ceptxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(complementotxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadetxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(estadotxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuariotxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(senhaLabel)
                    .addComponent(senhatxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmeSenhaLabel)
                    .addComponent(confirmeSenhatxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelCadastroClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(emailtxf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvarCadastroCliente)
                .addContainerGap())
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
                .addComponent(painelCadastroCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void salvarCadastroClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarCadastroClienteActionPerformed
        //Verificando se o usuario está acessando do menu externo, pois utilizei a mesma tela pra duas funções diferentes;
        //Cadastro inicial de um novo cliente;
        //Validações de preenchimento correto;
        if (controller == 0) {
            String nome = nometxf.getText().replaceAll("[0-9'~!@#$%¨¨&*(),.;?_+=-]", "");
            String telefone = telefonetxf.getText().replaceAll("[^0-9-)( ]", "");
            String cpf = cpftxf.getText().replaceAll("[^0-9.-]", "");
            String rg = rgtxf.getText().replaceAll("[^0-9.-]", "");
            String rua = ruatxf.getText();
            int numero = Integer.parseInt(String.valueOf(numero_residenciatxf.getText()));
            String complemento = complementotxf.getText();
            String bairro = bairrotxf.getText();
            String cep = ceptxf.getText().replaceAll("[^0-9]", "");
            String cidade = cidadetxf.getText();
            String estado = estadotxf.getItemAt(estadotxf.getSelectedIndex());
            String usuario = cpf.replaceAll("[^0-9]", "");
            String senha = String.valueOf(senhatxf.getPassword());
            String confirmeSenha = String.valueOf(confirmeSenhatxf.getPassword());
            String email = emailtxf.getText();
            String nivel = "Cliente";
            Cliente cliente = null;

            //Validações de preenchimento;            
            if (nome.length() < 1) {
                nometxf.setText("");
                JOptionPane.showMessageDialog(null, "Insira um nome válido!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (telefone.length() < 11) {
                telefonetxf.setText("");
                JOptionPane.showMessageDialog(null, "Insira um telefone válido! (Ex: (45)98401-2020)", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (cpf.length() < 11) {
                cpftxf.setText("");
                JOptionPane.showMessageDialog(null, "Insira um CPF válido!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (rg.length() < 5) {
                rgtxf.setText("");
                JOptionPane.showMessageDialog(null, "Insira um RG válido!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (senha == null || senha == "" || senha.contains(" ") || senha.isEmpty()) {
                senhatxf.setText("");
                confirmeSenhatxf.setText("");
                JOptionPane.showMessageDialog(null, "Não é possível usar essa senha!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (!senha.contentEquals(confirmeSenha)) {
                senhatxf.setText("");
                confirmeSenhatxf.setText("");
                JOptionPane.showMessageDialog(null, "Senhas digitadas diferem uma da outra!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (email.length() < 1) {
                JOptionPane.showMessageDialog(null, "Insira um email válido!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;

            } else {
                cliente = new Cliente(nome, telefone, cpf, rg, rua, numero, complemento, bairro, cep, cidade, estado, usuario.replaceAll("[^0-9]", ""), senha, email, nivel);

                //Guardando informações do preenchimento;
                try {
                    clienteDAO.cadastroCliente(cliente);
                    JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(null, "Utilize seu CPF cadastrado como usuário de login!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
                dispose();
            }
        }

        //Verificando se o usuario está acessando do menu interno, pois utilizei a mesma tela pra duas funções diferentes;
        //Editando o cadastro do cliente;
        if (controller == 1) {
            String nomeEditar = nometxf.getText().replaceAll("[0-9'~!@#$%¨¨&*(),.;?_+=-]", "");
            String telefoneEditar = telefonetxf.getText().replaceAll("[^0-9-)( ]", "");
            String rgEditar = rgtxf.getText().replaceAll("[^0-9.-]", "");
            String ruaEditar = ruatxf.getText();
            int numeroEditar = Integer.parseInt(String.valueOf(numero_residenciatxf.getText()));
            String complementoEditar = complementotxf.getText();
            String bairroEditar = bairrotxf.getText();
            String cepEditar = ceptxf.getText().replaceAll("[^0-9-]", "");
            String cidadeEditar = cidadetxf.getText();
            String estadoEditar = estadotxf.getItemAt(estadotxf.getSelectedIndex());
            String emailEditar = emailtxf.getText();

            if (nomeEditar.length() < 1) {
                nometxf.setText("");
                JOptionPane.showMessageDialog(null, "Insira um nome válido!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (telefoneEditar.length() < 11) {
                telefonetxf.setText("");
                JOptionPane.showMessageDialog(null, "Insira um telefone válido! (Ex: (45)98401-2020)", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (rgEditar.length() < 3) {
                rgtxf.setText("");
                JOptionPane.showMessageDialog(null, "Insira um RG válido!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;
            }

            if (emailEditar.length() < 1) {
                JOptionPane.showMessageDialog(null, "Insira um email válido!", "Atenção", JOptionPane.WARNING_MESSAGE);
                return;

            } else {
                Cliente clienteEditar = new Cliente(nomeEditar, telefoneEditar, rgEditar, ruaEditar, numeroEditar, complementoEditar, bairroEditar, cepEditar, cidadeEditar, estadoEditar, emailEditar);

                //Atualizando os dados do cliente;
                try {
                    clienteDAO.atualizarMeusDadosCliente(clienteEditar);
                    JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "Atenção", JOptionPane.INFORMATION_MESSAGE);
                    dispose();

                    //Atualizando tela;
                    java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                            new CadastroCliente().setVisible(true);
                        }
                    });

                } catch (SQLException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao inserir no banco de dados!", "Erro", JOptionPane.ERROR_MESSAGE);
                }

            }

        }
    }//GEN-LAST:event_salvarCadastroClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bairrotxf;
    private javax.swing.JTextField ceptxf;
    private javax.swing.JTextField cidadetxf;
    private javax.swing.JTextField complementotxf;
    private javax.swing.JLabel confirmeSenhaLabel;
    private javax.swing.JPasswordField confirmeSenhatxf;
    private javax.swing.JTextField cpftxf;
    private javax.swing.JTextField emailtxf;
    private javax.swing.JComboBox<String> estadotxf;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nometxf;
    private javax.swing.JTextField numero_residenciatxf;
    private javax.swing.JPanel painelCadastroCliente;
    private javax.swing.JTextField rgtxf;
    private javax.swing.JTextField ruatxf;
    private javax.swing.JButton salvarCadastroCliente;
    private javax.swing.JLabel senhaLabel;
    private javax.swing.JPasswordField senhatxf;
    private javax.swing.JTextField telefonetxf;
    private javax.swing.JTextField usuariotxf;
    // End of variables declaration//GEN-END:variables

}

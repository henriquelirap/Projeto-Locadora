package vision;

import static vision.Login.controller;
import static vision.Login.nivelAcessado;

public class Locadora extends javax.swing.JFrame {

    public Locadora() {
        initComponents();
        verificarNivel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        areaCliente = new javax.swing.JMenu();
        meusDados = new javax.swing.JMenuItem();
        menuNovaLocacao = new javax.swing.JMenuItem();
        minhasLocacoes = new javax.swing.JMenuItem();
        caixa = new javax.swing.JMenuItem();
        cadNovoVeiculo = new javax.swing.JMenuItem();
        trocarUsuario = new javax.swing.JMenuItem();
        sairSistema = new javax.swing.JMenuItem();
        relatorios = new javax.swing.JMenu();
        veiculosCadastrados = new javax.swing.JMenuItem();
        movimentacaoCaixa = new javax.swing.JMenuItem();
        clientes = new javax.swing.JMenu();
        crudClientes = new javax.swing.JMenuItem();
        funcionarios = new javax.swing.JMenu();
        crudFuncionarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Principal");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 935, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 557, Short.MAX_VALUE)
        );

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 153));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        areaCliente.setBackground(new java.awt.Color(204, 204, 204));
        areaCliente.setForeground(new java.awt.Color(0, 0, 0));
        areaCliente.setText("Manutenção");
        areaCliente.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        meusDados.setBackground(new java.awt.Color(204, 204, 204));
        meusDados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        meusDados.setForeground(new java.awt.Color(0, 0, 0));
        meusDados.setText("Meus Dados");
        meusDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                meusDadosActionPerformed(evt);
            }
        });
        areaCliente.add(meusDados);

        menuNovaLocacao.setBackground(new java.awt.Color(204, 204, 204));
        menuNovaLocacao.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menuNovaLocacao.setForeground(new java.awt.Color(0, 0, 0));
        menuNovaLocacao.setText("Nova Locação");
        menuNovaLocacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNovaLocacaoActionPerformed(evt);
            }
        });
        areaCliente.add(menuNovaLocacao);

        minhasLocacoes.setBackground(new java.awt.Color(204, 204, 204));
        minhasLocacoes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        minhasLocacoes.setForeground(new java.awt.Color(0, 0, 0));
        minhasLocacoes.setText("Minhas Locações");
        minhasLocacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minhasLocacoesActionPerformed(evt);
            }
        });
        areaCliente.add(minhasLocacoes);

        caixa.setBackground(new java.awt.Color(204, 204, 204));
        caixa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        caixa.setForeground(new java.awt.Color(0, 0, 0));
        caixa.setText("Caixa");
        caixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaActionPerformed(evt);
            }
        });
        areaCliente.add(caixa);

        cadNovoVeiculo.setBackground(new java.awt.Color(204, 204, 204));
        cadNovoVeiculo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cadNovoVeiculo.setForeground(new java.awt.Color(0, 0, 0));
        cadNovoVeiculo.setText("Cadastrar Novo Veículo");
        cadNovoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadNovoVeiculoActionPerformed(evt);
            }
        });
        areaCliente.add(cadNovoVeiculo);

        trocarUsuario.setBackground(new java.awt.Color(204, 204, 204));
        trocarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        trocarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        trocarUsuario.setText("Trocar de Usuário");
        trocarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trocarUsuarioActionPerformed(evt);
            }
        });
        areaCliente.add(trocarUsuario);

        sairSistema.setBackground(new java.awt.Color(204, 204, 204));
        sairSistema.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sairSistema.setForeground(new java.awt.Color(0, 0, 0));
        sairSistema.setText("Sair");
        sairSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairSistemaActionPerformed(evt);
            }
        });
        areaCliente.add(sairSistema);

        jMenuBar1.add(areaCliente);

        relatorios.setBackground(new java.awt.Color(204, 204, 204));
        relatorios.setForeground(new java.awt.Color(0, 0, 0));
        relatorios.setText("Relatórios");
        relatorios.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        veiculosCadastrados.setBackground(new java.awt.Color(204, 204, 204));
        veiculosCadastrados.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        veiculosCadastrados.setForeground(new java.awt.Color(0, 0, 0));
        veiculosCadastrados.setText("Veículos Cadastrados");
        veiculosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                veiculosCadastradosActionPerformed(evt);
            }
        });
        relatorios.add(veiculosCadastrados);

        movimentacaoCaixa.setBackground(new java.awt.Color(204, 204, 204));
        movimentacaoCaixa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        movimentacaoCaixa.setForeground(new java.awt.Color(0, 0, 0));
        movimentacaoCaixa.setText("Movimentação do Caixa/Provisões");
        movimentacaoCaixa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movimentacaoCaixaActionPerformed(evt);
            }
        });
        relatorios.add(movimentacaoCaixa);

        jMenuBar1.add(relatorios);

        clientes.setBackground(new java.awt.Color(204, 204, 204));
        clientes.setForeground(new java.awt.Color(0, 0, 0));
        clientes.setText("Clientes");
        clientes.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        crudClientes.setBackground(new java.awt.Color(204, 204, 204));
        crudClientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        crudClientes.setForeground(new java.awt.Color(0, 0, 0));
        crudClientes.setText("Listar/Cadastrar/Editar/Remover");
        crudClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudClientesActionPerformed(evt);
            }
        });
        clientes.add(crudClientes);

        jMenuBar1.add(clientes);

        funcionarios.setBackground(new java.awt.Color(204, 204, 204));
        funcionarios.setForeground(new java.awt.Color(0, 0, 0));
        funcionarios.setText("Funcionários");
        funcionarios.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N

        crudFuncionarios.setBackground(new java.awt.Color(204, 204, 204));
        crudFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        crudFuncionarios.setForeground(new java.awt.Color(0, 0, 0));
        crudFuncionarios.setText("Listar/Cadastrar/Editar/Remover/Permissões");
        crudFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudFuncionariosActionPerformed(evt);
            }
        });
        funcionarios.add(crudFuncionarios);

        jMenuBar1.add(funcionarios);

        setJMenuBar(jMenuBar1);

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

    private void crudClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudClientesActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudClientes().setVisible(true);
            }
        });
    }//GEN-LAST:event_crudClientesActionPerformed

    private void crudFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudFuncionariosActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudFuncionarios().setVisible(true);
            }
        });
    }//GEN-LAST:event_crudFuncionariosActionPerformed

    private void trocarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trocarUsuarioActionPerformed
        controller = 0;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
                dispose();
            }
        });
    }//GEN-LAST:event_trocarUsuarioActionPerformed

    private void veiculosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_veiculosCadastradosActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudVeiculos().setVisible(true);
            }
        });
    }//GEN-LAST:event_veiculosCadastradosActionPerformed

    private void cadNovoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadNovoVeiculoActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarNovoVeiculo().setVisible(true);
            }
        });
    }//GEN-LAST:event_cadNovoVeiculoActionPerformed

    private void caixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaixaDia().setVisible(true);
            }
        });
    }//GEN-LAST:event_caixaActionPerformed

    private void menuNovaLocacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNovaLocacaoActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NovaLocacao().setVisible(true);
            }
        });
    }//GEN-LAST:event_menuNovaLocacaoActionPerformed

    private void minhasLocacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minhasLocacoesActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinhasLocacoesCliente().setVisible(true);
            }
        });
    }//GEN-LAST:event_minhasLocacoesActionPerformed

    //Botão meus dados, que verifica se é um funcionario ou cliente acessando a tela;   
    private void meusDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_meusDadosActionPerformed
        //Controlador pra informar que o usuário está abrindo a tela de de dentro do sistema já logado e autenticado;
        controller = 1;

        //Verificando se é cliente;
        if (nivelAcessado.equalsIgnoreCase("cliente")) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new CadastroCliente().setVisible(true);
                }
            });
        }

        //Verificando se é funcionário;
        if (nivelAcessado.equalsIgnoreCase("funcionario") || nivelAcessado.equalsIgnoreCase("funcionário") || nivelAcessado.equalsIgnoreCase("Admin")) {
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new CadastroFuncionario().setVisible(true);
                }
            });
        }
    }//GEN-LAST:event_meusDadosActionPerformed

    private void movimentacaoCaixaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movimentacaoCaixaActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MovimentacoesCaixa().setVisible(true);
            }
        });
    }//GEN-LAST:event_movimentacaoCaixaActionPerformed

    private void sairSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairSistemaActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairSistemaActionPerformed

    //Método pra verificar nível de acesso;
    private void verificarNivel() {

        //Sistema para cliente;
        if (nivelAcessado.equalsIgnoreCase("Cliente")) {
            caixa.setVisible(false);
            cadNovoVeiculo.setVisible(false);
            relatorios.setVisible(false);
            clientes.setVisible(false);
            funcionarios.setVisible(false);
        }

        //Sistema para funcionários;
        if (nivelAcessado.equalsIgnoreCase("Funcionario") || nivelAcessado.equalsIgnoreCase("Funcionário")) {
            funcionarios.setVisible(false);
            movimentacaoCaixa.setVisible(false);
            minhasLocacoes.setVisible(false);
            menuNovaLocacao.setVisible(false);
            crudClientes.setText("Listar/Cadastrar/Editar");           
        }

        //Sistema para administrador;
        if (nivelAcessado.equalsIgnoreCase("Admin")) {
            minhasLocacoes.setVisible(false);
            menuNovaLocacao.setVisible(false);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu areaCliente;
    private javax.swing.JMenuItem cadNovoVeiculo;
    private javax.swing.JMenuItem caixa;
    private javax.swing.JMenu clientes;
    private javax.swing.JMenuItem crudClientes;
    private javax.swing.JMenuItem crudFuncionarios;
    private javax.swing.JMenu funcionarios;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem menuNovaLocacao;
    public static javax.swing.JMenuItem meusDados;
    private javax.swing.JMenuItem minhasLocacoes;
    private javax.swing.JMenuItem movimentacaoCaixa;
    private javax.swing.JMenu relatorios;
    private javax.swing.JMenuItem sairSistema;
    private javax.swing.JMenuItem trocarUsuario;
    private javax.swing.JMenuItem veiculosCadastrados;
    // End of variables declaration//GEN-END:variables

}

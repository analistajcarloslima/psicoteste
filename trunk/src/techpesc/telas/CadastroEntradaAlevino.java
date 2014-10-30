/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techpesc.telas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.java2d.pipe.SpanShapeRenderer;
import techpesc.alevinos.Alevino;
import techpesc.alevinos.AlevinoDAO;
import techpesc.alevinos.AlevinoRN;
import techpesc.alevinos.AlevinoTableModel;
import techpesc.fornecedor.Fornecedor;
import techpesc.fornecedor.FornecedorDAO;
import techpesc.fornecedor.FornecedorTableModel;
import techpesc.funcionario.Funcionario;
import techpesc.funcionario.FuncionarioDAO;
import techpesc.funcionario.FuncionarioRN;
import techpesc.funcionario.FuncionarioTableModel;
import techpesc.util.Util;

/**
 *
 * @author fatima
 */
public class CadastroEntradaAlevino extends javax.swing.JDialog {

    Alevino alevino;
    AlevinoDAO alevinoDAO = new AlevinoDAO();
    AlevinoRN alevinoRN = new AlevinoRN();
    Fornecedor fornecedor;
    SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
    Date data = new Date();
    Date dataAtual = new Date();
    Date dataNascimento = new Date();

    /**
     * Creates new form Cadastro_de_Funcionário
     */
    public CadastroEntradaAlevino() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/techpesc/imagens/peixe.png")).getImage());
        tfFornecedor.setEditable(false);
        setModal(true);
        limparCampos();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btPesquisar = new javax.swing.JButton();
        btVoltarMenu = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        btExcluir3 = new javax.swing.JButton();
        btSalvar1 = new javax.swing.JButton();
        tfDataNascimento = new javax.swing.JFormattedTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        tfQtdAlevinos = new javax.swing.JTextField();
        tfPesoAlevino = new javax.swing.JTextField();
        tfValorAlevino = new javax.swing.JTextField();
        tfFornecedor = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        btPesquisarNome4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entrada de Alevinos");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(23, 49, 106));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/cabeçalho1.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Entrada de Alevinos");

        jPanel2.setBackground(new java.awt.Color(23, 49, 106));

        btPesquisar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/pesquisa.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setToolTipText("");
        btPesquisar.setContentAreaFilled(false);
        btPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });

        btVoltarMenu.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btVoltarMenu.setForeground(new java.awt.Color(255, 255, 255));
        btVoltarMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/voltar.png"))); // NOI18N
        btVoltarMenu.setText("Voltar");
        btVoltarMenu.setToolTipText("");
        btVoltarMenu.setContentAreaFilled(false);
        btVoltarMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltarMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVoltarMenu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarMenuActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/salvar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setToolTipText("");
        btSalvar.setContentAreaFilled(false);
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btExcluir3.setForeground(new java.awt.Color(255, 255, 255));
        btExcluir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/excluir2.png"))); // NOI18N
        btExcluir3.setText("Excluir");
        btExcluir3.setToolTipText("");
        btExcluir3.setContentAreaFilled(false);
        btExcluir3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir3.setPreferredSize(new java.awt.Dimension(57, 35));
        btExcluir3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluir3ActionPerformed(evt);
            }
        });

        btSalvar1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btSalvar1.setForeground(new java.awt.Color(255, 255, 255));
        btSalvar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/novo.png"))); // NOI18N
        btSalvar1.setText("Novo");
        btSalvar1.setToolTipText("");
        btSalvar1.setContentAreaFilled(false);
        btSalvar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(btVoltarMenu)
                .addGap(160, 160, 160)
                .addComponent(btSalvar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btPesquisar)
                .addGap(18, 18, 18)
                .addComponent(btExcluir3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btVoltarMenu, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btSalvar)
                        .addComponent(btSalvar1)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btExcluir3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(62, 62, 62))
        );

        try {
            tfDataNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfDataNascimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfDataNascimento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfDataNascimentoFocusLost(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Data de Nascimento.:");

        jLabel42.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("Fornecedor.:");

        jLabel43.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("Peso Alevino Unid./g .:");

        jLabel44.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Quantidade Alevinos.:");

        tfQtdAlevinos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfQtdAlevinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfQtdAlevinosActionPerformed(evt);
            }
        });

        tfPesoAlevino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfPesoAlevino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesoAlevinoActionPerformed(evt);
            }
        });

        tfValorAlevino.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfValorAlevino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorAlevinoActionPerformed(evt);
            }
        });

        tfFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfFornecedorActionPerformed(evt);
            }
        });

        jLabel45.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("Valor dos Alevinos Unid. .:");

        btPesquisarNome4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_pesquisar.png"))); // NOI18N
        btPesquisarNome4.setContentAreaFilled(false);
        btPesquisarNome4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPesquisarNome4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarNome4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator17))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel42)
                    .addComponent(jLabel44)
                    .addComponent(jLabel43)
                    .addComponent(jLabel49)
                    .addComponent(jLabel45))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfPesoAlevino, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfValorAlevino)
                        .addComponent(tfDataNascimento)
                        .addComponent(tfQtdAlevinos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btPesquisarNome4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel41)
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfQtdAlevinos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel44)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel43)
                    .addComponent(tfPesoAlevino, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValorAlevino, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPesquisarNome4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed
        List<Alevino> lista;
        AlevinoDAO dao = new AlevinoDAO();
        lista = (dao.listar());
        AlevinoTableModel itm = new AlevinoTableModel(lista);
        Object o = TelaConsultaEntradaAlevino.exibeTela(itm, "Alevino");
        if (o != null) {
            alevino = alevinoRN.pesquisarCodigo(Short.valueOf(String.valueOf(o)));
            tfDataNascimento.setText(formatar.format(alevino.getDataNascimentoAlevino()));
            tfPesoAlevino.setText(String.valueOf(alevino.getPesoAlevino()));
            tfQtdAlevinos.setText(String.valueOf(alevino.getQtdAlevino()));
            if (alevino.isSituacaoEntradaAlevino() == false) {
                tfQtdAlevinos.setEnabled(false);
            }
            tfValorAlevino.setText(String.valueOf(alevino.getValorAlevino()));
            tfFornecedor.setText(alevino.getFornecedor().getNomeFornecedor());
            fornecedor = alevino.getFornecedor();
            btExcluir3.setEnabled(true);

        }
    }//GEN-LAST:event_btPesquisarActionPerformed


    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (alevino == null) {
            alevino = new Alevino();
        }

        if (alevino.getIdEntradaAlevino() == 0) {
            alevino.setPesoAlevino(Double.parseDouble(tfPesoAlevino.getText()));
            alevino.setQtdAlevino(Short.valueOf(tfQtdAlevinos.getText()));
            alevino.setValorAlevino(Double.parseDouble(tfValorAlevino.getText()));
            try {
                dataAtual = formatar.parse(formatar.format(data));
            } catch (ParseException ex) {
                Logger.getLogger(CadastroEntradaAlevino.class.getName()).log(Level.SEVERE, null, ex);
            }
            alevino.setDataEntrada(dataAtual);
            try {
                dataNascimento = formatar.parse(tfDataNascimento.getText());
            } catch (ParseException ex) {
                Logger.getLogger(CadastroEntradaAlevino.class.getName()).log(Level.SEVERE, null, ex);
            }
            alevino.setDataNascimentoAlevino(dataNascimento);
            alevino.setFornecedor(fornecedor);
            alevinoDAO.salvar(alevino);
            JOptionPane.showMessageDialog(rootPane, "Alevino Cadastrado com Sucesso!");
            limparCampos();
        } else {
            alevino.setPesoAlevino(Double.parseDouble(tfPesoAlevino.getText()));
            alevino.setQtdAlevino(Short.valueOf(tfQtdAlevinos.getText()));
            alevino.setValorAlevino(Double.parseDouble(tfValorAlevino.getText()));
            try {
                dataAtual = formatar.parse(formatar.format(data));
            } catch (ParseException ex) {
                Logger.getLogger(CadastroEntradaAlevino.class.getName()).log(Level.SEVERE, null, ex);
            }
            alevino.setDataEntrada(dataAtual);
            try {
                dataNascimento = formatar.parse(tfDataNascimento.getText());
            } catch (ParseException ex) {
                Logger.getLogger(CadastroEntradaAlevino.class.getName()).log(Level.SEVERE, null, ex);
            }
            alevino.setDataNascimentoAlevino(dataNascimento);

            alevino.setFornecedor(fornecedor);
            if (JOptionPane.showConfirmDialog(rootPane, "Deseja realmente editar a entrada da Data: " + alevino.getDataEntrada()
                    + " do Fornecedor: " + alevino.getFornecedor().getNomeFornecedor() + "?", "TechPesc", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION) {
                alevinoDAO.salvar(alevino);
                JOptionPane.showMessageDialog(rootPane, "Pronto, A entrada realizada no Data " + alevino.getDataEntrada() + " do Fornecedor: " + alevino.getFornecedor().getNomeFornecedor()
                        + ", foi editada com sucesso!", "Alevino", JOptionPane.INFORMATION_MESSAGE);
            }
            limparCampos();

        }

    }//GEN-LAST:event_btSalvarActionPerformed
    public void limparCampos() {
        tfDataNascimento.setText("");
        tfFornecedor.setText("");
        tfPesoAlevino.setText("");
        tfQtdAlevinos.setText("");
        tfValorAlevino.setText("");
        tfQtdAlevinos.setEnabled(true);
        btExcluir3.setEnabled(false);
        alevino = null;
    }

    private void btVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarMenuActionPerformed

        dispose();
    }//GEN-LAST:event_btVoltarMenuActionPerformed

    private void tfQtdAlevinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfQtdAlevinosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfQtdAlevinosActionPerformed

    private void btExcluir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluir3ActionPerformed
        if (alevino != null) {
            if (alevino.getIdEntradaAlevino() != 0) {
                if (alevino.isSituacaoEntradaAlevino() == true) {
                    if (JOptionPane.showConfirmDialog(rootPane, "Deseja excluir a Entrada " + alevino.getDataEntrada()
                            + " do Fornecedor: " + alevino.getFornecedor().getNomeFornecedor() + "?", "TechPesc", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE) == JOptionPane.YES_OPTION) {
                        if (alevinoRN.remove(alevino)) {
                            JOptionPane.showMessageDialog(rootPane, "Pronto,  a Entrada da Data" + alevino.getDataEntrada()
                                    + " do Fornecedor: " + alevino.getFornecedor().getNomeFornecedor() + ", foi excluído com sucesso!", "Funcionario", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Não foi possível excluir a Entrada " + alevino.getDataEntrada()
                                    + " do Fornecedor: " + alevino.getFornecedor().getNomeFornecedor(),
                                    "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Não é possível excluir uma entrada de alevino que está vinculado a algum lote!",
                            "Erro ao Excluir", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        limparCampos();

    }//GEN-LAST:event_btExcluir3ActionPerformed

    private void btSalvar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvar1ActionPerformed
        limparCampos();        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvar1ActionPerformed

    private void tfPesoAlevinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesoAlevinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesoAlevinoActionPerformed

    private void tfValorAlevinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorAlevinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorAlevinoActionPerformed

    private void tfFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfFornecedorActionPerformed

    private void btPesquisarNome4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarNome4ActionPerformed
        FornecedorDAO fornecedorDAO = new FornecedorDAO();
        fornecedor = new Fornecedor();
        FornecedorTableModel fornecedorTableModel = new FornecedorTableModel(fornecedorDAO.listar());
        Object object = TelaConsulta.exibeTela(fornecedorTableModel, "Fornecedores");        // TODO add your handling code here:
        Short codigo = Short.valueOf(String.valueOf(object));
        fornecedor = fornecedorDAO.pesquisarCodigo(codigo);
        tfFornecedor.setText(fornecedor.getNomeFornecedor());
    }//GEN-LAST:event_btPesquisarNome4ActionPerformed

    private void tfDataNascimentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfDataNascimentoFocusLost
        if (Util.dataValida(tfDataNascimento.getText().toString()) == false) {
            JOptionPane.showMessageDialog(rootPane, "Data inválida, redigite!",
                    "ERRO", JOptionPane.ERROR_MESSAGE);
            tfDataNascimento.setText("");
        }
    }//GEN-LAST:event_tfDataNascimentoFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroEntradaAlevino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEntradaAlevino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEntradaAlevino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEntradaAlevino.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEntradaAlevino().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir3;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btPesquisarNome4;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btSalvar1;
    private javax.swing.JButton btVoltarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JFormattedTextField tfDataNascimento;
    private javax.swing.JTextField tfFornecedor;
    private javax.swing.JTextField tfPesoAlevino;
    private javax.swing.JTextField tfQtdAlevinos;
    private javax.swing.JTextField tfValorAlevino;
    // End of variables declaration//GEN-END:variables
}

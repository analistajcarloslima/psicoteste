/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package techpesc.telas;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import techpesc.usuario.Usuario;

/**
 *
 * @author fatima
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal(Usuario usuario) {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/techpesc/imagens/peixe.png")).getImage());
        JlUsuario.setText(String.valueOf(usuario.toString()));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JlUsuario = new javax.swing.JLabel();
        JlUsuario1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Estoque = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(23, 49, 106));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(23, 49, 106));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/plano de fundo.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Versão.: 1.0");

        jLabel2.setBackground(new java.awt.Color(23, 49, 106));
        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/exit.png"))); // NOI18N
        jLabel2.setText("Logoff");
        jLabel2.setToolTipText("Voltar a tela de login");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setInheritsPopupMenu(false);
        jLabel2.setOpaque(true);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        JlUsuario.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        JlUsuario.setForeground(new java.awt.Color(255, 255, 255));
        JlUsuario.setText("????");

        JlUsuario1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        JlUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        JlUsuario1.setText("Usuário.:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JlUsuario1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JlUsuario)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JlUsuario1)
                            .addComponent(JlUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
                .addContainerGap())
        );

        jMenuBar1.setToolTipText("");

        Estoque.setBackground(new java.awt.Color(23, 49, 106));
        Estoque.setForeground(new java.awt.Color(23, 49, 106));
        Estoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/cadastrar.png"))); // NOI18N
        Estoque.setText("Cadastro");
        Estoque.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Estoque.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Estoque.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstoqueActionPerformed(evt);
            }
        });

        jMenuItem4.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_cadastrar.png"))); // NOI18N
        jMenuItem4.setText("Cliente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Estoque.add(jMenuItem4);

        jMenuItem3.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_cadastrar.png"))); // NOI18N
        jMenuItem3.setText("Estoque");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Estoque.add(jMenuItem3);

        jMenuItem1.setBackground(new java.awt.Color(23, 49, 106));
        jMenuItem1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_cadastrar.png"))); // NOI18N
        jMenuItem1.setText("Funcionário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Estoque.add(jMenuItem1);

        jMenuItem15.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem15.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_cadastrar.png"))); // NOI18N
        jMenuItem15.setText("Fornecedor");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        Estoque.add(jMenuItem15);

        jMenuItem2.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_cadastrar.png"))); // NOI18N
        jMenuItem2.setText("Lotes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Estoque.add(jMenuItem2);

        jMenuItem14.setBackground(new java.awt.Color(23, 49, 106));
        jMenuItem14.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem14.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_cadastrar.png"))); // NOI18N
        jMenuItem14.setText("Tanque Rede");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        Estoque.add(jMenuItem14);

        jMenuItem11.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem11.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_cadastrar.png"))); // NOI18N
        jMenuItem11.setText("Usuário");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        Estoque.add(jMenuItem11);

        jMenuBar1.add(Estoque);

        jMenu5.setForeground(new java.awt.Color(23, 49, 106));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/acompanhamento.png"))); // NOI18N
        jMenu5.setText("Criação");
        jMenu5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jMenu5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem18.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem18.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_acompanhamento.png"))); // NOI18N
        jMenuItem18.setText("Transferência de T.R");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem18);

        jMenuItem19.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem19.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_acompanhamento.png"))); // NOI18N
        jMenuItem19.setText("Alimentação");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem19);

        jMenuItem20.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem20.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_acompanhamento.png"))); // NOI18N
        jMenuItem20.setText("Mortandade");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem20);

        jMenuBar1.add(jMenu5);

        jMenu2.setForeground(new java.awt.Color(23, 49, 106));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/financeiro.png"))); // NOI18N
        jMenu2.setText("Financeiro");
        jMenu2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem16.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem16.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_financeiro.png"))); // NOI18N
        jMenuItem16.setText("Entrada Alevino");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem16);

        jMenuItem5.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_financeiro.png"))); // NOI18N
        jMenuItem5.setText("Vendas");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(23, 49, 106));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/relatorios.png"))); // NOI18N
        jMenu3.setText("Relatórios");
        jMenu3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jMenu3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem21.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem21.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_relatorios.png"))); // NOI18N
        jMenuItem21.setText("Estoque");
        jMenu3.add(jMenuItem21);

        jMenuItem10.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_relatorios.png"))); // NOI18N
        jMenuItem10.setText("Lista de Lotes");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem10);

        jMenuItem9.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_relatorios.png"))); // NOI18N
        jMenuItem9.setText("Lista de Tanques");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem9);

        jMenuItem12.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem12.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_relatorios.png"))); // NOI18N
        jMenuItem12.setText("Mortandade por Lote");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem7.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_relatorios.png"))); // NOI18N
        jMenuItem7.setText("Previsão de Abate");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem22.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem22.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_relatorios.png"))); // NOI18N
        jMenuItem22.setText("Transferência de T.R por Lote");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem22);

        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(23, 49, 106));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/ajuda.png"))); // NOI18N
        jMenu4.setText("Ajuda");
        jMenu4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jMenu4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });

        jMenuItem17.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jMenuItem17.setForeground(new java.awt.Color(23, 49, 106));
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/techpesc/imagens/sub_relatorios.png"))); // NOI18N
        jMenuItem17.setText("Tutoriais");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        new CadastroLote().setVisible(true);

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
      new Login().setVisible(true);
      dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new CadastroFuncionario().setVisible(true);

        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstoqueActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_EstoqueActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
          new CadastroUsuario().setVisible(true);

    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        new CadastroTanqueRede().setVisible(true);
     // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
       new CadastroFornecedor().setVisible(true);

    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
    new CadastroEntradaAlevino().setVisible(true);

    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
     new CadastroEstoque().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
      new CadastroTransferenciaTanque().setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
     new CadastroAlimentarTanqueRede().setVisible(true);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
    new CadastroMortandade().setVisible(true);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
     new CadastroVendaTanqueRede().setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
      new Tutoriais().setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
      new TelaRelatorioPrevisaoTanque().setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       new TelaRelatorioTanquesEmLotes().setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
       new TelaRelatorioTransferencia().setVisible(true);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
      new TelaRelatorioTanques().setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
       new TelaRelatorioMortandade().setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       new CadastroCliente().setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Estoque;
    private javax.swing.JLabel JlUsuario;
    private javax.swing.JLabel JlUsuario1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author johnn
 */
public class TelaPrincipalMDI extends javax.swing.JFrame {
    

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipalMDI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("clinica_crc?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        pacienteQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT p FROM Paciente p");
        pacienteList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : pacienteQuery.getResultList();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ocorrenciaButtonBVD = new javax.swing.JButton();
        pacienteButtonBVD = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        declaracaoButtonBVD = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        pacienteButton = new javax.swing.JButton();
        ocorrenciaButton = new javax.swing.JButton();
        declaracaoButton = new javax.swing.JButton();
        parentPanel = new javax.swing.JPanel();
        pacientePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePac = new javax.swing.JTable();
        ocorrenciaPanel = new javax.swing.JPanel();
        declaracaoPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Utilitário da Clínica do Rim do Carpina");

        PosicaoFormulario form = new PosicaoFormulario();
        jInternalFrame1.setClosable(true);
        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Bem-vindo");
        try {
            jInternalFrame1.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        int lDesk = jDesktopPane1.getWidth();
        int aDesk = jDesktopPane1.getHeight();
        int lIFrame = jInternalFrame1.getWidth();
        int aIFrame = jInternalFrame1.getHeight();

        jInternalFrame1.setLocation( lDesk / 2 - lIFrame / 2, aDesk / 2 - aIFrame / 2 );
        jInternalFrame1.setVisible(true);
        jInternalFrame1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jInternalFrame1FocusGained(evt);
            }
        });
        jInternalFrame1.getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Sistema Utilitário da Clínica do Rim");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 260, 17);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/rins45%.png"))); // NOI18N
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(258, 0, 362, 358);

        ocorrenciaButtonBVD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/heart.png"))); // NOI18N
        ocorrenciaButtonBVD.setText("Ocorrências");
        ocorrenciaButtonBVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocorrenciaButtonBVDActionPerformed(evt);
            }
        });
        jPanel1.add(ocorrenciaButtonBVD);
        ocorrenciaButtonBVD.setBounds(10, 60, 130, 25);

        pacienteButtonBVD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/group.png"))); // NOI18N
        pacienteButtonBVD.setText("Pacientes");
        pacienteButtonBVD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteButtonBVDActionPerformed(evt);
            }
        });
        jPanel1.add(pacienteButtonBVD);
        pacienteButtonBVD.setBounds(10, 90, 130, 25);

        jLabel3.setText("Deseja Consultar:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 40, 100, 14);

        declaracaoButtonBVD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/page_add.png"))); // NOI18N
        declaracaoButtonBVD.setText(" Declarações");
        jPanel1.add(declaracaoButtonBVD);
        declaracaoButtonBVD.setBounds(10, 120, 130, 25);

        jInternalFrame1.getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 620, 350);

        jDesktopPane1.add(jInternalFrame1);
        jInternalFrame1.setBounds(577, 264, 630, 383);

        pacienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/group.png"))); // NOI18N
        pacienteButton.setText("Pacientes");
        pacienteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pacienteButtonActionPerformed(evt);
            }
        });

        ocorrenciaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/heart.png"))); // NOI18N
        ocorrenciaButton.setText("Ocorrências");
        ocorrenciaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ocorrenciaButtonActionPerformed(evt);
            }
        });

        declaracaoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/page_add.png"))); // NOI18N
        declaracaoButton.setText("Declarações");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pacienteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ocorrenciaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(declaracaoButton)
                .addContainerGap(1601, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pacienteButton)
                    .addComponent(ocorrenciaButton)
                    .addComponent(declaracaoButton))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jDesktopPane1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1950, 160);

        parentPanel.setLayout(new java.awt.CardLayout());

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, pacienteList, jTablePac);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nome}"));
        columnBinding.setColumnName("Nome");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${turno}"));
        columnBinding.setColumnName("Turno");
        columnBinding.setColumnClass(view.Turno.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${medico}"));
        columnBinding.setColumnName("Medico");
        columnBinding.setColumnClass(view.Medico.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cidade}"));
        columnBinding.setColumnName("Cidade");
        columnBinding.setColumnClass(view.Cidade.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${rua}"));
        columnBinding.setColumnName("Rua");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${bairro}"));
        columnBinding.setColumnName("Bairro");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cep}"));
        columnBinding.setColumnName("Cep");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${cpf}"));
        columnBinding.setColumnName("Cpf");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${profissao}"));
        columnBinding.setColumnName("Profissao");
        columnBinding.setColumnClass(view.Profissao.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${estado}"));
        columnBinding.setColumnName("Estado");
        columnBinding.setColumnClass(view.Estado.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataNascimento}"));
        columnBinding.setColumnName("Data Nascimento");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jScrollPane1.setViewportView(jTablePac);

        javax.swing.GroupLayout pacientePanelLayout = new javax.swing.GroupLayout(pacientePanel);
        pacientePanel.setLayout(pacientePanelLayout);
        pacientePanelLayout.setHorizontalGroup(
            pacientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pacientePanelLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(317, Short.MAX_VALUE))
        );
        pacientePanelLayout.setVerticalGroup(
            pacientePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pacientePanelLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        parentPanel.add(pacientePanel, "card4");

        javax.swing.GroupLayout ocorrenciaPanelLayout = new javax.swing.GroupLayout(ocorrenciaPanel);
        ocorrenciaPanel.setLayout(ocorrenciaPanelLayout);
        ocorrenciaPanelLayout.setHorizontalGroup(
            ocorrenciaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1950, Short.MAX_VALUE)
        );
        ocorrenciaPanelLayout.setVerticalGroup(
            ocorrenciaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );

        parentPanel.add(ocorrenciaPanel, "card3");

        javax.swing.GroupLayout declaracaoPanelLayout = new javax.swing.GroupLayout(declaracaoPanel);
        declaracaoPanel.setLayout(declaracaoPanelLayout);
        declaracaoPanelLayout.setHorizontalGroup(
            declaracaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1950, Short.MAX_VALUE)
        );
        declaracaoPanelLayout.setVerticalGroup(
            declaracaoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );

        parentPanel.add(declaracaoPanel, "card2");

        jDesktopPane1.add(parentPanel);
        parentPanel.setBounds(0, 190, 1950, 840);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user.png"))); // NOI18N
        jMenu3.setText("Usuários");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_add.png"))); // NOI18N
        jMenuItem2.setText("Adicionar Usuário");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);
        jMenu3.add(jSeparator2);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/user_delete.png"))); // NOI18N
        jMenuItem4.setText("Remover Usuário");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/monitor.png"))); // NOI18N
        jMenu1.setText("Consulta");
        jMenu1.add(jSeparator1);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/heart.png"))); // NOI18N
        jMenu4.setText("Ocorrências");

        jMenuItem3.setText("Ocorrências da recepção");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem5.setText("Ocorrências");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenu1.add(jMenu4);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/page_add.png"))); // NOI18N
        jMenuItem6.setText("Gerar relatório");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/group.png"))); // NOI18N
        jMenu5.setText("Cadastros");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Pacientes");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem1);

        jMenuItem7.setText("Médicos");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem7);

        jMenuBar1.add(jMenu5);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cog.png"))); // NOI18N
        jMenu2.setText("Configurações");
        jMenuBar1.add(jMenu2);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/disconnect.png"))); // NOI18N
        jMenu6.setText("Sair");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu6ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1951, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jInternalFrame1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jInternalFrame1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jInternalFrame1FocusGained

    private void pacienteButtonBVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteButtonBVDActionPerformed
        jInternalFrame1.dispose();
        parentPanel.removeAll();
        parentPanel.add(pacientePanel);
        parentPanel.repaint();
        parentPanel.revalidate();
        jInternalFrame1.dispose(); 
    }//GEN-LAST:event_pacienteButtonBVDActionPerformed

    private void ocorrenciaButtonBVDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocorrenciaButtonBVDActionPerformed
        parentPanel.removeAll();
        parentPanel.add(ocorrenciaPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
        jInternalFrame1.dispose();
    }//GEN-LAST:event_ocorrenciaButtonBVDActionPerformed

    private void jMenu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu6ActionPerformed
   // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed

    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
        //TelaPaciente telaPac = new TelaPaciente();
        //jDesktopPane1.add(telaPac);
        // telaPac.setVisible(true);

    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

        //TelaCadMed telaCadM = new TelaCadMed();
        // jDesktopPane1.add(telaCadM);
        //telaCadM.setVisible(true);
       

    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        //TelaCadastroUsuario telaCadUser = new TelaCadastroUsuario();
        //jDesktopPane1.add(telaCadUser);
        //telaCadUser.setVisible(true);
        

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void pacienteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pacienteButtonActionPerformed
       parentPanel.removeAll();
        parentPanel.add(pacientePanel);
        parentPanel.repaint();
        parentPanel.revalidate();
        jInternalFrame1.dispose();
    }//GEN-LAST:event_pacienteButtonActionPerformed

    private void ocorrenciaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ocorrenciaButtonActionPerformed
       parentPanel.removeAll();
        parentPanel.add(ocorrenciaPanel);
        parentPanel.repaint();
        parentPanel.revalidate();
        jInternalFrame1.dispose();
    }//GEN-LAST:event_ocorrenciaButtonActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      
    }//GEN-LAST:event_jMenuItem6ActionPerformed
     public void preencherTabela(final String Sql) {
     
    }
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
            java.util.logging.Logger.getLogger(TelaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalMDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalMDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton declaracaoButton;
    private javax.swing.JButton declaracaoButtonBVD;
    private javax.swing.JPanel declaracaoPanel;
    private javax.persistence.EntityManager entityManager;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTable jTablePac;
    private javax.swing.JButton ocorrenciaButton;
    private javax.swing.JButton ocorrenciaButtonBVD;
    private javax.swing.JPanel ocorrenciaPanel;
    private javax.swing.JButton pacienteButton;
    private javax.swing.JButton pacienteButtonBVD;
    private java.util.List<view.Paciente> pacienteList;
    private javax.swing.JPanel pacientePanel;
    private javax.persistence.Query pacienteQuery;
    private javax.swing.JPanel parentPanel;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
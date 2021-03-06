/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unirio.pcs.suta.ui;

import br.unirio.pcs.suta.Cliente;

/**
 *
 * @author Lucas
 */
public class AlteraCadastroTela extends javax.swing.JFrame {

    /**
     * Creates new form FormEndereco
     */
    public AlteraCadastroTela() {
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

        editarCadastroDescrTitulo = new javax.swing.JLabel();
        editarCadastroFieldEmail = new javax.swing.JTextField();
        editarCadastroFieldSenha = new javax.swing.JTextField();
        editarCadastroFieldSenhaConfirm = new javax.swing.JTextField();
        editarCadastroFieldDescrSenha = new javax.swing.JLabel();
        editarCadastroFieldDescrConfirmSenha = new javax.swing.JLabel();
        editarCadastroFieldDescrEmail = new javax.swing.JLabel();
        editarCadastroVoltar = new javax.swing.JButton();
        alterarCadastroSenhaButton = new javax.swing.JButton();
        alterarCadastroEmailButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editarCadastroDescrTitulo.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        editarCadastroDescrTitulo.setText("Editar Cadastro");

        editarCadastroFieldDescrSenha.setText("Senha");

        editarCadastroFieldDescrConfirmSenha.setText("Confirme a senha");

        editarCadastroFieldDescrEmail.setText("Email");

        editarCadastroVoltar.setText("Voltar para tela inicial");
        editarCadastroVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarCadastroVoltarActionPerformed(evt);
            }
        });

        alterarCadastroSenhaButton.setText("Atualizar senha");
        alterarCadastroSenhaButton.setToolTipText("");
        alterarCadastroSenhaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCadastroSenhaButtonActionPerformed(evt);
            }
        });

        alterarCadastroEmailButton.setText("Atualizar Email");
        alterarCadastroEmailButton.setToolTipText("");
        alterarCadastroEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarCadastroEmailButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(317, Short.MAX_VALUE)
                .addComponent(editarCadastroDescrTitulo)
                .addGap(306, 306, 306))
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(editarCadastroFieldDescrEmail)
                            .addComponent(editarCadastroFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alterarCadastroEmailButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editarCadastroFieldDescrSenha)
                            .addComponent(editarCadastroFieldDescrConfirmSenha)
                            .addComponent(editarCadastroFieldSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(editarCadastroFieldSenhaConfirm))
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editarCadastroVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(alterarCadastroSenhaButton)
                        .addGap(162, 162, 162))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(editarCadastroDescrTitulo)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarCadastroFieldDescrSenha)
                    .addComponent(editarCadastroFieldDescrEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarCadastroFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarCadastroFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alterarCadastroEmailButton)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editarCadastroFieldDescrConfirmSenha)
                        .addGap(17, 17, 17)
                        .addComponent(editarCadastroFieldSenhaConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(alterarCadastroSenhaButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 77, Short.MAX_VALUE)
                        .addComponent(editarCadastroVoltar)
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEditarCadastroVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarCadastroVoltarActionPerformed
        // TODO add your handling code here:
        PrincipalTela editar = new PrincipalTela();
        this.dispose();
        editar.setVisible(true);
    }//GEN-LAST:event_botaoEditarCadastroVoltarActionPerformed

    private void alterarCadastroSenhaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarCadastroSenhaButtonActionPerformed
        Cliente cliente = new Cliente();
        String senha = editarCadastroFieldEmail.getText();
        String senhaTmp = editarCadastroFieldSenhaConfirm.getText();
        cliente.atualizarCadastroSenha(senha,senhaTmp);
    }//GEN-LAST:event_alterarCadastroSenhaButtonActionPerformed

    private void alterarCadastroEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarCadastroEmailButtonActionPerformed
        Cliente cliente = new Cliente();
        String email = editarCadastroFieldEmail.getText();
        cliente.atualizarCadastroEmail(email);
        
    }//GEN-LAST:event_alterarCadastroEmailButtonActionPerformed

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
            java.util.logging.Logger.getLogger(AlteraCadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlteraCadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlteraCadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlteraCadastroTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlteraCadastroTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarCadastroEmailButton;
    private javax.swing.JButton alterarCadastroSenhaButton;
    private javax.swing.JLabel editarCadastroDescrTitulo;
    private javax.swing.JLabel editarCadastroFieldDescrConfirmSenha;
    private javax.swing.JLabel editarCadastroFieldDescrEmail;
    private javax.swing.JLabel editarCadastroFieldDescrSenha;
    private javax.swing.JTextField editarCadastroFieldEmail;
    private javax.swing.JTextField editarCadastroFieldSenha;
    private javax.swing.JTextField editarCadastroFieldSenhaConfirm;
    private javax.swing.JButton editarCadastroVoltar;
    // End of variables declaration//GEN-END:variables
}

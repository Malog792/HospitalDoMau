/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package filaatendimento;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author 82212145
 */
public class TelaSenha extends NFrame {
   
    /**
     * Creates new form TelaSenha
     */
    public TelaSenha() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SenhaPreferencial = new javax.swing.JButton();
        SenhaComum = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        SenhaComum1 = new javax.swing.JButton();
        SenhaPreferencial1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(576, 388));

        SenhaPreferencial.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        SenhaPreferencial.setText("Senha Preferencial");
        SenhaPreferencial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaPreferencialActionPerformed(evt);
            }
        });

        SenhaComum.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        SenhaComum.setText("Senha Comum");
        SenhaComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaComumActionPerformed(evt);
            }
        });

        Voltar.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        Voltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Voltar.setLabel("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        SenhaComum1.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        SenhaComum1.setText("Senha Comum Emergência");
        SenhaComum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaComum1ActionPerformed(evt);
            }
        });

        SenhaPreferencial1.setFont(new java.awt.Font("Palatino Linotype", 0, 12)); // NOI18N
        SenhaPreferencial1.setText("Senha Preferencial Emergência");
        SenhaPreferencial1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaPreferencial1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 1, 20)); // NOI18N
        jLabel1.setText(" Área de Senhas ");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel3.setText("Retire sua senha nos botões conforme sua necessidade.");

        jLabel4.setText("Após a retirada aguarde na tela principal a chamada da equipe.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SenhaPreferencial1)
                            .addComponent(SenhaComum1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SenhaPreferencial, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SenhaComum, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(141, 141, 141))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SenhaPreferencial1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SenhaPreferencial, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SenhaComum1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SenhaComum, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(Voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SenhaPreferencialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaPreferencialActionPerformed
        // TODO add your handling code here:
         Sprefe.adicionarSenha();   
         
         System.out.println("Fila Preferencial:" + Sprefe.lerSenhasDoArquivo());//exibe a lista no console
        

        JOptionPane.showMessageDialog(null, "A sua senha foi retirada: " + Sprefe.lerUltimaSenhaDoArquivo());
        JOptionPane.showMessageDialog(null, "Voltando para a tela principal");
        TelaHome2 th= new TelaHome2();
                th.setVisible(true);
                this.dispose(); 

    }//GEN-LAST:event_SenhaPreferencialActionPerformed

    private void SenhaComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaComumActionPerformed
        // TODO add your handling code here:
       
        Scomum.adicionarSenha();
       
        System.out.println("Fila Comum:" + Scomum.lerSenhasDoArquivo());//exibe a lista no console
        
        JOptionPane.showMessageDialog(null, "A sua senha foi retirada: " + Scomum.lerUltimaSenhaDoArquivo());
        JOptionPane.showMessageDialog(null, "Voltando para a tela principal");
        TelaHome2 th= new TelaHome2();
                th.setVisible(true);
                this.dispose();
                 
        
    }//GEN-LAST:event_SenhaComumActionPerformed

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        JOptionPane.showMessageDialog(null, "Voltando para a tela principal");
        TelaHome2 th= new TelaHome2();
        th.setLocationRelativeTo(null);
        th.setVisible(true);
        
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_VoltarActionPerformed

    private void SenhaComum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaComum1ActionPerformed
        // TODO add your handling code here:
        //Emergencial
        ScomumEm.adicionarSenha();
        
        System.out.println("Fila Comum Emergencial:" + ScomumEm.lerSenhasDoArquivo());//exibe a lista no console
       
        JOptionPane.showMessageDialog(null, "A sua senha foi retirada: " + ScomumEm.lerUltimaSenhaDoArquivo());
        JOptionPane.showMessageDialog(null, "Voltando para a tela principal");
        TelaHome2 th= new TelaHome2();
                th.setVisible(true);
                this.dispose();
        
    }//GEN-LAST:event_SenhaComum1ActionPerformed

    private void SenhaPreferencial1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaPreferencial1ActionPerformed
        // TODO add your handling code here:
        //Emergencial
        SprefeEm.adicionarSenha();
        
        System.out.println("Fila Preferencial Emergencial:" + SprefeEm.lerSenhasDoArquivo());//exibe a lista no console
       
        JOptionPane.showMessageDialog(null, "A sua senha foi retirada: " + SprefeEm.lerUltimaSenhaDoArquivo());
        JOptionPane.showMessageDialog(null, "Voltando para a tela principal");
        TelaHome2 th= new TelaHome2();
                th.setVisible(true);
                this.dispose();
    }//GEN-LAST:event_SenhaPreferencial1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SenhaComum;
    private javax.swing.JButton SenhaComum1;
    private javax.swing.JButton SenhaPreferencial;
    private javax.swing.JButton SenhaPreferencial1;
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}

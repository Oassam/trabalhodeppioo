package View;

import Control.Rotinas;
import Model.Mago;
import Model.Personagem;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javafx.scene.input.DataFormat;
import javax.swing.JOptionPane;

public class TelaInicial extends javax.swing.JFrame {

  /**
   * Creates new form Teste
   */
  public TelaInicial() {
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

    jDialog1 = new javax.swing.JDialog();
    btnSair = new javax.swing.JButton();
    btnNovoJogo = new javax.swing.JButton();
    lblDescricao = new javax.swing.JLabel();
    lblTitulo = new javax.swing.JLabel();

    javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
    jDialog1.getContentPane().setLayout(jDialog1Layout);
    jDialog1Layout.setHorizontalGroup(
      jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 400, Short.MAX_VALUE)
    );
    jDialog1Layout.setVerticalGroup(
      jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGap(0, 300, Short.MAX_VALUE)
    );

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    btnSair.setText("Sair");
    btnSair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSairActionPerformed(evt);
      }
    });

    btnNovoJogo.setLabel("Novo Jogo");
    btnNovoJogo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNovoJogoActionPerformed(evt);
      }
    });

    lblDescricao.setFont(new java.awt.Font("Pristina", 0, 24)); // NOI18N
    lblDescricao.setForeground(new java.awt.Color(153, 0, 0));
    lblDescricao.setText("Uma terra selvagem com desafios gigantescos");

    lblTitulo.setFont(new java.awt.Font("Pristina", 0, 36)); // NOI18N
    lblTitulo.setForeground(new java.awt.Color(255, 0, 0));
    lblTitulo.setText("UEM Warriors");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(layout.createSequentialGroup()
            .addGap(36, 36, 36)
            .addComponent(lblDescricao))
          .addGroup(layout.createSequentialGroup()
            .addGap(98, 98, 98)
            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(62, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(btnNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(122, 122, 122))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addGap(23, 23, 23)
        .addComponent(lblTitulo)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(lblDescricao)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
        .addComponent(btnNovoJogo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
    this.Fechar();
  }//GEN-LAST:event_btnSairActionPerformed

  private void btnNovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoJogoActionPerformed
    TelaSelecaoPersonagens telaSelecaoPersonagens;
      telaSelecaoPersonagens = new TelaSelecaoPersonagens();
      
      telaSelecaoPersonagens.setVisible(true);
  }//GEN-LAST:event_btnNovoJogoActionPerformed

  private void Fechar() {
    if (Rotinas.pergunta("Deseja realmente sair?")) {
      dispose();
    }
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
      java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new TelaInicial().setVisible(true);
      }
    });
    
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnNovoJogo;
  private javax.swing.JButton btnSair;
  private javax.swing.JDialog jDialog1;
  private javax.swing.JLabel lblDescricao;
  private javax.swing.JLabel lblTitulo;
  // End of variables declaration//GEN-END:variables

}

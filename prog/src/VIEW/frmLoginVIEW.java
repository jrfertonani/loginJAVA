package VIEW;

import DAO.UsuarioDAO;
import DTO.UsuarioDTO;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class frmLoginVIEW extends javax.swing.JFrame {

    public frmLoginVIEW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLoginUsuario = new javax.swing.JTextField();
        txtSenhaUsuario = new javax.swing.JPasswordField();
        btnEntrarSistema = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Login:");

        jLabel2.setText("Senha:");

        txtSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaUsuarioActionPerformed(evt);
            }
        });

        btnEntrarSistema.setText("Entrar");
        btnEntrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarSistemaActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Login Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSenhaUsuario)
                            .addComponent(txtLoginUsuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(btnEntrarSistema, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCadastrar)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtLoginUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrarSistema)
                    .addComponent(btnCadastrar))
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaUsuarioActionPerformed

    private void btnEntrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarSistemaActionPerformed
        Logar();

    }//GEN-LAST:event_btnEntrarSistemaActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        frmCadastroUsuarioVIEW frmcadastrousuarioview = new frmCadastroUsuarioVIEW();
        frmcadastrousuarioview.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLoginVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmLoginVIEW().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrarSistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtLoginUsuario;
    private javax.swing.JPasswordField txtSenhaUsuario;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos(){
        if (txtLoginUsuario.getText().isEmpty() || txtSenhaUsuario.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "O Login e Senha são obrigatorios.","Erro!", JOptionPane.INFORMATION_MESSAGE);
            return false;
        
        }
        return true;
    }
    
    private void Logar() {

        try {

            validarCampos();
            
            String login, senha;

            login = txtLoginUsuario.getText();
            senha = txtLoginUsuario.getText();

            UsuarioDTO objusuariodto = new UsuarioDTO();
            objusuariodto.setLogin(login);
            objusuariodto.setSenha(senha);

            UsuarioDAO objusuariodao = new UsuarioDAO();
            ResultSet rsusuariodao = objusuariodao.autenticacaoUsuario(objusuariodto);

            dispose();

            if (rsusuariodao.next()) {
                //Chamar Proxoma tela
                JOptionPane.showMessageDialog(rootPane, "Acesso autorizado.","Seja Bem Vindo!", JOptionPane.INFORMATION_MESSAGE);

                dispose();

            } else {
                //Enviar mensg de erro
                JOptionPane.showMessageDialog(rootPane, "Login ou Senha invalido","Sistema ADEMIR FERTONANI",JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "FRMLOGINVIEW" + e);

        }

    }

}

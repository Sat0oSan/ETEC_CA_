package telas;

import dao.cadastroDAO;



/**
 *
 * @author attie
 */
public class Cadastro extends javax.swing.JFrame {

    public String getEmail;
    public String getSenha;

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        email = new javax.swing.JTextField();
        confirmPassword = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        btnTermos = new javax.swing.JToggleButton();
        btnCadastrar = new javax.swing.JButton();
        telaCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2000, 1000));
        setPreferredSize(new java.awt.Dimension(1185, 830));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 440, 60));
        getContentPane().add(confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 440, 50));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 440, 50));

        btnTermos.setBorderPainted(false);
        btnTermos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTermos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTermosActionPerformed(evt);
            }
        });
        getContentPane().add(btnTermos, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 30, 30));

        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, 250, 90));

        telaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tela-de-cadastro.png"))); // NOI18N
        telaCadastro.setMaximumSize(new java.awt.Dimension(2000, 1000));
        telaCadastro.setPreferredSize(new java.awt.Dimension(1185, 799));
        getContentPane().add(telaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTermosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTermosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTermosActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JToggleButton btnTermos;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JTextField email;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel telaCadastro;
    // End of variables declaration//GEN-END:variables

    public void setIdCadastro(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setEmail(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setSenha(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

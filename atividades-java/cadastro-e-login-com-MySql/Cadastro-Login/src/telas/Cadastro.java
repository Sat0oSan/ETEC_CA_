package telas;

import dao.cadastroDAO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.regex.Pattern;

/**
 *
 * @author attie
 */

public class Cadastro extends javax.swing.JFrame {

    private JTextField email; // Campo de texto para o email
    private JPasswordField password; // Campo de senha
    private JPasswordField confirmPassword; // Campo de confirmação de senha
    private JToggleButton btnTermos; // Checkbox para aceitar termos
    private JButton btnCadastrar; // Botão de cadastrar
    private JLabel telaCadastro; // JLabel para imagem
    public String getEmail;
    public String getSenha;

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
        initComponents();
    }

    private void initComponents() {
        email = new javax.swing.JTextField();
        confirmPassword = new javax.swing.JPasswordField();
        password = new javax.swing.JPasswordField();
        btnTermos = new javax.swing.JToggleButton("Aceitar termos");
        btnCadastrar = new javax.swing.JButton("Cadastrar");
        telaCadastro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2000, 1000));
        setPreferredSize(new java.awt.Dimension(1185, 830));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        email.setFont(new java.awt.Font("Gill Sans MT", 0, 18)); // NOI18N
        email.addActionListener(this::emailActionPerformed);
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 440, 60));
        getContentPane().add(confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 500, 440, 50));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 440, 50));

        btnTermos.setBorderPainted(false);
        btnTermos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTermos.addActionListener(this::btnTermosActionPerformed);
        getContentPane().add(btnTermos, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 570, 30, 30));

        btnCadastrar.setBorderPainted(false);
        btnCadastrar.setContentAreaFilled(false);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.addActionListener(this::btnCadastrarActionPerformed);
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, 250, 90));

        telaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tela-de-cadastro.png"))); // NOI18N
        telaCadastro.setMaximumSize(new java.awt.Dimension(2000, 1000));
        getContentPane().add(telaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    } 
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
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
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
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 620, 250, 90));

        telaCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tela-de-cadastro.png"))); // NOI18N
        telaCadastro.setMaximumSize(new java.awt.Dimension(2000, 1000));
        getContentPane().add(telaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTermosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTermosActionPerformed
         // Lógica para aceitar termos (se necessário)
    }//GEN-LAST:event_btnTermosActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String emailText = email.getText();
        String senha = new String(password.getPassword());
        String confirmarSenha = new String(confirmPassword.getPassword());

        if (!btnTermos.isSelected()) {
            JOptionPane.showMessageDialog(this, "Cadastro error: Você deve aceitar os termos.");
        } else if (!isValidEmail(emailText)) {
            JOptionPane.showMessageDialog(this, "Cadastro error: Email inválido.");
        } else if (!senha.equals(confirmarSenha)) {
            JOptionPane.showMessageDialog(this, "Cadastro error: As senhas não correspondem.");
        } else {
            JOptionPane.showMessageDialog(this, "Cadastro concluído.");
            login loginFrame = new login(); // Verifique se a classe Login está correta
            loginFrame.setVisible(true);
            this.dispose(); // Fecha a tela de cadastro
        }
}

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }
    
        public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Cadastro cadastro = new Cadastro();
            cadastro.setSize(300, 300);
            cadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            cadastro.setVisible(true);
        });
    }       

    public void setEmail(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setIdCadastro(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setSenha(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed
          
    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        //nada
    }//GEN-LAST:event_emailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JToggleButton btnTermos;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JTextField email;
    private javax.swing.JPasswordField password;
    private javax.swing.JLabel telaCadastro;
    // End of variables declaration//GEN-END:variables

    public void setIdCadastro(int aInt) {
        //nada
    }

    public void setEmail(String string) {
        //nada
    }

    public void setSenha(String string) {
        //nada
    }

    private boolean isValidEmail(JTextField email) {
       //nada
    }

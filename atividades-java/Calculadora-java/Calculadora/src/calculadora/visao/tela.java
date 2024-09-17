
//Miguel Attie Pereira 2DB


package calculadora.visao;

import calculadora.Calculadora;
import javax.swing.*;

public class tela extends javax.swing.JFrame {

    private Calculadora calc = new Calculadora();
    
    public tela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel = new javax.swing.JPanel();
        btAC = new javax.swing.JButton();
        btMaisMenos = new javax.swing.JButton();
        btMultiplicacao = new javax.swing.JButton();
        btDivisao = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        btMais = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        btMenos = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        btResult = new javax.swing.JButton();
        Jvisor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel.setBackground(new java.awt.Color(102, 102, 102));
        jPanel.setLayout(new java.awt.GridLayout(4, 4));

        btAC.setText("AC");
        btAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btACActionPerformed(evt);
            }
        });
        jPanel.add(btAC);

        btMaisMenos.setText("+/-");
        btMaisMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMaisMenosActionPerformed(evt);
            }
        });
        jPanel.add(btMaisMenos);

        btMultiplicacao.setText("X");
        btMultiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMultiplicacaoActionPerformed(evt);
            }
        });
        jPanel.add(btMultiplicacao);

        btDivisao.setText("/");
        btDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDivisaoActionPerformed(evt);
            }
        });
        jPanel.add(btDivisao);

        bt7.setText("7");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        jPanel.add(bt7);

        bt8.setText("8");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        jPanel.add(bt8);

        bt9.setText("9");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });
        jPanel.add(bt9);

        btMais.setText("+");
        btMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMaisActionPerformed(evt);
            }
        });
        jPanel.add(btMais);

        bt4.setText("4");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        jPanel.add(bt4);

        bt5.setText("5");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        jPanel.add(bt5);

        bt6.setText("6");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        jPanel.add(bt6);

        btMenos.setText("-");
        btMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenosActionPerformed(evt);
            }
        });
        jPanel.add(btMenos);

        bt3.setText("3");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        jPanel.add(bt3);

        bt2.setText("2");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        jPanel.add(bt2);

        bt1.setText("1");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        jPanel.add(bt1);

        btResult.setText("=");
        btResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResultActionPerformed(evt);
            }
        });
        jPanel.add(btResult);

        Jvisor.setBackground(new java.awt.Color(0, 153, 51));
        Jvisor.setFont(new java.awt.Font("Unispace", 2, 24)); // NOI18N
        Jvisor.setForeground(new java.awt.Color(0, 255, 51));
        Jvisor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Jvisor.setText("0.00");
        Jvisor.setMargin(new java.awt.Insets(2, 8, 2, 6));
        Jvisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JvisorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Jvisor, javax.swing.GroupLayout.DEFAULT_SIZE, 366, Short.MAX_VALUE)
            .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Jvisor, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void initComponents() {
        // Inicialização dos componentes
        jPanel = new javax.swing.JPanel();
        btAC = new javax.swing.JButton();
        btMaisMenos = new javax.swing.JButton();
        btMultiplicacao = new javax.swing.JButton();
        btDivisao = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        btMais = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        btMenos = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        btResult = new javax.swing.JButton();
        Jvisor = new javax.swing.JTextField();
    }
    
    private void JvisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JvisorActionPerformed

    }//GEN-LAST:event_JvisorActionPerformed

    private void btACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btACActionPerformed
        btAC.setText("AC");
        btAC.addActionListener(evt -> {
        calc.limpar(); // Chama a lógica de limpeza
        atualizarVisor(); // Atualiza o visor
        });
        jPanel.add(btAC);
    }//GEN-LAST:event_btACActionPerformed

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt9ActionPerformed
        bt9.setText("9");
    }//GEN-LAST:event_bt9ActionPerformed

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        bt2.setText("2");
    }//GEN-LAST:event_bt2ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        bt1.setText("1");
    }//GEN-LAST:event_bt1ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        bt3.setText("3");
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        bt4.setText("4");
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        bt5.setText("5");
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        bt6.setText("6");
    }//GEN-LAST:event_bt6ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        bt7.setText("7");
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        bt8.setText("8");
    }//GEN-LAST:event_bt8ActionPerformed

    private void btMaisMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaisMenosActionPerformed
        btMaisMenos.setText("+/-");
    }//GEN-LAST:event_btMaisMenosActionPerformed

    private void btMultiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMultiplicacaoActionPerformed
        btMultiplicacao.setText("X");
    }//GEN-LAST:event_btMultiplicacaoActionPerformed

    private void btDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDivisaoActionPerformed
        btDivisao.setText("/");
    }//GEN-LAST:event_btDivisaoActionPerformed

    private void btMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaisActionPerformed
        btMais.setText("+");
    }//GEN-LAST:event_btMaisActionPerformed

    private void btMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenosActionPerformed
        btMenos.setText("-");
    }//GEN-LAST:event_btMenosActionPerformed

    private void btResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResultActionPerformed
        btResult.setText("=");
    }//GEN-LAST:event_btResultActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jvisor;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btAC;
    private javax.swing.JButton btDivisao;
    private javax.swing.JButton btMais;
    private javax.swing.JButton btMaisMenos;
    private javax.swing.JButton btMenos;
    private javax.swing.JButton btMultiplicacao;
    private javax.swing.JButton btResult;
    private javax.swing.JPanel jPanel;
    // End of variables declaration//GEN-END:variables
}

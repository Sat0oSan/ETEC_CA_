

package calculadora;

import calculadora.visao.tela;

/**
 *
 * @author attie
 */
public class Calculadora {
    public static void main(String[] args) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.HangMan;

/**
 *
 * @author haleacu
 */
public class MainWindow extends javax.swing.JFrame {

    private HangMan hangman;
    private CardLayout cl;
    //        int numFails = hangman.getFails().size();

    /**
     * Creates new form MainWIndow
     */
    public MainWindow() {
        initComponents();
        tryButton.setEnabled(false);
        introCharTextField.setEnabled(false);
        cl = (CardLayout) jPanel1.getLayout();
        cl.show(jPanel1, "card7");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog = new javax.swing.JDialog();
        newGameButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        hiddenWordLabel = new javax.swing.JLabel();
        failedCharsLabel = new javax.swing.JLabel();
        introCharLabel = new javax.swing.JLabel();
        introCharTextField = new javax.swing.JTextField();
        tryButton = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();
        hiddenWordWhiteLabel = new javax.swing.JLabel();
        failedCharsWhiteLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialogLayout = new javax.swing.GroupLayout(jDialog.getContentPane());
        jDialog.getContentPane().setLayout(jDialogLayout);
        jDialogLayout.setHorizontalGroup(
            jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialogLayout.setVerticalGroup(
            jDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("El ahorcado");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        newGameButton.setText("Nueva Partida");
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Salir");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        hiddenWordLabel.setText("Palabra a adivinar:");

        failedCharsLabel.setText("Letras falladas:");

        introCharLabel.setText("Introduce una letra:");

        introCharTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                introCharTextFieldKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                introCharTextFieldKeyTyped(evt);
            }
        });

        tryButton.setText("Probar");
        tryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tryButtonMouseClicked(evt);
            }
        });
        tryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tryButtonActionPerformed(evt);
            }
        });
        tryButton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tryButtonKeyPressed(evt);
            }
        });

        TitleLabel.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("El juego del ahorcado");

        hiddenWordWhiteLabel.setText(" ");
        hiddenWordWhiteLabel.setToolTipText("");

        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HANGMAN STAGES IMAGES/Hangman-0.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1, "card1");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HANGMAN STAGES IMAGES/Hangman-1.png"))); // NOI18N
        jPanel1.add(jLabel2, "card2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HANGMAN STAGES IMAGES/Hangman-2.png"))); // NOI18N
        jPanel1.add(jLabel3, "card3");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HANGMAN STAGES IMAGES/Hangman-3.png"))); // NOI18N
        jPanel1.add(jLabel4, "card4");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HANGMAN STAGES IMAGES/Hangman-4.png"))); // NOI18N
        jPanel1.add(jLabel5, "card5");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HANGMAN STAGES IMAGES/Hangman-5.png"))); // NOI18N
        jPanel1.add(jLabel6, "card6");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HANGMAN STAGES IMAGES/Hangman-6.png"))); // NOI18N
        jPanel1.add(jLabel7, "card7");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(introCharLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(introCharTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tryButton))
                            .addComponent(newGameButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(exitButton)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hiddenWordLabel)
                            .addComponent(failedCharsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(failedCharsWhiteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hiddenWordWhiteLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {failedCharsWhiteLabel, hiddenWordWhiteLabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hiddenWordLabel)
                            .addComponent(hiddenWordWhiteLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(failedCharsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(failedCharsWhiteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(introCharLabel)
                            .addComponent(introCharTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tryButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newGameButton)
                            .addComponent(exitButton))
                        .addContainerGap())))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {failedCharsWhiteLabel, hiddenWordWhiteLabel});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        this.startNewGame();
    }//GEN-LAST:event_newGameButtonActionPerformed

    private void tryButtonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tryButtonKeyPressed
        
    }//GEN-LAST:event_tryButtonKeyPressed

    private void tryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tryButtonMouseClicked
    }//GEN-LAST:event_tryButtonMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void introCharTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_introCharTextFieldKeyTyped
        if (introCharTextField.getText().length() >= 1) {
            evt.consume();
        }
    }//GEN-LAST:event_introCharTextFieldKeyTyped

    private void tryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tryButtonActionPerformed
        this.tryChar();               
    }//GEN-LAST:event_tryButtonActionPerformed

    private void introCharTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_introCharTextFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            this.tryChar();
        }
    }//GEN-LAST:event_introCharTextFieldKeyPressed

    private void startNewGame() {
        WordGenerator wordG = null;
        cl.show(jPanel1, "card1");
        String opciones[] = new String[2];
        opciones[0] = "Un jugador, generando la palabra al azar";
        opciones[1] = "Multijugador, otro jugador elige la palabra";
        String answer = (String) JOptionPane.showInputDialog(this, "Selecciona un modo de juego:", "Modo de juego",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
        System.out.println(answer);
        if (answer.equals(opciones[0])) {
            wordG = new ArrayWordGenerator();
        } else if (answer.equals(opciones[1])) {
            wordG = new GUIKeyboardWordGenerator();
        }
        try {
            hangman = new HangMan(wordG.generateWord());
        } catch (GenerateWordException ex) {
            JOptionPane.showMessageDialog(this, "Malisismo", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        tryButton.setEnabled(true);
        introCharTextField.setEnabled(true);
    }
    
    private void tryChar() {
        char userInput = introCharTextField.getText().toLowerCase().charAt(0);
        hangman.tryChar(userInput);
        failedCharsWhiteLabel.setText(hangman.getStringFails());
        hiddenWordWhiteLabel.setText(hangman.showHiddenWord());
        introCharTextField.setText("");
        int numFails = hangman.getFails().size();
        if (numFails == 6) {
            JOptionPane.showMessageDialog(this, "Fin del juego. Te ahorcaste!! La palabra oculta era " + hangman.showFullWord(), "Game Over", JOptionPane.INFORMATION_MESSAGE);
            tryButton.setEnabled(false);
            introCharTextField.setEnabled(false);
        }

        cl.show(jPanel1, "card" + (hangman.getFails().size() + 1));
    }
    
    private void showGameStatus(){
        if (hangman.isGameOver()){
            
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel failedCharsLabel;
    private javax.swing.JLabel failedCharsWhiteLabel;
    private javax.swing.JLabel hiddenWordLabel;
    private javax.swing.JLabel hiddenWordWhiteLabel;
    private javax.swing.JLabel introCharLabel;
    private javax.swing.JTextField introCharTextField;
    private javax.swing.JDialog jDialog;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton newGameButton;
    private javax.swing.JButton tryButton;
    // End of variables declaration//GEN-END:variables
}

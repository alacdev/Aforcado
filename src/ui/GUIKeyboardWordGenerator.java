/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.awt.GridLayout;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author haleacu
 */
public class GUIKeyboardWordGenerator implements WordGenerator {

    @Override
    public String generateWord() throws GenerateWordException {

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1 / 2, 1));
        JLabel label = new JLabel("Introduce a palabra secreta:");
        JPasswordField pass = new JPasswordField();

        panel.add(label);
        panel.add(pass);
        
        String word;
        do {
        JOptionPane.showOptionDialog(null, panel, "Palabra secreta",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        word = String.valueOf(pass.getPassword());
        //getText en PasswordField está deprecated porque es un immuttable object,
        //pero si usas getPassword se guarda como un char array y no se mantiene en la memoria
        //  String word = pass.getText();
        if (!onlyLetters(word)) {
                JOptionPane.showMessageDialog(panel, "La palabra solo puede contener letras de la 'a' a la 'z'",
                        "Palabra incorrecta", JOptionPane.INFORMATION_MESSAGE);
            }         }
        while (onlyLetters(word) == false);      
        

        return word.toLowerCase();
    }

    public static boolean onlyLetters(String s) {
        //        for (int i = 0; i < po.length(); i++) {
        //            char caracter = po.toUpperCase().charAt(i);
        //            int valorASCII = (int) caracter;
        //            if (valorASCII != 165 && (valorASCII < 65 || valorASCII > 90)) {
        //                return false;
        //            }
        //        }
   
        return s != null && s.matches("^[a-zA-Z]*$");
    

      
    }
}

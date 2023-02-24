/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import java.util.Scanner;

/**
 *
 * @author haleacu
 */
public class KeyboardWordGenerator implements WordGenerator {

    /**
     * Método que pide por teclado la palabra a acertar
     *
     * @return
     * @throws GenerateWordException
     */
    @Override
    public String generateWord() throws GenerateWordException {
        //La llamada System.console solo funciona desde la consola, desde el IDE
        //devolverá null.
        Scanner scan = new Scanner(System.in);
        String word;
        System.out.println("Inserte la palabra para jugar");
        if (System.console() != null) {
            char[] chars = System.console().readPassword();
            word = new String(chars);
            return word;
        } else {
            char[] chars = scan.nextLine().toCharArray();
            word = new String(chars);
            return word;
        }

    }

}

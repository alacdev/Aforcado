/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aforcado;

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
        char[] chars = System.console().readPassword();
        String word = new String(chars);
        return word;
    }

}

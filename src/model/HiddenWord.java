/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase que implementa la palabra a adivinar con la que trabajaremos en el juego. 
 * Resolverá todo el trabajo de mantener las letras acertadas, mostrar la palabra 
 * ocultando las letras no acertadas, y comprobar si una letra forma parte de la palabra. 
 * 
 * @author haleacu
 */
public class HiddenWord {

    public char[] characters; //array de los carácteres de la palabra a adivinar
    public boolean[] hits; //booleano con los intentos 

    public HiddenWord(String word) {
        characters = word.toCharArray();
        this.hits = new boolean[word.length()];
    }

    /**
     * Comprueba si un carácter aparece en la lista de caracteres de la palabra,
     * marcando todas las aparicones de ese carácter como acertadas. Si el carácter
     * aparece en la palabra devuele true, si no devuelve false.
     *
     * @param c
     * @return
     */
    public boolean checkChar(char c) {
        
        boolean isCharInWord = false;
        for (int i = 0; i < characters.length; i++) {
            if (c == characters[i]) {
                hits[i] = true;
                isCharInWord = true;
            }
        }
        return isCharInWord;
    }

    /**
     * Devuelve la palabra sustituyendo los caracteres no acertados por guiones.
     *
     * @return
     */
    public String show() {
        
        String hiddenWord = "";
        for (int i = 0; i < characters.length; i++) {
            if (hits[i]) {
                hiddenWord = hiddenWord + characters[i];
            } else {
                hiddenWord = hiddenWord + "_";
            }
        }
        return hiddenWord;
    }

    /**
     * Devuelve la palabra completa, incluyendo los caracteres no acertados. Este
     * método lo usaremos para mostrar al usuario al final del juego, si pierde,
     * cual era la palabra oculta.
     *
     * @return
     */
    public String showFullWord() {
        
        String fullWord = "";
        for (int i = 0; i < characters.length; i++) {
            fullWord = fullWord + characters[i];
        }
        return fullWord;
    }

    /**
     * Indica si la palabra es totalmente visible, es decir, si todos los caracteres
     * están acertados. Este método nos permitirá saber si el usuario adivinó la
     * palabra y por lo tanto ganó la partida.
     *
     * @return
     */
    public boolean isVisible() {
        
        for (int i = 0; i < characters.length; i++) {
            if (!hits[i]) {
                return false;
            }            
        }
        return true;
    }

}

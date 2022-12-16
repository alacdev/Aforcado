/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aforcado;

/**
 * Clase que implementa a palabra a adiviñar coa que traballaremos no xogo, e 
 * resolverá todo o traballo de manter as letras acertadas, mostrar a palabra 
 * ocultando as letras non acertadas, e comprobar se unha letra forma parte da palabra. 
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
     * Comproba se un caracter aparece na lista de caracteres da palabra,
     * marcando todas as aparicións dese caracter como acertadas. Se o caracter
     * aparece na palabra devolve true, se non devolve false.
     *
     * @param c
     * @return
     */
    public boolean checkChar(char c) {
        
        boolean isCharInWord = false;
        for (int i = 0; i < characters.length; i++) {
            if (c == characters[i]) {
                isCharInWord = hits[i] = true;
            }
        }
        return isCharInWord;
    }

    /**
     * Devolve a palabra substituíndo os caracteres non acertados por guións.
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
     * Devolve a palabra completa, incluíndo os caracteres non acertados. Este
     * método o usaremos para mostrar ao usuario ao final do xogo, se perde, cal
     * era a palabra oculta.
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
     * Indica se a palabra é totalmente visible, é dicir, se todos os caracteres
     * están xa acertados. Este método permitiranos saber se o usuario adiviñou
     * a palabra e polo tanto gañou a a partida.
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

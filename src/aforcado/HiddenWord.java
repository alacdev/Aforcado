/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aforcado;

/**
 *
 * @author haleacu
 */
public class HiddenWord {

    public char[] characters;
    public boolean[] hits;

    public HiddenWord(String HWord) {
        this.characters = characters;
        this.hits = hits;
    }

    /**
     * Comproba se un caracter aparece na lista de caracteres da palabra, 
     * marcando todas as aparicións dese caracter como acertadas. Se o caracter 
     * aparece na palabra devolve true, se non devolve false.
     * @param c
     * @return
     */
    public boolean checkChar(char c) {
        
        return false;
    }

    /**
     * Devolve a palabra substituíndo os caracteres non acertados por guións.
     * @return
     */
    public String show() {

        return null;
    }
    
    /**
     * Devolve a palabra completa, incluíndo os caracteres non acertados. 
     * Este método o usaremos para mostrar ao usuario ao final do xogo, se perde, 
     * cal era a palabra oculta.
     * @return
     */
    public String showFullWord () {
        
        return null;        
    }
    
    /**
     * Indica se a palabra é totalmente visible, é dicir, se todos os caracteres
     * están xa acertados. Este método permitiranos saber se o usuario adiviñou 
     * a palabra e polo tanto gañou a a partida.
     * @return
     */
    public boolean isVisible() {
        
        return false;        
    }

}

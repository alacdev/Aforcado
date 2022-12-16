/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aforcado;

import java.util.ArrayList;

/**
 * Clase que implementa todo o estado dunha partida ao aforcado. Manterá unha 
 * referencia a un obxecto da clase HiddenWord coa palabra oculta a adiviñar, e 
 * tamén irá almacenando as letras introducidas polo usuario que non estean na 
 * palabra, para irllas mostrando e que non as introduza de novo.
 * 
 * @author haleacu
 */
public class HangMan {
    // Constantes
    public static final int MAX_FAILS = 6;
    
    // Atributos
    private HiddenWord hiddenWord;
    private ArrayList <Character> fails;
    
    public HangMan(String word) {
        // Inicializacion
        hiddenWord = new HiddenWord(word);
        fails = new ArrayList();
    }
    
    /**
     * Obtén a lista de caracteres fallados acumulados na partida.
     * @return
     */
    public ArrayList <Character> getFails() {
        
        return fails;        
    }
    
    /**
     * Obtén un String coa lista de caracteres fallados acumulados, separados 
     * por espazos en branco.
     * @return
     */
    public String getStringFails() {
        
        String failedChars = "";
        for (int i = 0; i < fails.size(); i++) {
            failedChars = failedChars + fails.get(i) + " ";
            
        }
        return failedChars;
        
    }
    
    /**
     * Devolve a palabra oculta pero poñendo un guión nas letras non acertadas.
     * @return
     */
    public String showHiddenWord() {
        
        return hiddenWord.show();        
    }
    
    /**
     * Devolve a palabra oculta mostrando todas as súas letras.
     * @return
     */
    public String showFullWord() {
        
        return hiddenWord.showFullWord();        
    }
    
    /**
     * Proba a ver se o caracter indicado forma parte da palabra oculta.Se 
     * está, márcanse todas as súas aparicións como letras acertadas; se 
     * non está engádese o caracter na lista de fallos acumulados na partida.
     * @param c
     */
    public void tryChar(char c) {
        
        if (!hiddenWord.checkChar(c)) {
            fails.add(c);
        }        
    }
    
    /**
     * Comproba se rematou a partida, ben porque se chegou ao límite de fallos 
     * ou ben porque se adiviñou toda a palabra oculta.
     * @return devolvemos true en caso de que el método maxFailsExceeded y/o 
     *         isVisible de la clase HiddenWord sean true
     */
    public boolean isGameOver() {
        
        return maxFailsExceeded() || hiddenWord.isVisible();        
    }
    
    /**
     * Comproba se se chegou ao límite de fallos permitidos. Permitiranos saber 
     * se o usuario gañou ou perdeu a partida.
     * @return devolvemos true en caso de que se haya excedido el nº de fallos
     */
    public boolean maxFailsExceeded() {
        
        return fails.size() > MAX_FAILS;        
    }
    
}

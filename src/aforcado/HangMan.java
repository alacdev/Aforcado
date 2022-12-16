/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aforcado;

import java.util.ArrayList;

/**
 * Clase que implementa todo el estado de una partida al ahorcado. Mantendrá una 
 * referencia a un objeco de la clase HiddenWord con la palabra oculta a 
 * adivinar, y también irá almacenando las letras introducidas por el usuario 
 * que no esten en la palabra, para írselas mostrando y que no las introduzca de nuevo.
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
        // Inicialización
        hiddenWord = new HiddenWord(word);
        fails = new ArrayList();
    }
    
    /**
     * Obtiene la lista de caracteres fallados acumulados en la partida.
     * @return
     */
    public ArrayList <Character> getFails() {
        
        return fails;        
    }
    
    /**
     * Obtiene un String con la lista de caracteres fallados acumulados, 
     * separados por espacios en blanco.
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
     * Devuelve la palabra oculta pero poniendo un guión en las letras no acertadas.
     * @return
     */
    public String showHiddenWord() {
        
        return hiddenWord.show();        
    }
    
    /**
     * Devolve la palabra oculta mostrando todas sus letras.
     * @return
     */
    public String showFullWord() {
        
        return hiddenWord.showFullWord();        
    }
    
    /**
     * Prueba a ver si el carácter indicado forma parte de la palabra oculta.Si 
     * está, se marcan todas sus apariciones como letras acertadas; si no se 
     * añade el carácter en la lista de fallos acumulados en la partida.
     * @param c
     */
    public void tryChar(char c) {
        
        if (!hiddenWord.checkChar(c)) {
            fails.add(c);
        }        
    }
    
    /**
     * Comprueba que se acabó la partida, bien porque se llegó al límite de 
     * fallos o bien porque se adivinó toda la palabra oculta
     * @return devolvemos true en caso de que el método maxFailsExceeded y/o 
     *         isVisible de la clase HiddenWord sean true
     */
    public boolean isGameOver() {
        
        return maxFailsExceeded() || hiddenWord.isVisible();        
    }
    
    /**
     * Comprueba si se llegó al límite de fallos permitidos. Nos permitirá  
     * saber si el usuario ganó o perdió la partida.
     * @return devolvemos true en caso de que se haya excedido el nº de fallos
     */
    public boolean maxFailsExceeded() {
        
        return fails.size() > MAX_FAILS;        
    }
    
}

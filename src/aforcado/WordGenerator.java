/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aforcado;

/**
 * Clase que genera la palabra a adivinar
 *
 * @author haleacu
 */
public class WordGenerator {

    private final String WORDLIST[] = {"messi", "cristiano", "joao", "havertz", "mudryk"};

    /**
     * Clase que escoge una palabra del array
     * @return
     */
    public String generateWord() {
        int value = new java.util.Random().nextInt(WORDLIST.length);
        return WORDLIST[value];
    }
}

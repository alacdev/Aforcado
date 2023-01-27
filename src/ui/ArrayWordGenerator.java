/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

/**
 * Clase que genera la palabra a adivinar
 *
 * @author haleacu
 */
public class ArrayWordGenerator implements WordGenerator {

    private final String WORDLIST[] = {"messi", "cristiano", "joao", "havertz", "mudryk"};

    /**
     * Método que escoge una palabra del array
     * @return
     */
    @Override
    public String generateWord() throws GenerateWordException {
        int value = new java.util.Random().nextInt(WORDLIST.length);
        return WORDLIST[value];
    }   
}

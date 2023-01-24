/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aforcado;

import java.util.Scanner;

/**
 *
 * @author bcasrod
 */
public class MenuGenerator {

    private HangMan Hangman;
    
    /**
     * Muestra el menú inicial que permite generar la palabra a adivinar.
     * @return
     */
    private String showInitMenu(){
        WordGenerator init = new WordGenerator();
        init.generateWord();
        return null;
    }
    
    /**
    * Muestra el menú de juego, que va pidiendo las letras y mostrando los aciertos
    * y los fallos. El juego acaba cuando cuando se aciertan todas las letras o se 
    * llega al límite de fallos.
     */
    private void showGameMenu() {
        Scanner scan = new Scanner(System.in);
        while (!Hangman.isGameOver()) {
            System.out.print("Introduce una letra: ");
            char userInput = scan.next().charAt(0);
            Hangman.tryChar(userInput);
            System.out.println(Hangman.getStringFails());
            System.out.println(Hangman.showHiddenWord());
        }
        System.out.println(Hangman.showFullWord());
    }
    
    /**
     * Pregunta al usuario si quiere jugar otra partida o salir de la aplicación.
     * @return
     */
    private boolean showExitMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jugar otra vez? (s/n)");
        char userInput = scan.next().charAt(0);
        return userInput != 's';
    }

    /**
     * Método main que crea un objeto de la clase MenuGenerator() y otro de 
     * la clase WordGenretaor() y ejecuta el programa
     * @param args
     */
    public static void main(String[] args) {
        MenuGenerator menuGenerator = new MenuGenerator();
        WordGenerator wordGenerator = new WordGenerator();

        do {
            menuGenerator.Hangman = new HangMan(wordGenerator.generateWord());
            menuGenerator.showGameMenu();
        } while (!menuGenerator.showExitMenu());
    }
}

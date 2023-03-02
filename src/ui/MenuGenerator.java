/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui;

import model.HangMan;
import java.util.Scanner;

/**
 *
 * @author bcasrod
 */
public class MenuGenerator {

    private HangMan hangman;

    /**
     * Muestra el menú inicial que permite generar la palabra a adivinar.
     *
     * @return
     */
    private String showInitMenu() throws GenerateWordException {

        WordGenerator wg;
        do {
            System.out.println("Escoge el modo de juego");
            System.out.println("Pulse 1 si quiere coger una palabra aleatoria del Array");
            System.out.println("Pulse 2 si quiere que otro jugador elija la palabra");
            Scanner scan = new Scanner(System.in);
            int gameMode = scan.nextInt();
            scan.nextLine();
                    

            switch (gameMode) {
                case 1:
                    wg = new ArrayWordGenerator();
                    break;
                case 2:
                    wg = new KeyboardWordGenerator();
                    break;
                default:
                    wg = null;
                    System.out.println("Opción incorrecta");
                    break;

            }
        } while (wg == null);
        String word = wg.generateWord();
        return word;

    }

    /**
     * Muestra el menú de juego, que va pidiendo las letras y mostrando los
     * aciertos y los fallos. El juego acaba cuando cuando se aciertan todas las
     * letras o se llega al límite de fallos.
     */
    private void showGameMenu() {
        Scanner scan = new Scanner(System.in);
        while (!hangman.isGameOver()) {
            System.out.print("Introduce una letra: ");
            char userInput = scan.next().charAt(0);
            hangman.tryChar(userInput);
            System.out.println(hangman.getStringFails());
            System.out.println(hangman.showHiddenWord());
        }
        System.out.println(hangman.showFullWord());
    }

    /**
     * Pregunta al usuario si quiere jugar otra partida o salir de la
     * aplicación.
     *
     * @return
     */
    private boolean showExitMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Jugar otra vez? (s/n)");
        char userInput = scan.next().charAt(0);
        return userInput != 's';
    }

    /**
     * Método main que crea un objeto de la clase MenuGenerator() y otro de la
     * clase WordGenretaor() y ejecuta el programa
     *
     * @param args
     */
    public static void main(String[] args) {
        MenuGenerator menuGenerator = new MenuGenerator();
        
        do {
            try {
                menuGenerator.hangman = new HangMan(menuGenerator.showInitMenu());
                menuGenerator.showGameMenu();
            } catch (GenerateWordException e) {
                
            }
        } while (!menuGenerator.showExitMenu());
    }
}

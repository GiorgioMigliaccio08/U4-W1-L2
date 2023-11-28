package Esercizio2;

import java.util.Scanner;

public class Main2 {

    public class ConvertiInLettere {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Inserisci un numero intero: ");
            int numero = scanner.nextInt();

            switch (numero) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("Uno");
                    break;
                case 2:
                    System.out.println("Due");
                    break;
                case 3:
                    System.out.println("Tre");
                    break;
                default:
                    System.out.println("Errore: il numero deve essere compreso tra 0 e 3.");
            }
        }
    }
}

package Esercizio4;

import java.util.Scanner;
public class Main4 {
    public class ContoAllaRovescia {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Inserisci un numero intero: ");
            int numero = scanner.nextInt();

            System.out.println("Conto alla rovescia:");

            // Utilizzo del costrutto for per il conto alla rovescia
            for (int i = numero; i >= 0; i--) {
                System.out.println(i);
            }
        }
    }
}

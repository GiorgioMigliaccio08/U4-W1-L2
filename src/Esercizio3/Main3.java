package Esercizio3;

import java.util.Scanner;

public class Main3 {
    public class SuddivisioneStringa {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input;

            while (true) {
                System.out.print("Inserisci una stringa ( oppure inserisci 'q' per uscire): ");
                input = scanner.nextLine();

                if (input.equals("q")) {
                    System.out.println("Uscita dal programma.");
                    break;
                }

                for (int i = 0; i < input.length(); i++) {
                    System.out.print(input.charAt(i));
                    if (i < input.length() - 1) {
                        System.out.print(", ");
                    }
                }

                System.out.println();
            }
        }
    }

}

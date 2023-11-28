import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String inputString = scanner.nextLine();

        boolean risultato = stringaPariDispari(inputString);
        System.out.println(risultato);
    }

    public static boolean stringaPariDispari(String input) {
        if (input.length() % 2 == 0) {
            return true; // se il numero di caratteri è pari
        } else {
            return false; // se il numero di caratteri è dispari
        }
    }
}

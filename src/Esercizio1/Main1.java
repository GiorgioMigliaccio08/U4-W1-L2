import java.util.Scanner;

public class Main1 {
    //PUNTO 1
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
    //PUNTO 2
    public static void mainUno(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un anno: ");
        int inputAnno = scanner.nextInt();

        boolean risultato = annoBisestile(inputAnno);
        System.out.println(risultato);
    }

    public static boolean annoBisestile(int anno) {
        if ((anno % 4 == 0 && anno % 100 != 0) || (anno % 400 == 0)) {
            return true; //l'anno inserito è un anno bisestile
        } else {
            return false; //l'anno inserito non è un anno bisestile
        }
    }
}

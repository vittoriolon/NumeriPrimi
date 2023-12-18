import java.util.Scanner;

public class NumeriPrimi {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero N:");
        int numeroN = scanner.nextInt();

        int somma = 0;

        for (int i = 0; i < numeroN; i++){
            somma = somma + numeroN;
            numeroN = numeroN -1;
        }

        System.out.println("la somma dei primi numeri" +numeroN + "è uguale a" +somma);
        scanner.close();
    }
}

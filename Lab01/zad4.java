import java.util.Scanner;

public class zad4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); // dodano średnik, komppilacja wykryje

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) { // zmiana = na == kompilacja wykryje
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba jest nieparzysta"); // dodano średnik kompilacja wykryje
        }

        for (int i = 0; i <= 5; i++) { // zmiana i-- na i++, program skompilował by się ale pętlla byłaby nieskończona bo i się zmniejsza
            System.out.println(i);
        }

        scanner.close();
    }
}
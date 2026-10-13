import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] liczby = new int[10];
        System.out.println("Podaj 10 liczb całkowitych:");
        for (int i = 0; i < 10; i++) {
            liczby[i] = scanner.nextInt();
        }
        int min = liczby[0];
        int max = liczby[0];
        int suma = 0;
        for (int liczba : liczby) {
            if (liczba < min) min = liczba;
            if (liczba > max) max = liczba;
            suma += liczba;
        }
        double srednia = (double) suma / liczby.length;
        int wiekszeOdSredniej = 0;
        for (int liczba : liczby) {
            if (liczba > srednia) {
                wiekszeOdSredniej++;
            }
        }
        System.out.println("Największa wartość: " + max);
        System.out.println("Najmniejsza wartość: " + min);
        System.out.println("Suma: " + suma);
        System.out.println("Średnia: " + srednia);
        System.out.println("Liczba wartości większych od średniej: " + wiekszeOdSredniej);
        scanner.close();
    }
}
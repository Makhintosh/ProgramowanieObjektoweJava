import java.util.Scanner;

public class Zad3 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        int[] liczby = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.printf("Podaj %d liczbe: ", i + 1);
            liczby[i] = scanner.nextInt();
        }

        scanner.close();

        int max = liczby[0];
        int min = liczby[0];
        int suma = 0;

        for (int i = 0; i < 10; i++){
            if (liczby[i] > max){
                max = liczby[i];
            }
            if (liczby[i] < min){
                min = liczby[i];
            }
            suma += liczby[i];
        }
        double srednia = (double) suma / 10.0;

        int wiekszeOdSredniej = 0;
        for (int i = 0; i < 10; i++){
            if (liczby[i] > srednia){
                wiekszeOdSredniej++;
            }
        }

        System.out.printf("Największa wartość: %d%n", max);
        System.out.printf("Najmniejsza wartość: %d%n", min);
        System.out.printf("Suma wszystkich elementów: %d%n", suma);
        System.out.printf("Średnia arytmetyczna: %f%n", srednia);
        System.out.printf("Liczba wartości większych od średniej: %d" ,wiekszeOdSredniej);
    }
}
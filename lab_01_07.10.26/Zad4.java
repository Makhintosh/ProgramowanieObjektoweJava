import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Dodano średnik

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) { // Zmiana = na ==
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba jest nieparzysta"); //Dodano średnik
        }

        for (int i = 0; i <= 5; i++) { // Zamiana -- na ++
            System.out.println(i);
        }

        scanner.close();

        // Błędy które wykrył kompilator: Brak średników, użycie przypisania zamiast porównania
        // Błędy ujawniające się podczas działania programu: Nieskończona pętla
    }
}

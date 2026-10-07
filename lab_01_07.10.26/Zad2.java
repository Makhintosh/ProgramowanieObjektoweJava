import java.util.Scanner;

public class Zad2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbe n: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.printf("Podana liczba n: %d%n", n);

        if (n % 2 != 0){
            System.out.println("Liczba jest nieparzysta");
        } else {
            System.out.println("Liczba jest parzysta");
        }

        if (n % 3 == 0){
            System.out.println("Liczba jest podzielna przez 3");
        } else {
            System.out.println("Liczba nie jest podzielna przez 3");
        }

        int suma_liczb = 0;
        for (int i = 0; i <= n; i++){
            suma_liczb += i;
        }
        System.out.printf("Suma: %d%n", suma_liczb);

        int count = 0;
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                count++;
            }
        }
        System.out.printf("Liczb parzystych: %d", count);
    }
}

public class Zad5 {
    public static void main(String[] args) {
        int x = 2;
        int wynik = 0;

        for (int i = 0; i < 4; i++) {
            wynik += x;
            x *= 2;
        }

        System.out.println(x);
        System.out.println(wynik);
    }

    // i:    | x: | wynik:
    // start | 2  | 0
    // 0     | 4  | 2
    // 1     | 8  | 6
    // 2     | 16 | 14
    // 3     | 32 | 30
}

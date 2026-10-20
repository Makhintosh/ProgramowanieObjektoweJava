public class Zad12 {
    static void main(String[] args) {
        Pojazd auto = new Pojazd("Toyota", "Yaris");
        Klient igor = new Klient("Igor", "Szatkowski", "123456789");

        auto.pokazInformacje();
        System.out.println();

        Wypozyczenie wynajem = new Wypozyczenie(auto, igor, 14);
        wynajem.pokazSzczegoly();

        wynajem.zwrocPojazd();
        System.out.println();

        auto.pokazInformacje();
    }
}

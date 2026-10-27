package Klasy;

public class InitializationDemo {
    private static String poleStatyczne = zainicjujPoleStatyczne();

    static {
        System.out.println("Blok statyczny");
    }

    private String poleInstancji = zainicjujPoleInstancji();

    {
        System.out.println("Blok instancyjny");
    }

    public InitializationDemo() {
        System.out.println("Konstruktor");
    }

    private static String zainicjujPoleStatyczne() {
        System.out.println("Inicjalizacja statycznego pola");
        return "statyczne";
    }

    private static String zainicjujPoleInstancji() {
        System.out.println("Inicjalizacja pola instancji");
        return "instancyjne";
    }
}

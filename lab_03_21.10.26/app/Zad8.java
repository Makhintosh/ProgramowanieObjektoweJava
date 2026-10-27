package app;

import Klasy.StaticCalculator;

public class Zad8 {
    static void main(String[] args) {
        System.out.println("2 inty: " + StaticCalculator.add(6, 7));
        System.out.println("3 inty: " + StaticCalculator.add(1, 2, 3));
        System.out.println("2 double: " + StaticCalculator.add(3.5, 4.5));
    }

    // Gdybyśmy zrobili 2 metody różniące się typem zwracanym to kompilator wypisałby błąd, ponieważ po wywołaniu .add kompilator nie wie której metody powinen użyć.
}

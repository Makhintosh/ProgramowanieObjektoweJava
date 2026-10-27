package app;

import Klasy.StaticCalculator;

public class Zad7 {
    static void main(String[] args) {
        System.out.println("Dodawanie: " + StaticCalculator.add(6, 7));
        System.out.println("Odejmowanie: " + StaticCalculator.substract(10, 5));
        System.out.println("Mnożenie: " + StaticCalculator.multiply(2, 3));

        System.out.println("Licznik: " + StaticCalculator.getNumberOfOperations());
    }
}

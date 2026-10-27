package app;

import Klasy.Product;

public class Zad5 {
    static void main(String[] args) {
        System.out.println("Liczba na start: " + Product.getNumberOfProducts());

        Product p1 = new Product("Piwo", 3.40);
        Product p2 = new Product("Papierosy", 24.50);
        Product p3 = new Product("Wódka", 25.00);

        System.out.println("Liczba po dodaniu: " + Product.getNumberOfProducts());
    }
}

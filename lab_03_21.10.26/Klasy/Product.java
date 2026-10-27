package Klasy;

public class Product {
    public static final int MAX_PRODUCTS = 100;
    private static int numberOfProducts = 0;
    private String name;
    private double price;

    public Product(String name, double price) {
        if (numberOfProducts >= MAX_PRODUCTS) {
            throw new IllegalArgumentException("Przekroczono max ilość produktów");
        }

        this.name = name;
        this.price = price;
        numberOfProducts++;
    }

    public static int getNumberOfProducts() {
        return numberOfProducts;
    }

    // 1. static znaczy, że ten MAX_PRODUCTS należy tylko do klasy Product. Gdyby nie było static, każdy obiekt musiałby przechowywać własną kopię tej samej wartości
    // 2. Słowo final używamy, aby upewnić się, że limit maksymalnych produktów nie zostanie przypadkowo lub celowo zmieniony
    // 3. numberOfProducts jest licznikiem, użycie final oznaczałoby, że nie moglibyśmy zmieniać tego licznika co mijałoby się z celem licznika
}

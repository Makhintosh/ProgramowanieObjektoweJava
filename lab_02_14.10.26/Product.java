public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        // Usunąłem słowo void
        this.name = name;
        this.price = price;
        // Trzeba dodać słowo "this"
    }

    public void show() {
        System.out.println(name + ": " + price);
    }

    // Przez użycie void kompilator traktuje to jako metodę zamiast konstruktor.
    // Słowo kluczowe "this" wskazuje nam bieżący obiekt. Używany jest, aby odróżnić pola klasy od parametru
}

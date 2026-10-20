public class Zad7 {
    static void main(String[] args) {
        Person first = new Person("Anna");
        Person second1 = first;

        Person second2 = new Person(first);
        second2.name = "Jakob";

        // second1 jest wskaźnikiem do pamięci first za to second2 jest kopią danych z first
    }
}

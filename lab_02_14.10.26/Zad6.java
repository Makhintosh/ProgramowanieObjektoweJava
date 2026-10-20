public class Zad6 {
    static void main(String[] args) {
        Person first = new Person("Anna");
        Person second = first;

        second.name = "Maria";

        first.introduceYourself();
        second.introduceYourself();

        // 1. Powstał tylko jeden obiekt
        // 2. Istieją 2 referencje
        // 3. Ponieważ obie referencje wskazują na ten sam obiekt w pamięci zamiast kopiować danych

        Person second2 = new Person(first);
        second2.name = "Jakob";


    }
}

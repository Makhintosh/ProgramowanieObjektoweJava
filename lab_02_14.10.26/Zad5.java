public class Zad5 {
    static void main(String[] args) {
        Car original = new Car("Toyota", "Corolla", 2021, 30000);
        Car copy = new Car(original);

        original.milage = 35000;

        original.showInformation();
        copy.showInformation();

        // Po zmianie originału kopia się nie zmienia, ponieważ tworzymy zupełnie nowy obiekt "copy" który
        // tylko przyjmuje dane originału
    }
}

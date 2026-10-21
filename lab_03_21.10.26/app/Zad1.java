package app;
import animals.Dog;
import animals.Cat;

public class Zad1 {
    public static void main(String[] args) {
        Dog pies = new Dog("Burek", 12);
        Cat kot = new Cat("Mruczek", 3);

        pies.makeSound();
        kot.makeSound();
    }
}

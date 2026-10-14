public class Zad1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Borys", "Owczarek niemiecki", 3);
        Dog dog2 = new Dog("Maciej", "Husky", 1);

        dog1.bark();
        dog1.showInformation();

        dog2.showInformation();
    }
}

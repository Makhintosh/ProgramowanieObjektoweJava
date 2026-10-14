public class Zad4 {
    public static void main(String[] args) {
        Car auto1 = new Car();
        Car auto2 = new Car("Toyota", "Yaris");
        Car auto3 = new Car("Audi", "A4", 1999);
        Car auto4 = new Car("Hyundai", "Kaszkai", 2020, 50000);

        auto3.showInformation();
        auto4.drive(25000);
    }
}

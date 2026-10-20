public class Car {
    String brand;
    String model;
    int productionYear;
    int milage;

    public Car(){
    }

    public Car(String brand, String model) {
        this(brand, model, 2020, 0);
    }

    public Car(String brand, String model, int productionYear){
        this(brand, model, productionYear, 0);
    }

    public Car(String brand, String model, int productionYear, int milage) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.milage = milage;
    }

    public Car(Car other){
        this.brand = other.brand;
        this.model = other.model;
        this.productionYear = other.productionYear;
        this.milage = other.milage;
    }

    public void drive(double distance){
        if (distance >= 0){
            milage += distance;
        }
    }

    public void showInformation(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Production year: " + productionYear);
        System.out.println("Milage: " + milage);
    }
}

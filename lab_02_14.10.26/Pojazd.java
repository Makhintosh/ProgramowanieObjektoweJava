public class Pojazd {
    String marka;
    String model;
    boolean czyDostepny;

    public Pojazd(String marka, String model) {
        this.marka = marka;
        this.model = model;
        this.czyDostepny = true;
    }

    public void zmienStatus(boolean status){
        this.czyDostepny = status;
    }

    public void pokazInformacje(){
        System.out.println("Pojazd: " + marka + " " + model);
        System.out.println("Dostępny: " + (czyDostepny ? "Tak" : "Nie"));
    }
}

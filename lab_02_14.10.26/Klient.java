public class Klient {
    String imie;
    String nazwisko;
    String numerPrawaJazdy;

    public Klient(String imie, String nazwisko, String numerPrawaJazdy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerPrawaJazdy = numerPrawaJazdy;
    }

    public void pokazDaneKlienta(){
        System.out.println("Klient: " + imie + " " + nazwisko + " numer prawa jazdy: " + numerPrawaJazdy);
    }
}

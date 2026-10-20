public class Wypozyczenie {
    Pojazd pojazd;
    Klient klient;
    int liczbaDni;

    public Wypozyczenie(Pojazd pojazd, Klient klient, int liczbaDni) {
        this.pojazd = pojazd;
        this.klient = klient;
        this.liczbaDni = liczbaDni;

        this.pojazd.zmienStatus(false);
    }

    public void pokazSzczegoly(){
        klient.pokazDaneKlienta();
        pojazd.pokazInformacje();
        System.out.println("Okres wynajmu: " + liczbaDni + " dni");
    }

    public void zwrocPojazd(){
        this.pojazd.zmienStatus(true);
    }
}

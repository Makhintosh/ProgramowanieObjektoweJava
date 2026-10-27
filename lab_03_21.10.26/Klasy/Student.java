package Klasy;

public class Student {
    private String name;
    private String albumNumber;

    public Student(String name, String albumNumber) {
        if (name == null || albumNumber == null) {
            throw new IllegalArgumentException("Dane nie mogą być puste!");
        }
        this.name = name;
        this.albumNumber = albumNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getAlbumNumber() {
        return albumNumber;
    }

    // name ma setter i getter, ponieważ imie lub nazwisko studenta może się zmienić
    // albumNumber ma tylko getter, ponieważ numer albumu jest tylko jeden na każdego studenta i nie powinno się móc go zmienić
}

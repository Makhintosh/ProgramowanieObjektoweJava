package Klasy;

import java.util.Arrays;

public record ExamResults(int[] points) {
    public ExamResults(int[] points) {
        if (points != null) {
            this.points = Arrays.copyOf(points, points.length);
        } else {
            this.points = new int[0];
        }
    }

    public int[] getPoints() {
        if (this.points != null) {
            return Arrays.copyOf(this.points, this.points.length);
        }
        return null;
    }

    // Zmiana oryginalnej talbicy wpływa na obiekt
    // Tak. Metoda getPoints() zwraca referencję do prywatnej tablicy. Ktoś wywołujący tę metodę może zmienić jej wartość np. obiekt.getPoints()[0] == 99;
}

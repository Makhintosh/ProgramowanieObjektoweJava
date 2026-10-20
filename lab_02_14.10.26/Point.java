public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void distance(Point otherPoint){
        double wynik = Math.sqrt(Math.pow(otherPoint.x - this.x, 2) + Math.pow(otherPoint.y - this.y, 2));
        System.out.printf("Dystans: %.2f%n", wynik);
    }
}

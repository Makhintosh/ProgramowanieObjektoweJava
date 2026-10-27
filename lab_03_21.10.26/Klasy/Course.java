package Klasy;

public class Course {
    public static final int MAX_LIMIT = 300;

    private static int numberOfCreatedCourses = 0;

    private String name;
    private int maxStudents;

    public Course(String name, int maxStudents) {
        if (name == null || maxStudents <= 0) {
            throw new IllegalArgumentException("Błędna nazwa lub limit studentów!");
        }
        this.name = name;
        this.maxStudents = maxStudents;

        numberOfCreatedCourses++;
    }

    public static int getNumberOfCreatedCourses() {
        return numberOfCreatedCourses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents > 0 && maxStudents <= MAX_LIMIT) {
            this.maxStudents = maxStudents;
        }
    }

    public void printInfo() {
        System.out.println("Kurs: " + name);
    }

    public void printInfo(String prefix) {
        System.out.println(prefix + " " + name);
    }

    // name ma setter i getter, ponieważ nazwa kursu może się zmienić
    // maxStudents ma setter i getter, ponieważ może być zmiejszona lub zwiększona liczba dozwolonych studentów na kurs
    // MAX_LIMIT to stała, jest publiczna więc każdy ma do niej dostęp. Nie ma getter ani setter bo stałych nie da się modyfikować
}
public class Zad8 {
    static void main(String[] args) {
        Counter first = new Counter();
        first.value = 10;

        Counter second = new Counter();
        second.value = 20;

        first.increaseOther(second);
        System.out.println(first.value);
        System.out.println(second.value);

        // do metody nie przekazujemy kopii całego obiektu a jedynie adres w pamięci.
    }
}

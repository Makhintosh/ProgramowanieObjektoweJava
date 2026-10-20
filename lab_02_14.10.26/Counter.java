public class Counter {
    int value;

    public void increaseOther(Counter other){
        if (other != null){
            other.value += 1;
        }
    }
}

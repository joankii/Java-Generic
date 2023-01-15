package Java.Generic;

public class Pair <T, U>{

    private T First;
    private U Second;

    public Pair(T first, U second) {
        First = first;
        Second = second;
    }

    public T getFirst() {
        return First;
    }

    public void setFirst(T first) {
        First = first;
    }

    public U getSecond() {
        return Second;
    }

    public void setSecond(U second) {
        Second = second;
    }
}

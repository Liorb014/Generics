package org.example;

public class Pair <T,S> {
    private T object1;
    private S object2;

    public Pair(T object1,S object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public T getFirst() {
        return object1;
    }

    public S getSecond() {
        return object2;
    }

    @Override
    public String toString() {
        return "Pair{" + object1 +
                "," + object2 + "}";
    }
}

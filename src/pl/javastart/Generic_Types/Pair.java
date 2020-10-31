package pl.javastart.Generic_Types;

public class Pair<T, V> {
    private final T x;
    private final V y;

    public Pair(T x, V y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Pair " + x +
                ", " + y;
    }
}

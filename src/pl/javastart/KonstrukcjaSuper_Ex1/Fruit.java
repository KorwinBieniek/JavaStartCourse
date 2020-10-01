package pl.javastart.KonstrukcjaSuper_Ex1;

public class Fruit {
    private final int weight;
    private final String type;

    @Override
    public String toString() {
        return "Fruit weight " + weight +
                ", type " + type;
    }

    public Fruit(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }
}

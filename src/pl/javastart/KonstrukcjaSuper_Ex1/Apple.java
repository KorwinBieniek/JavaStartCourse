package pl.javastart.KonstrukcjaSuper_Ex1;

public class Apple extends Fruit {
    public static final String TYPE = "jabłkowate";

    private final String category;

    public Apple(int weight, String category) {
        super(weight, TYPE);
        this.category = category;
    }

    @Override
    public String toString() {
        return super.toString() + " category " + category;
    }
}

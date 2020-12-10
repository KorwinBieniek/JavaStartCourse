package pl.javastart_zadania.barman_v2;

public class Ingredient {
    private final String ingName;
    private final double ingAmount;

    public Ingredient(String ingName, double ingAmount) {
        this.ingName = ingName;
        this.ingAmount = ingAmount;
    }

    public String getIngName() {
        return ingName;
    }

    public double getIngAmount() {
        return ingAmount;
    }
}

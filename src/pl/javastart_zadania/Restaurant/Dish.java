package pl.javastart_zadania.Restaurant;

public class Dish {

    private final String dishName;
    private final int ID;
    private final double price;

    public Dish(String dishName, int ID, double price) {
        this.dishName = dishName;
        this.ID = ID;
        this.price = price;
    }

    public String getDishName() {
        return dishName;
    }

    public int getID() {
        return ID;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return ID + ". " + dishName + ", " + price + "zł";
    }
}

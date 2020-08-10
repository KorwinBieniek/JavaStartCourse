package pl.javastart.KonstrukcjaSuper;

public class Fruit {
    int weight;
    String type;

    public Fruit(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getInfo()
    {
        return "Type: " + getType() + " weight: " + getWeight();
    }
}

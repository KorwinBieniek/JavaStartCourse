package pl.javastart.KonstrukcjaSuper;

public class Apple extends Fruit{
    public static final String type = "apple";
    String typeOfApple;

    public Apple(int weight, String typeOfApple) {
        super(weight, type);
        this.typeOfApple = typeOfApple;
    }

    public String getTypeOfApple() {
        return typeOfApple;
    }

    public void setTypeOfApple(String typeOfApple) {
        this.typeOfApple = typeOfApple;
    }

    @Override
    public String getInfo()
    {
        return super.getInfo() + ", odmiana: " + typeOfApple;
    }
}

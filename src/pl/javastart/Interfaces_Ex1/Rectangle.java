package pl.javastart.Interfaces_Ex1;

public class Rectangle implements Shape{

    public static final String RECTANGLE = "rectangle";
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public double calculateArea() {
        return a * b;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b + " area " + calculateArea() + " perimeter " + calculatePerimeter() +
                '}';
    }
}

package pl.javastart.Interfaces_Ex1;

public class Circle implements Shape{

    public static final String CIRCLE = "circle";
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return r * (Shape.PI * Shape.PI);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Shape.PI * r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r + " area " + calculateArea() + " perimeter " + calculatePerimeter() +
                '}';
    }
}

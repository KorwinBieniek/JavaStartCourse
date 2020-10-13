package pl.javastart.Interfaces_Ex1;

public class Circle implements Shape{

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
}

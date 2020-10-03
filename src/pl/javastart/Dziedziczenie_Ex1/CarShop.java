package pl.javastart.Dziedziczenie_Ex1;

public class CarShop {
    public static void main(String[] args) {
        Part exPart = new ExhaustPart(5, "volkswagen", "12e", "a4a433265b");
        Part tire = new Tire(5, "volkswagen", "12e", 22, 15);

        System.out.println(exPart.toString());
        System.out.println(tire.toString());
    }
}

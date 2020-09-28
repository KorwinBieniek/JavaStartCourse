package pl.javastart.Metody_Ex1;

public class Calculate {
    public static void main(String[] args) {
        int a = 6;
        int b = 3;

        Calculator calc = new Calculator();

        System.out.println(calc.add(a,b));
        System.out.println(calc.subtract(a,b));
        System.out.println(calc.divide(a,b));
        System.out.println(calc.multiply(a,b));
    }
}

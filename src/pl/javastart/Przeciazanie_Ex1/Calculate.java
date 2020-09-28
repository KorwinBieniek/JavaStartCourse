package pl.javastart.Przeciazanie_Ex1;

public class Calculate {
    public static void main(String[] args) {
        int a = 50;
        int b = 20;
        int c = 100;

        System.out.println(Calculator.add(a,b));
        System.out.println(Calculator.add(a,c));
        System.out.println(Calculator.add(a,b,c));
        System.out.println(Calculator.add(a,b,c,22));
    }
}

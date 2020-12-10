package pl.javastart_zadania.define_variables;

public class Main {
    public static void main(String[] args) {
        System.out.printf("%.2f + %.2f + %.4f = %.4f", 5.1, 5.2, 5.433349, (5.1 + 5.2 + 5.433349));
        System.out.println();

        float a = 5.1f;
        float b= 5.2f;
        double c = 5.433349;
        double sum = a + b + c;
        System.out.println(a + " + " + b + " + " + c + " = " + sum);
    }
}

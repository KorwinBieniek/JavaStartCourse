package pl.javastart_zadania.draw_figures;

public class Rectangle implements Figure{

    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public void draw() {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}

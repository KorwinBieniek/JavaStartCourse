package pl.javastart.DrawShape.logic;

public class DrawShapeController {

    public void drawSquare(int a)
    {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    public void drawRectangle(int a, int b)
    {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }

    public void drawTriangle(int h)
    {
        for (int i = 0; i < h; i++) {
            for (int j = i; j < h; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}

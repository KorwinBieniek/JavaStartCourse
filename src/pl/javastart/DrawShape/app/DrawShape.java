package pl.javastart.DrawShape.app;

import pl.javastart.DrawShape.logic.DrawShapeController;

import java.util.Scanner;

public class DrawShape {
    public static void main(String[] args) {
        DrawShapeController ds = new DrawShapeController();

        Scanner input = new Scanner(System.in);
        int choice = 0;

        while(choice != -1)
        {
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    int rectangleVertical = input.nextInt();
                    int rectangleHorizontal = input.nextInt();
                    ds.drawRectangle(rectangleVertical, rectangleHorizontal);
                }
                case 2 -> {
                    int squareSide = input.nextInt();
                    ds.drawSquare(squareSide);
                }
                case 3 -> {
                    int triangleHeight = input.nextInt();
                    ds.drawTriangle(triangleHeight);
                }
                default -> System.out.println("There is no such option");
            }
        }

    }
}

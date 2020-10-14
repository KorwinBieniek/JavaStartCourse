package pl.javastart.Interfaces_Ex1;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeService {

    private Scanner input = new Scanner(System.in);

    private Rectangle readRectangleData()
    {
        System.out.println("Enter first side");
        double chooseA = input.nextInt();
        System.out.println("Enter second side");
        double chooseB = input.nextInt();

        return new Rectangle(chooseA, chooseB);
    }

    private Circle readCircleData()
    {
        System.out.println("Enter the radius");
        double r = input.nextInt();

        return new Circle(r);
    }

    private Triangle readTriangleData()
    {
        System.out.println("Enter first side");
        double a = input.nextInt();
        System.out.println("Enter second side");
        double b = input.nextInt();
        System.out.println("Enter third side");
        double c = input.nextInt();
        System.out.println("Enter height");
        double h = input.nextInt();

        return new Triangle(a, b, c, h);
    }

    public Shape createShape(){
        String choice;
        System.out.println("input \"exit\" to exit the program");

        do {
            choice = input.next().toLowerCase();

            switch(choice)
            {
                case "rectangle" -> {
                    return readRectangleData();
                }
                case "circle" -> {
                    return readCircleData();
                }
                case "triangle" -> {
                    return readTriangleData();
                }
                default ->
                    throw new NoSuchElementException();

            }

        }while(!choice.equals("exit"));
    }

    public void closeScanner()
    {
        input.close();
    }

}

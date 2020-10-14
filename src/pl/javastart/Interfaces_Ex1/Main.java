package pl.javastart.Interfaces_Ex1;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ShapeService ss = new ShapeService();

        Shape shape = null;

        boolean readComplete = false;

        while(!readComplete)
        {
            try {
                System.out.println("Type a figure(rectangle, circle or triangle) to calculate its area and perimeter");
                shape = ss.createShape();
                readComplete = true;
            } catch(NoSuchElementException e)
            {
                e.printStackTrace();
            }

            System.out.println(shape);
            ss.closeScanner();
        }


    }
}

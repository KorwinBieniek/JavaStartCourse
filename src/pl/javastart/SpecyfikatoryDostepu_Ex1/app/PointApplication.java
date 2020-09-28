package pl.javastart.SpecyfikatoryDostepu_Ex1.app;



import pl.javastart.SpecyfikatoryDostepu_Ex1.data.Point;
import pl.javastart.SpecyfikatoryDostepu_Ex1.logic.PointController;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointApplication {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PointController pc = new PointController();
        Point p = new Point(11,2);
        int choice;

        do
        {
            choice = Integer.parseInt(br.readLine());
            switch (choice) {
                case 1 -> pc.addX(p);
                case 2 -> pc.minusX(p);
                case 3 -> pc.plusY(p);
                case 4 -> pc.minusY(p);
            }
        }while(choice != -1);

        System.out.println(p.toString());
    }
}

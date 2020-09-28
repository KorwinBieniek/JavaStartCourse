package pl.javastart.SpecyfikatoryDostepu_Ex1.logic;

import pl.javastart.SpecyfikatoryDostepu_Ex1.data.Point;

public class PointController {
    public void addX(Point p)
    {
        p.setX(p.getX()+1);
    }

    public void minusX(Point p)
    {
        p.setX(p.getX()-1);
    }

    public void minusY(Point p)
    {
        p.setY(p.getY()-1);
    }

    public void plusY(Point p)
    {
        p.setY(p.getY()+1);
    }
}

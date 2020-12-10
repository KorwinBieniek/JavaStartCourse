package pl.javastart_zadania.draw_figures;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,8);
        //rectangle.draw();

        Square square = new Square(10);
        //square.draw();

        Tree tree = new Tree(10);
        tree.draw();
    }
}

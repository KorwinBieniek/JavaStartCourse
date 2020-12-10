package pl.javastart_zadania.draw_figures;

public class Square implements Figure{

    private final int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public void draw() {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("x ");
            }
            System.out.println();
        }
    }
}

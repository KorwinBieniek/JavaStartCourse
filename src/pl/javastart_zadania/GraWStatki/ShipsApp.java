package pl.javastart_zadania.GraWStatki;

public class ShipsApp {
    public static void main(String[] args) {

        System.out.println("Please enter a dimension of a board:");
        Board b1 = new Board();
        while(true) {
            b1.printBoard();
            b1.userMove();
        }
    }
}

package pl.javastart_zadania.GraWStatki;

public class ShipsApp {
    public static void main(String[] args) {

        System.out.println("Please enter a dimension of a board:");
        ShipsService b1 = new ShipsService();
        b1.prepareBoard();
        while(true) {
            b1.printBoard();
            b1.userMove();
        }
    }
}

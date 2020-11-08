package pl.javastart_zadania.Romb;

public class Main {
    public static void main(String[] args) {

        printDiamond(10);
    }

    public static void printDiamond(int num) {

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

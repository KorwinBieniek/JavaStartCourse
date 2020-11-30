package pl.javastart_zadania.GraWStatki;

import java.util.Arrays;
import java.util.Scanner;

public class Board {
    private Scanner input = new Scanner(System.in);
    char[][] board = createBoard(input.nextInt());


    public char[][] createBoard(int x) {
        char[][] createdBoard = new char[x][x];

        for (int i = 0; i < createdBoard.length; i++) {
            for (int j = 0; j < createdBoard[0].length; j++) {
                createdBoard[i][j] = '_';
            }
        }

        return createdBoard;
    }

    public void printBoard() {

        int verticalInt = 1;
        int horizontalInt = 1;
        System.out.print("\t");
        for (int i = 0; i < board.length; i++) {
            System.out.print(horizontalInt++ + "\t");
        }
        System.out.println();

        for (char[] chars : board) {
            System.out.print(verticalInt++ + "\t");
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(chars[j] + "\t");
            }
            System.out.println();
        }
    }

    public void userMove() {
        boolean moveCompleted = false;

        while (!moveCompleted) {
            try {
                System.out.println("Please enter y coordinate from 1 to " + board.length);
                int yMove = input.nextInt() - 1;
                System.out.println("Please enter x coordinate from 1 to " + board.length);
                int xMove = input.nextInt() - 1;

                moveCompleted = true;
                board[yMove][xMove] = 'X';
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The number has to be between 1 and " + board.length);
            }
        }
    }
}

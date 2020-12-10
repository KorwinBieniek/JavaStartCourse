package pl.javastart_zadania.ship_game;

import java.util.Random;
import java.util.Scanner;

public class ShipsService {
    private final Scanner input = new Scanner(System.in);
    private final int sizeOfBoard = input.nextInt();
    char[][] board = createBoard(sizeOfBoard);


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

    public void prepareBoard() {
        System.out.println("Please enter number of ships on the board:");
        int numberOfShips = input.nextInt();
        Random randY = new Random();
        Random randX = new Random();

        for (int i = 0; i < numberOfShips; i++) {
            board[randX.nextInt(sizeOfBoard)][randY.nextInt(sizeOfBoard)] = 'X';
        }
    }

    public boolean isShip(int y, int x) {
        return board[y][x] != '_';
    }

    public void userMove() {
        boolean moveCompleted = false;

        while (!moveCompleted) {
            try {
                System.out.println("Please enter y coordinate from 1 to " + board.length);
                int yMove = input.nextInt() - 1;
                System.out.println("Please enter x coordinate from 1 to " + board.length);
                int xMove = input.nextInt() - 1;

                if (isShip(yMove, xMove)) {
                    System.out.println("Boom! The ship at (" + (yMove+1) + ";" + (xMove+1) + ") got hit");
                    board[yMove][xMove] = 'V';
                } else {
                    System.out.println("Miss! There was no ship at (" + (yMove+1) + ";" + (xMove+1) + ")");
                }
                moveCompleted = true;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The number has to be between 1 and " + board.length);
            }
        }
    }
}

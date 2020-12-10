package pl.javastart_zadania.count_lines_in_directory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    private String  directoryName;
    private int totalCounter = 0;

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        System.out.println("Input a path to access the directory");

        Scanner input = new Scanner(System.in);
        String dirLocation = input.next();

        File dir = new File(dirLocation);
        if(dir.exists()) {
             directoryName = dirLocation;
            processDirectory(dir);
            System.out.println("Total lines = " + totalCounter);

        } else {
            System.out.println("The chosen directory doesn't exist");
        }
    }

    private void processDirectory(File dir) {
        for(File file : Objects.requireNonNull(dir.listFiles())) {
            if(file.isDirectory()) {
                processDirectory(file);
            } else {
                int lines = countLinesInFile(file);
                totalCounter += lines;

                String nameWithoutDirectory =
                        file.getAbsolutePath().replace(directoryName, "");

                System.out.println(nameWithoutDirectory + " - " + lines);
            }
        }
    }

    private int countLinesInFile(File file) {

        int counter = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            while(br.readLine() != null) {
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return counter;
    }
}

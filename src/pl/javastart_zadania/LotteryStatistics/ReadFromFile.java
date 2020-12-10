package pl.javastart_zadania.LotteryStatistics;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFromFile {

    public List<Result> readFile(String fileName) {

        List<Result> results = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        scanner.nextLine(); //pomijamy nagłówek pliku
        while (scanner.hasNextLine()) {
            String csvLine = scanner.nextLine();
            Result result = Result.fromCsv(csvLine);
            results.add(result);
        }
        return results;
    }
}

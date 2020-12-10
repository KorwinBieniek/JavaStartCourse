package pl.javastart_zadania.LotteryStatistics;

import java.io.FileNotFoundException;
import java.util.List;

class LotteryApp {

    public static void main(String[] args) {
        var lotteryFileReader = new ReadFromFile();
        List<Result> results = lotteryFileReader.readFile("loteria.csv");
        System.out.println("10 Najpopularniejszych liczb: ");
        LotteryStats.mostPopularNumbers(results)
                .limit(10)
                .forEach(System.out::println);
        System.out.println("3 Najpopularniejsze mega ball:");
        LotteryStats.mostPopularMegaBall(results)
                .limit(3)
                .forEach(System.out::println);

    }
}

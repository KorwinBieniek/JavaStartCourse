package pl.javastart_zadania.LotteryStatistics;

import java.util.Arrays;

public class Result {

        private int[] numbers;
        private int megaBall;

        Result(int[] numbers, int megaBall) {
            this.numbers = numbers;
            this.megaBall = megaBall;
        }

        public int[] getNumbers() {
            return numbers;
        }

        public void setNumbers(int[] numbers) {
            this.numbers = numbers;
        }

        public int getMegaBall() {
            return megaBall;
        }

        public void setMegaBall(int megaBall) {
            this.megaBall = megaBall;
        }

        static Result fromCsv(String csv) {
            String[] columns = csv.split(",");
            String[] winningNumbers = columns[1].split(" ");
            int winLength = winningNumbers.length;
            int[] winningNumbersInt = new int[winLength];
            for (int i = 0; i < winLength; i++) {
                winningNumbersInt[i] = Integer.parseInt(winningNumbers[i]);
            }
            int megaBall = Integer.parseInt(columns[2]);
            return new Result(winningNumbersInt, megaBall);
        }

    @Override
    public String toString() {
        return "Result{" +
                "numbers=" + Arrays.toString(numbers) +
                ", megaBall=" + megaBall +
                '}';
    }
}

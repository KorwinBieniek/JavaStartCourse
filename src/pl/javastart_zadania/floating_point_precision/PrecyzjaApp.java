package pl.javastart_zadania.floating_point_precision;

import java.math.BigDecimal;
import java.util.Scanner;

public class PrecyzjaApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num;

        do {
            System.out.println("Enter a number. It has to be different than 0");
            num = input.nextDouble();
        } while (num == 0);

        input.close();

        BigDecimal bd = BigDecimal.valueOf(num);
        if (num > 0) {
            for (BigDecimal i = BigDecimal.ZERO; i.compareTo(bd) <= 0; i = i.add(BigDecimal.valueOf(0.1))) {
                System.out.println(i.toString());
            }
        }
        else if (num < 0)
        {
            for (BigDecimal i = BigDecimal.ZERO; i.compareTo(bd) >= 0; i = i.subtract(BigDecimal.valueOf(0.1))) {
                System.out.println(i.toString());
            }
        }


    }
}

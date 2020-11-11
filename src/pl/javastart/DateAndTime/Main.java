package pl.javastart.DateAndTime;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("To start measuring time press Enter");

        input.nextLine();
        Instant i1 = Instant.now();

        System.out.println("To stop measuring time press Enter again");
        input.nextLine();

        Instant i2 = Instant.now();

        Duration timeBetween = Duration.between(i1, i2);
        System.out.println(timeBetween.toSeconds() + " seconds");

    }
}

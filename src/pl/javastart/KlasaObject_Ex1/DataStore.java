package pl.javastart.KlasaObject_Ex1;

import java.util.Arrays;
import java.util.Scanner;

public class DataStore {
    Scanner input = new Scanner(System.in);

    final private int MAX_CAPACITY = 100;
    private Computer[] computers = new Computer[1];
    private int current_capacity = 0;


    public void add(Computer computer)
    {
        if(current_capacity == computers.length)
            computers = Arrays.copyOf(computers, computers.length*2);
        computers[current_capacity] = computer;
        current_capacity++;
    }

    public Computer[] deleteNullsInComputers()
    {
        Computer[] comps = new Computer[current_capacity];
        for (int i = 0; i < current_capacity; i++) {
            comps[i] = computers[i];
        }

        return comps;
    }

    public int checkAvailability(Computer computer)
    {
        int same_computers = 0;

        for (Computer value : computers) {
            if (computer.equals(value))
                same_computers++;
        }

        return same_computers;
    }
}

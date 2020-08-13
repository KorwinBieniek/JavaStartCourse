package pl.javastart.Metody_Klasy_Object;

import Polimorfizm.Person;

import java.util.Arrays;

public class DataStore {

    private int emptyPlace = 0;
    final private int INITIAL_SIZE = 1;
    Computer[] computers = new Computer[INITIAL_SIZE];

    void add(Computer computer)
    {
        if(computer == null)
            throw new NullPointerException("Computer cannot be null");
        if(emptyPlace == computers.length)
            computers = Arrays.copyOf(computers, computers.length * 2);
        computers[emptyPlace] = computer;
        emptyPlace++;
    }

    public Computer[] getComputers() {
        Computer[] comps = new Computer[emptyPlace];
        for (int i = 0; i < emptyPlace; i++) {
            comps[i] = computers[i];
        }
        return comps;
    }

    int checkAvailability(Computer find) {
        if (find == null)
            return 0;

        int count = 0;
        for (int i = 0; i < emptyPlace; i++) {
            if (find.equals(computers[i]))
                count++;
        }
        return count;
    }
}

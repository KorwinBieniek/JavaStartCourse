package Polimorfizm;

import java.util.Arrays;

public class Hospital {

    private int emptyPlace = 0;
    final private int INITIAL_SIZE = 1;
    Person[] workers = new Person[INITIAL_SIZE];

    void add(Person person)
    {
        if(person == null)
            throw new NullPointerException("Person cannot be null");
        if(emptyPlace == workers.length)
            workers = Arrays.copyOf(workers, workers.length * 2);
        workers[emptyPlace] = person;
        emptyPlace++;
    }

    String getInfo()
    {
        String result = "";
        for (int i = 0; i < emptyPlace; i++) {
            result = result + workers[i].getInfo() + "\n";
        }
        return result;
    }

}

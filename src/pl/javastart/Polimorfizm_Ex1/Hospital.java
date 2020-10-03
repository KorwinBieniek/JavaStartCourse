package pl.javastart.Polimorfizm_Ex1;

import java.util.LinkedList;
import java.util.List;

public class Hospital {

    private static List<Person> list = new LinkedList<>();

    public static List<Person> getList() {
        return list;
    }

    public static void add(Person person)
    {
        list.add(person);
    }

    public static void getInfo(List<Person> list)
    {
        for(Person person : list)
            System.out.println(person.toString());
    }
}

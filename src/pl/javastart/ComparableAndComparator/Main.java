package pl.javastart.ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> list = new ArrayList<>();

        list.add(new User("Karol","Krawczyk",5000));
        list.add(new User("Krzysztof","Ikea",2500));
        list.add(new User("Karol","Wojtyla",1100));
        list.add(new User("Sobor","Krawczyk",3600));
        list.add(new User("Norbert","Krawczyk",5400));

        for (User user : list) {
            System.out.println(user);
        }

        System.out.println("________________________________________________________");

        list.sort(new User.UserNameComparator());

        for (User user : list) {
            System.out.println(user);
        }
    }
}

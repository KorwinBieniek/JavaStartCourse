package pl.javastart_zadania.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Order {

    public static double addToList(int ID, List<Dish> dishes) {

        double sum = 0;

        for (Dish dish : dishes) {
            if(ID == dish.getID()) {
                sum += dish.getPrice();
            }
        }
        return sum;
    }
}

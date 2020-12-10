package pl.javastart_zadania.Barman;

public class Barman {

    public static Drink createDrink(Ingredient ing1, Ingredient ing2, Ingredient ing3) {
        return new Drink(ing1, ing2, ing3);
    }

    public static void printDrink(Drink drink) {
        int totalAmount = (int) (drink.getIng1().getIngAmount() + drink.getIng2().getIngAmount() + drink.getIng3().getIngAmount());
                System.out.println("Składniki drinka to " +
                        drink.getIng1().getIngName() + ", " +
                        drink.getIng2().getIngName() + ", " +
                drink.getIng3().getIngName() +
                        " w proporcjach " + drink.getIng1().getIngAmount()/totalAmount +
                        ", " + drink.getIng2().getIngAmount()/totalAmount +
                        ", " + drink.getIng3().getIngAmount()/totalAmount + ", jego pojemność to " + totalAmount + "ml");
    }
}

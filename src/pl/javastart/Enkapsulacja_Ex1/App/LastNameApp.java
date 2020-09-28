package pl.javastart.Enkapsulacja_Ex1.App;

import pl.javastart.Enkapsulacja_Ex1.Logic.LastNameLogic;

public class LastNameApp {

    public static void main(String[] args) {
        LastNameLogic l1 = new LastNameLogic();
        LastNameLogic l2 = new LastNameLogic(null, "Kowalski");
        LastNameLogic l3 = new LastNameLogic("Jan");
        LastNameLogic l4 = new LastNameLogic("Jan","Kowalski");

        l1.print(l1);
        l2.print(l2);
        l3.print(l3);
        l4.print(l4);
    }

}

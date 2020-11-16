package pl.javastart_zadania.Restaurant;

import java.util.List;

public class PaymentService {

    public static double calculatePayment(double totalPrice) {

        double tip;

        if (totalPrice >= 100) {
            tip = 0.1 * totalPrice;
        } else {
            tip = 0.15 * totalPrice;
        }

        return tip;
    }
}

package pl.javastart_zadania.PhoneBook;

import java.util.Arrays;

public class TeleBookApp {

    public static void main(String[] args) {
        TeleBookController teleBookController = new TeleBookController();

        teleBookController.loop();
    }
}

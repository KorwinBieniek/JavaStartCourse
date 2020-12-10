package pl.javastart_zadania.phone_book_project;

public class TeleBookApp {

    public static void main(String[] args) {
        TeleBookController teleBookController = new TeleBookController();

        teleBookController.loop();
    }
}

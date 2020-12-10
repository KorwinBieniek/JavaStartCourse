package pl.javastart_zadania.PhoneBook;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TeleBookController {
    private TeleBook teleBook;
    private final Scanner input = new Scanner(System.in);

    public TeleBookController() {
        teleBook = FileUtilities.read();
    }

    public void loop() {
        OPTIONS option = null;
        do {
            showOptions();
            try {
                option = chooseOption();
                executeOption(option);
            } catch (NoSuchElementException e) {
                System.out.println("No such option exists");
            }
        } while (option != OPTIONS.CLOSE);
    }

    private void showOptions() {
        for (OPTIONS option : OPTIONS.values()) {
            System.out.println(option);
        }
    }

    private OPTIONS chooseOption() {
        int option = input.nextInt();
        input.nextLine();
        return OPTIONS.convertToOption(option);
    }

    private void executeOption(OPTIONS options) {
        switch (options) {
            case ADD -> addContact();
            case SEARCH_BY_NAME -> searchContactByName();
            case SEARCH_BY_NUM -> searchContactByNumber();
            case DELETE -> deleteContact();
            case CLOSE -> close();
        }
    }

    private void addContact() {
        System.out.println("Input contact name");
        String name = input.nextLine();
        System.out.println("Input contact number");
        String number = input.nextLine();
        boolean add = teleBook.add(name, number);
        if (add) {
            System.out.println("Record has been added");
        } else {
            System.out.println("Unable to add record. Such record might exist");
        }
    }

    private void searchContactByName() {
        System.out.println("Input a contact name or part of it");
        String namePart = input.nextLine();
        List<Contact> contacts = teleBook.findByName(namePart);
        if(contacts.isEmpty()) {
            System.out.println("No such contact");
        } else {
            System.out.println("Found contacts: ");
            contacts.forEach(System.out::println);
        }
    }

    private void searchContactByNumber() {
        System.out.println("Input a contact number or part of it");
        String numberPart = input.nextLine();
        List<Contact> contacts = teleBook.findByNumber(numberPart);
        if(contacts.isEmpty()) {
            System.out.println("No such contact");
        } else {
            System.out.println("Found contacts: ");
            contacts.forEach(System.out::println);
        }
    }

    private void deleteContact() {
        System.out.println("Input a contact name that you want to delete");
        String contactName = input.nextLine();
        boolean removed = teleBook.remove(contactName);
        if (removed) {
            System.out.println("The contact has been removed");
        } else {
            System.out.println("No such contact has been found");
        }
    }

    private void close() {
        input.close();
        try {
            FileUtilities.saveFile(teleBook);
            System.out.println("Zapisano zmiany.");
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać zmian");
        }
        System.out.println("Bye bye.");
    }
}

package pl.javastart_zadania.PhoneBook;

import java.util.HashMap;
import java.util.Map;

public class TeleBook {
    Map<String, Contact> contacts = new HashMap<>();

    public boolean add(String name, String number) {
        if(name == null || number == null) {
            throw new IllegalArgumentException("Name and number cannot be null");
        }
        if (name.isEmpty() || number.isEmpty()) {
            throw new IllegalArgumentException("Name and number cannot be empty");
        }
        if (number.length() != 9) {
            throw new IllegalArgumentException("Number needs to have 9 digits");
        }
        if(!contacts.containsKey(name)) {
            contacts.put(name, new Contact(name, number));
            return true;
        } else {
            return false;
        }
    }

    public void find(){}

    public void remove(){}
}

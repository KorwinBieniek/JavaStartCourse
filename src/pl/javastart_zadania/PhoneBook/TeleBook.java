package pl.javastart_zadania.PhoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Komenatarz do testowania hotfixu -- gitflow

//Mergowanie komenda
//Kolejna linia
public class TeleBook {
    Map<String, Contact> contacts = new HashMap<>();

    public TeleBook() {
    }

    public TeleBook(Map<String, Contact> contacts) {
        this.contacts = contacts;
    }

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
        boolean flag = true;
        for (Contact value : contacts.values()) {
            if (value.getNumber().equals(number)) {
                flag = false;
                break;
            }
        }
        if(!contacts.containsKey(name) && flag) {
            contacts.put(name, new Contact(name, number));
            return true;
        } else {
            return false;
        }
    }

    public List<Contact> findByName(String name) {
        List<Contact> result = new ArrayList<>();
        for (Map.Entry<String, Contact> stringContactEntry : contacts.entrySet()) {
            if (stringContactEntry.getKey().contains(name)) {
                result.add(stringContactEntry.getValue());
            }
        }
        return result;
    }

    public List<Contact> findByNumber(String number) {
        List<Contact> result = new ArrayList<>();
        for (Map.Entry<String, Contact> stringContactEntry : contacts.entrySet()) {
            if (stringContactEntry.getValue().getNumber().contains(number)) {
                result.add(stringContactEntry.getValue());
            }
        }
        return result;
    }

    public boolean remove(String name) {
        return contacts.remove(name) != null;
    }
}

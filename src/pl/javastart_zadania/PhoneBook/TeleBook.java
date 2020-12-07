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

    public void remove(String name) {
        if(contacts != null) {
            contacts.remove(name);
        }
    }
}

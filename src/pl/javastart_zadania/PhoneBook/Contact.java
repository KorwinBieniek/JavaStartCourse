package pl.javastart_zadania.PhoneBook;

public class Contact {
    private final String name;
    private final String number;

    public String toCSV() {
        return name + ";" + number;
    }

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return name + " " + number;
    }
}

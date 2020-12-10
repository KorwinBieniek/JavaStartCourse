package pl.javastart_zadania.phone_book_project;

import java.util.NoSuchElementException;

public enum OPTIONS {
    ADD(1, "Add contact"),
    SEARCH_BY_NUM(2, "Search by number"),
    SEARCH_BY_NAME(3, "Search by name"),
    DELETE(4, "Delete contact"),
    CLOSE(5,"Exit");


    private final int optionId;
    private final String optionDescription;

    OPTIONS(int optionId, String optionDescription) {
        this.optionId = optionId;
        this.optionDescription = optionDescription;
    }

    static OPTIONS convertToOption(int chooseOption) {
        if(chooseOption > values().length || chooseOption <= 0) {
            throw new NoSuchElementException("No such option available");
        }
        return values()[chooseOption - 1];
    }

    @Override
    public String toString() {
        return optionId + ". " + optionDescription;
    }
}

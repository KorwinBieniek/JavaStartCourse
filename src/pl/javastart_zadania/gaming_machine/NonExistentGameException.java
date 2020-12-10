package pl.javastart_zadania.gaming_machine;

public class NonExistentGameException extends Exception{

    public NonExistentGameException(String gameTitle) {
        super("Game not found " + gameTitle);
    }
}

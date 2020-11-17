package pl.javastart_zadania.GamingMachine;

public class NonExistentGameException extends Exception{

    public NonExistentGameException(String gameTitle) {
        super("Game not found " + gameTitle);
    }
}

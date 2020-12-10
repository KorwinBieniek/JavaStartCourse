package pl.javastart_zadania.storage_controller;

public class Main {
    public static void main(String[] args) {


        FormatFile.printInfo(FormatFile.formatFile(ReadFile.readFile("data.csv")));
    }
}

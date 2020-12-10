package pl.javastart_zadania.AirConditioning;

public class Room {

    private final int size;
    private final int temperature;

    public Room(int size, int temperature) {
        this.size = size;
        this.temperature = temperature;
    }

    public int getSize() {
        return size;
    }

    public int getTemperature() {
        return temperature;
    }
}

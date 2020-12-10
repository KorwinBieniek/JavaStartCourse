package pl.javastart_zadania.air_conditioning;

public interface AirConditioner {

    void lowerTemperature(double temp, double roomSize, double targetTemp) throws InterruptedException;
}

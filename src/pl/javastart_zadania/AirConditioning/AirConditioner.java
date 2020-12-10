package pl.javastart_zadania.AirConditioning;

public interface AirConditioner {

    void lowerTemperature(double temp, double roomSize, double targetTemp) throws InterruptedException;
}

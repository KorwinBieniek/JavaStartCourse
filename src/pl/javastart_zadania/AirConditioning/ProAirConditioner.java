package pl.javastart_zadania.AirConditioning;

public class ProAirConditioner implements AirConditioner{

    @Override
    public void lowerTemperature(double temp, double roomSize, double targetTemp) throws InterruptedException {


        while(temp > targetTemp){
            Thread.sleep(1000);
            System.out.println("Current temperature: " + temp);
            temp -= (2 / roomSize);
        }
    }
}

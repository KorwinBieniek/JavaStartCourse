package pl.javastart_zadania.AirConditioning;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Room room1 = new Room(4, 32);
        Room room2 = new Room(6, 62);
        Room room3 = new Room(4, 24);
        Room room4 = new Room(5, 41);

        BasicAirConditioner bac = new BasicAirConditioner();
        ProAirConditioner pac = new ProAirConditioner();

        bac.lowerTemperature(room1.getTemperature(), room1.getSize(), 31);
        pac.lowerTemperature(room2.getTemperature(), room2.getSize(), 58);
        bac.lowerTemperature(room3.getTemperature(), room3.getSize(), 23);
        pac.lowerTemperature(room4.getTemperature(), room4.getSize(), 40);
    }
}

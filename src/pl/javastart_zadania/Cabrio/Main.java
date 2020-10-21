package pl.javastart_zadania.Cabrio;

public class Main {
    public static void main(String[] args) {

        boolean isCarMoving = true;

        Car.openRoof(isCarMoving);

        isCarMoving = Car.move(isCarMoving);

        Car.openRoof(isCarMoving);
    }
}

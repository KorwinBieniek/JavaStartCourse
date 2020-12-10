package pl.javastart_zadania.Cabrio;

public class Car {
    private String name;
    private String model;
    private static final boolean roofOpen = false;
    private static final boolean carMoving = false;

    public static boolean move(boolean carMoving) {
        return !carMoving;
    }

    public static void openRoof(boolean carMoving){

        if(carMoving)
        {
            System.out.println("Car is moving, you can't open or close the roof.");
            return;
        }

        if(roofOpen){
            System.out.println("The roof is closing");
        }
        else{
            System.out.println("The roof is opening");
        }
    }
}

package pl.javastart.Generic_Types;

public class Main {

    public static void main(String[] args) {

        Pair<Integer,String> pair1 = new Pair<>(5,"x");
        Pair<Float,Double> pair2 = new Pair<>(5.3f,4.534252);
        Pair<Character,String> pair3 = new Pair<>('z',"to jest z");

        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);
    }
}

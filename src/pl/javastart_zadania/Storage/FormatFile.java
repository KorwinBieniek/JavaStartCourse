package pl.javastart_zadania.Storage;

import java.util.*;

public class FormatFile {

    public static Map<String,Integer> formatFile(List<String> list) {
        Map<String, Integer> equipment = new HashMap<>();

        for (String s : list) {
            String[] elements = s.split(";");
            equipment.put(elements[0], Integer.valueOf(elements[1]));
        }

        return equipment;
    }

    public static String getStars(int num) {
        if(num%10 > 5) {
            num += 10;
        }
        int round = num/10;

        return "*".repeat(Math.max(0, round));
    }

    public static void printInfo(Map<String, Integer> map) {
        map.forEach((k,v) -> System.out.printf("%-30s (%d) %s\n", k, v, getStars(v)));
    }
}

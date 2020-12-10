package pl.javastart_zadania.storage_controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    public static List<String> readFile(String filename) {

        List<String> items = new ArrayList<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            String line;

            while ((line = br.readLine()) != null) {
                items.add(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return items;
    }


}

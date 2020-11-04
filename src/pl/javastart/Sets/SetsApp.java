package pl.javastart.Sets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class SetsApp {

    public static void main(String[] args) {
        try {
            TreeSet<String> names = (TreeSet<String>) returnUniqueNames("namespl.txt");
            System.out.println(names.first());
            System.out.println(names.last());
        } catch (IOException e) {
            System.err.println("IOException thrown");
        }

    }

    public static Set<String> returnUniqueNames(String filename) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filename));
        int num = 0;

        TreeSet<String> uniqueNames = new TreeSet<>(new Comparator<>() {

            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });

        String nextLine;

        while ((nextLine = br.readLine()) != null) {
            uniqueNames.add(nextLine);
        }

        for (String uniqueName : uniqueNames) {
            num++;
        }

        System.out.println(num);

        br.close();
        return uniqueNames;
    }
}

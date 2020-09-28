package pl.javastart.SentenceGenerator;

import java.util.Random;

public class CreateSentence {

    Random rand = new Random();

    public int generateNumber()
    {
        return rand.nextInt(3);
    }

    public String createSentence(String[] whoAdj,String[] who, String[] verb, String[] what, String[] conjunction, String[] withWho)
    {
        int[] array = new int[6];
        for (int i = 0; i < array.length; i++) {
            array[i] = generateNumber();
        }

        return whoAdj[array[0]] + " " + who[array[1]] + " " + verb[array[2]] + " " + what[array[3]] + " " + conjunction[array[4]] + " " + withWho[array[5]];
    }
}

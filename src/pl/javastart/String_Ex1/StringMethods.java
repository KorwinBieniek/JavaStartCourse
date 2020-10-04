package pl.javastart.String_Ex1;

public class StringMethods {

    public static String wordFromFirstLetters(String[] strings)
    {
        StringBuilder finalString = new StringBuilder();

        for (String string : strings) {
            finalString.append(string.charAt(string.length()-1));
        }

        return finalString.toString();
    }
}

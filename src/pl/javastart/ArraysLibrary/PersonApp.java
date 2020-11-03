package pl.javastart.ArraysLibrary;

public class PersonApp {
    public static void main(String[] args) {
        PersonDatabase pd = new PersonDatabase();

        Person kasia = new Person("Kasia","Michalska","532532");
        Person korwin = new Person("Korwin","Bieniek","7564743");
        pd.add(kasia);
        pd.add(new Person("Adam","Kalota","1124245"));
        pd.add(new Person("Robert","Domagala","6346733"));
        pd.add(korwin);
        pd.add(new Person("Julia","Saferna","86565546"));

        pd.remove(kasia);
        pd.remove(korwin);

        pd.print();
    }
}

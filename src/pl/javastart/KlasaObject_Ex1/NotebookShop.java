package pl.javastart.KlasaObject_Ex1;

public class NotebookShop {
    public static void main(String[] args) {

        DataStore ds = new DataStore();

        ds.add(new Computer("aaa","xcs1"));
        ds.add(new Computer("aaa","xcs2"));
        ds.add(new Computer("ccc","xcs1"));
        ds.add(new Computer("aaa","xcs1"));
        ds.add(new Computer("ddd","xcs4"));

        Computer compToCompare = new Computer("aaa","xcs1");


        System.out.println(ds.checkAvailability(compToCompare));

        for(Computer computer : ds.deleteNullsInComputers())
            System.out.println(computer);
    }
}

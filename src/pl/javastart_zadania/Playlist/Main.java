package pl.javastart_zadania.Playlist;

public class Main {

    public static void main(String[] args) {
        Song song1 = new Song("Ulalala", 309);
        Song song2 = new Song("Nothing else matters", 300);
        int playlistLength = Playlist.totalLength(song1, song2);

        System.out.print("The songs total duration is " + playlistLength + " seconds\n" +
                "In minutes: ");
        Playlist.formatOutput(playlistLength);
    }
}

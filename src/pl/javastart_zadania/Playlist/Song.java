package pl.javastart_zadania.Playlist;

public class Song {
    private final String songName;
    private final int duration;

    public Song(String songName, int duration) {
        this.songName = songName;
        this.duration = duration;
    }

    public String getSongName() {
        return songName;
    }

    public int getDuration() {
        return duration;
    }
}

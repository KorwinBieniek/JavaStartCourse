package pl.javastart_zadania.Playlist;

import java.time.Duration;

public class Playlist {

    public static int totalLength(Song ... songs) {
        int duration = 0;
        for (Song song : songs) {
            duration += song.getDuration();
        }

        return duration;
    }

    public static void formatOutput(int seconds) {
        Duration duration = Duration.ofSeconds(seconds);

        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        seconds = duration.toSecondsPart();

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}

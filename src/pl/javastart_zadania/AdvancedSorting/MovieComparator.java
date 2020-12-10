package pl.javastart_zadania.AdvancedSorting;

import java.util.Comparator;

public enum MovieComparator {
    TITLE("Title", Comparator.comparing(Movie::getTitle)),
    DIRECTOR("Director", Comparator.comparing(Movie::getDirector)),
    RATING("Rating",Comparator.comparingDouble(Movie::getRating).reversed()),
    YEAR("Year", Comparator.comparingInt(Movie::getYear).reversed());

    private final String criteria;
    private final Comparator<Movie> movieComparator;

    MovieComparator(String criteria, Comparator<Movie> movieComparator) {
        this.criteria = criteria;
        this.movieComparator = movieComparator;
    }

    public String getCriteria() {
        return criteria;
    }

    public Comparator<Movie> getMovieComparator() {
        return movieComparator;
    }

    public static MovieComparator convert (String userCriteria) {
        MovieComparator[] values = MovieComparator.values();
        for (MovieComparator value : values) {
            if (userCriteria.equals(value.criteria)) {
                return value;
            }
        }
        throw new IllegalArgumentException("Wrong sorting criteria " + userCriteria);
    }
}

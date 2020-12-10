package pl.javastart_zadania.advanced_sorting;

import java.util.*;

public class MovieDatabase {
    public static void main(String[] args) {

        List<Movie> moviesList = createMoviesList();
        printOptions();
        Comparator<Movie> sortAlgorithm = getSortAlgorithm();
        moviesList.sort(sortAlgorithm);
        print(moviesList);

    }

    private static List<Movie> createMoviesList() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Jumanji", "Johnston Joe", 1995, 6.8));
        movies.add(new Movie("The Shawshank Redemption", "Johnston Joe", 1994, 8.75));
        movies.add(new Movie("The Green Mile", "Darabont Frank", 1999, 8.61));
        movies.add(new Movie("Spider Man", "Raimi Sam", 2002, 6.7));
        movies.add(new Movie("Transformers", "Bay Michael", 2007, 7.3));
        movies.add(new Movie("Alien", "Scott Ridley", 1979, 7.8));
        movies.add(new Movie("Home Alone", "Columbus Chris", 1979, 7.1));
        return movies;
    }

    private static Comparator<Movie> getSortAlgorithm() {
        Scanner input = new Scanner(System.in);
        MovieComparator mc = null;
        try {
            mc = MovieComparator.convert(input.next());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        return mc != null ? mc.getMovieComparator() : null;
    }

    private static void printOptions() {
        MovieComparator[] comparators = MovieComparator.values();
        for (MovieComparator comparator : comparators) {
            System.out.println(comparator.getCriteria());
        }

        System.out.println("Please enter a comparator:");
    }

    private static void print(List<Movie> movies) {
        System.out.println("Lista filmów:");
        movies.forEach(System.out::println);
    }

}
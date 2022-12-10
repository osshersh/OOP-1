package task2;

public class Movie {
    private final String title;
    private final String directorName;
    private final double length;
    private final int releaseYear;

    public Movie(String title, String directorName, double length, int releaseYear) {
        this.title = title;
        this.directorName = directorName;
        this.length = length;
        this.releaseYear = releaseYear;
    }
}

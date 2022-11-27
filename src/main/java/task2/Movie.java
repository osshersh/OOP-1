package task2;

public class Movie {
    private String filmTitle;
    private String nameProducer;
    private String sureNameProducer;
    private double lengthFilm;
    private int yearReleased;

    public Movie(String title, String nameProducer, String sureNameProducer, double lengthFilm, int yearReleased) {
        this.filmTitle = title;
        this.nameProducer = nameProducer;
        this.sureNameProducer = sureNameProducer;
        this.lengthFilm = lengthFilm;
        this.yearReleased = yearReleased;
    }
}

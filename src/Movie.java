import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Movie {
    String title, director, language, country, cast1, cast2, genre;
    int releaseYear, budget;
    double rating;

    public Movie(String title, String director, int releaseYear, double rating, String language,
                 String country, String cast1, String cast2, String genre, int budget) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
        this.rating = rating;
        this.language = language;
        this.country = country;
        this.cast1 = cast1;
        this.cast2 = cast2;
        this.genre = genre;
        this.budget = budget;
    }

    public String getTitle() { return title; }
    public String getDirector() { return director; }
    public int getReleaseYear() { return releaseYear; }
    public double getRating() { return rating; }
    public String getLanguage() { return language; }
    public String getCountry() { return country; }
    public String getCast1() { return cast1; }
    public String getCast2() { return cast2; }
    public String getGenre() { return genre; }
    public int getBudget() { return budget; }
    @Override
    public String toString() {
        return title + " (" + releaseYear + ") directed by " + director +
                ", Rating: " + rating + ", Language: " + language +
                ", Country: " + country + ", Cast: " + cast1 +
                " and " + cast2 + ", Genre: " + genre +
                ", Budget: $" + budget;
    }
}



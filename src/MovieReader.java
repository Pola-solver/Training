import java.io.*;
import java.util.*;
public class MovieReader {
    public static List<Movie> readMoviesFromFile(String fileName) {
        List<Movie> movies = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",", -1);
                if (parts.length != 10) {
                    System.out.println("Skipping invalid line: " + line);
                    continue;
                }
                try {
                    String title = parts[0];
                    String director = parts[1];
                    int releaseYear = Integer.parseInt(parts[2]);
                    double rating = Double.parseDouble(parts[3]);
                    String language = parts[4];
                    String country = parts[5];
                    String cast1 = parts[6];
                    String cast2 = parts[7];
                    String genre = parts[8];
                    int budget = Integer.parseInt(parts[9]);

                    movies.add(new Movie(title, director, releaseYear, rating, language, country, cast1, cast2, genre, budget));
                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid data in line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return movies;
    }

    public static void main(String[] args) {
        String fileName = "movies.txt";

        // Read movies from file
        List<Movie> movies = readMoviesFromFile(fileName);

        // Output movies
        if (movies.isEmpty()) {
            System.out.println("No movies found.");
        } else {
            System.out.println("Movies from file:");
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }
}
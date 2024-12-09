import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Files {
    // Method to read movies from a file
    public static List<Movie> read(String filePath) {
        List<Movie> movies = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            // Read each line from the file
            while ((line = br.readLine()) != null) {
                String[] movieData = line.split(",");

                // Parse data fields
                String title = movieData[0];
                String director = movieData[1];
                int releaseYear = Integer.parseInt(movieData[2]);
                double rating = Double.parseDouble(movieData[3]);
                String language = movieData[4];
                String country = movieData[5];
                String cast1 = movieData[6];
                String cast2 = movieData[7];
                String genre = movieData[8];
                int budget = Integer.parseInt(movieData[9]);

                // Create a new Movie object and add it to the list
                movies.add(new Movie(title, director, releaseYear, rating, language,
                        country, cast1, cast2, genre, budget));
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return movies;
    }

    // Method to write movies to a file
    public static void write(String filePath, List<Movie> movies) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (Movie movie : movies) {
                // Write each movie's details in the same format
                bw.write(movie.getTitle() + "," + movie.getDirector() + "," + movie.getReleaseYear() + "," +
                        movie.getRating() + "," + movie.getLanguage() + "," + movie.getCountry() + "," +
                        movie.getCast1() + "," + movie.getCast2() + "," + movie.getGenre() + "," + movie.getBudget());
                bw.newLine();
            }
            System.out.println("Movies have been successfully written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}

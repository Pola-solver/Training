import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MovieWriter {
    public static void writeMoviesToFile(String filePath, List<Movie> movies) {
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
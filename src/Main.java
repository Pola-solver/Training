/*import java.io.*;
import java.nio.charset.StandardCharsets;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String filePath = "movies.txt"; // Ensure this file exists in the working directory
        String OutputFilepath = "MoviesWritten";
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("five feet apart", "Maria", 2005, 9.9, "Eng", "Usa", "Youssef", "Clara", "Comedy", 100000000));
        MovieWriter.writeMoviesToFile(OutputFilepath,movies);




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

        // Output movie details in the main method
        System.out.println("Movies Information:");
        System.out.println("=========================================");
        for (Movie movie : movies) {
            System.out.println(movie); // toString() method is called implicitly
        }
    }
    }
}
*/
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "movies.txt"; // Ensure this file exists
        String outputFilePath = "output_movies.txt";

        // Read movies from file
        List<Movie> movies = Files.read(inputFilePath);

        // Output movie details
        System.out.println("Movies Information:");
        System.out.println("=========================================");
        for (Movie movie : movies) {
            System.out.println(movie); // toString() method is called implicitly
        }

        // Write movies to a new file
        Files.write(outputFilePath, movies);
    }
}
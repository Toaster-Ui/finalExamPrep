package compareTo;

import java.util.ArrayList;
import java.util.Collections;

public class MovieDriver {

	public static void main(String[] args) {
        // Create Movie objects
        Movie m1 = new Movie("Inception", "Christopher Nolan", 148, 8.8);
        Movie m2 = new Movie("Interstellar", "Christopher Nolan", 169, 8.6);
        Movie m3 = new Movie("The Dark Knight", "Christopher Nolan", 152, 9.0);

        // Add to a list
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);

        // Sort using compareTo (by rating)
        Collections.sort(movies);

        // Print sorted movies
        for (Movie m : movies) {
            System.out.println(m);
        }
    }

}

package compareTo;

public class Movie implements Comparable<Movie> {
    private String title;
    private String director;
    private int length;     // in minutes
    private double rating;  // out of 10

    public Movie(String title, String director, int length, double rating) {
        this.title = title;
        this.director = director;
        this.length = length;
        this.rating = rating;
    }

    @Override
    public int compareTo(Movie other) {
        // Compare by rating (higher rating = greater movie)
        return Double.compare(this.rating, other.rating);
    }

    // Optional: toString for easy printing
    public String toString() {
        return title + " (" + director + ") - " + length + "min, Rating: " + rating;
    }
    
    
    public static void main(String[] args) {
    	
    }
}

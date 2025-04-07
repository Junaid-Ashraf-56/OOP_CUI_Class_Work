package OOP_CUI_Class_Work.src.Lab7.Task;

// Base class: Movie
class Movie {
    private final String mpaaRating;  // MPAA Rating (G, PG, PG-13, R)
    private final int idNumber;
    private final String movieTitle;

    // Constructor
    public Movie(String mpaaRating, int idNumber, String movieTitle) {
        this.mpaaRating = mpaaRating;
        this.idNumber = idNumber;
        this.movieTitle = movieTitle;
    }

    // Getters
    public String getMpaaRating() { return mpaaRating; }
    public int getIdNumber() { return idNumber; }
    public String getMovieTitle() { return movieTitle; }

    // Overriding equals method to compare movies by ID
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Movie movie = (Movie) obj;
        return idNumber == movie.idNumber;
    }

    // Method to calculate late fees (Default: $2/day)
    public double calcLateFees(int daysLate) {
        return 2.0 * daysLate;
    }

    // Display Movie Information
    public void display() {
        System.out.println(" Movie: " + movieTitle + "  ID: " + getIdNumber() + "  Rating: " + getMpaaRating());
    }
}

// Derived class: Action
class Action extends Movie {
    public Action(String mpaaRating, int idNumber, String movieTitle) {
        super(mpaaRating, idNumber, movieTitle);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return 3.0 * daysLate; // $3 per day
    }
}

// Derived class: Comedy
class Comedy extends Movie {
    public Comedy(String mpaaRating, int idNumber, String movieTitle) {
        super(mpaaRating, idNumber, movieTitle);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return 2.50 * daysLate; // $2.50 per day
    }
}

// Derived class: Drama
class Drama extends Movie {
    public Drama(String mpaaRating, int idNumber, String movieTitle) {
        super(mpaaRating, idNumber, movieTitle);
    }

    @Override
    public double calcLateFees(int daysLate) {
        return 2.0 * daysLate; // $2 per day
    }
}

// Main class
public class Task1 {
    public static void main(String[] args) {
        // Creating movie objects
        Action actionMovie = new Action("PG-13", 101, "Mad Max: Fury Road");
        Comedy comedyMovie = new Comedy("PG", 102, "The Mask");
        Drama dramaMovie = new Drama("R", 103, "The Shawshank Redemption");

        // Displaying movie details
        actionMovie.display();
        comedyMovie.display();
        dramaMovie.display();

        // Calculating late fees
        System.out.println("\n Late Fees:");
        System.out.println(actionMovie.getMovieTitle() + "  $" + actionMovie.calcLateFees(5));
        System.out.println(comedyMovie.getMovieTitle() + " $" + comedyMovie.calcLateFees(6));
        System.out.println(dramaMovie.getMovieTitle() + "  $" + dramaMovie.calcLateFees(8));

        // Comparing movies
        System.out.println("\n Comparing Movies:");
        System.out.println("Is " + actionMovie.getMovieTitle() + " same as " + comedyMovie.getMovieTitle() + "? " + actionMovie.equals(comedyMovie));
        System.out.println("Is " + comedyMovie.getMovieTitle() + " same as " + comedyMovie.getMovieTitle() + "? " + comedyMovie.equals(comedyMovie));
    }
}

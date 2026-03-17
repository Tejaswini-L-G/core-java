
class Movie {

    int movieId;
    String title;
    String director;
    String genre;
    int releaseYear;
	
	 public Movie() {}

    public Movie(int movieId, String title, String director, String genre, int releaseYear) {
        this.movieId = movieId;
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public void getMovieDetails(){

        System.out.println("Movie Id: " + this.movieId);
        System.out.println("Title: " + this.title);
        System.out.println("Director: " + this.director);
        System.out.println("Genre: " + this.genre);
        System.out.println("Release Year: " + this.releaseYear);
    }
}

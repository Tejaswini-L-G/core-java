
class Movie {

    int movieId;
    String title;
    String director;
    String genre;
    int releaseYear;

    public void getMovieDetails(){

        System.out.println("Movie Id: " + this.movieId);
        System.out.println("Title: " + this.title);
        System.out.println("Director: " + this.director);
        System.out.println("Genre: " + this.genre);
        System.out.println("Release Year: " + this.releaseYear);
    }
}

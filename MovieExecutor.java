class MovieExecutor {

    public static void main(String[] args) {

        boolean movieValid;

        System.out.println("Scenario 1");
        movieValid = Movie.createMovie(
                "KGF", "Yash", "Srinidhi",
                "Prashanth Neel", "Kannada", 155, 2018);
        if (movieValid) Movie.getMovieDetails();

        System.out.println("\nScenario 2");
        movieValid = Movie.createMovie(
                "", "Yash", "Srinidhi",
                "Prashanth Neel", "Kannada", 155, 2018);
        if (movieValid) Movie.getMovieDetails();

        System.out.println("\nScenario 3");
        movieValid = Movie.createMovie(
                "Bahubali", "", "Anushka",
                "Rajamouli", "Telugu", 160, 2015);
        if (movieValid) Movie.getMovieDetails();

        System.out.println("\nScenario 4");
        movieValid = Movie.createMovie(
                "RRR", "NTR", "",
                "Rajamouli", "Telugu", 180, 2022);
        if (movieValid) Movie.getMovieDetails();

        System.out.println("\nScenario 5");
        movieValid = Movie.createMovie(
                "Leo", "Vijay", "Trisha",
                "", "Tamil", 160, 2023);
        if (movieValid) Movie.getMovieDetails();

        System.out.println("\nScenario 6");
        movieValid = Movie.createMovie(
                "Jawan", "SRK", "Nayanthara",
                "Atlee", "", 165, 2023);
        if (movieValid) Movie.getMovieDetails();

        System.out.println("\nScenario 7");
        movieValid = Movie.createMovie(
                "Dangal", "Aamir", "Fatima",
                "Nitesh Tiwari", "Hindi", 0, 2016);
        if (movieValid) Movie.getMovieDetails();

        System.out.println("\nScenario 8");
        movieValid = Movie.createMovie(
                "Pathaan", "SRK", "Deepika",
                "Siddharth Anand", "Hindi", 146, 2023);
        if (movieValid) Movie.getMovieDetails();
    }
}
class Movie {

    static String movieTitle;
    static String heroName;
    static String heroineName;
    static String directorName;
    static String language;
    static int durationMinutes;
    static int releaseYear;

    public static boolean createMovie(String title,
                                      String hero,
                                      String heroine,
                                      String director,
                                      String movieLanguage,
                                      int duration,
                                      int year) {

        boolean isMovieCreated = false;

        boolean isTitleValid = false;
        boolean isHeroValid = false;
        boolean isHeroineValid = false;
        boolean isDirectorValid = false;
        boolean isLanguageValid = false;
        boolean isDurationValid = false;
        boolean isYearValid = false;

        if (title != null && !title.isEmpty()) {
            movieTitle = title;
            isTitleValid = true;
        } else System.out.println("Movie title required");

        if (hero != null && !hero.isEmpty()) {
            heroName = hero;
            isHeroValid = true;
        } else System.out.println("Hero name required");

        if (heroine != null && !heroine.isEmpty()) {
            heroineName = heroine;
            isHeroineValid = true;
        } else System.out.println("Heroine name required");

        if (director != null && !director.isEmpty()) {
            directorName = director;
            isDirectorValid = true;
        } else System.out.println("Director name required");

        if (movieLanguage != null && !movieLanguage.isEmpty()) {
            language = movieLanguage;
            isLanguageValid = true;
        } else System.out.println("Language required");

        if (duration > 0) {
            durationMinutes = duration;
            isDurationValid = true;
        } else System.out.println("Invalid duration");

        if (year > 1900) {
            releaseYear = year;
            isYearValid = true;
        } else System.out.println("Invalid year");

        if (isTitleValid && isHeroValid && isHeroineValid &&
            isDirectorValid && isLanguageValid &&
            isDurationValid && isYearValid) {
            isMovieCreated = true;
        } else System.out.println("Movie not created");

        return isMovieCreated;
    }

    public static void getMovieDetails() {

        System.out.println("Movie Title : " + movieTitle);
        System.out.println("Hero : " + heroName);
        System.out.println("Heroine : " + heroineName);
        System.out.println("Director : " + directorName);
        System.out.println("Language : " + language);
        System.out.println("Duration : " + durationMinutes);
        System.out.println("Release Year : " + releaseYear);
    }
}
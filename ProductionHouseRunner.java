class ProductionHouseRunner {

    public static void main(String[] args) {
		
		 Movie m = new Movie(1, "Inception", "Nolan", "SciFi", 2010);
        ProductionHouse p = new ProductionHouse(101, "Warner Bros", "Hollywood", 1923, "Founders", m);
        p.getProductionDetails();

        ProductionHouse ph1 = new ProductionHouse();
        Movie movie1 = new Movie();

        ph1.companyId = 100;
        ph1.companyName = "Universal Pictures";
        ph1.headquarters = "Hollywood";
        ph1.establishedYear = 1912;
        ph1.founder = "Carl Laemmle";

        movie1.movieId = 3001;
        movie1.title = "Inception";
        movie1.director = "Christopher Nolan";
        movie1.genre = "SciFi";
        movie1.releaseYear = 2010;

        ph1.movie = movie1;
        ph1.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph2 = new ProductionHouse();
        Movie movie2 = new Movie();

        ph2.companyId = 100;
        ph2.companyName = "Universal Pictures";
        ph2.headquarters = "Hollywood";
        ph2.establishedYear = 1912;
        ph2.founder = "Carl Laemmle";

        movie2.movieId = 3002;
        movie2.title = "Titanic";
        movie2.director = "James Cameron";
        movie2.genre = "Romance";
        movie2.releaseYear = 1997;

        ph2.movie = movie2;
        ph2.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph3 = new ProductionHouse();
        Movie movie3 = new Movie();

        ph3.companyId = 100;
        ph3.companyName = "Universal Pictures";
        ph3.headquarters = "Hollywood";
        ph3.establishedYear = 1912;
        ph3.founder = "Carl Laemmle";

        movie3.movieId = 3003;
        movie3.title = "Avatar";
        movie3.director = "James Cameron";
        movie3.genre = "SciFi";
        movie3.releaseYear = 2009;

        ph3.movie = movie3;
        ph3.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph4 = new ProductionHouse();
        Movie movie4 = new Movie();

        ph4.companyId = 100;
        ph4.companyName = "Universal Pictures";
        ph4.headquarters = "Hollywood";
        ph4.establishedYear = 1912;
        ph4.founder = "Carl Laemmle";

        movie4.movieId = 3004;
        movie4.title = "Interstellar";
        movie4.director = "Christopher Nolan";
        movie4.genre = "SciFi";
        movie4.releaseYear = 2014;

        ph4.movie = movie4;
        ph4.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph5 = new ProductionHouse();
        Movie movie5 = new Movie();

        ph5.companyId = 100;
        ph5.companyName = "Universal Pictures";
        ph5.headquarters = "Hollywood";
        ph5.establishedYear = 1912;
        ph5.founder = "Carl Laemmle";

        movie5.movieId = 3005;
        movie5.title = "The Dark Knight";
        movie5.director = "Christopher Nolan";
        movie5.genre = "Action";
        movie5.releaseYear = 2008;

        ph5.movie = movie5;
        ph5.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph6 = new ProductionHouse();
        Movie movie6 = new Movie();

        ph6.companyId = 100;
        ph6.companyName = "Universal Pictures";
        ph6.headquarters = "Hollywood";
        ph6.establishedYear = 1912;
        ph6.founder = "Carl Laemmle";

        movie6.movieId = 3006;
        movie6.title = "Jaws";
        movie6.director = "Steven Spielberg";
        movie6.genre = "Thriller";
        movie6.releaseYear = 1975;

        ph6.movie = movie6;
        ph6.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph7 = new ProductionHouse();
        Movie movie7 = new Movie();

        ph7.companyId = 100;
        ph7.companyName = "Universal Pictures";
        ph7.headquarters = "Hollywood";
        ph7.establishedYear = 1912;
        ph7.founder = "Carl Laemmle";

        movie7.movieId = 3007;
        movie7.title = "Jurassic Park";
        movie7.director = "Steven Spielberg";
        movie7.genre = "Adventure";
        movie7.releaseYear = 1993;

        ph7.movie = movie7;
        ph7.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph8 = new ProductionHouse();
        Movie movie8 = new Movie();

        ph8.companyId = 100;
        ph8.companyName = "Universal Pictures";
        ph8.headquarters = "Hollywood";
        ph8.establishedYear = 1912;
        ph8.founder = "Carl Laemmle";

        movie8.movieId = 3008;
        movie8.title = "The Godfather";
        movie8.director = "Francis Ford Coppola";
        movie8.genre = "Crime";
        movie8.releaseYear = 1972;

        ph8.movie = movie8;
        ph8.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph9 = new ProductionHouse();
        Movie movie9 = new Movie();

        ph9.companyId = 100;
        ph9.companyName = "Universal Pictures";
        ph9.headquarters = "Hollywood";
        ph9.establishedYear = 1912;
        ph9.founder = "Carl Laemmle";

        movie9.movieId = 3009;
        movie9.title = "The Matrix";
        movie9.director = "Wachowski";
        movie9.genre = "SciFi";
        movie9.releaseYear = 1999;

        ph9.movie = movie9;
        ph9.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph10 = new ProductionHouse();
        Movie movie10 = new Movie();

        ph10.companyId = 100;
        ph10.companyName = "Universal Pictures";
        ph10.headquarters = "Hollywood";
        ph10.establishedYear = 1912;
        ph10.founder = "Carl Laemmle";

        movie10.movieId = 3010;
        movie10.title = "Gladiator";
        movie10.director = "Ridley Scott";
        movie10.genre = "Action";
        movie10.releaseYear = 2000;

        ph10.movie = movie10;
        ph10.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph11 = new ProductionHouse();
        Movie movie11 = new Movie();

        ph11.companyId = 100;
        ph11.companyName = "Universal Pictures";
        ph11.headquarters = "Hollywood";
        ph11.establishedYear = 1912;
        ph11.founder = "Carl Laemmle";

        movie11.movieId = 3011;
        movie11.title = "The Lion King";
        movie11.director = "Roger Allers";
        movie11.genre = "Animation";
        movie11.releaseYear = 1994;

        ph11.movie = movie11;
        ph11.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph12 = new ProductionHouse();
        Movie movie12 = new Movie();

        ph12.companyId = 100;
        ph12.companyName = "Universal Pictures";
        ph12.headquarters = "Hollywood";
        ph12.establishedYear = 1912;
        ph12.founder = "Carl Laemmle";

        movie12.movieId = 3012;
        movie12.title = "Frozen";
        movie12.director = "Chris Buck";
        movie12.genre = "Animation";
        movie12.releaseYear = 2013;

        ph12.movie = movie12;
        ph12.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph13 = new ProductionHouse();
        Movie movie13 = new Movie();

        ph13.companyId = 100;
        ph13.companyName = "Universal Pictures";
        ph13.headquarters = "Hollywood";
        ph13.establishedYear = 1912;
        ph13.founder = "Carl Laemmle";

        movie13.movieId = 3013;
        movie13.title = "Avengers";
        movie13.director = "Joss Whedon";
        movie13.genre = "Action";
        movie13.releaseYear = 2012;

        ph13.movie = movie13;
        ph13.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph14 = new ProductionHouse();
        Movie movie14 = new Movie();

        ph14.companyId = 100;
        ph14.companyName = "Universal Pictures";
        ph14.headquarters = "Hollywood";
        ph14.establishedYear = 1912;
        ph14.founder = "Carl Laemmle";

        movie14.movieId = 3014;
        movie14.title = "Iron Man";
        movie14.director = "Jon Favreau";
        movie14.genre = "Action";
        movie14.releaseYear = 2008;

        ph14.movie = movie14;
        ph14.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph15 = new ProductionHouse();
        Movie movie15 = new Movie();

        ph15.companyId = 100;
        ph15.companyName = "Universal Pictures";
        ph15.headquarters = "Hollywood";
        ph15.establishedYear = 1912;
        ph15.founder = "Carl Laemmle";

        movie15.movieId = 3015;
        movie15.title = "Black Panther";
        movie15.director = "Ryan Coogler";
        movie15.genre = "Action";
        movie15.releaseYear = 2018;

        ph15.movie = movie15;
        ph15.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph16 = new ProductionHouse();
        Movie movie16 = new Movie();

        ph16.companyId = 100;
        ph16.companyName = "Universal Pictures";
        ph16.headquarters = "Hollywood";
        ph16.establishedYear = 1912;
        ph16.founder = "Carl Laemmle";

        movie16.movieId = 3016;
        movie16.title = "Dune";
        movie16.director = "Denis Villeneuve";
        movie16.genre = "SciFi";
        movie16.releaseYear = 2021;

        ph16.movie = movie16;
        ph16.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph17 = new ProductionHouse();
        Movie movie17 = new Movie();

        ph17.companyId = 100;
        ph17.companyName = "Universal Pictures";
        ph17.headquarters = "Hollywood";
        ph17.establishedYear = 1912;
        ph17.founder = "Carl Laemmle";

        movie17.movieId = 3017;
        movie17.title = "Tenet";
        movie17.director = "Christopher Nolan";
        movie17.genre = "SciFi";
        movie17.releaseYear = 2020;

        ph17.movie = movie17;
        ph17.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph18 = new ProductionHouse();
        Movie movie18 = new Movie();

        ph18.companyId = 100;
        ph18.companyName = "Universal Pictures";
        ph18.headquarters = "Hollywood";
        ph18.establishedYear = 1912;
        ph18.founder = "Carl Laemmle";

        movie18.movieId = 3018;
        movie18.title = "Gravity";
        movie18.director = "Alfonso Cuaron";
        movie18.genre = "SciFi";
        movie18.releaseYear = 2013;

        ph18.movie = movie18;
        ph18.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph19 = new ProductionHouse();
        Movie movie19 = new Movie();

        ph19.companyId = 100;
        ph19.companyName = "Universal Pictures";
        ph19.headquarters = "Hollywood";
        ph19.establishedYear = 1912;
        ph19.founder = "Carl Laemmle";

        movie19.movieId = 3019;
        movie19.title = "The Batman";
        movie19.director = "Matt Reeves";
        movie19.genre = "Action";
        movie19.releaseYear = 2022;

        ph19.movie = movie19;
        ph19.getProductionHouseDetails();

        System.out.println("------------------------");

        ProductionHouse ph20 = new ProductionHouse();
        Movie movie20 = new Movie();

        ph20.companyId = 100;
        ph20.companyName = "Universal Pictures";
        ph20.headquarters = "Hollywood";
        ph20.establishedYear = 1912;
        ph20.founder = "Carl Laemmle";

        movie20.movieId = 3020;
        movie20.title = "Oppenheimer";
        movie20.director = "Christopher Nolan";
        movie20.genre = "Biography";
        movie20.releaseYear = 2023;

        ph20.movie = movie20;
        ph20.getProductionHouseDetails();

        System.out.println("------------------------");
    }
}
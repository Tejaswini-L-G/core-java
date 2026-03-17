
class ProductionHouse {

    int companyId;
    String companyName;
    String headquarters;
    int establishedYear;
    String founder;

    Movie movie;
	
	public ProductionHouse() {}

    public ProductionHouse(int companyId, String companyName, String headquarters, int foundedYear, String founder, Movie movie) {
        this.companyId = companyId;
        this.companyName = companyName;
        this.headquarters = headquarters;
        this.foundedYear = foundedYear;
        this.founder = founder;
        this.movie = movie;
    }


    public void getProductionHouseDetails(){

        System.out.println("Company Id: " + this.companyId);
        System.out.println("Company Name: " + this.companyName);
        System.out.println("Headquarters: " + this.headquarters);
        System.out.println("Established Year: " + this.establishedYear);
        System.out.println("Founder: " + this.founder);

        this.movie.getMovieDetails();
    }
}

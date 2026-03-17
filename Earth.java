
class Earth {

    int earthId;
    String continent;
    String country;
    long population;
    String climate;
	
	 public Earth() {}

    public Earth(int earthId, String continent, String country, long population, String climate) {
        this.earthId = earthId;
        this.continent = continent;
        this.country = country;
        this.population = population;
        this.climate = climate;
    }

    public void getEarthDetails(){

        System.out.println("Earth Id: " + this.earthId);
        System.out.println("Continent: " + this.continent);
        System.out.println("Country: " + this.country);
        System.out.println("Population: " + this.population);
        System.out.println("Climate: " + this.climate);
    }
}

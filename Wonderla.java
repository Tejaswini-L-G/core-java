
class Wonderla {

    int parkId;
    String parkLocation;
    String parkCity;
    int totalRides;
    String openingYear;

    LazyPool lazyPool;
	
	public Wonderla() {}

    public Wonderla(int parkId, String parkLocation, String parkCity, int totalRides, String openingYear, LazyPool lazyPool) {
        this.parkId = parkId;
        this.parkLocation = parkLocation;
        this.parkCity = parkCity;
        this.totalRides = totalRides;
        this.openingYear = openingYear;
        this.lazyPool = lazyPool;
    }

    public void getWonderlaDetails(){

        System.out.println("Park Id: " + this.parkId);
        System.out.println("Location: " + this.parkLocation);
        System.out.println("City: " + this.parkCity);
        System.out.println("Total Rides: " + this.totalRides);
        System.out.println("Opening Year: " + this.openingYear);

        this.lazyPool.getLazyPoolDetails();
    }
}

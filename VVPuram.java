
class VVPuram {

    int streetId;
    String streetName;
    String city;
    int establishedYear;
    String famousFor;

    FoodStreet foodStreet;
	
	 public VVPuram() {}

    public VVPuram(int streetId, String streetName, String city, int establishedYear, String famousFor, FoodStreet foodStreet) {
        this.streetId = streetId;
        this.streetName = streetName;
        this.city = city;
        this.establishedYear = establishedYear;
        this.famousFor = famousFor;
        this.foodStreet = foodStreet;
    }

    public void getStreetDetails(){

        System.out.println("Street Id: " + this.streetId);
        System.out.println("Street Name: " + this.streetName);
        System.out.println("City: " + this.city);
        System.out.println("Established Year: " + this.establishedYear);
        System.out.println("Famous For: " + this.famousFor);

        this.foodStreet.getFoodDetails();
    }
}

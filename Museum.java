
class Museum {

    int museumId;
    String museumName;
    String city;
    int establishedYear;
    String curator;

    Diamond diamond;
	
	 public Museum() {}

    public Museum(int museumId, String museumName, String city, int establishedYear, String curator, Diamond diamond) {
        this.museumId = museumId;
        this.museumName = museumName;
        this.city = city;
        this.establishedYear = establishedYear;
        this.curator = curator;
        this.diamond = diamond;
    }

    public void getMuseumDetails(){

        System.out.println("Museum Id: " + this.museumId);
        System.out.println("Museum Name: " + this.museumName);
        System.out.println("City: " + this.city);
        System.out.println("Established Year: " + this.establishedYear);
        System.out.println("Curator: " + this.curator);

        this.diamond.getDiamondDetails();
    }
}

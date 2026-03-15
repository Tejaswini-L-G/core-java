
class Museum {

    int museumId;
    String museumName;
    String city;
    int establishedYear;
    String curator;

    Diamond diamond;

    public void getMuseumDetails(){

        System.out.println("Museum Id: " + this.museumId);
        System.out.println("Museum Name: " + this.museumName);
        System.out.println("City: " + this.city);
        System.out.println("Established Year: " + this.establishedYear);
        System.out.println("Curator: " + this.curator);

        this.diamond.getDiamondDetails();
    }
}

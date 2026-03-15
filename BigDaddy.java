
class BigDaddy {

    int shipId;
    String casinoName;
    String location;
    int establishedYear;
    String owner;

    Casino casino;

    public void getBigDaddyDetails(){

        System.out.println("Ship Id: " + this.shipId);
        System.out.println("Casino Name: " + this.casinoName);
        System.out.println("Location: " + this.location);
        System.out.println("Established Year: " + this.establishedYear);
        System.out.println("Owner: " + this.owner);

        this.casino.getCasinoDetails();
    }
}

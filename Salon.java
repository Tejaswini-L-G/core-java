
class Salon {

    int salonId;
    String salonName;
    String location;
    int establishedYear;
    String owner;

    Service service;

    public void getSalonDetails(){

        System.out.println("Salon Id: " + this.salonId);
        System.out.println("Salon Name: " + this.salonName);
        System.out.println("Location: " + this.location);
        System.out.println("Established Year: " + this.establishedYear);
        System.out.println("Owner: " + this.owner);

        this.service.getServiceDetails();
    }
}

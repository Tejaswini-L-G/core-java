
class Salon {

    int salonId;
    String salonName;
    String location;
    int establishedYear;
    String owner;

    Service service;
	 public Salon() {}

    public Salon(int salonId, String salonName, String location, int establishedYear, String owner, Service service) {
        this.salonId = salonId;
        this.salonName = salonName;
        this.location = location;
        this.establishedYear = establishedYear;
        this.owner = owner;
        this.service = service;
    }

    public void getSalonDetails(){

        System.out.println("Salon Id: " + this.salonId);
        System.out.println("Salon Name: " + this.salonName);
        System.out.println("Location: " + this.location);
        System.out.println("Established Year: " + this.establishedYear);
        System.out.println("Owner: " + this.owner);

        this.service.getServiceDetails();
    }
}

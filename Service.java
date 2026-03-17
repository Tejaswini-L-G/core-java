
class Service {

    int serviceId;
    String serviceName;
    double price;
    int durationMinutes;
    String specialist;
	
	public Service() {}

    public Service(int serviceId, String serviceName, double price, int durationMinutes, String specialist) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.price = price;
        this.durationMinutes = durationMinutes;
        this.specialist = specialist;
    }

    public void getServiceDetails(){

        System.out.println("Service Id: " + this.serviceId);
        System.out.println("Service Name: " + this.serviceName);
        System.out.println("Price: " + this.price);
        System.out.println("Duration: " + this.durationMinutes);
        System.out.println("Specialist: " + this.specialist);
    }
}

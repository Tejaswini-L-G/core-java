
class Package {

    int packageId;
    String destination;
    int days;
    double price;
    String transport;

    public void getPackageDetails(){

        System.out.println("Package Id: " + this.packageId);
        System.out.println("Destination: " + this.destination);
        System.out.println("Days: " + this.days);
        System.out.println("Price: " + this.price);
        System.out.println("Transport: " + this.transport);
    }
}

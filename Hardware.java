
class Hardware {

    int hardwareId;
    String type;
    String manufacturer;
    int warrantyYears;
    String model;

    public void getHardwareDetails(){

        System.out.println("Hardware Id: " + this.hardwareId);
        System.out.println("Type: " + this.type);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Warranty Years: " + this.warrantyYears);
        System.out.println("Model: " + this.model);
    }
}

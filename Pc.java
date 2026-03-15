
class Pc {

    int pcId;
    String brand;
    String processor;
    int ram;
    int storage;

    Hardware hardware;

    public void getPcDetails(){

        System.out.println("Pc Id: " + this.pcId);
        System.out.println("Brand: " + this.brand);
        System.out.println("Processor: " + this.processor);
        System.out.println("RAM: " + this.ram);
        System.out.println("Storage: " + this.storage);

        this.hardware.getHardwareDetails();
    }
}

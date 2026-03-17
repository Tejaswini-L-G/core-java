
class Pc {

    int pcId;
    String brand;
    String processor;
    int ram;
    int storage;

    Hardware hardware;
	
	public Pc() {}

    public Pc(int pcId, String brand, String processor, int ram, int storage, Hardware hardware) {
        this.pcId = pcId;
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.hardware = hardware;
    }


    public void getPcDetails(){

        System.out.println("Pc Id: " + this.pcId);
        System.out.println("Brand: " + this.brand);
        System.out.println("Processor: " + this.processor);
        System.out.println("RAM: " + this.ram);
        System.out.println("Storage: " + this.storage);

        this.hardware.getHardwareDetails();
    }
}

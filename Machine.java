
class Machine {

    int machineId;
    String machineName;
    String function;
    String manufacturer;
    int capacity;
	
	public Machine() {}

    public Machine(int machineId, String machineName, String function, String manufacturer, int capacity) {
        this.machineId = machineId;
        this.machineName = machineName;
        this.function = function;
        this.manufacturer = manufacturer;
        this.capacity = capacity;
    }

    public void getMachineDetails(){

        System.out.println("Machine Id: " + this.machineId);
        System.out.println("Machine Name: " + this.machineName);
        System.out.println("Function: " + this.function);
        System.out.println("Manufacturer: " + this.manufacturer);
        System.out.println("Capacity: " + this.capacity);
    }
}

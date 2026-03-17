
class Factory {

    int factoryId;
    String factoryName;
    String location;
    int establishedYear;
    String industryType;

    Machine machine;
	
	 public Factory() {}

    public Factory(int factoryId, String factoryName, String location, int establishedYear, String industryType, Machine machine) {
        this.factoryId = factoryId;
        this.factoryName = factoryName;
        this.location = location;
        this.establishedYear = establishedYear;
        this.industryType = industryType;
        this.machine = machine;
    }


    public void getFactoryDetails(){

        System.out.println("Factory Id: " + this.factoryId);
        System.out.println("Factory Name: " + this.factoryName);
        System.out.println("Location: " + this.location);
        System.out.println("Established Year: " + this.establishedYear);
        System.out.println("Industry Type: " + this.industryType);

        this.machine.getMachineDetails();
    }
}

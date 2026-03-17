class Train {

    int trainId;
    String trainName;
    String source;
    String destination;
    int totalCoaches;

    Boggy boggy;
	
	
	
	 // Default constructor
    public Train() {
    }

    // Parameterized constructor
    public Train(int trainId, String trainName, String source, String destination, int totalCoaches, Boggy boggy) {

        this.trainId = trainId;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.totalCoaches = totalCoaches;
        this.boggy = boggy;

    }

    public void getTrainDetails(){

        System.out.println("Train Id: " + this.trainId);
        System.out.println("Train Name: " + this.trainName);
        System.out.println("Source: " + this.source);
        System.out.println("Destination: " + this.destination);
        System.out.println("Total Coaches: " + this.totalCoaches);

        this.boggy.getBoggyDetails();

    }

}
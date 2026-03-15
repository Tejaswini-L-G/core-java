class Train {

    int trainId;
    String trainName;
    String source;
    String destination;
    int totalCoaches;

    Boggy boggy;

    public void getTrainDetails(){

        System.out.println("Train Id: " + this.trainId);
        System.out.println("Train Name: " + this.trainName);
        System.out.println("Source: " + this.source);
        System.out.println("Destination: " + this.destination);
        System.out.println("Total Coaches: " + this.totalCoaches);

        this.boggy.getBoggyDetails();

    }

}
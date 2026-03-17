class Boggy {

    int boggyId;
    String boggyType;
    int seatCount;
    String boggyColor;
    String boggyClass;
	
	
	
	 // Default constructor
    public Boggy() {
    }

    // Parameterized constructor
    public Boggy(int boggyId, String boggyType, int seatCount, String boggyColor, String boggyClass) {

        this.boggyId = boggyId;
        this.boggyType = boggyType;
        this.seatCount = seatCount;
        this.coachColor = boggyColor;
        this.coachClass = boggyClass;

    }

    public void getBoggyDetails(){

        System.out.println("Boggy Id: " + this.boggyId);
        System.out.println("Boggy Type: " + this.boggyType);
        System.out.println("Seat Count: " + this.seatCount);
        System.out.println("Boggy Color: " + this.boggyColor);
        System.out.println("Boggy Class: " + this.boggyClass);

    }

}
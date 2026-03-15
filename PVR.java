class PVR{

int theatreId;
String theatreName;
String location;
String city;
String screenType;
int screenCount;
int seatCapacity;
String movieGenre;
String showTiming;
double ticketPrice;
String soundSystem;
String projectionType;
String foodCourt;
String parking;
String bookingPlatform;
String manager;
String ownerCompany;
String status;
String description;
int rating;

public PVR(int theatreId,String theatreName,String location,String city,String screenType,int screenCount,int seatCapacity,String movieGenre,String showTiming,double ticketPrice,String soundSystem,String projectionType,String foodCourt,String parking,String bookingPlatform,String manager,String ownerCompany,String status,String description,int rating){

this.theatreId=theatreId;
this.theatreName=theatreName;
this.location=location;
this.city=city;
this.screenType=screenType;
this.screenCount=screenCount;
this.seatCapacity=seatCapacity;
this.movieGenre=movieGenre;
this.showTiming=showTiming;
this.ticketPrice=ticketPrice;
this.soundSystem=soundSystem;
this.projectionType=projectionType;
this.foodCourt=foodCourt;
this.parking=parking;
this.bookingPlatform=bookingPlatform;
this.manager=manager;
this.ownerCompany=ownerCompany;
this.status=status;
this.description=description;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The theatre id is "+this.theatreId);
System.out.println("The theatre name is "+this.theatreName);
System.out.println("The location is "+this.location);
System.out.println("The city is "+this.city);
System.out.println("The screen type is "+this.screenType);
System.out.println("The screen count is "+this.screenCount);
System.out.println("The seat capacity is "+this.seatCapacity);
System.out.println("The movie genre is "+this.movieGenre);
System.out.println("The show timing is "+this.showTiming);
System.out.println("The ticket price is "+this.ticketPrice);
System.out.println("The sound system is "+this.soundSystem);
System.out.println("The projection type is "+this.projectionType);
System.out.println("The food court is "+this.foodCourt);
System.out.println("The parking availability is "+this.parking);
System.out.println("The booking platform is "+this.bookingPlatform);
System.out.println("The manager is "+this.manager);
System.out.println("The owner company is "+this.ownerCompany);
System.out.println("The status is "+this.status);
System.out.println("The description is "+this.description);
System.out.println("The rating is "+this.rating);

}

}
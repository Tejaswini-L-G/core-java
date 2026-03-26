class TravelAgencyRunner{
 public static void main(String[] args){
  TravelAgency manager=new TravelAgency();
  manager.addPlaces("Paris");
  manager.addPlaces("London");
  manager.addPlaces("Maldives");
  manager.addPlaces("Bali");
  manager.addPlaces("Dubai");
  manager.addPlaces("Singapore");
  manager.addPlaces("Thailand");
  manager.addPlaces("Switzerland");
  manager.addPlaces("New York");
  manager.addPlaces("Tokyo");
  manager.addPlaces("Sydney");
  manager.addPlaces("Rome");
  manager.addPlaces("Barcelona");
  manager.addPlaces("Istanbul");
  manager.addPlaces("Bangkok");
  manager.addPlaces("Amsterdam");
  manager.addPlaces("Venice");
  manager.getPlaces();
  
  int index=0;
System.out.println("The place at position "+index+" is "+ travelAgency.getPlacesByIndex(index));

String name="Paris";
int result = travelAgency.getIndexByPlaces(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}
 }
}

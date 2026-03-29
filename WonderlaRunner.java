class WonderlaRunner{
 public static void main(String[] args){
  Wonderla manager=new Wonderla();
  manager.addWatergames("Wave Pool");
  manager.addWatergames("Rain Disco");
  manager.addWatergames("Lazy River");
  manager.addWatergames("Boomerang Ride");
  manager.addWatergames("Harakiri Slide");
  manager.addWatergames("Water Pendulum");
  manager.addWatergames("Play Pool");
  manager.addWatergames("Kids Pool");
  manager.addWatergames("Drop Loop");
  manager.addWatergames("Wave Rider");
  manager.addWatergames("Splash Tower");
  manager.addWatergames("Cyclone Ride");
  manager.addWatergames("Thunder Falls");
  manager.addWatergames("Rapid River");
  manager.addWatergames("Aqua Loop");
  manager.addWatergames("Twister Ride");
  manager.addWatergames("Family Slide");
  manager.addWatergames("Fun Pool");
  manager.addWatergames("Water Coaster");
  manager.addWatergames("Aqua Dance");
  manager.addWatergames("Pirate Ship");
  manager.addWatergames("Mini Slides");
  manager.getWatergames();
  
  int index=0;
System.out.println("The game at position "+index+" is "+ wonderla.getWaterGamesByIndex(index));

String name="Wave Pool";
int result = wonderla.getIndexByWaterGames(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}

System.out.println("--------------------------");
boolean isUpdated = wonderla.updateWaterGames("Wave Pool","Mega Wave Pool");
System.out.println("The updation is " + isUpdated);
wonderla.getWaterGames();

System.out.println("--------------------------");
boolean isDeleted = wonderla.deleteWaterGames("Wave Pool");
System.out.println("The deletion is " + isDeleted);
wonderla.getWaterGames();
 }
}

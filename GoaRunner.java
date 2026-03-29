class GoaRunner{
 public static void main(String[] args){
  Goa manager=new Goa();
  manager.addBeachnames("Baga Beach");
  manager.addBeachnames("Calangute Beach");
  manager.addBeachnames("Anjuna Beach");
  manager.addBeachnames("Vagator Beach");
  manager.addBeachnames("Colva Beach");
  manager.addBeachnames("Palolem Beach");
  manager.addBeachnames("Candolim Beach");
  manager.addBeachnames("Morjim Beach");
  manager.addBeachnames("Arambol Beach");
  manager.addBeachnames("Majorda Beach");
  manager.addBeachnames("Betalbatim Beach");
  manager.addBeachnames("Cavelossim Beach");
  manager.addBeachnames("Agonda Beach");
  manager.addBeachnames("Sinquerim Beach");
  manager.addBeachnames("Miramar Beach");
  manager.addBeachnames("Ashwem Beach");
  manager.addBeachnames("Mandrem Beach");
  manager.addBeachnames("Varca Beach");
  manager.addBeachnames("Benaulim Beach");
  manager.getBeachnames();
  
  int index=0;
System.out.println("The beach at position "+index+" is "+ goa.getBeachNamesByIndex(index));

String name="Baga Beach";
int result = goa.getIndexByBeachNames(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}

System.out.println("--------------------------");
boolean isUpdated = goa.updateBeachNames("Baga Beach","Baga Beach Goa");
System.out.println("The updation is " + isUpdated);
goa.getBeachNames();

System.out.println("--------------------------");
boolean isDeleted = goa.deleteBeachNames("Baga Beach");
System.out.println("The deletion is " + isDeleted);
goa.getBeachNames();
 }
}

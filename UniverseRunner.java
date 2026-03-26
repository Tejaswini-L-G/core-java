class UniverseRunner{
 public static void main(String[] args){
  Universe manager=new Universe();
  manager.addGalaxies("Milky Way");
  manager.addGalaxies("Andromeda");
  manager.addGalaxies("Sombrero");
  manager.addGalaxies("Whirlpool");
  manager.addGalaxies("Pinwheel");
  manager.addGalaxies("Messier 87");
  manager.addGalaxies("Triangulum");
  manager.addGalaxies("Cartwheel");
  manager.addGalaxies("Centaurus A");
  manager.addGalaxies("Black Eye");
  manager.addGalaxies("Sunflower");
  manager.addGalaxies("Comet");
  manager.addGalaxies("Cigar");
  manager.addGalaxies("Large Magellanic Cloud");
  manager.addGalaxies("Small Magellanic Cloud");
  manager.addGalaxies("NGC 1300");
  manager.addGalaxies("NGC 4622");
  manager.getGalaxies();
  
  int index=0;
System.out.println("The galaxy at position "+index+" is "+ universe.getGalaxiesByIndex(index));

String name="Milky Way";
int result = universe.getIndexByGalaxies(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}
 }
}

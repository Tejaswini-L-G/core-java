class ArchitectRunner{
 public static void main(String[] args){
  Architect manager=new Architect();
  manager.addInteriordesignnames("Modern Design");
  manager.addInteriordesignnames("Minimalist Design");
  manager.addInteriordesignnames("Industrial Design");
  manager.addInteriordesignnames("Scandinavian Design");
  manager.addInteriordesignnames("Contemporary Design");
  manager.addInteriordesignnames("Traditional Design");
  manager.addInteriordesignnames("Bohemian Style");
  manager.addInteriordesignnames("Rustic Style");
  manager.addInteriordesignnames("Art Deco");
  manager.addInteriordesignnames("Vintage Style");
  manager.addInteriordesignnames("Luxury Design");
  manager.getInteriordesignnames();
  
  int index=0;
System.out.println("The design at position "+index+" is "+ architect.getInteriorDesignNamesByIndex(index));

String name="Modern Design";
int result = architect.getIndexByInteriorDesignNames(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}

System.out.println("--------------------------");
boolean isUpdated = architect.updateInteriorDesignNames("Modern Design","Luxury Modern Design");
System.out.println("The updation is " + isUpdated);
architect.getInteriorDesignNames();

System.out.println("--------------------------");
boolean isDeleted = architect.deleteInteriorDesignNames("Modern Design");
System.out.println("The deletion is " + isDeleted);
architect.getInteriorDesignNames();
 }
}

class PetShopRunner{
 public static void main(String[] args){
  PetShop manager=new PetShop();
  manager.addPetaccessories("Dog Collar");
  manager.addPetaccessories("Dog Leash");
  manager.addPetaccessories("Cat Toy");
  manager.addPetaccessories("Fish Tank");
  manager.addPetaccessories("Bird Cage");
  manager.addPetaccessories("Pet Bed");
  manager.addPetaccessories("Pet Shampoo");
  manager.addPetaccessories("Pet Food Bowl");
  manager.addPetaccessories("Scratching Post");
  manager.addPetaccessories("Pet Carrier");
  manager.addPetaccessories("Aquarium Filter");
  manager.addPetaccessories("Pet Brush");
  manager.addPetaccessories("Dog Jacket");
  manager.addPetaccessories("Pet Nail Cutter");
  manager.addPetaccessories("Pet Training Pads");
  manager.addPetaccessories("Pet Water Bottle");
  manager.addPetaccessories("Pet Harness");
  manager.addPetaccessories("Pet Blanket");
  manager.addPetaccessories("Pet Comb");
  manager.addPetaccessories("Pet Toys");
  manager.getPetaccessories();
  
  int index=0;
System.out.println("The accessory at position "+index+" is "+ petShop.getPetAccessoriesByIndex(index));

String name="Dog Collar";
int result = petShop.getIndexByPetAccessories(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}
 }
}

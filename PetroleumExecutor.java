class PetroleumExecutor{

  public static void main(String[] args){

      Petroleum ref=new Petroleum();
      ref.addPetroleum("Petrol");
      ref.addPetroleum("Diesel");
      ref.addPetroleum("Kerosene");
      ref.addPetroleum("CNG");
      ref.addPetroleum("LPG");
      ref.addPetroleum("Aviation Fuel");
      ref.addPetroleum("Biofuel");
      ref.addPetroleum("Ethanol");
      ref.addPetroleum("Natural Gas");
      ref.addPetroleum("Crude Oil");

      ref.getPetroleum();

      System.out.println("--------------------------");
      int index=0;
      System.out.println("The value at position "+index+" is "+ ref.getPetroleumByIndex(index));

      System.out.println("--------------------------");
      String name="Kerosene";
      int result=ref.getIndexByPetroleum(name);
      if(result!=0){
          System.out.println("The Position of "+name+" is "+result);
      }

      System.out.println("--------------------------");
      boolean updated=ref.updatePetroleum("Diesel","Updated Diesel");
      System.out.println("The updation is "+updated);
      ref.getPetroleum();

      System.out.println("--------------------------");
      boolean deleted=ref.deletePetroleum("Petrol");
      System.out.println("The deletion is "+deleted);
      ref.getPetroleum();
  }
}

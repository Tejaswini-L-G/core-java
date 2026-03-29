class KettleExecutor{

  public static void main(String[] args){

      Kettle ref=new Kettle();
      ref.addKettle("Electric");
      ref.addKettle("Glass");
      ref.addKettle("Steel");
      ref.addKettle("Travel");
      ref.addKettle("Tea");
      ref.addKettle("Cordless");
      ref.addKettle("Smart");
      ref.addKettle("Mini");
      ref.addKettle("Portable");
      ref.addKettle("Whistling");

      ref.getKettle();

      System.out.println("--------------------------");
      int index=0;
      System.out.println("The value at position "+index+" is "+ ref.getKettleByIndex(index));

      System.out.println("--------------------------");
      String name="Steel";
      int result=ref.getIndexByKettle(name);
      if(result!=0){
          System.out.println("The Position of "+name+" is "+result);
      }

      System.out.println("--------------------------");
      boolean updated=ref.updateKettle("Glass","Updated Glass");
      System.out.println("The updation is "+updated);
      ref.getKettle();

      System.out.println("--------------------------");
      boolean deleted=ref.deleteKettle("Electric");
      System.out.println("The deletion is "+deleted);
      ref.getKettle();
  }
}

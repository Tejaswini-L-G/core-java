class BedExecutor{

  public static void main(String[] args){

      Bed ref=new Bed();
      ref.addBed("King Size");
      ref.addBed("Queen Size");
      ref.addBed("Single");
      ref.addBed("Double");
      ref.addBed("Bunk");
      ref.addBed("Sofa Bed");
      ref.addBed("Platform");
      ref.addBed("Murphy");
      ref.addBed("Canopy");
      ref.addBed("Adjustable");

      ref.getBed();

      System.out.println("--------------------------");
      int index=0;
      System.out.println("The value at position "+index+" is "+ ref.getBedByIndex(index));

      System.out.println("--------------------------");
      String name="Single";
      int result=ref.getIndexByBed(name);
      if(result!=0){
          System.out.println("The Position of "+name+" is "+result);
      }

      System.out.println("--------------------------");
      boolean updated=ref.updateBed("Queen Size","Updated Queen Size");
      System.out.println("The updation is "+updated);
      ref.getBed();

      System.out.println("--------------------------");
      boolean deleted=ref.deleteBed("King Size");
      System.out.println("The deletion is "+deleted);
      ref.getBed();
  }
}

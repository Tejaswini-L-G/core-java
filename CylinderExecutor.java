class CylinderExecutor{

  public static void main(String[] args){

      Cylinder ref=new Cylinder();
      ref.addCylinder("HP Gas");
      ref.addCylinder("Indane");
      ref.addCylinder("Bharat Gas");
      ref.addCylinder("Total Gas");
      ref.addCylinder("Reliance Gas");
      ref.addCylinder("Go Gas");
      ref.addCylinder("Shell Gas");
      ref.addCylinder("Essar Gas");
      ref.addCylinder("Adani Gas");
      ref.addCylinder("ONGC Gas");

      ref.getCylinder();

      System.out.println("--------------------------");
      int index=0;
      System.out.println("The value at position "+index+" is "+ ref.getCylinderByIndex(index));

      System.out.println("--------------------------");
      String name="Bharat Gas";
      int result=ref.getIndexByCylinder(name);
      if(result!=0){
          System.out.println("The Position of "+name+" is "+result);
      }

      System.out.println("--------------------------");
      boolean updated=ref.updateCylinder("Indane","Updated Indane");
      System.out.println("The updation is "+updated);
      ref.getCylinder();

      System.out.println("--------------------------");
      boolean deleted=ref.deleteCylinder("HP Gas");
      System.out.println("The deletion is "+deleted);
      ref.getCylinder();
  }
}

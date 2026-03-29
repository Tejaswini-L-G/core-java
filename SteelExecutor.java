class SteelExecutor{

  public static void main(String[] args){

      Steel ref=new Steel();
      ref.addSteel("Alloy Steel");
      ref.addSteel("Carbon Steel");
      ref.addSteel("Stainless Steel");
      ref.addSteel("Tool Steel");
      ref.addSteel("Mild Steel");
      ref.addSteel("Spring Steel");
      ref.addSteel("Cast Steel");
      ref.addSteel("Forged Steel");
      ref.addSteel("Structural Steel");
      ref.addSteel("High Speed Steel");

      ref.getSteel();

      System.out.println("--------------------------");
      int index=0;
      System.out.println("The value at position "+index+" is "+ ref.getSteelByIndex(index));

      System.out.println("--------------------------");
      String name="Stainless Steel";
      int result=ref.getIndexBySteel(name);
      if(result!=0){
          System.out.println("The Position of "+name+" is "+result);
      }

      System.out.println("--------------------------");
      boolean updated=ref.updateSteel("Carbon Steel","Updated Carbon Steel");
      System.out.println("The updation is "+updated);
      ref.getSteel();

      System.out.println("--------------------------");
      boolean deleted=ref.deleteSteel("Alloy Steel");
      System.out.println("The deletion is "+deleted);
      ref.getSteel();
  }
}

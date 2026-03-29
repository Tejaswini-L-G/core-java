class TurbineExecutor{

  public static void main(String[] args){

      Turbine ref=new Turbine();
      ref.addTurbine("Steam");
      ref.addTurbine("Gas");
      ref.addTurbine("Wind");
      ref.addTurbine("Water");
      ref.addTurbine("Hydraulic");
      ref.addTurbine("Impulse");
      ref.addTurbine("Reaction");
      ref.addTurbine("Francis");
      ref.addTurbine("Kaplan");
      ref.addTurbine("Pelton");

      ref.getTurbine();

      System.out.println("--------------------------");
      int index=0;
      System.out.println("The value at position "+index+" is "+ ref.getTurbineByIndex(index));

      System.out.println("--------------------------");
      String name="Wind";
      int result=ref.getIndexByTurbine(name);
      if(result!=0){
          System.out.println("The Position of "+name+" is "+result);
      }

      System.out.println("--------------------------");
      boolean updated=ref.updateTurbine("Gas","Updated Gas");
      System.out.println("The updation is "+updated);
      ref.getTurbine();

      System.out.println("--------------------------");
      boolean deleted=ref.deleteTurbine("Steam");
      System.out.println("The deletion is "+deleted);
      ref.getTurbine();
  }
}

class PastaExecutor{

  public static void main(String[] args){

      Pasta ref=new Pasta();
      ref.addPasta("White Sauce");
      ref.addPasta("Red Sauce");
      ref.addPasta("Alfredo");
      ref.addPasta("Penne");
      ref.addPasta("Macaroni");
      ref.addPasta("Spaghetti");
      ref.addPasta("Lasagna");
      ref.addPasta("Fusilli");
      ref.addPasta("Ravioli");
      ref.addPasta("Rigatoni");

      ref.getPasta();

      System.out.println("--------------------------");
      int index=0;
      System.out.println("The value at position "+index+" is "+ ref.getPastaByIndex(index));

      System.out.println("--------------------------");
      String name="Alfredo";
      int result=ref.getIndexByPasta(name);
      if(result!=0){
          System.out.println("The Position of "+name+" is "+result);
      }

      System.out.println("--------------------------");
      boolean updated=ref.updatePasta("Red Sauce","Updated Red Sauce");
      System.out.println("The updation is "+updated);
      ref.getPasta();

      System.out.println("--------------------------");
      boolean deleted=ref.deletePasta("White Sauce");
      System.out.println("The deletion is "+deleted);
      ref.getPasta();
  }
}

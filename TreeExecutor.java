class TreeExecutor{

  public static void main(String[] args){

      Tree ref=new Tree();
      ref.addTree("Mango");
      ref.addTree("Neem");
      ref.addTree("Banyan");
      ref.addTree("Peepal");
      ref.addTree("Coconut");
      ref.addTree("Teak");
      ref.addTree("Oak");
      ref.addTree("Pine");
      ref.addTree("Eucalyptus");
      ref.addTree("Guava");

      ref.getTree();

      System.out.println("--------------------------");
      int index=0;
      System.out.println("The value at position "+index+" is "+ ref.getTreeByIndex(index));

      System.out.println("--------------------------");
      String name="Banyan";
      int result=ref.getIndexByTree(name);
      if(result!=0){
          System.out.println("The Position of "+name+" is "+result);
      }

      System.out.println("--------------------------");
      boolean updated=ref.updateTree("Neem","Updated Neem");
      System.out.println("The updation is "+updated);
      ref.getTree();

      System.out.println("--------------------------");
      boolean deleted=ref.deleteTree("Mango");
      System.out.println("The deletion is "+deleted);
      ref.getTree();
  }
}

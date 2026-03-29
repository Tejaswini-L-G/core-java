class SingerExecutor{

  public static void main(String[] args){

      Singer ref=new Singer();
      ref.addSinger("Arijit Singh");
      ref.addSinger("Sonu Nigam");
      ref.addSinger("Shreya Ghoshal");
      ref.addSinger("SPB");
      ref.addSinger("KK");
      ref.addSinger("Atif Aslam");
      ref.addSinger("Neha Kakkar");
      ref.addSinger("Lata Mangeshkar");
      ref.addSinger("A R Rahman");
      ref.addSinger("Sunidhi Chauhan");

      ref.getSinger();

      System.out.println("--------------------------");
      int index=0;
      System.out.println("The value at position "+index+" is "+ ref.getSingerByIndex(index));

      System.out.println("--------------------------");
      String name="Shreya Ghoshal";
      int result=ref.getIndexBySinger(name);
      if(result!=0){
          System.out.println("The Position of "+name+" is "+result);
      }

      System.out.println("--------------------------");
      boolean updated=ref.updateSinger("Sonu Nigam","Updated Sonu Nigam");
      System.out.println("The updation is "+updated);
      ref.getSinger();

      System.out.println("--------------------------");
      boolean deleted=ref.deleteSinger("Arijit Singh");
      System.out.println("The deletion is "+deleted);
      ref.getSinger();
  }
}

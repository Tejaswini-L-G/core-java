class CricBuzRunner{
 public static void main(String[] args){
  CricBuz manager=new CricBuz();
  manager.addTeamnames("India");
  manager.addTeamnames("Australia");
  manager.addTeamnames("England");
  manager.addTeamnames("New Zealand");
  manager.addTeamnames("South Africa");
  manager.addTeamnames("Pakistan");
  manager.addTeamnames("Sri Lanka");
  manager.addTeamnames("West Indies");
  manager.getTeamnames();
  
  int index=0;
System.out.println("The team at position "+index+" is "+ cricBuz.getTeamNamesByIndex(index));

String name="India";
int result = cricBuz.getIndexByTeamNames(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}
 }
}

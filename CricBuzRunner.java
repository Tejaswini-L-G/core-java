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
 }
}

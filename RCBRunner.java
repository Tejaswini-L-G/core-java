class RCBRunner{
 public static void main(String[] args){
  RCB manager=new RCB();
  manager.addPlayernames("Virat Kohli");
  manager.addPlayernames("Faf du Plessis");
  manager.addPlayernames("Glenn Maxwell");
  manager.addPlayernames("Rajat Patidar");
  manager.addPlayernames("Dinesh Karthik");
  manager.addPlayernames("Mohammed Siraj");
  manager.addPlayernames("Josh Hazlewood");
  manager.addPlayernames("Wanindu Hasaranga");
  manager.addPlayernames("Harshal Patel");
  manager.addPlayernames("Anuj Rawat");
  manager.addPlayernames("Shahbaz Ahmed");
  manager.addPlayernames("Mahipal Lomror");
  manager.addPlayernames("Finn Allen");
  manager.addPlayernames("Suyash Prabhudessai");
  manager.addPlayernames("Karn Sharma");
  manager.getPlayernames();
  int index=0;
System.out.println("The player at position "+index+" is "+ rcb.getPlayerNamesByIndex(index));

String name="Virat Kohli";
int result = rcb.getIndexByPlayerNames(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}

System.out.println("--------------------------");
boolean isUpdated = rcb.updatePlayerNames("Virat Kohli","King Kohli");
System.out.println("The updation is " + isUpdated);
rcb.getPlayerNames();

System.out.println("--------------------------");
boolean isDeleted = rcb.deletePlayerNames("Virat Kohli");
System.out.println("The deletion is " + isDeleted);
rcb.getPlayerNames();
 }
}

class StateRunner{
 public static void main(String[] args){
  State manager=new State();
  manager.addHighwaynames("NH44");
  manager.addHighwaynames("NH48");
  manager.addHighwaynames("NH75");
  manager.addHighwaynames("NH66");
  manager.addHighwaynames("NH7");
  manager.addHighwaynames("NH4");
  manager.addHighwaynames("NH50");
  manager.addHighwaynames("NH275");
  manager.addHighwaynames("NH173");
  manager.getHighwaynames();
  
  int index=0;
System.out.println("The highway at position "+index+" is "+ state.getHighwayNamesByIndex(index));

String name="NH44";
int result = state.getIndexByHighwayNames(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}
 }
}

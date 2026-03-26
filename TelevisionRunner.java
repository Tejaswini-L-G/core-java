class TelevisionRunner{
 public static void main(String[] args){
  Television manager=new Television();
  manager.addChannelnames("Star Plus");
  manager.addChannelnames("Zee TV");
  manager.addChannelnames("Colors");
  manager.addChannelnames("Sony TV");
  manager.addChannelnames("Star Sports");
  manager.addChannelnames("Discovery");
  manager.addChannelnames("National Geographic");
  manager.addChannelnames("Cartoon Network");
  manager.addChannelnames("Pogo");
  manager.addChannelnames("Sun TV");
  manager.addChannelnames("Asianet");
  manager.addChannelnames("Udaya TV");
  manager.addChannelnames("DD National");
  manager.addChannelnames("MTV");
  manager.addChannelnames("Nick");
  manager.addChannelnames("History TV");
  manager.addChannelnames("Animal Planet");
  manager.getChannelnames();
  
  int index=0;
System.out.println("The channel at position "+index+" is "+ television.getChannelNamesByIndex(index));

String name="Star Plus";
int result = television.getIndexByChannelNames(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}
 }
}

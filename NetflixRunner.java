class NetflixRunner{
 public static void main(String[] args){
  Netflix manager=new Netflix();
  manager.addWebseries("Stranger Things");
  manager.addWebseries("Money Heist");
  manager.addWebseries("Dark");
  manager.addWebseries("The Witcher");
  manager.addWebseries("Narcos");
  manager.addWebseries("Breaking Bad");
  manager.addWebseries("Lucifer");
  manager.addWebseries("Ozark");
  manager.addWebseries("Peaky Blinders");
  manager.addWebseries("Wednesday");
  manager.addWebseries("The Crown");
  manager.addWebseries("Black Mirror");
  manager.addWebseries("You");
  manager.addWebseries("Elite");
  manager.addWebseries("1899");
  manager.addWebseries("Squid Game");
  manager.addWebseries("Manifest");
  manager.addWebseries("Vikings");
  manager.getWebseries();
  
  int index=0;
System.out.println("The web series at position "+index+" is "+ netflix.getWebSeriesByIndex(index));

String name="Dark";
int result = netflix.getIndexByWebSeries(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}

System.out.println("--------------------------");
boolean isUpdated = netflix.updateWebSeries("Dark","Dark S2");
System.out.println("The updation is " + isUpdated);
netflix.getWebSeries();

System.out.println("--------------------------");
boolean isDeleted = netflix.deleteWebSeries("Dark");
System.out.println("The deletion is " + isDeleted);
netflix.getWebSeries();
 }
}

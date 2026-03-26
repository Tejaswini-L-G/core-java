class MuseumRunner{
 public static void main(String[] args){
  Museum manager=new Museum();
  manager.addHistoricalmonuments("Taj Mahal");
  manager.addHistoricalmonuments("Red Fort");
  manager.addHistoricalmonuments("Hampi");
  manager.addHistoricalmonuments("Qutub Minar");
  manager.addHistoricalmonuments("Gateway of India");
  manager.addHistoricalmonuments("India Gate");
  manager.addHistoricalmonuments("Charminar");
  manager.addHistoricalmonuments("Mysore Palace");
  manager.addHistoricalmonuments("Konark Sun Temple");
  manager.addHistoricalmonuments("Ajanta Caves");
  manager.addHistoricalmonuments("Ellora Caves");
  manager.addHistoricalmonuments("Golden Temple");
  manager.addHistoricalmonuments("Victoria Memorial");
  manager.addHistoricalmonuments("Sanchi Stupa");
  manager.addHistoricalmonuments("Fatehpur Sikri");
  manager.addHistoricalmonuments("Humayun Tomb");
  manager.getHistoricalmonuments();
  
  int index=0;
System.out.println("The monument at position "+index+" is "+ museum.getHistoricalMonumentsByIndex(index));

String name="Taj Mahal";
int result = museum.getIndexByHistoricalMonuments(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}
 }
}

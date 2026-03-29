class ElectricalShopRunner{
 public static void main(String[] args){
  ElectricalShop manager=new ElectricalShop();
  manager.addAppliances("Fan");
  manager.addAppliances("Refrigerator");
  manager.addAppliances("Washing Machine");
  manager.addAppliances("Microwave");
  manager.addAppliances("Mixer Grinder");
  manager.addAppliances("Air Conditioner");
  manager.addAppliances("Heater");
  manager.addAppliances("Iron Box");
  manager.addAppliances("Water Purifier");
  manager.addAppliances("Television");
  manager.addAppliances("Inverter");
  manager.addAppliances("Generator");
  manager.addAppliances("Vacuum Cleaner");
  manager.addAppliances("Toaster");
  manager.addAppliances("Induction Stove");
  manager.addAppliances("Electric Kettle");
  manager.addAppliances("Dishwasher");
  manager.addAppliances("Geyser");
  manager.addAppliances("Blender");
  manager.addAppliances("Air Cooler");
  manager.getAppliances();
  
  int index=0;
System.out.println("The appliance at position "+index+" is "+ electricalShop.getAppliancesByIndex(index));

String name="Fan";
int result = electricalShop.getIndexByAppliances(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}

System.out.println("--------------------------");
boolean isUpdated = electricalShop.updateAppliances("Fan","Ceiling Fan");
System.out.println("The updation is " + isUpdated);
electricalShop.getAppliances();

System.out.println("--------------------------");
boolean isDeleted = electricalShop.deleteAppliances("Fan");
System.out.println("The deletion is " + isDeleted);
electricalShop.getAppliances();
 }
}

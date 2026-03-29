class GymRunner{
 public static void main(String[] args){
  Gym manager=new Gym();
  manager.addEquipments("Treadmill");
  manager.addEquipments("Dumbbells");
  manager.addEquipments("Barbell");
  manager.addEquipments("Bench Press");
  manager.addEquipments("Leg Press");
  manager.addEquipments("Pull Up Bar");
  manager.addEquipments("Skipping Rope");
  manager.addEquipments("Exercise Bike");
  manager.addEquipments("Kettlebell");
  manager.addEquipments("Smith Machine");
  manager.addEquipments("Rowing Machine");
  manager.addEquipments("Stepper");
  manager.addEquipments("Cable Machine");
  manager.addEquipments("Resistance Bands");
  manager.addEquipments("Ab Roller");
  manager.addEquipments("Punching Bag");
  manager.getEquipments();
  
  int index=0;
System.out.println("The equipment at position "+index+" is "+ gym.getEquipmentsByIndex(index));

String name="Treadmill";
int result = gym.getIndexByEquipments(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}

System.out.println("--------------------------");
boolean isUpdated = gym.updateEquipments("Treadmill","Advanced Treadmill");
System.out.println("The updation is " + isUpdated);
gym.getEquipments();

System.out.println("--------------------------");
boolean isDeleted = gym.deleteEquipments("Treadmill");
System.out.println("The deletion is " + isDeleted);
gym.getEquipments();
 }
}

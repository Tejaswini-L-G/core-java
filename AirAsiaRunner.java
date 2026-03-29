class AirAsiaRunner{
 public static void main(String[] args){
  AirAsia manager=new AirAsia();
  manager.addPassengers("Aarav Sharma");
  manager.addPassengers("Diya Patel");
  manager.addPassengers("Arjun Reddy");
  manager.addPassengers("Meera Nair");
  manager.addPassengers("Rohan Das");
  manager.addPassengers("Ananya Singh");
  manager.addPassengers("Vikram Joshi");
  manager.addPassengers("Sneha Iyer");
  manager.addPassengers("Karthik Rao");
  manager.addPassengers("Pooja Mehta");
  manager.addPassengers("Rahul Verma");
  manager.addPassengers("Neha Kapoor");
  manager.addPassengers("Aditya Kulkarni");
  manager.addPassengers("Priya Nair");
  manager.addPassengers("Siddharth Jain");
  manager.addPassengers("Kavya Shetty");
  manager.addPassengers("Nikhil Gupta");
  manager.addPassengers("Aisha Khan");
  manager.addPassengers("Varun Malhotra");
  manager.addPassengers("Ishita Choudhary");
  manager.addPassengers("Devansh Agarwal");
  manager.addPassengers("Ritika Bose");
  manager.addPassengers("Harsh Vardhan");
  manager.addPassengers("Tanvi Deshmukh");
  manager.addPassengers("Manish Yadav");
  manager.addPassengers("Swati Mishra");
  manager.addPassengers("Amit Tiwari");
  manager.addPassengers("Sonal Arora");
  manager.addPassengers("Yash Bansal");
  manager.addPassengers("Nidhi Saxena");
  manager.getPassengers();
  
  int index=0;
System.out.println("The passenger at position "+index+" is "+ airAsia.getPassengersByIndex(index));

String name="Aarav Sharma";
int result = airAsia.getIndexByPassengers(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}

System.out.println("--------------------------");
boolean isUpdated = airAsia.updatePassengers("Aarav","Aarav Sharma");
System.out.println("The updation is " + isUpdated);
airAsia.getPassengers();

System.out.println("--------------------------");
boolean isDeleted = airAsia.deletePassengers("Aarav Sharma");
System.out.println("The deletion is " + isDeleted);
airAsia.getPassengers();
 }
}

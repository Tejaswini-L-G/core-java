class PhonepeRunner{
 public static void main(String[] args){
  Phonepe manager=new Phonepe();
  manager.addInsurancenames("Health Insurance");
  manager.addInsurancenames("Life Insurance");
  manager.addInsurancenames("Vehicle Insurance");
  manager.addInsurancenames("Travel Insurance");
  manager.addInsurancenames("Home Insurance");
  manager.addInsurancenames("Accident Insurance");
  manager.addInsurancenames("Term Plan");
  manager.addInsurancenames("Family Health Plan");
  manager.addInsurancenames("Senior Citizen Plan");
  manager.addInsurancenames("Child Plan");
  manager.addInsurancenames("ULIP Plan");
  manager.addInsurancenames("Critical Illness Plan");
  manager.addInsurancenames("Motor Insurance");
  manager.addInsurancenames("Bike Insurance");
  manager.addInsurancenames("Car Insurance");
  manager.addInsurancenames("Crop Insurance");
  manager.addInsurancenames("Fire Insurance");
  manager.addInsurancenames("Marine Insurance");
  manager.addInsurancenames("Group Insurance");
  manager.addInsurancenames("Personal Accident Plan");
  manager.addInsurancenames("Medical Insurance");
  manager.addInsurancenames("Dental Insurance");
  manager.addInsurancenames("Vision Insurance");
  manager.addInsurancenames("Pet Insurance");
  manager.addInsurancenames("Liability Insurance");
  manager.addInsurancenames("Business Insurance");
  manager.addInsurancenames("Micro Insurance");
  manager.getInsurancenames();
  
  int index=0;
System.out.println("The insurance at position "+index+" is "+ phonepe.getInsuranceNamesByIndex(index));

String name="Health Insurance";
int result = phonepe.getIndexByInsuranceNames(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}
 }
}

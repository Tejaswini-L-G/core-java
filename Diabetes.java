class Diabetes{

int patientId;
String patientName;
int age;
String gender;
String diabetesType;
double glucoseLevel;
double insulinLevel;
String doctorName;
String hospital;
String treatmentType;
String medicineName;
String dietPlan;
String exercisePlan;
String riskLevel;
String diagnosisDate;
String monitorDevice;
String status;
String city;
String notes;
int rating;

public Diabetes(int patientId,String patientName,int age,String gender,String diabetesType,double glucoseLevel,double insulinLevel,String doctorName,String hospital,String treatmentType,String medicineName,String dietPlan,String exercisePlan,String riskLevel,String diagnosisDate,String monitorDevice,String status,String city,String notes,int rating){

this.patientId=patientId;
this.patientName=patientName;
this.age=age;
this.gender=gender;
this.diabetesType=diabetesType;
this.glucoseLevel=glucoseLevel;
this.insulinLevel=insulinLevel;
this.doctorName=doctorName;
this.hospital=hospital;
this.treatmentType=treatmentType;
this.medicineName=medicineName;
this.dietPlan=dietPlan;
this.exercisePlan=exercisePlan;
this.riskLevel=riskLevel;
this.diagnosisDate=diagnosisDate;
this.monitorDevice=monitorDevice;
this.status=status;
this.city=city;
this.notes=notes;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The patient id is "+this.patientId);
System.out.println("The patient name is "+this.patientName);
System.out.println("The age is "+this.age);
System.out.println("The gender is "+this.gender);
System.out.println("The diabetes type is "+this.diabetesType);
System.out.println("The glucose level is "+this.glucoseLevel);
System.out.println("The insulin level is "+this.insulinLevel);
System.out.println("The doctor name is "+this.doctorName);
System.out.println("The hospital is "+this.hospital);
System.out.println("The treatment type is "+this.treatmentType);
System.out.println("The medicine name is "+this.medicineName);
System.out.println("The diet plan is "+this.dietPlan);
System.out.println("The exercise plan is "+this.exercisePlan);
System.out.println("The risk level is "+this.riskLevel);
System.out.println("The diagnosis date is "+this.diagnosisDate);
System.out.println("The monitor device is "+this.monitorDevice);
System.out.println("The status is "+this.status);
System.out.println("The city is "+this.city);
System.out.println("The notes are "+this.notes);
System.out.println("The rating is "+this.rating);

}

}
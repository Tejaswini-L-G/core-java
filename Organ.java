class Organ{

int organId;
String organName;
String system;
String function;
double weight;
String locationInBody;
String cellType;
String bloodSupply;
String nerveSupply;
String diseaseRelated;
String researchField;
String scientist;
String studyType;
String importanceLevel;
String donorStatus;
String transplantPossible;
String description;
String category;
String status;
int rating;

public Organ(int organId,String organName,String system,String function,double weight,String locationInBody,String cellType,String bloodSupply,String nerveSupply,String diseaseRelated,String researchField,String scientist,String studyType,String importanceLevel,String donorStatus,String transplantPossible,String description,String category,String status,int rating){

this.organId=organId;
this.organName=organName;
this.system=system;
this.function=function;
this.weight=weight;
this.locationInBody=locationInBody;
this.cellType=cellType;
this.bloodSupply=bloodSupply;
this.nerveSupply=nerveSupply;
this.diseaseRelated=diseaseRelated;
this.researchField=researchField;
this.scientist=scientist;
this.studyType=studyType;
this.importanceLevel=importanceLevel;
this.donorStatus=donorStatus;
this.transplantPossible=transplantPossible;
this.description=description;
this.category=category;
this.status=status;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The organ id is "+this.organId);
System.out.println("The organ name is "+this.organName);
System.out.println("The system is "+this.system);
System.out.println("The function is "+this.function);
System.out.println("The weight is "+this.weight);
System.out.println("The location in body is "+this.locationInBody);
System.out.println("The cell type is "+this.cellType);
System.out.println("The blood supply is "+this.bloodSupply);
System.out.println("The nerve supply is "+this.nerveSupply);
System.out.println("The disease related is "+this.diseaseRelated);
System.out.println("The research field is "+this.researchField);
System.out.println("The scientist is "+this.scientist);
System.out.println("The study type is "+this.studyType);
System.out.println("The importance level is "+this.importanceLevel);
System.out.println("The donor status is "+this.donorStatus);
System.out.println("The transplant possible is "+this.transplantPossible);
System.out.println("The description is "+this.description);
System.out.println("The category is "+this.category);
System.out.println("The status is "+this.status);
System.out.println("The rating is "+this.rating);

}

}
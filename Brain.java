class Brain{

int brainId;
String partName;
String function;
String hemisphere;
double weight;
String nervousSystemPart;
String cellType;
String diseaseRelated;
String researchField;
String scientist;
String studyType;
String labName;
String country;
String category;
String importanceLevel;
String description;
String status;
String modelType;
String usage;
int rating;

public Brain(int brainId,String partName,String function,String hemisphere,double weight,String nervousSystemPart,String cellType,String diseaseRelated,String researchField,String scientist,String studyType,String labName,String country,String category,String importanceLevel,String description,String status,String modelType,String usage,int rating){

this.brainId=brainId;
this.partName=partName;
this.function=function;
this.hemisphere=hemisphere;
this.weight=weight;
this.nervousSystemPart=nervousSystemPart;
this.cellType=cellType;
this.diseaseRelated=diseaseRelated;
this.researchField=researchField;
this.scientist=scientist;
this.studyType=studyType;
this.labName=labName;
this.country=country;
this.category=category;
this.importanceLevel=importanceLevel;
this.description=description;
this.status=status;
this.modelType=modelType;
this.usage=usage;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The brain id is "+this.brainId);
System.out.println("The part name is "+this.partName);
System.out.println("The function is "+this.function);
System.out.println("The hemisphere is "+this.hemisphere);
System.out.println("The weight is "+this.weight);
System.out.println("The nervous system part is "+this.nervousSystemPart);
System.out.println("The cell type is "+this.cellType);
System.out.println("The disease related is "+this.diseaseRelated);
System.out.println("The research field is "+this.researchField);
System.out.println("The scientist is "+this.scientist);
System.out.println("The study type is "+this.studyType);
System.out.println("The lab name is "+this.labName);
System.out.println("The country is "+this.country);
System.out.println("The category is "+this.category);
System.out.println("The importance level is "+this.importanceLevel);
System.out.println("The description is "+this.description);
System.out.println("The status is "+this.status);
System.out.println("The model type is "+this.modelType);
System.out.println("The usage is "+this.usage);
System.out.println("The rating is "+this.rating);

}

}
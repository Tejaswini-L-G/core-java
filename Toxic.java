class Toxic{

int toxicId;
String chemicalName;
String category;
String color;
String state;
double toxicityLevel;
String hazardLevel;
String originLab;
String usage;
String storageCondition;
String safetyLevel;
String containerType;
String manufacturer;
String country;
String chemicalFormula;
String reactivity;
String riskType;
String description;
String status;
int rating;

public Toxic(int toxicId,String chemicalName,String category,String color,String state,double toxicityLevel,String hazardLevel,String originLab,String usage,String storageCondition,String safetyLevel,String containerType,String manufacturer,String country,String chemicalFormula,String reactivity,String riskType,String description,String status,int rating){

this.toxicId=toxicId;
this.chemicalName=chemicalName;
this.category=category;
this.color=color;
this.state=state;
this.toxicityLevel=toxicityLevel;
this.hazardLevel=hazardLevel;
this.originLab=originLab;
this.usage=usage;
this.storageCondition=storageCondition;
this.safetyLevel=safetyLevel;
this.containerType=containerType;
this.manufacturer=manufacturer;
this.country=country;
this.chemicalFormula=chemicalFormula;
this.reactivity=reactivity;
this.riskType=riskType;
this.description=description;
this.status=status;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The toxic id is "+this.toxicId);
System.out.println("The chemical name is "+this.chemicalName);
System.out.println("The category is "+this.category);
System.out.println("The color is "+this.color);
System.out.println("The state is "+this.state);
System.out.println("The toxicity level is "+this.toxicityLevel);
System.out.println("The hazard level is "+this.hazardLevel);
System.out.println("The origin lab is "+this.originLab);
System.out.println("The usage is "+this.usage);
System.out.println("The storage condition is "+this.storageCondition);
System.out.println("The safety level is "+this.safetyLevel);
System.out.println("The container type is "+this.containerType);
System.out.println("The manufacturer is "+this.manufacturer);
System.out.println("The country is "+this.country);
System.out.println("The chemical formula is "+this.chemicalFormula);
System.out.println("The reactivity is "+this.reactivity);
System.out.println("The risk type is "+this.riskType);
System.out.println("The description is "+this.description);
System.out.println("The status is "+this.status);
System.out.println("The rating is "+this.rating);

}

}
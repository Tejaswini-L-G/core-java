class Cell{

int cellId;
String cellType;
String organism;
String function;
String shape;
double size;
String nucleusType;
String membraneType;
String cytoplasmContent;
String organelleType;
String divisionType;
String researchField;
String labName;
String country;
String category;
String importanceLevel;
String usage;
String description;
String status;
int rating;

public Cell(int cellId,String cellType,String organism,String function,String shape,double size,String nucleusType,String membraneType,String cytoplasmContent,String organelleType,String divisionType,String researchField,String labName,String country,String category,String importanceLevel,String usage,String description,String status,int rating){

this.cellId=cellId;
this.cellType=cellType;
this.organism=organism;
this.function=function;
this.shape=shape;
this.size=size;
this.nucleusType=nucleusType;
this.membraneType=membraneType;
this.cytoplasmContent=cytoplasmContent;
this.organelleType=organelleType;
this.divisionType=divisionType;
this.researchField=researchField;
this.labName=labName;
this.country=country;
this.category=category;
this.importanceLevel=importanceLevel;
this.usage=usage;
this.description=description;
this.status=status;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The cell id is "+this.cellId);
System.out.println("The cell type is "+this.cellType);
System.out.println("The organism is "+this.organism);
System.out.println("The function is "+this.function);
System.out.println("The shape is "+this.shape);
System.out.println("The size is "+this.size);
System.out.println("The nucleus type is "+this.nucleusType);
System.out.println("The membrane type is "+this.membraneType);
System.out.println("The cytoplasm content is "+this.cytoplasmContent);
System.out.println("The organelle type is "+this.organelleType);
System.out.println("The division type is "+this.divisionType);
System.out.println("The research field is "+this.researchField);
System.out.println("The lab name is "+this.labName);
System.out.println("The country is "+this.country);
System.out.println("The category is "+this.category);
System.out.println("The importance level is "+this.importanceLevel);
System.out.println("The usage is "+this.usage);
System.out.println("The description is "+this.description);
System.out.println("The status is "+this.status);
System.out.println("The rating is "+this.rating);

}

}
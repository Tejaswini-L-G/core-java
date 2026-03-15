class Garlic{

int garlicId;
String variety;
String originCountry;
String color;
double pricePerKg;
double weight;
int quantity;
String harvestSeason;
String qualityGrade;
String supplier;
String organicStatus;
String size;
String flavor;
String aroma;
String storageCondition;
String exportCountry;
String category;
String usage;
String description;
int rating;

public Garlic(int garlicId,String variety,String originCountry,String color,double pricePerKg,double weight,int quantity,String harvestSeason,String qualityGrade,String supplier,String organicStatus,String size,String flavor,String aroma,String storageCondition,String exportCountry,String category,String usage,String description,int rating){

this.garlicId=garlicId;
this.variety=variety;
this.originCountry=originCountry;
this.color=color;
this.pricePerKg=pricePerKg;
this.weight=weight;
this.quantity=quantity;
this.harvestSeason=harvestSeason;
this.qualityGrade=qualityGrade;
this.supplier=supplier;
this.organicStatus=organicStatus;
this.size=size;
this.flavor=flavor;
this.aroma=aroma;
this.storageCondition=storageCondition;
this.exportCountry=exportCountry;
this.category=category;
this.usage=usage;
this.description=description;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The garlic id is "+this.garlicId);
System.out.println("The garlic variety is "+this.variety);
System.out.println("The origin country is "+this.originCountry);
System.out.println("The garlic color is "+this.color);
System.out.println("The price per kg is "+this.pricePerKg);
System.out.println("The weight is "+this.weight);
System.out.println("The quantity is "+this.quantity);
System.out.println("The harvest season is "+this.harvestSeason);
System.out.println("The quality grade is "+this.qualityGrade);
System.out.println("The supplier is "+this.supplier);
System.out.println("The organic status is "+this.organicStatus);
System.out.println("The garlic size is "+this.size);
System.out.println("The flavor is "+this.flavor);
System.out.println("The aroma is "+this.aroma);
System.out.println("The storage condition is "+this.storageCondition);
System.out.println("The export country is "+this.exportCountry);
System.out.println("The category is "+this.category);
System.out.println("The usage is "+this.usage);
System.out.println("The description is "+this.description);
System.out.println("The rating is "+this.rating);

}

}
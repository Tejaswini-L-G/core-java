class Pepper{

int pepperId;
String type;
String originCountry;
String color;
String taste;
double pricePerKg;
double weight;
int quantity;
String harvestSeason;
String qualityGrade;
String supplier;
String organicStatus;
String spiceLevel;
String aroma;
String storageCondition;
String exportCountry;
String category;
String usage;
String description;
int rating;

public Pepper(int pepperId,String type,String originCountry,String color,String taste,double pricePerKg,double weight,int quantity,String harvestSeason,String qualityGrade,String supplier,String organicStatus,String spiceLevel,String aroma,String storageCondition,String exportCountry,String category,String usage,String description,int rating){

this.pepperId=pepperId;
this.type=type;
this.originCountry=originCountry;
this.color=color;
this.taste=taste;
this.pricePerKg=pricePerKg;
this.weight=weight;
this.quantity=quantity;
this.harvestSeason=harvestSeason;
this.qualityGrade=qualityGrade;
this.supplier=supplier;
this.organicStatus=organicStatus;
this.spiceLevel=spiceLevel;
this.aroma=aroma;
this.storageCondition=storageCondition;
this.exportCountry=exportCountry;
this.category=category;
this.usage=usage;
this.description=description;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The pepper id is "+this.pepperId);
System.out.println("The pepper type is "+this.type);
System.out.println("The origin country is "+this.originCountry);
System.out.println("The pepper color is "+this.color);
System.out.println("The taste of pepper is "+this.taste);
System.out.println("The price per kg is "+this.pricePerKg);
System.out.println("The weight is "+this.weight);
System.out.println("The quantity is "+this.quantity);
System.out.println("The harvest season is "+this.harvestSeason);
System.out.println("The quality grade is "+this.qualityGrade);
System.out.println("The supplier is "+this.supplier);
System.out.println("The organic status is "+this.organicStatus);
System.out.println("The spice level is "+this.spiceLevel);
System.out.println("The aroma is "+this.aroma);
System.out.println("The storage condition is "+this.storageCondition);
System.out.println("The export country is "+this.exportCountry);
System.out.println("The category is "+this.category);
System.out.println("The usage is "+this.usage);
System.out.println("The description is "+this.description);
System.out.println("The rating is "+this.rating);

}

}
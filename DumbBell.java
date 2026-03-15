class DumbBell{

int dumbbellId;
String brand;
double weightKg;
String material;
String color;
double price;
String gripType;
String shape;
String usage;
String fitnessLevel;
String gymType;
String quality;
String manufacturer;
String originCountry;
String category;
String availability;
String trainerRecommendation;
String description;
String finish;
int rating;

public DumbBell(int dumbbellId,String brand,double weightKg,String material,String color,double price,String gripType,String shape,String usage,String fitnessLevel,String gymType,String quality,String manufacturer,String originCountry,String category,String availability,String trainerRecommendation,String description,String finish,int rating){

this.dumbbellId=dumbbellId;
this.brand=brand;
this.weightKg=weightKg;
this.material=material;
this.color=color;
this.price=price;
this.gripType=gripType;
this.shape=shape;
this.usage=usage;
this.fitnessLevel=fitnessLevel;
this.gymType=gymType;
this.quality=quality;
this.manufacturer=manufacturer;
this.originCountry=originCountry;
this.category=category;
this.availability=availability;
this.trainerRecommendation=trainerRecommendation;
this.description=description;
this.finish=finish;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The dumbbell id is "+this.dumbbellId);
System.out.println("The brand is "+this.brand);
System.out.println("The weight in kg is "+this.weightKg);
System.out.println("The material is "+this.material);
System.out.println("The color is "+this.color);
System.out.println("The price is "+this.price);
System.out.println("The grip type is "+this.gripType);
System.out.println("The shape is "+this.shape);
System.out.println("The usage is "+this.usage);
System.out.println("The fitness level is "+this.fitnessLevel);
System.out.println("The gym type is "+this.gymType);
System.out.println("The quality is "+this.quality);
System.out.println("The manufacturer is "+this.manufacturer);
System.out.println("The origin country is "+this.originCountry);
System.out.println("The category is "+this.category);
System.out.println("The availability is "+this.availability);
System.out.println("The trainer recommendation is "+this.trainerRecommendation);
System.out.println("The description is "+this.description);
System.out.println("The finish is "+this.finish);
System.out.println("The rating is "+this.rating);

}

}
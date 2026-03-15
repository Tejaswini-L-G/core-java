class Trophy{

int trophyId;
String eventName;
String winnerName;
String category;
String material;
String color;
double height;
double weight;
String design;
String manufacturer;
String originCountry;
String quality;
String finish;
String purpose;
String eventYear;
String sponsor;
String description;
String style;
String availability;
int rating;

public Trophy(int trophyId,String eventName,String winnerName,String category,String material,String color,double height,double weight,String design,String manufacturer,String originCountry,String quality,String finish,String purpose,String eventYear,String sponsor,String description,String style,String availability,int rating){

this.trophyId=trophyId;
this.eventName=eventName;
this.winnerName=winnerName;
this.category=category;
this.material=material;
this.color=color;
this.height=height;
this.weight=weight;
this.design=design;
this.manufacturer=manufacturer;
this.originCountry=originCountry;
this.quality=quality;
this.finish=finish;
this.purpose=purpose;
this.eventYear=eventYear;
this.sponsor=sponsor;
this.description=description;
this.style=style;
this.availability=availability;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The trophy id is "+this.trophyId);
System.out.println("The event name is "+this.eventName);
System.out.println("The winner name is "+this.winnerName);
System.out.println("The category is "+this.category);
System.out.println("The material is "+this.material);
System.out.println("The color is "+this.color);
System.out.println("The height is "+this.height);
System.out.println("The weight is "+this.weight);
System.out.println("The design is "+this.design);
System.out.println("The manufacturer is "+this.manufacturer);
System.out.println("The origin country is "+this.originCountry);
System.out.println("The quality is "+this.quality);
System.out.println("The finish is "+this.finish);
System.out.println("The purpose is "+this.purpose);
System.out.println("The event year is "+this.eventYear);
System.out.println("The sponsor is "+this.sponsor);
System.out.println("The description is "+this.description);
System.out.println("The style is "+this.style);
System.out.println("The availability is "+this.availability);
System.out.println("The rating is "+this.rating);

}

}
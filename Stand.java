class Stand{

int standId;
String standType;
String brand;
String material;
String color;
double price;
double height;
double weight;
String usage;
String roomType;
String style;
String quality;
String manufacturer;
String originCountry;
String availability;
String supplier;
String category;
String description;
String finish;
int rating;

public Stand(int standId,String standType,String brand,String material,String color,double price,double height,double weight,String usage,String roomType,String style,String quality,String manufacturer,String originCountry,String availability,String supplier,String category,String description,String finish,int rating){

this.standId=standId;
this.standType=standType;
this.brand=brand;
this.material=material;
this.color=color;
this.price=price;
this.height=height;
this.weight=weight;
this.usage=usage;
this.roomType=roomType;
this.style=style;
this.quality=quality;
this.manufacturer=manufacturer;
this.originCountry=originCountry;
this.availability=availability;
this.supplier=supplier;
this.category=category;
this.description=description;
this.finish=finish;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The stand id is "+this.standId);
System.out.println("The stand type is "+this.standType);
System.out.println("The brand is "+this.brand);
System.out.println("The material is "+this.material);
System.out.println("The color is "+this.color);
System.out.println("The price is "+this.price);
System.out.println("The height is "+this.height);
System.out.println("The weight is "+this.weight);
System.out.println("The usage is "+this.usage);
System.out.println("The room type is "+this.roomType);
System.out.println("The style is "+this.style);
System.out.println("The quality is "+this.quality);
System.out.println("The manufacturer is "+this.manufacturer);
System.out.println("The origin country is "+this.originCountry);
System.out.println("The availability is "+this.availability);
System.out.println("The supplier is "+this.supplier);
System.out.println("The category is "+this.category);
System.out.println("The description is "+this.description);
System.out.println("The finish is "+this.finish);
System.out.println("The rating is "+this.rating);

}

}
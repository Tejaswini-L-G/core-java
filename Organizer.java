class Organizer{

int organizerId;
String organizerType;
String brand;
String material;
String color;
double price;
String size;
String shape;
String usage;
String roomType;
String style;
String quality;
String manufacturer;
String originCountry;
String category;
String availability;
String supplier;
String description;
String finish;
int rating;

public Organizer(int organizerId,String organizerType,String brand,String material,String color,double price,String size,String shape,String usage,String roomType,String style,String quality,String manufacturer,String originCountry,String category,String availability,String supplier,String description,String finish,int rating){

this.organizerId=organizerId;
this.organizerType=organizerType;
this.brand=brand;
this.material=material;
this.color=color;
this.price=price;
this.size=size;
this.shape=shape;
this.usage=usage;
this.roomType=roomType;
this.style=style;
this.quality=quality;
this.manufacturer=manufacturer;
this.originCountry=originCountry;
this.category=category;
this.availability=availability;
this.supplier=supplier;
this.description=description;
this.finish=finish;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The organizer id is "+this.organizerId);
System.out.println("The organizer type is "+this.organizerType);
System.out.println("The brand is "+this.brand);
System.out.println("The material is "+this.material);
System.out.println("The color is "+this.color);
System.out.println("The price is "+this.price);
System.out.println("The size is "+this.size);
System.out.println("The shape is "+this.shape);
System.out.println("The usage is "+this.usage);
System.out.println("The room type is "+this.roomType);
System.out.println("The style is "+this.style);
System.out.println("The quality is "+this.quality);
System.out.println("The manufacturer is "+this.manufacturer);
System.out.println("The origin country is "+this.originCountry);
System.out.println("The category is "+this.category);
System.out.println("The availability is "+this.availability);
System.out.println("The supplier is "+this.supplier);
System.out.println("The description is "+this.description);
System.out.println("The finish is "+this.finish);
System.out.println("The rating is "+this.rating);

}

}
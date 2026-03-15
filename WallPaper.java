class WallPaper{

int wallpaperId;
String design;
String brand;
String color;
String pattern;
String material;
double price;
double width;
double height;
String texture;
String finish;
String roomType;
String style;
String originCountry;
String supplier;
String availability;
String quality;
String usage;
String description;
int rating;

public WallPaper(int wallpaperId,String design,String brand,String color,String pattern,String material,double price,double width,double height,String texture,String finish,String roomType,String style,String originCountry,String supplier,String availability,String quality,String usage,String description,int rating){

this.wallpaperId=wallpaperId;
this.design=design;
this.brand=brand;
this.color=color;
this.pattern=pattern;
this.material=material;
this.price=price;
this.width=width;
this.height=height;
this.texture=texture;
this.finish=finish;
this.roomType=roomType;
this.style=style;
this.originCountry=originCountry;
this.supplier=supplier;
this.availability=availability;
this.quality=quality;
this.usage=usage;
this.description=description;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The wallpaper id is "+this.wallpaperId);
System.out.println("The wallpaper design is "+this.design);
System.out.println("The wallpaper brand is "+this.brand);
System.out.println("The wallpaper color is "+this.color);
System.out.println("The wallpaper pattern is "+this.pattern);
System.out.println("The wallpaper material is "+this.material);
System.out.println("The wallpaper price is "+this.price);
System.out.println("The wallpaper width is "+this.width);
System.out.println("The wallpaper height is "+this.height);
System.out.println("The wallpaper texture is "+this.texture);
System.out.println("The wallpaper finish is "+this.finish);
System.out.println("The wallpaper room type is "+this.roomType);
System.out.println("The wallpaper style is "+this.style);
System.out.println("The wallpaper origin country is "+this.originCountry);
System.out.println("The wallpaper supplier is "+this.supplier);
System.out.println("The wallpaper availability is "+this.availability);
System.out.println("The wallpaper quality is "+this.quality);
System.out.println("The wallpaper usage is "+this.usage);
System.out.println("The wallpaper description is "+this.description);
System.out.println("The wallpaper rating is "+this.rating);

}

}
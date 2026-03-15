class Shampoo{

int productId;
String brand;
String variant;
String hairType;
String color;
double price;
int volumeMl;
String ingredient;
String fragrance;
String manufacturer;
String originCountry;
String usageType;
String quality;
String packaging;
String shelfLife;
String availability;
String supplier;
String description;
String category;
int rating;

public Shampoo(int productId,String brand,String variant,String hairType,String color,double price,int volumeMl,String ingredient,String fragrance,String manufacturer,String originCountry,String usageType,String quality,String packaging,String shelfLife,String availability,String supplier,String description,String category,int rating){

this.productId=productId;
this.brand=brand;
this.variant=variant;
this.hairType=hairType;
this.color=color;
this.price=price;
this.volumeMl=volumeMl;
this.ingredient=ingredient;
this.fragrance=fragrance;
this.manufacturer=manufacturer;
this.originCountry=originCountry;
this.usageType=usageType;
this.quality=quality;
this.packaging=packaging;
this.shelfLife=shelfLife;
this.availability=availability;
this.supplier=supplier;
this.description=description;
this.category=category;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The shampoo id is "+this.productId);
System.out.println("The shampoo brand is "+this.brand);
System.out.println("The variant is "+this.variant);
System.out.println("The hair type is "+this.hairType);
System.out.println("The color is "+this.color);
System.out.println("The price is "+this.price);
System.out.println("The volume in ml is "+this.volumeMl);
System.out.println("The ingredient is "+this.ingredient);
System.out.println("The fragrance is "+this.fragrance);
System.out.println("The manufacturer is "+this.manufacturer);
System.out.println("The origin country is "+this.originCountry);
System.out.println("The usage type is "+this.usageType);
System.out.println("The quality is "+this.quality);
System.out.println("The packaging is "+this.packaging);
System.out.println("The shelf life is "+this.shelfLife);
System.out.println("The availability is "+this.availability);
System.out.println("The supplier is "+this.supplier);
System.out.println("The description is "+this.description);
System.out.println("The category is "+this.category);
System.out.println("The rating is "+this.rating);

}

}
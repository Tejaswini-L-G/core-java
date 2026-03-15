class Paper{

int paperId;
String paperType;
String brand;
String color;
String size;
String material;
double price;
int quantity;
String gsm;
String texture;
String usage;
String manufacturer;
String originCountry;
String quality;
String packType;
String category;
String availability;
String supplier;
String description;
int rating;

public Paper(int paperId,String paperType,String brand,String color,String size,String material,double price,int quantity,String gsm,String texture,String usage,String manufacturer,String originCountry,String quality,String packType,String category,String availability,String supplier,String description,int rating){

this.paperId=paperId;
this.paperType=paperType;
this.brand=brand;
this.color=color;
this.size=size;
this.material=material;
this.price=price;
this.quantity=quantity;
this.gsm=gsm;
this.texture=texture;
this.usage=usage;
this.manufacturer=manufacturer;
this.originCountry=originCountry;
this.quality=quality;
this.packType=packType;
this.category=category;
this.availability=availability;
this.supplier=supplier;
this.description=description;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The paper id is "+this.paperId);
System.out.println("The paper type is "+this.paperType);
System.out.println("The paper brand is "+this.brand);
System.out.println("The paper color is "+this.color);
System.out.println("The paper size is "+this.size);
System.out.println("The paper material is "+this.material);
System.out.println("The paper price is "+this.price);
System.out.println("The paper quantity is "+this.quantity);
System.out.println("The paper GSM is "+this.gsm);
System.out.println("The paper texture is "+this.texture);
System.out.println("The paper usage is "+this.usage);
System.out.println("The paper manufacturer is "+this.manufacturer);
System.out.println("The origin country is "+this.originCountry);
System.out.println("The paper quality is "+this.quality);
System.out.println("The pack type is "+this.packType);
System.out.println("The category is "+this.category);
System.out.println("The availability is "+this.availability);
System.out.println("The supplier is "+this.supplier);
System.out.println("The description is "+this.description);
System.out.println("The rating is "+this.rating);

}

}
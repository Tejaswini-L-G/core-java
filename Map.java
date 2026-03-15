class Map{

int mapId;
String mapName;
String region;
String country;
String publisher;
int publishYear;
String scale;
String language;
String format;
String material;
String colorScheme;
String usage;
String category;
String edition;
String size;
String availability;
String supplier;
String description;
String type;
int rating;

public Map(int mapId,String mapName,String region,String country,String publisher,int publishYear,String scale,String language,String format,String material,String colorScheme,String usage,String category,String edition,String size,String availability,String supplier,String description,String type,int rating){

this.mapId=mapId;
this.mapName=mapName;
this.region=region;
this.country=country;
this.publisher=publisher;
this.publishYear=publishYear;
this.scale=scale;
this.language=language;
this.format=format;
this.material=material;
this.colorScheme=colorScheme;
this.usage=usage;
this.category=category;
this.edition=edition;
this.size=size;
this.availability=availability;
this.supplier=supplier;
this.description=description;
this.type=type;
this.rating=rating;

}

public void displayDetails(){

System.out.println("The map id is "+this.mapId);
System.out.println("The map name is "+this.mapName);
System.out.println("The region is "+this.region);
System.out.println("The country is "+this.country);
System.out.println("The publisher is "+this.publisher);
System.out.println("The publish year is "+this.publishYear);
System.out.println("The scale is "+this.scale);
System.out.println("The language is "+this.language);
System.out.println("The format is "+this.format);
System.out.println("The material is "+this.material);
System.out.println("The color scheme is "+this.colorScheme);
System.out.println("The usage is "+this.usage);
System.out.println("The category is "+this.category);
System.out.println("The edition is "+this.edition);
System.out.println("The size is "+this.size);
System.out.println("The availability is "+this.availability);
System.out.println("The supplier is "+this.supplier);
System.out.println("The description is "+this.description);
System.out.println("The type is "+this.type);
System.out.println("The rating is "+this.rating);

}

}
class BedSheet {
    String material, color, size, pattern, brand, type, usage, packaging, origin, quality;
    int threadCount, rating;
    double price, weight;
    boolean isCotton, isAvailable;
    String design, warranty, category, washType;

    BedSheet(){
        this("Cotton","Blue","King","Floral","Spaces","Double","Home","Pack","India","Premium",
             300,5,1500.0,1.5,true,true,"Modern","1yr","Home","Machine");
    }

    BedSheet(String material,String color,String size,String pattern,String brand,String type,
             String usage,String packaging,String origin,String quality,int threadCount,int rating,
             double price,double weight,boolean isCotton,boolean isAvailable,String design,
             String warranty,String category,String washType){
        this.material=material; this.color=color; this.size=size; this.pattern=pattern;
        this.brand=brand; this.type=type; this.usage=usage; this.packaging=packaging;
        this.origin=origin; this.quality=quality; this.threadCount=threadCount;
        this.rating=rating; this.price=price; this.weight=weight;
        this.isCotton=isCotton; this.isAvailable=isAvailable; this.design=design;
        this.warranty=warranty; this.category=category; this.washType=washType;
    }

    BedSheet(String brand,double price){
        this("Silk","White","Queen","Plain",brand,"Single","Home","Cover","India","Luxury",
             400,5,price,1.2,true,true,"Classic","2yr","Home","Handwash");
    }

    void getDetails(){
        System.out.println("Brand: "+brand+" Size: "+size+" Price: "+price);
    }
}
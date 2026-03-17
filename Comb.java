class Comb {
    String material, color, brand, type, usage, packaging, origin, quality, durability, size;
    int teethCount, length, rating;
    double price, weight;
    boolean isFlexible, isAvailable;
    String finish, warranty, category;

    Comb() {
        this("Plastic","Black","Vega","Hair", "Daily","Box","India","High","Strong","Medium",
             40,20,4,50.0,30.0,true,true,"Matte","1yr","Personal");
    }

    Comb(String material,String color,String brand,String type,String usage,String packaging,
         String origin,String quality,String durability,String size,int teethCount,int length,
         int rating,double price,double weight,boolean isFlexible,boolean isAvailable,
         String finish,String warranty,String category){
        this.material=material; this.color=color; this.brand=brand; this.type=type;
        this.usage=usage; this.packaging=packaging; this.origin=origin; this.quality=quality;
        this.durability=durability; this.size=size; this.teethCount=teethCount;
        this.length=length; this.rating=rating; this.price=price; this.weight=weight;
        this.isFlexible=isFlexible; this.isAvailable=isAvailable; this.finish=finish;
        this.warranty=warranty; this.category=category;
    }

    Comb(String brand,double price){
        this("Wood","Brown",brand,"Hair","Daily","Cover","India","Premium","Strong","Large",
             50,25,5,price,40.0,true,true,"Glossy","2yr","Personal");
    }

    void getDetails(){
        System.out.println("Brand: "+brand+" Price: "+price+" Teeth: "+teethCount);
    }
}
class PaperCups {
    String material, color, brand, size, usage, pattern, origin, quality, coating, category;
    int capacity, quantity, rating;
    double price, weight;
    boolean isDisposable, isEcoFriendly;
    String shape, packaging, design, temperatureType;

    PaperCups(){
        this("Paper","White","EcoCup","Small","Tea","Plain","India","Good","Wax","Disposable",
             150,50,4,100.0,200.0,true,true,"Round","Pack","Simple","Hot");
    }

    PaperCups(String material,String color,String brand,String size,String usage,String pattern,String origin,
              String quality,String coating,String category,int capacity,int quantity,int rating,double price,
              double weight,boolean isDisposable,boolean isEcoFriendly,String shape,String packaging,
              String design,String temperatureType){
        this.material=material; this.color=color; this.brand=brand; this.size=size;
        this.usage=usage; this.pattern=pattern; this.origin=origin; this.quality=quality;
        this.coating=coating; this.category=category; this.capacity=capacity;
        this.quantity=quantity; this.rating=rating; this.price=price; this.weight=weight;
        this.isDisposable=isDisposable; this.isEcoFriendly=isEcoFriendly;
        this.shape=shape; this.packaging=packaging; this.design=design; this.temperatureType=temperatureType;
    }

    PaperCups(String brand,double price){
        this("Paper","Brown",brand,"Medium","Coffee","Printed","India","Premium","Double","Disposable",
             200,100,5,price,300.0,true,true,"Round","Box","Fancy","Hot");
    }

    void getDetails(){
        System.out.println("Brand: "+brand+" Quantity: "+quantity+" Price: "+price);
    }
}
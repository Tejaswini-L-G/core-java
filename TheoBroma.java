class TheoBroma {
    String bakeryName, itemType, flavor, size, packaging, origin, quality, category, chefName, storeType;
    int quantity, rating;
    double price, weight;
    boolean isFresh, isEggless;
    String expiry, ingredients, design, deliveryType;

    TheoBroma(){
        this("TheoBroma","Cake","Chocolate","Medium","Box","India","Premium","Bakery","ChefA","Online",
             1,5,800.0,1.0,true,true,"2 days","Cocoa","Classic","Home Delivery");
    }

    TheoBroma(String bakeryName,String itemType,String flavor,String size,String packaging,String origin,
              String quality,String category,String chefName,String storeType,int quantity,int rating,
              double price,double weight,boolean isFresh,boolean isEggless,String expiry,
              String ingredients,String design,String deliveryType){
        this.bakeryName=bakeryName; this.itemType=itemType; this.flavor=flavor;
        this.size=size; this.packaging=packaging; this.origin=origin;
        this.quality=quality; this.category=category; this.chefName=chefName;
        this.storeType=storeType; this.quantity=quantity; this.rating=rating;
        this.price=price; this.weight=weight; this.isFresh=isFresh;
        this.isEggless=isEggless; this.expiry=expiry; this.ingredients=ingredients;
        this.design=design; this.deliveryType=deliveryType;
    }

    TheoBroma(String bakeryName,double price){
        this(bakeryName,"Pastry","Vanilla","Small","Pack","India","Good","Bakery","ChefB","Online",
             2,4,price,0.5,true,false,"1 day","Milk","Simple","Pickup");
    }

    void getDetails(){
        System.out.println("Bakery: "+bakeryName+" Item: "+itemType+" Price: "+price);
    }
}
class LionDates {
    String brand, type, quality, origin, packaging, category, taste, color, size, supplier;
    int quantity, rating;
    double price, weight;
    boolean isSeedless, isOrganic;
    String variety, expiry, storage, certification;

    LionDates(){
        this("Lion","Premium","High","Saudi","Box","DryFruit","Sweet","Brown","Medium","LionCo",
             1,5,300.0,500.0,true,true,"Ajwa","2026","Cool","ISO");
    }

    LionDates(String brand,String type,String quality,String origin,String packaging,String category,
              String taste,String color,String size,String supplier,int quantity,int rating,double price,
              double weight,boolean isSeedless,boolean isOrganic,String variety,String expiry,
              String storage,String certification){
        this.brand=brand; this.type=type; this.quality=quality; this.origin=origin;
        this.packaging=packaging; this.category=category; this.taste=taste; this.color=color;
        this.size=size; this.supplier=supplier; this.quantity=quantity; this.rating=rating;
        this.price=price; this.weight=weight; this.isSeedless=isSeedless;
        this.isOrganic=isOrganic; this.variety=variety; this.expiry=expiry;
        this.storage=storage; this.certification=certification;
    }

    LionDates(String brand,double price){
        this(brand,"Standard","Good","UAE","Pack","DryFruit","Sweet","Dark","Large","Local",
             2,4,price,600.0,true,false,"Medjool","2025","Room","FSSAI");
    }

    void getDetails(){
        System.out.println("Brand: "+brand+" Variety: "+variety+" Price: "+price);
    }
}
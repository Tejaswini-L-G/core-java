class PlasticPlate {
    String material, color, brand, shape, size, usage, pattern, origin, quality, category;
    int diameter, quantity, rating;
    double price, weight;
    boolean isReusable, isMicrowaveSafe;
    String design, packaging, finish, type;

    PlasticPlate(){
        this("Plastic","White","ServeWell","Round","Medium","Dining","Plain","India","Good","Kitchen",
             10,50,4,200.0,300.0,true,false,"Simple","Pack","Matte","Plate");
    }

    PlasticPlate(String material,String color,String brand,String shape,String size,String usage,String pattern,
                 String origin,String quality,String category,int diameter,int quantity,int rating,double price,
                 double weight,boolean isReusable,boolean isMicrowaveSafe,String design,String packaging,
                 String finish,String type){
        this.material=material; this.color=color; this.brand=brand; this.shape=shape;
        this.size=size; this.usage=usage; this.pattern=pattern; this.origin=origin;
        this.quality=quality; this.category=category; this.diameter=diameter;
        this.quantity=quantity; this.rating=rating; this.price=price; this.weight=weight;
        this.isReusable=isReusable; this.isMicrowaveSafe=isMicrowaveSafe;
        this.design=design; this.packaging=packaging; this.finish=finish; this.type=type;
    }

    PlasticPlate(String brand,double price){
        this("Plastic","Blue",brand,"Square","Large","Dining","Printed","India","Premium","Kitchen",
             12,30,5,price,350.0,true,true,"Modern","Box","Glossy","Plate");
    }

    void getDetails(){
        System.out.println("Brand: "+brand+" Quantity: "+quantity+" Price: "+price);
    }
}
class SoapHolder {
    String material, color, brand, type, shape, usage, mountingType, origin, finish, category;
    int slots, rating;
    double price, weight;
    boolean isWallMounted, isRustProof;
    String design, warranty, size, drainageType;

    SoapHolder(){
        this("Plastic","White","HomeBasics","Bathroom","Oval","Daily","Wall","India","Matte","Bathroom",
             2,4,150.0,200.0,true,true,"Modern","1yr","Medium","Hole");
    }

    SoapHolder(String material,String color,String brand,String type,String shape,String usage,String mountingType,
               String origin,String finish,String category,int slots,int rating,double price,double weight,
               boolean isWallMounted,boolean isRustProof,String design,String warranty,String size,String drainageType){
        this.material=material; this.color=color; this.brand=brand; this.type=type;
        this.shape=shape; this.usage=usage; this.mountingType=mountingType;
        this.origin=origin; this.finish=finish; this.category=category;
        this.slots=slots; this.rating=rating; this.price=price; this.weight=weight;
        this.isWallMounted=isWallMounted; this.isRustProof=isRustProof;
        this.design=design; this.warranty=warranty; this.size=size; this.drainageType=drainageType;
    }

    SoapHolder(String brand,double price){
        this("Steel","Silver",brand,"Bathroom","Rectangle","Daily","Wall","India","Glossy","Bathroom",
             3,5,price,300.0,true,true,"Classic","2yr","Large","Slit");
    }

    void getDetails(){
        System.out.println("Brand: "+brand+" Type: "+type+" Price: "+price);
    }
}
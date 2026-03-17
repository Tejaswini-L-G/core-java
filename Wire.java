class Wire {
    String material, color, type, usage, insulation, brand, origin, quality, category, coating;
    int length, rating;
    double price, thickness;
    boolean isFlexible, isDurable;
    String voltage, warranty, packaging, size;

    Wire(){
        this("Copper","Red","Electric","House","PVC","Finolex","India","High","Electrical","Rubber",
             100,5,2000.0,2.5,true,true,"220V","2yr","Roll","Medium");
    }

    Wire(String material,String color,String type,String usage,String insulation,String brand,String origin,
         String quality,String category,String coating,int length,int rating,double price,double thickness,
         boolean isFlexible,boolean isDurable,String voltage,String warranty,String packaging,String size){
        this.material=material; this.color=color; this.type=type; this.usage=usage;
        this.insulation=insulation; this.brand=brand; this.origin=origin;
        this.quality=quality; this.category=category; this.coating=coating;
        this.length=length; this.rating=rating; this.price=price; this.thickness=thickness;
        this.isFlexible=isFlexible; this.isDurable=isDurable;
        this.voltage=voltage; this.warranty=warranty; this.packaging=packaging; this.size=size;
    }

    Wire(String brand,double price){
        this("Aluminum","Black","Cable","Industrial","PVC",brand,"India","Medium","Electrical","Plastic",
             200,4,price,3.0,true,true,"440V","1yr","Bundle","Large");
    }

    void getDetails(){
        System.out.println("Brand: "+brand+" Length: "+length+" Price: "+price);
    }
}
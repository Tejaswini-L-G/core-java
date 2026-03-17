class Cylinder {
    String gasType, brand, color, material, usage, safetyFeatures, origin, certification, valveType, category;
    int capacity, weight, height;
    double price, pressure;
    boolean isFilled, isAvailable;
    String warranty, regulatorType, supplier;

    Cylinder(){
        this("LPG","HP","Red","Steel","Cooking","High","India","ISO","Standard","Gas",
             14,30,60,1000.0,200.0,true,true,"2yr","Auto","HP Gas");
    }

    Cylinder(String gasType,String brand,String color,String material,String usage,String safetyFeatures,
             String origin,String certification,String valveType,String category,int capacity,int weight,
             int height,double price,double pressure,boolean isFilled,boolean isAvailable,
             String warranty,String regulatorType,String supplier){
        this.gasType=gasType; this.brand=brand; this.color=color; this.material=material;
        this.usage=usage; this.safetyFeatures=safetyFeatures; this.origin=origin;
        this.certification=certification; this.valveType=valveType; this.category=category;
        this.capacity=capacity; this.weight=weight; this.height=height;
        this.price=price; this.pressure=pressure; this.isFilled=isFilled;
        this.isAvailable=isAvailable; this.warranty=warranty;
        this.regulatorType=regulatorType; this.supplier=supplier;
    }

    Cylinder(String brand,double price){
        this("LPG",brand,"Blue","Steel","Cooking","Medium","India","ISO","Standard","Gas",
             10,25,50,price,180.0,true,true,"1yr","Manual","Local");
    }

    void getDetails(){
        System.out.println("Brand: "+brand+" Capacity: "+capacity+" Price: "+price);
    }
}
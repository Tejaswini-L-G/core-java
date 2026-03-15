class Watch {
    int watchId;
    String brand;
    String model;
    double price;
    int batteryDays;
    int waterResistance;
    String color;
    String strapMaterial;
    double dialSize;
    int features;
    String origin;
    int warranty;

    Watch(int watchId){
        this.watchId=watchId;
    }

    Watch(String brand, int watchId){
        this.brand=brand;
    }

    Watch(String model, String brand){
        this.model=model;
    }

    Watch(double price, String model){
        this.price=price;
    }

    Watch(int batteryDays, double price){
        this.batteryDays=batteryDays;
    }

    Watch(int waterResistance, int batteryDays){
        this.waterResistance=waterResistance;
    }

    Watch(String color, int waterResistance){
        this.color=color;
    }

    Watch(String strapMaterial, String color){
        this.strapMaterial=strapMaterial;
    }

    Watch(double dialSize, String strapMaterial){
        this.dialSize=dialSize;
    }

    Watch(int features, double dialSize){
        this.features=features;
    }

    Watch(String origin, int features){
        this.origin=origin;
    }

    Watch(int warranty, String origin){
        this.warranty=warranty;
    }

}

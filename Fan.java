class Fan {
    int fanId;
    String brand;
    String type;
    double price;
    int speedLevels;
    int power;
    String color;
    String material;
    double bladeSize;
    int blades;
    String origin;
    int warranty;

    Fan(int fanId){
        this.fanId=fanId;
    }

    Fan(String brand, int fanId){
        this.brand=brand;
    }

    Fan(String type, String brand){
        this.type=type;
    }

    Fan(double price, String type){
        this.price=price;
    }

    Fan(int speedLevels, double price){
        this.speedLevels=speedLevels;
    }

    Fan(int power, int speedLevels){
        this.power=power;
    }

    Fan(String color, int power){
        this.color=color;
    }

    Fan(String material, String color){
        this.material=material;
    }

    Fan(double bladeSize, String material){
        this.bladeSize=bladeSize;
    }

    Fan(int blades, double bladeSize){
        this.blades=blades;
    }

    Fan(String origin, int blades){
        this.origin=origin;
    }

    Fan(int warranty, String origin){
        this.warranty=warranty;
    }

}

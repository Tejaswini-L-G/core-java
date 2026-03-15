class Bottle {
    int bottleId;
    String brand;
    String material;
    double price;
    int capacity;
    int weight;
    String color;
    String capType;
    double height;
    int diameter;
    String origin;
    int warranty;

    Bottle(int bottleId){
        this.bottleId=bottleId;
    }

    Bottle(String brand, int bottleId){
        this.brand=brand;
    }

    Bottle(String material, String brand){
        this.material=material;
    }

    Bottle(double price, String material){
        this.price=price;
    }

    Bottle(int capacity, double price){
        this.capacity=capacity;
    }

    Bottle(int weight, int capacity){
        this.weight=weight;
    }

    Bottle(String color, int weight){
        this.color=color;
    }

    Bottle(String capType, String color){
        this.capType=capType;
    }

    Bottle(double height, String capType){
        this.height=height;
    }

    Bottle(int diameter, double height){
        this.diameter=diameter;
    }

    Bottle(String origin, int diameter){
        this.origin=origin;
    }

    Bottle(int warranty, String origin){
        this.warranty=warranty;
    }

}

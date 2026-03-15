class Lamp {
    int lampId;
    String brand;
    String type;
    double price;
    int power;
    int brightness;
    String color;
    String material;
    double height;
    int modes;
    String origin;
    int warranty;

    Lamp(int lampId){
        this.lampId=lampId;
    }

    Lamp(String brand, int lampId){
        this.brand=brand;
    }

    Lamp(String type, String brand){
        this.type=type;
    }

    Lamp(double price, String type){
        this.price=price;
    }

    Lamp(int power, double price){
        this.power=power;
    }

    Lamp(int brightness, int power){
        this.brightness=brightness;
    }

    Lamp(String color, int brightness){
        this.color=color;
    }

    Lamp(String material, String color){
        this.material=material;
    }

    Lamp(double height, String material){
        this.height=height;
    }

    Lamp(int modes, double height){
        this.modes=modes;
    }

    Lamp(String origin, int modes){
        this.origin=origin;
    }

    Lamp(int warranty, String origin){
        this.warranty=warranty;
    }

}

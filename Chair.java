class Chair {
    int chairId;
    String brand;
    String material;
    double price;
    int height;
    int width;
    String color;
    String type;
    double weight;
    int legs;
    String origin;
    int warranty;

    Chair(int chairId){
        this.chairId=chairId;
    }

    Chair(String brand, int chairId){
        this.brand=brand;
    }

    Chair(String material, String brand){
        this.material=material;
    }

    Chair(double price, String material){
        this.price=price;
    }

    Chair(int height, double price){
        this.height=height;
    }

    Chair(int width, int height){
        this.width=width;
    }

    Chair(String color, int width){
        this.color=color;
    }

    Chair(String type, String color){
        this.type=type;
    }

    Chair(double weight, String type){
        this.weight=weight;
    }

    Chair(int legs, double weight){
        this.legs=legs;
    }

    Chair(String origin, int legs){
        this.origin=origin;
    }

    Chair(int warranty, String origin){
        this.warranty=warranty;
    }

}

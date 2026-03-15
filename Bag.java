class Bag {
    int bagId;
    String brand;
    String material;
    double price;
    int capacity;
    int pockets;
    String color;
    String type;
    double weight;
    int zippers;
    String origin;
    int warranty;

    Bag(int bagId){
        this.bagId=bagId;
    }

    Bag(String brand, int bagId){
        this.brand=brand;
    }

    Bag(String material, String brand){
        this.material=material;
    }

    Bag(double price, String material){
        this.price=price;
    }

    Bag(int capacity, double price){
        this.capacity=capacity;
    }

    Bag(int pockets, int capacity){
        this.pockets=pockets;
    }

    Bag(String color, int pockets){
        this.color=color;
    }

    Bag(String type, String color){
        this.type=type;
    }

    Bag(double weight, String type){
        this.weight=weight;
    }

    Bag(int zippers, double weight){
        this.zippers=zippers;
    }

    Bag(String origin, int zippers){
        this.origin=origin;
    }

    Bag(int warranty, String origin){
        this.warranty=warranty;
    }

}

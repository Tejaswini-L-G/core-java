class Pen {
    int penId;
    String brand;
    String inkColor;
    double price;
    int length;
    int weight;
    String type;
    String material;
    double tipSize;
    int inkLevel;
    String origin;
    int warranty;

    Pen(int penId){
        this.penId=penId;
    }

    Pen(String brand, int penId){
        this.brand=brand;
    }

    Pen(String inkColor, String brand){
        this.inkColor=inkColor;
    }

    Pen(double price, String inkColor){
        this.price=price;
    }

    Pen(int length, double price){
        this.length=length;
    }

    Pen(int weight, int length){
        this.weight=weight;
    }

    Pen(String type, int weight){
        this.type=type;
    }

    Pen(String material, String type){
        this.material=material;
    }

    Pen(double tipSize, String material){
        this.tipSize=tipSize;
    }

    Pen(int inkLevel, double tipSize){
        this.inkLevel=inkLevel;
    }

    Pen(String origin, int inkLevel){
        this.origin=origin;
    }

    Pen(int warranty, String origin){
        this.warranty=warranty;
    }

}

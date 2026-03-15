class Helmet {
    int helmetId;
    String brand;
    String type;
    double price;
    int size;
    int weight;
    String color;
    String material;
    double visorSize;
    int vents;
    String origin;
    int warranty;

    Helmet(int helmetId){
        this.helmetId=helmetId;
    }

    Helmet(String brand, int helmetId){
        this.brand=brand;
    }

    Helmet(String type, String brand){
        this.type=type;
    }

    Helmet(double price, String type){
        this.price=price;
    }

    Helmet(int size, double price){
        this.size=size;
    }

    Helmet(int weight, int size){
        this.weight=weight;
    }

    Helmet(String color, int weight){
        this.color=color;
    }

    Helmet(String material, String color){
        this.material=material;
    }

    Helmet(double visorSize, String material){
        this.visorSize=visorSize;
    }

    Helmet(int vents, double visorSize){
        this.vents=vents;
    }

    Helmet(String origin, int vents){
        this.origin=origin;
    }

    Helmet(int warranty, String origin){
        this.warranty=warranty;
    }

}

class Glass {
    int glassId;
    String brand;
    String material;
    double price;
    int capacityMl;
    int heightCm;
    String color;
    String type;
    double weight;
    int diameterMm;
    String origin;
    int warranty;

    Glass(int glassId){
        this.glassId=glassId;
    }

    Glass(String brand, int glassId){
        this.brand=brand;
    }

    Glass(String material, String brand){
        this.material=material;
    }

    Glass(double price, String material){
        this.price=price;
    }

    Glass(int capacityMl, double price){
        this.capacityMl=capacityMl;
    }

    Glass(int heightCm, int capacityMl){
        this.heightCm=heightCm;
    }

    Glass(String color, int heightCm){
        this.color=color;
    }

    Glass(String type, String color){
        this.type=type;
    }

    Glass(double weight, String type){
        this.weight=weight;
    }

    Glass(int diameterMm, double weight){
        this.diameterMm=diameterMm;
    }

    Glass(String origin, int diameterMm){
        this.origin=origin;
    }

    Glass(int warranty, String origin){
        this.warranty=warranty;
    }

}

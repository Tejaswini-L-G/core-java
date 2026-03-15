class Cup {
    int cupId;
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

    Cup(int cupId){
        this.cupId=cupId;
    }

    Cup(String brand, int cupId){
        this.brand=brand;
    }

    Cup(String material, String brand){
        this.material=material;
    }

    Cup(double price, String material){
        this.price=price;
    }

    Cup(int capacityMl, double price){
        this.capacityMl=capacityMl;
    }

    Cup(int heightCm, int capacityMl){
        this.heightCm=heightCm;
    }

    Cup(String color, int heightCm){
        this.color=color;
    }

    Cup(String type, String color){
        this.type=type;
    }

    Cup(double weight, String type){
        this.weight=weight;
    }

    Cup(int diameterMm, double weight){
        this.diameterMm=diameterMm;
    }

    Cup(String origin, int diameterMm){
        this.origin=origin;
    }

    Cup(int warranty, String origin){
        this.warranty=warranty;
    }

}

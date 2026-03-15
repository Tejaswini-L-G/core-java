class Plate {
    int plateId;
    String brand;
    String material;
    double price;
    int diameterCm;
    int weightG;
    String color;
    String shape;
    double thicknessMm;
    int pieces;
    String origin;
    int warranty;

    Plate(int plateId){
        this.plateId=plateId;
    }

    Plate(String brand, int plateId){
        this.brand=brand;
    }

    Plate(String material, String brand){
        this.material=material;
    }

    Plate(double price, String material){
        this.price=price;
    }

    Plate(int diameterCm, double price){
        this.diameterCm=diameterCm;
    }

    Plate(int weightG, int diameterCm){
        this.weightG=weightG;
    }

    Plate(String color, int weightG){
        this.color=color;
    }

    Plate(String shape, String color){
        this.shape=shape;
    }

    Plate(double thicknessMm, String shape){
        this.thicknessMm=thicknessMm;
    }

    Plate(int pieces, double thicknessMm){
        this.pieces=pieces;
    }

    Plate(String origin, int pieces){
        this.origin=origin;
    }

    Plate(int warranty, String origin){
        this.warranty=warranty;
    }

}

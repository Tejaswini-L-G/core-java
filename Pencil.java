class Pencil {
    int pencilId;
    String brand;
    String type;
    double price;
    int lengthCm;
    int weightG;
    String color;
    String material;
    double tipSize;
    int hardness;
    String origin;
    int packSize;

    Pencil(int pencilId){
        this.pencilId=pencilId;
    }

    Pencil(String brand, int pencilId){
        this.brand=brand;
    }

    Pencil(String type, String brand){
        this.type=type;
    }

    Pencil(double price, String type){
        this.price=price;
    }

    Pencil(int lengthCm, double price){
        this.lengthCm=lengthCm;
    }

    Pencil(int weightG, int lengthCm){
        this.weightG=weightG;
    }

    Pencil(String color, int weightG){
        this.color=color;
    }

    Pencil(String material, String color){
        this.material=material;
    }

    Pencil(double tipSize, String material){
        this.tipSize=tipSize;
    }

    Pencil(int hardness, double tipSize){
        this.hardness=hardness;
    }

    Pencil(String origin, int hardness){
        this.origin=origin;
    }

    Pencil(int packSize, String origin){
        this.packSize=packSize;
    }

}

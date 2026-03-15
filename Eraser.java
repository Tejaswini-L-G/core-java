class Eraser {
    int eraserId;
    String brand;
    String material;
    double price;
    int lengthMm;
    int widthMm;
    String color;
    String type;
    double weight;
    int pieces;
    String origin;
    int stock;

    Eraser(int eraserId){
        this.eraserId=eraserId;
    }

    Eraser(String brand, int eraserId){
        this.brand=brand;
    }

    Eraser(String material, String brand){
        this.material=material;
    }

    Eraser(double price, String material){
        this.price=price;
    }

    Eraser(int lengthMm, double price){
        this.lengthMm=lengthMm;
    }

    Eraser(int widthMm, int lengthMm){
        this.widthMm=widthMm;
    }

    Eraser(String color, int widthMm){
        this.color=color;
    }

    Eraser(String type, String color){
        this.type=type;
    }

    Eraser(double weight, String type){
        this.weight=weight;
    }

    Eraser(int pieces, double weight){
        this.pieces=pieces;
    }

    Eraser(String origin, int pieces){
        this.origin=origin;
    }

    Eraser(int stock, String origin){
        this.stock=stock;
    }

}

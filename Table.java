class Table {
    int tableId;
    String brand;
    String material;
    double price;
    int height;
    int width;
    String shape;
    String color;
    double weight;
    int legs;
    String origin;
    int warranty;

    Table(int tableId){
        this.tableId=tableId;
    }

    Table(String brand, int tableId){
        this.brand=brand;
    }

    Table(String material, String brand){
        this.material=material;
    }

    Table(double price, String material){
        this.price=price;
    }

    Table(int height, double price){
        this.height=height;
    }

    Table(int width, int height){
        this.width=width;
    }

    Table(String shape, int width){
        this.shape=shape;
    }

    Table(String color, String shape){
        this.color=color;
    }

    Table(double weight, String color){
        this.weight=weight;
    }

    Table(int legs, double weight){
        this.legs=legs;
    }

    Table(String origin, int legs){
        this.origin=origin;
    }

    Table(int warranty, String origin){
        this.warranty=warranty;
    }

}

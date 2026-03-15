class Printer {
    int printerId;
    String brand;
    String type;
    double price;
    int printSpeed;
    int resolution;
    String colorMode;
    String connectionType;
    double weight;
    int paperCapacity;
    String origin;
    int warranty;

    Printer(int printerId){
        this.printerId=printerId;
    }

    Printer(String brand, int printerId){
        this.brand=brand;
    }

    Printer(String type, String brand){
        this.type=type;
    }

    Printer(double price, String type){
        this.price=price;
    }

    Printer(int printSpeed, double price){
        this.printSpeed=printSpeed;
    }

    Printer(int resolution, int printSpeed){
        this.resolution=resolution;
    }

    Printer(String colorMode, int resolution){
        this.colorMode=colorMode;
    }

    Printer(String connectionType, String colorMode){
        this.connectionType=connectionType;
    }

    Printer(double weight, String connectionType){
        this.weight=weight;
    }

    Printer(int paperCapacity, double weight){
        this.paperCapacity=paperCapacity;
    }

    Printer(String origin, int paperCapacity){
        this.origin=origin;
    }

    Printer(int warranty, String origin){
        this.warranty=warranty;
    }

}

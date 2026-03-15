class Monitor {
    int monitorId;
    String brand;
    String model;
    double price;
    int refreshRate;
    int resolution;
    String panelType;
    String color;
    double screenSize;
    int ports;
    String origin;
    int warranty;

    Monitor(int monitorId){
        this.monitorId=monitorId;
    }

    Monitor(String brand, int monitorId){
        this.brand=brand;
    }

    Monitor(String model, String brand){
        this.model=model;
    }

    Monitor(double price, String model){
        this.price=price;
    }

    Monitor(int refreshRate, double price){
        this.refreshRate=refreshRate;
    }

    Monitor(int resolution, int refreshRate){
        this.resolution=resolution;
    }

    Monitor(String panelType, int resolution){
        this.panelType=panelType;
    }

    Monitor(String color, String panelType){
        this.color=color;
    }

    Monitor(double screenSize, String color){
        this.screenSize=screenSize;
    }

    Monitor(int ports, double screenSize){
        this.ports=ports;
    }

    Monitor(String origin, int ports){
        this.origin=origin;
    }

    Monitor(int warranty, String origin){
        this.warranty=warranty;
    }

}

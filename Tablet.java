class Tablet {
    int tabletId;
    String brand;
    String model;
    double price;
    int ramGB;
    int storageGB;
    String color;
    String processor;
    double screenSize;
    int batteryMah;
    String os;
    int warranty;

    Tablet(int tabletId){
        this.tabletId=tabletId;
    }

    Tablet(String brand, int tabletId){
        this.brand=brand;
    }

    Tablet(String model, String brand){
        this.model=model;
    }

    Tablet(double price, String model){
        this.price=price;
    }

    Tablet(int ramGB, double price){
        this.ramGB=ramGB;
    }

    Tablet(int storageGB, int ramGB){
        this.storageGB=storageGB;
    }

    Tablet(String color, int storageGB){
        this.color=color;
    }

    Tablet(String processor, String color){
        this.processor=processor;
    }

    Tablet(double screenSize, String processor){
        this.screenSize=screenSize;
    }

    Tablet(int batteryMah, double screenSize){
        this.batteryMah=batteryMah;
    }

    Tablet(String os, int batteryMah){
        this.os=os;
    }

    Tablet(int warranty, String os){
        this.warranty=warranty;
    }

}

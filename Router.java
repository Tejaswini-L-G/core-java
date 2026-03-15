class Router {
    int routerId;
    String brand;
    String model;
    double price;
    int speedMbps;
    int antennas;
    String color;
    String type;
    double weight;
    int ports;
    String origin;
    int warranty;

    Router(int routerId){
        this.routerId=routerId;
    }

    Router(String brand, int routerId){
        this.brand=brand;
    }

    Router(String model, String brand){
        this.model=model;
    }

    Router(double price, String model){
        this.price=price;
    }

    Router(int speedMbps, double price){
        this.speedMbps=speedMbps;
    }

    Router(int antennas, int speedMbps){
        this.antennas=antennas;
    }

    Router(String color, int antennas){
        this.color=color;
    }

    Router(String type, String color){
        this.type=type;
    }

    Router(double weight, String type){
        this.weight=weight;
    }

    Router(int ports, double weight){
        this.ports=ports;
    }

    Router(String origin, int ports){
        this.origin=origin;
    }

    Router(int warranty, String origin){
        this.warranty=warranty;
    }

}

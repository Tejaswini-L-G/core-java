class Charger {
    int chargerId;
    String brand;
    String type;
    double price;
    int powerWatt;
    int voltage;
    String color;
    String connectorType;
    double weight;
    int cableLength;
    String origin;
    int warranty;

    Charger(int chargerId){
        this.chargerId=chargerId;
    }

    Charger(String brand, int chargerId){
        this.brand=brand;
    }

    Charger(String type, String brand){
        this.type=type;
    }

    Charger(double price, String type){
        this.price=price;
    }

    Charger(int powerWatt, double price){
        this.powerWatt=powerWatt;
    }

    Charger(int voltage, int powerWatt){
        this.voltage=voltage;
    }

    Charger(String color, int voltage){
        this.color=color;
    }

    Charger(String connectorType, String color){
        this.connectorType=connectorType;
    }

    Charger(double weight, String connectorType){
        this.weight=weight;
    }

    Charger(int cableLength, double weight){
        this.cableLength=cableLength;
    }

    Charger(String origin, int cableLength){
        this.origin=origin;
    }

    Charger(int warranty, String origin){
        this.warranty=warranty;
    }

}

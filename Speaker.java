class Speaker {
    int speakerId;
    String brand;
    String model;
    double price;
    int power;
    int battery;
    String color;
    String type;
    double weight;
    int range;
    String origin;
    int warranty;

    Speaker(int speakerId){
        this.speakerId=speakerId;
    }

    Speaker(String brand, int speakerId){
        this.brand=brand;
    }

    Speaker(String model, String brand){
        this.model=model;
    }

    Speaker(double price, String model){
        this.price=price;
    }

    Speaker(int power, double price){
        this.power=power;
    }

    Speaker(int battery, int power){
        this.battery=battery;
    }

    Speaker(String color, int battery){
        this.color=color;
    }

    Speaker(String type, String color){
        this.type=type;
    }

    Speaker(double weight, String type){
        this.weight=weight;
    }

    Speaker(int range, double weight){
        this.range=range;
    }

    Speaker(String origin, int range){
        this.origin=origin;
    }

    Speaker(int warranty, String origin){
        this.warranty=warranty;
    }

}

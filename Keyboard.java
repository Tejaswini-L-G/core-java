class Keyboard {
    int keyboardId;
    String brand;
    String type;
    double price;
    int keys;
    int weight;
    String color;
    String connectionType;
    double length;
    int backlightLevels;
    String origin;
    int warranty;

    Keyboard(int keyboardId){
        this.keyboardId=keyboardId;
    }

    Keyboard(String brand, int keyboardId){
        this.brand=brand;
    }

    Keyboard(String type, String brand){
        this.type=type;
    }

    Keyboard(double price, String type){
        this.price=price;
    }

    Keyboard(int keys, double price){
        this.keys=keys;
    }

    Keyboard(int weight, int keys){
        this.weight=weight;
    }

    Keyboard(String color, int weight){
        this.color=color;
    }

    Keyboard(String connectionType, String color){
        this.connectionType=connectionType;
    }

    Keyboard(double length, String connectionType){
        this.length=length;
    }

    Keyboard(int backlightLevels, double length){
        this.backlightLevels=backlightLevels;
    }

    Keyboard(String origin, int backlightLevels){
        this.origin=origin;
    }

    Keyboard(int warranty, String origin){
        this.warranty=warranty;
    }

}

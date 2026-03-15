class Mouse {
    int mouseId;
    String brand;
    String type;
    double price;
    int dpi;
    int buttons;
    String color;
    String connectionType;
    double weight;
    int batteryLife;
    String origin;
    int warranty;

    Mouse(int mouseId){
        this.mouseId=mouseId;
    }

    Mouse(String brand, int mouseId){
        this.brand=brand;
    }

    Mouse(String type, String brand){
        this.type=type;
    }

    Mouse(double price, String type){
        this.price=price;
    }

    Mouse(int dpi, double price){
        this.dpi=dpi;
    }

    Mouse(int buttons, int dpi){
        this.buttons=buttons;
    }

    Mouse(String color, int buttons){
        this.color=color;
    }

    Mouse(String connectionType, String color){
        this.connectionType=connectionType;
    }

    Mouse(double weight, String connectionType){
        this.weight=weight;
    }

    Mouse(int batteryLife, double weight){
        this.batteryLife=batteryLife;
    }

    Mouse(String origin, int batteryLife){
        this.origin=origin;
    }

    Mouse(int warranty, String origin){
        this.warranty=warranty;
    }

}

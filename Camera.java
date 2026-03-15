class Camera {
    int cameraId;
    String brand;
    String model;
    double price;
    int megapixels;
    int zoom;
    String lensType;
    String color;
    double weight;
    int batteryCapacity;
    String origin;
    int warranty;

    Camera(int cameraId){
        this.cameraId=cameraId;
    }

    Camera(String brand, int cameraId){
        this.brand=brand;
    }

    Camera(String model, String brand){
        this.model=model;
    }

    Camera(double price, String model){
        this.price=price;
    }

    Camera(int megapixels, double price){
        this.megapixels=megapixels;
    }

    Camera(int zoom, int megapixels){
        this.zoom=zoom;
    }

    Camera(String lensType, int zoom){
        this.lensType=lensType;
    }

    Camera(String color, String lensType){
        this.color=color;
    }

    Camera(double weight, String color){
        this.weight=weight;
    }

    Camera(int batteryCapacity, double weight){
        this.batteryCapacity=batteryCapacity;
    }

    Camera(String origin, int batteryCapacity){
        this.origin=origin;
    }

    Camera(int warranty, String origin){
        this.warranty=warranty;
    }

}

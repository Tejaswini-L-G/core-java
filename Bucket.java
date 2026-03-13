class Bucket {

    String brand;
    String color;
    int capacity;
    String material;
    double price;

    Bucket(){
        System.out.println("Default constructor of Bucket created");
    }

    Bucket(String brand,String color,int capacity,String material,double price){
        this.brand=brand;
        this.color=color;
        this.capacity=capacity;
        this.material=material;
        this.price=price;
    }
}
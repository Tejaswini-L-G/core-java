class Jacket {

    String brand;
    String color;
    String material;
    String size;
    double price;

    Jacket(){
        System.out.println("Default constructor of Jacket created");
    }

    Jacket(String brand,String color,String material,String size,double price){
        this.brand=brand;
        this.color=color;
        this.material=material;
        this.size=size;
        this.price=price;
    }
}
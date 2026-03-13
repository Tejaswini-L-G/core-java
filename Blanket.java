class Blanket {

    String brand;
    String color;
    String material;
    String size;
    double price;
    double weight;

    Blanket(){
        System.out.println("Default constructor of Blanket created");
    }

    Blanket(String brand,String color,String material,String size,double price,double weight){
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.size = size;
        this.price = price;
        this.weight = weight;
    }
}
class ShoeLace {

    String brand;
    String color;
    String material;
    int length;
    double price;
    String type;
    String shape;
    String durability;
    String shoeType;
    String originCountry;

    ShoeLace(){
        System.out.println("Default constructor of ShoeLace created");
    }

    ShoeLace(String brand,String color,String material,int length,double price,
             String type,String shape,String durability,String shoeType,String originCountry){

        this.brand=brand;
        this.color=color;
        this.material=material;
        this.length=length;
        this.price=price;
        this.type=type;
        this.shape=shape;
        this.durability=durability;
        this.shoeType=shoeType;
        this.originCountry=originCountry;
    }
}
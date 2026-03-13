class Bracelet {

    String material;
    String color;
    String design;
    double price;
    String brand;
    String size;
    String type;
    double weight;
    String stone;
    String finish;
    String style;
    String shape;
    String origin;
    String claspType;
    String plating;
    String gender;
    String pattern;
    String texture;
    String durability;
    String warranty;

    Bracelet(){
        System.out.println("Bracelet object created");
    }

    Bracelet(String material,String color,String design,double price,String brand,String size,String type,double weight,
             String stone,String finish,String style,String shape,String origin,String claspType,String plating,
             String gender,String pattern,String texture,String durability,String warranty){

        this.material=material;
        this.color=color;
        this.design=design;
        this.price=price;
        this.brand=brand;
        this.size=size;
        this.type=type;
        this.weight=weight;
        this.stone=stone;
        this.finish=finish;
        this.style=style;
        this.shape=shape;
        this.origin=origin;
        this.claspType=claspType;
        this.plating=plating;
        this.gender=gender;
        this.pattern=pattern;
        this.texture=texture;
        this.durability=durability;
        this.warranty=warranty;
    }
}
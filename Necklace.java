class Necklace {

    String brand;
    String material;
    String color;
    double weight;
    double price;
    String gemstone;
    int length;
    String claspType;
    String style;
    String design;
    String occasion;
    String gender;
    String originCountry;
    String plating;
    String shape;
    String pattern;
    String chainType;
    String finish;
    int warrantyYears;
    String collection;

    Necklace(){
        System.out.println("Default constructor of Necklace created");
    }

    Necklace(String brand,String material,String color,double weight,double price,
             String gemstone,int length,String claspType,String style,String design,
             String occasion,String gender,String originCountry,String plating,
             String shape,String pattern,String chainType,String finish,
             int warrantyYears,String collection){

        this.brand=brand;
        this.material=material;
        this.color=color;
        this.weight=weight;
        this.price=price;
        this.gemstone=gemstone;
        this.length=length;
        this.claspType=claspType;
        this.style=style;
        this.design=design;
        this.occasion=occasion;
        this.gender=gender;
        this.originCountry=originCountry;
        this.plating=plating;
        this.shape=shape;
        this.pattern=pattern;
        this.chainType=chainType;
        this.finish=finish;
        this.warrantyYears=warrantyYears;
        this.collection=collection;
    }
}
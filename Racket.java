class Racket {

    String brand;
    String sport;
    String color;
    double weight;
    int price;
    String material;
    String gripType;
    int length;
    int balance;
    String country;

    Racket(){
        System.out.println("Default constructor of Racket created");
    }

    Racket(String brand,String sport,String color,double weight,int price,
           String material,String gripType,int length,int balance,String country){

        this.brand=brand;
        this.sport=sport;
        this.color=color;
        this.weight=weight;
        this.price=price;
        this.material=material;
        this.gripType=gripType;
        this.length=length;
        this.balance=balance;
        this.country=country;
    }
}
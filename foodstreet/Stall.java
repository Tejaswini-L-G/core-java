
public class Stall {
    int stallId;
    String name;
    String foodType;
    double price;
    boolean veg;

    public Stall(){}

    public Stall(int stallId,String name,String foodType,double price,boolean veg){
        this.stallId=stallId;
        this.name=name;
        this.foodType=foodType;
        this.price=price;
        this.veg=veg;
    }
}

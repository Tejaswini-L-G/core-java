
public class FoodStreet {

    Stall stall;

    public FoodStreet(){}

    public FoodStreet(Stall stall){
        this.stall=stall;
    }

    public void createStall(Stall stall){
        this.stall=stall;
    }

    public void getDetails(){
        System.out.println("Stall Id : "+stall.stallId);
        System.out.println("Name : "+stall.name);
        System.out.println("Food Type : "+stall.foodType);
        System.out.println("Price : "+stall.price);
        System.out.println("Veg : "+stall.veg);
    }
}

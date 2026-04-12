
public class FoodStreetRunnerMethod {
    public static void main(String[] args) {

        FoodStreet f1=new FoodStreet();
        f1.createStall(new Stall(1,"Dosa Corner","South Indian",50,true));
        f1.getDetails();

        FoodStreet f2=new FoodStreet();
        f2.createStall(new Stall(2,"Burger Hub","Fast Food",120,false));
        f2.getDetails();

        FoodStreet f3=new FoodStreet();
        f3.createStall(new Stall(3,"Chaat Point","Snacks",40,true));
        f3.getDetails();
    }
}

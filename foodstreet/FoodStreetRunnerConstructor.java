
public class FoodStreetRunnerConstructor {
    public static void main(String[] args) {

        FoodStreet f1=new FoodStreet(new Stall(1,"Dosa Corner","South Indian",50,true));
        f1.getDetails();

        FoodStreet f2=new FoodStreet(new Stall(2,"Burger Hub","Fast Food",120,false));
        f2.getDetails();

        FoodStreet f3=new FoodStreet(new Stall(3,"Chaat Point","Snacks",40,true));
        f3.getDetails();
    }
}

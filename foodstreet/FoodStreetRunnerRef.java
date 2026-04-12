
public class FoodStreetRunnerRef {

    public static void main(String[] args) {

        Stall stallOne=new Stall();
        stallOne.stallId=1;
        stallOne.name="Dosa Corner";
        stallOne.foodType="South Indian";
        stallOne.price=50;
        stallOne.veg=true;

        Stall stallTwo=new Stall();
        stallTwo.stallId=2;
        stallTwo.name="Burger Hub";
        stallTwo.foodType="Fast Food";
        stallTwo.price=120;
        stallTwo.veg=false;

        Stall stallThree=new Stall();
        stallThree.stallId=3;
        stallThree.name="Chaat Point";
        stallThree.foodType="Snacks";
        stallThree.price=40;
        stallThree.veg=true;

        FoodStreet foodStreetOne=new FoodStreet();
        foodStreetOne.stall=stallOne;
        foodStreetOne.getDetails();

        FoodStreet foodStreetTwo=new FoodStreet();
        foodStreetTwo.stall=stallTwo;
        foodStreetTwo.getDetails();

        FoodStreet foodStreetThree=new FoodStreet();
        foodStreetThree.stall=stallThree;
        foodStreetThree.getDetails();
    }
}

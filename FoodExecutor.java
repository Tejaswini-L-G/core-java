class FoodExecutor {

    public static void main(String[] args) {

        boolean foodValid;

        System.out.println("Scenario 1");
        foodValid = Food.createFood(
                "Pizza","Veg","Italian","Spicy","Fast Food");
        if(foodValid) Food.getFoodDetails();

        System.out.println("\nScenario 2");
        foodValid = Food.createFood(
                "","Veg","Italian","Spicy","Fast Food");
        if(foodValid) Food.getFoodDetails();

        System.out.println("\nScenario 3");
        foodValid = Food.createFood(
                "Burger","","American","Savory","Fast Food");
        if(foodValid) Food.getFoodDetails();

        System.out.println("\nScenario 4");
        foodValid = Food.createFood(
                "Biryani","Non-Veg","","Spicy","Main Course");
        if(foodValid) Food.getFoodDetails();

        System.out.println("\nScenario 5");
        foodValid = Food.createFood(
                "Pasta","Veg","Italian","","Main Course");
        if(foodValid) Food.getFoodDetails();

        System.out.println("\nScenario 6");
        foodValid = Food.createFood(
                "Dosa","Veg","South Indian","Crispy","");
        if(foodValid) Food.getFoodDetails();

        System.out.println("\nScenario 7");
        foodValid = Food.createFood(
                "Noodles","Veg","Chinese","Spicy","Street Food");
        if(foodValid) Food.getFoodDetails();

        System.out.println("\nScenario 8");
        foodValid = Food.createFood(
                "Ice Cream","Dessert","Global","Sweet","Dessert");
        if(foodValid) Food.getFoodDetails();
    }
}
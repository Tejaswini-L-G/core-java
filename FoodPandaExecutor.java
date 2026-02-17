class FoodPandaExecutor {

    public static void main(String[] args) {

        String foodName = "FoodPandaFood1";
        double price = FoodPanda.search(foodName);
        System.out.println("The price of " + foodName + " is " + price);

    }
}

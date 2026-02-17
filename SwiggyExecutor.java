class SwiggyExecutor {

    public static void main(String[] args) {

        String foodName = "AndhraMeals";
        double price = Swiggy.search(foodName);
        System.out.println("The price of " + foodName + " is " + price);

    }
}

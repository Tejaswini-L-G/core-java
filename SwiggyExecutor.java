class SwiggyExecutor {

    public static void main(String[] args) {

        String foodName = "SwiggyFood1";
        double price = Swiggy.search(foodName);
        System.out.println("The price of " + foodName + " is " + price);

    }
}

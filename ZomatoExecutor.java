class ZomatoExecutor {

    public static void main(String[] args) {

        String foodName = "ZomatoFood1";
        double price = Zomato.search(foodName);
        System.out.println("The price of " + foodName + " is " + price);

    }
}

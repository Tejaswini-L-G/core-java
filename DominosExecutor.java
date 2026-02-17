class DominosExecutor {

    public static void main(String[] args) {

        String foodName = "MargheritaPizza";
        double price = Dominos.search(foodName);
        System.out.println("The price of " + foodName + " is " + price);

    }
}

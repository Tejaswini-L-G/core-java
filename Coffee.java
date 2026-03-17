
class Coffee {

    int coffeeId;
    String coffeeName;
    String beanType;
    double price;
    String size;
	
	 public Coffee() {}

    public Coffee(int coffeeId, String coffeeName, String beanType, double price, String size) {
        this.coffeeId = coffeeId;
        this.coffeeName = coffeeName;
        this.beanType = beanType;
        this.price = price;
        this.size = size;
    }


    public void getCoffeeDetails(){

        System.out.println("Coffee Id: " + this.coffeeId);
        System.out.println("Coffee Name: " + this.coffeeName);
        System.out.println("Bean Type: " + this.beanType);
        System.out.println("Price: " + this.price);
        System.out.println("Size: " + this.size);
    }
}


class Coffee {

    int coffeeId;
    String coffeeName;
    String beanType;
    double price;
    String size;

    public void getCoffeeDetails(){

        System.out.println("Coffee Id: " + this.coffeeId);
        System.out.println("Coffee Name: " + this.coffeeName);
        System.out.println("Bean Type: " + this.beanType);
        System.out.println("Price: " + this.price);
        System.out.println("Size: " + this.size);
    }
}

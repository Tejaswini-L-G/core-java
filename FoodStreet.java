
class FoodStreet {

    int stallId;
    String foodName;
    String cuisine;
    double price;
    String popularity;
	
	 public FoodStreet() {}

    public FoodStreet(int stallId, String foodName, String cuisine, double price, String popularity) {
        this.stallId = stallId;
        this.foodName = foodName;
        this.cuisine = cuisine;
        this.price = price;
        this.popularity = popularity;
    }


    public void getFoodDetails(){

        System.out.println("Stall Id: " + this.stallId);
        System.out.println("Food Name: " + this.foodName);
        System.out.println("Cuisine: " + this.cuisine);
        System.out.println("Price: " + this.price);
        System.out.println("Popularity: " + this.popularity);
    }
}

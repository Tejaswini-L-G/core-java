
class FoodStreet {

    int stallId;
    String foodName;
    String cuisine;
    double price;
    String popularity;

    public void getFoodDetails(){

        System.out.println("Stall Id: " + this.stallId);
        System.out.println("Food Name: " + this.foodName);
        System.out.println("Cuisine: " + this.cuisine);
        System.out.println("Price: " + this.price);
        System.out.println("Popularity: " + this.popularity);
    }
}

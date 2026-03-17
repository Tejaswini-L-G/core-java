
class Shop {

    int shopId;
    String shopName;
    String category;
    int employees;
    String brand;
	
	
	 public Shop() {}

    public Shop(int shopId, String shopName, String category, int employees, String brand) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.category = category;
        this.employees = employees;
        this.brand = brand;
    }

    public void getShopDetails(){

        System.out.println("Shop Id: " + this.shopId);
        System.out.println("Shop Name: " + this.shopName);
        System.out.println("Category: " + this.category);
        System.out.println("Employees: " + this.employees);
        System.out.println("Brand: " + this.brand);
    }
}

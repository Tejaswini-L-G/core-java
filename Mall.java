
class Mall {

    int mallId;
    String mallName;
    String location;
    int floors;
    String owner;

    Shop shop;
	
	public Mall() {}

    public Mall(int mallId, String mallName, String location, int floors, String owner, Shop shop) {
        this.mallId = mallId;
        this.mallName = mallName;
        this.location = location;
        this.floors = floors;
        this.owner = owner;
        this.shop = shop;
    }

    public void getMallDetails(){

        System.out.println("Mall Id: " + this.mallId);
        System.out.println("Mall Name: " + this.mallName);
        System.out.println("Location: " + this.location);
        System.out.println("Floors: " + this.floors);
        System.out.println("Owner: " + this.owner);

        this.shop.getShopDetails();
    }
}

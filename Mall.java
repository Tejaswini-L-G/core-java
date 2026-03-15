
class Mall {

    int mallId;
    String mallName;
    String location;
    int floors;
    String owner;

    Shop shop;

    public void getMallDetails(){

        System.out.println("Mall Id: " + this.mallId);
        System.out.println("Mall Name: " + this.mallName);
        System.out.println("Location: " + this.location);
        System.out.println("Floors: " + this.floors);
        System.out.println("Owner: " + this.owner);

        this.shop.getShopDetails();
    }
}

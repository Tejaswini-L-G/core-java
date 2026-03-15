
class Stock {

    int stockId;
    String company;
    String sector;
    double price;
    String exchange;

    public void getStockDetails(){

        System.out.println("Stock Id: " + this.stockId);
        System.out.println("Company: " + this.company);
        System.out.println("Sector: " + this.sector);
        System.out.println("Price: " + this.price);
        System.out.println("Exchange: " + this.exchange);
    }
}

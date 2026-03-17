
class Stock {

    int stockId;
    String company;
    String sector;
    double price;
    String exchange;
	
	 public Stock() {}

    public Stock(int stockId, String stockName, String sector, double price, String exchange) {
        this.stockId = stockId;
        this.stockName = stockName;
        this.sector = sector;
        this.price = price;
        this.exchange = exchange;
    }

    public void getStockDetails(){

        System.out.println("Stock Id: " + this.stockId);
        System.out.println("Company: " + this.company);
        System.out.println("Sector: " + this.sector);
        System.out.println("Price: " + this.price);
        System.out.println("Exchange: " + this.exchange);
    }
}

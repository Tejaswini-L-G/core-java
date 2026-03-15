
class Groww {

    int platformId;
    String companyName;
    String headquarters;
    int foundedYear;
    String founder;

    Stock stock;

    public void getGrowwDetails(){

        System.out.println("Platform Id: " + this.platformId);
        System.out.println("Company Name: " + this.companyName);
        System.out.println("Headquarters: " + this.headquarters);
        System.out.println("Founded Year: " + this.foundedYear);
        System.out.println("Founder: " + this.founder);

        this.stock.getStockDetails();
    }
}

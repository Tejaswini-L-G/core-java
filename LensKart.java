
class LensKart {

    int storeId;
    String brandName;
    String headquarters;
    int foundedYear;
    String founder;

    Frame frame;
	
	 public LensKart() {}

    public LensKart(int storeId, String brandName, String headquarters, int foundedYear, String founder, Frame frame) {
        this.storeId = storeId;
        this.brandName = brandName;
        this.headquarters = headquarters;
        this.foundedYear = foundedYear;
        this.founder = founder;
        this.frame = frame;
    }

    public void getLensKartDetails(){

        System.out.println("Store Id: " + this.storeId);
        System.out.println("Brand Name: " + this.brandName);
        System.out.println("Headquarters: " + this.headquarters);
        System.out.println("Founded Year: " + this.foundedYear);
        System.out.println("Founder: " + this.founder);

        this.frame.getFrameDetails();
    }
}

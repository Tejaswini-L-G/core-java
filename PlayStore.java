class PlayStore {

    int storeId;
    String company;
    String platform;
    int totalApps;
    String headquarters;

    Application application;
	
	 public PlayStore() {}

    public PlayStore(int storeId, String company, String platform, int totalApps, String headquarters, Application application) {
        this.storeId = storeId;
        this.company = company;
        this.platform = platform;
        this.totalApps = totalApps;
        this.headquarters = headquarters;
        this.application = application;
    }

    public void getPlayStoreDetails(){

        System.out.println("Store Id: " + this.storeId);
        System.out.println("Company: " + this.company);
        System.out.println("Platform: " + this.platform);
        System.out.println("Total Apps: " + this.totalApps);
        System.out.println("Headquarters: " + this.headquarters);

        this.application.getApplicationDetails();
    }
}

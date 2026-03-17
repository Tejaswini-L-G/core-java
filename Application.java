
class Application {

    int appId;
    String appName;
    String category;
    double rating;
    String developer;
	
	 public Application() {}

    public Application(int appId, String appName, String category, double rating, String developer) {
        this.appId = appId;
        this.appName = appName;
        this.category = category;
        this.rating = rating;
        this.developer = developer;
    }

    public void getApplicationDetails(){

        System.out.println("App Id: " + this.appId);
        System.out.println("App Name: " + this.appName);
        System.out.println("Category: " + this.category);
        System.out.println("Rating: " + this.rating);
        System.out.println("Developer: " + this.developer);
    }
}

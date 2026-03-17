
class LinkedIn {

    int platformId;
    String company;
    String headquarters;
    int foundedYear;
    String founder;

    Profile profile;
	
	 public LinkedIn() {}

    public LinkedIn(int platformId, String company, String headquarters, int foundedYear, String founder, Profile profile) {
        this.platformId = platformId;
        this.company = company;
        this.headquarters = headquarters;
        this.foundedYear = foundedYear;
        this.founder = founder;
        this.profile = profile;
    }

    public void getLinkedInDetails(){

        System.out.println("Platform Id: " + this.platformId);
        System.out.println("Company: " + this.company);
        System.out.println("Headquarters: " + this.headquarters);
        System.out.println("Founded Year: " + this.foundedYear);
        System.out.println("Founder: " + this.founder);

        this.profile.getProfileDetails();
    }
}

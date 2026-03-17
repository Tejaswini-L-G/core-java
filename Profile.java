
class Profile {

    int profileId;
    String name;
    String designation;
    String company;
    int experienceYears;
	
	public Profile() {}

    public Profile(int profileId, String name, String designation, String company, int experienceYears) {
        this.profileId = profileId;
        this.name = name;
        this.designation = designation;
        this.company = company;
        this.experienceYears = experienceYears;
    }


    public void getProfileDetails(){

        System.out.println("Profile Id: " + this.profileId);
        System.out.println("Name: " + this.name);
        System.out.println("Designation: " + this.designation);
        System.out.println("Company: " + this.company);
        System.out.println("Experience Years: " + this.experienceYears);
    }
}

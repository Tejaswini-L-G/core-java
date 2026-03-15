
class Profile {

    int profileId;
    String name;
    String designation;
    String company;
    int experienceYears;

    public void getProfileDetails(){

        System.out.println("Profile Id: " + this.profileId);
        System.out.println("Name: " + this.name);
        System.out.println("Designation: " + this.designation);
        System.out.println("Company: " + this.company);
        System.out.println("Experience Years: " + this.experienceYears);
    }
}

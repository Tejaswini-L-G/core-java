
class Company {

    int companyId;
    String companyName;
    String headquarters;
    int establishedYear;
    String ceo;

    Project project;

    public void getCompanyDetails(){

        System.out.println("Company Id: " + this.companyId);
        System.out.println("Company Name: " + this.companyName);
        System.out.println("Headquarters: " + this.headquarters);
        System.out.println("Established Year: " + this.establishedYear);
        System.out.println("CEO: " + this.ceo);

        this.project.getProjectDetails();
    }
}


class Government {

    int governmentId;
    String country;
    String leader;
    int establishedYear;
    String system;

    Policy policy;

    public void getGovernmentDetails(){

        System.out.println("Government Id: " + this.governmentId);
        System.out.println("Country: " + this.country);
        System.out.println("Leader: " + this.leader);
        System.out.println("Established Year: " + this.establishedYear);
        System.out.println("System: " + this.system);

        this.policy.getPolicyDetails();
    }
}

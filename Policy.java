
class Policy {

    int policyId;
    String policyName;
    String sector;
    String objective;
    int launchYear;
	
	 public Policy() {}

    public Policy(int policyId, String policyName, String sector, String objective, int launchYear) {
        this.policyId = policyId;
        this.policyName = policyName;
        this.sector = sector;
        this.objective = objective;
        this.launchYear = launchYear;
    }

    public void getPolicyDetails(){

        System.out.println("Policy Id: " + this.policyId);
        System.out.println("Policy Name: " + this.policyName);
        System.out.println("Sector: " + this.sector);
        System.out.println("Objective: " + this.objective);
        System.out.println("Launch Year: " + this.launchYear);
    }
}

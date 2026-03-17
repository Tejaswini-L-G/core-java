
class Franchise {

    int teamId;
    String teamName;
    String country;
    String teamPrincipal;
    int championships;
	
	 public Franchise() {}

    public Franchise(int teamId, String teamName, String country, String teamPrincipal, int championships) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.country = country;
        this.teamPrincipal = teamPrincipal;
        this.championships = championships;
    }

    public void getFranchiseDetails(){

        System.out.println("Team Id: " + this.teamId);
        System.out.println("Team Name: " + this.teamName);
        System.out.println("Country: " + this.country);
        System.out.println("Team Principal: " + this.teamPrincipal);
        System.out.println("Championships: " + this.championships);
    }
}

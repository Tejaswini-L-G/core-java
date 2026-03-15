
class Franchise {

    int teamId;
    String teamName;
    String country;
    String teamPrincipal;
    int championships;

    public void getFranchiseDetails(){

        System.out.println("Team Id: " + this.teamId);
        System.out.println("Team Name: " + this.teamName);
        System.out.println("Country: " + this.country);
        System.out.println("Team Principal: " + this.teamPrincipal);
        System.out.println("Championships: " + this.championships);
    }
}

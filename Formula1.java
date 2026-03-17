
class Formula1 {

    int championshipYear;
    String organizer;
    int totalTeams;
    String titleSponsor;
    String finalRaceCity;

    Franchise franchise;
	
	 public Formula1() {}

    public Formula1(int championshipYear, String organizer, int totalTeams, String titleSponsor, String finalRaceCity, Franchise franchise) {
        this.championshipYear = championshipYear;
        this.organizer = organizer;
        this.totalTeams = totalTeams;
        this.titleSponsor = titleSponsor;
        this.finalRaceCity = finalRaceCity;
        this.franchise = franchise;
    }

    public void getFormula1Details(){

        System.out.println("Championship Year: " + this.championshipYear);
        System.out.println("Organizer: " + this.organizer);
        System.out.println("Total Teams: " + this.totalTeams);
        System.out.println("Title Sponsor: " + this.titleSponsor);
        System.out.println("Final Race City: " + this.finalRaceCity);

        this.franchise.getFranchiseDetails();
    }
}


class Ipl {

    int seasonYear;
    String hostCity;
    String sponsor;
    int totalTeams;
    String trophyName;

    Player player;

    public void getIplDetails(){

        System.out.println("Season Year: " + this.seasonYear);
        System.out.println("Host City: " + this.hostCity);
        System.out.println("Sponsor: " + this.sponsor);
        System.out.println("Total Teams: " + this.totalTeams);
        System.out.println("Trophy: " + this.trophyName);

        this.player.getPlayerDetails();
    }
}

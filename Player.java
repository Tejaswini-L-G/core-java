
class Player {

    int playerId;
    String playerName;
    String team;
    String role;
    int jerseyNumber;

    public void getPlayerDetails(){

        System.out.println("Player Id: " + this.playerId);
        System.out.println("Player Name: " + this.playerName);
        System.out.println("Team: " + this.team);
        System.out.println("Role: " + this.role);
        System.out.println("Jersey Number: " + this.jerseyNumber);
    }
}


class Casino {

    int tableId;
    String gameName;
    String gameType;
    int maxPlayers;
    String popularity;
	
	  public Casino() {}

    public Casino(int tableId, String gameName, String gameType, int maxPlayers, String popularity) {
        this.tableId = tableId;
        this.gameName = gameName;
        this.gameType = gameType;
        this.maxPlayers = maxPlayers;
        this.popularity = popularity;
    }

    public void getCasinoDetails(){

        System.out.println("Table Id: " + this.tableId);
        System.out.println("Game Name: " + this.gameName);
        System.out.println("Game Type: " + this.gameType);
        System.out.println("Max Players: " + this.maxPlayers);
        System.out.println("Popularity: " + this.popularity);
    }
}

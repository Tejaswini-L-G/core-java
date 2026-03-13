class Cricket {

    String teamName;
    String captain;
    String viceCaptain;
    int players;
    String format;
    String stadium;
    String country;
    int overs;
    int wickets;
    int runs;
    double runRate;
    String coach;
    String sponsor;
    String jerseyColor;
    int ranking;
    int matchesPlayed;
    int matchesWon;
    int matchesLost;
    int points;
    String league;

    Cricket(){
        System.out.println("Default constructor of Cricket created");
    }

    Cricket(String teamName,String captain,String viceCaptain,int players,String format,
            String stadium,String country,int overs,int wickets,int runs,double runRate,
            String coach,String sponsor,String jerseyColor,int ranking,int matchesPlayed,
            int matchesWon,int matchesLost,int points,String league){

        this.teamName=teamName;
        this.captain=captain;
        this.viceCaptain=viceCaptain;
        this.players=players;
        this.format=format;
        this.stadium=stadium;
        this.country=country;
        this.overs=overs;
        this.wickets=wickets;
        this.runs=runs;
        this.runRate=runRate;
        this.coach=coach;
        this.sponsor=sponsor;
        this.jerseyColor=jerseyColor;
        this.ranking=ranking;
        this.matchesPlayed=matchesPlayed;
        this.matchesWon=matchesWon;
        this.matchesLost=matchesLost;
        this.points=points;
        this.league=league;
    }
}
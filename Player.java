public class Player {

    private int playerId;
    private String name;
    private String sport;
    private int age;
    private String team;
    private String country;
    private String ranking;

    public void setPlayerId(int playerId){ this.playerId = playerId; }
    public int getPlayerId(){ return playerId; }

    public void setName(String name){ this.name = name; }
    public String getName(){ return name; }

    public void setSport(String sport){ this.sport = sport; }
    public String getSport(){ return sport; }

    public void setAge(int age){ this.age = age; }
    public int getAge(){ return age; }

    public void setTeam(String team){ this.team = team; }
    public String getTeam(){ return team; }

    public void setCountry(String country){ this.country = country; }
    public String getCountry(){ return country; }

    public void setRanking(String ranking){ this.ranking = ranking; }
    public String getRanking(){ return ranking; }
}
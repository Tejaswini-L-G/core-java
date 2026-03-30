public class GameInfo {

    private int gameId;
    private String name;
    private String genre;
    private double rating;
    private String platform;
    private String releaseDate;
    private String developer;

    public void setGameId(int gameId){ this.gameId = gameId; }
    public int getGameId(){ return gameId; }

    public void setName(String name){ this.name = name; }
    public String getName(){ return name; }

    public void setGenre(String genre){ this.genre = genre; }
    public String getGenre(){ return genre; }

    public void setRating(double rating){ this.rating = rating; }
    public double getRating(){ return rating; }

    public void setPlatform(String platform){ this.platform = platform; }
    public String getPlatform(){ return platform; }

    public void setReleaseDate(String releaseDate){ this.releaseDate = releaseDate; }
    public String getReleaseDate(){ return releaseDate; }

    public void setDeveloper(String developer){ this.developer = developer; }
    public String getDeveloper(){ return developer; }
}
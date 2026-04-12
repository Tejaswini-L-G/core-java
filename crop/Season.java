
public class Season {
    int seasonId;
    String name;
    int durationMonths;
    String climate;
    boolean irrigation;

    public Season(){}

    public Season(int seasonId,String name,int durationMonths,String climate,boolean irrigation){
        this.seasonId=seasonId;
        this.name=name;
        this.durationMonths=durationMonths;
        this.climate=climate;
        this.irrigation=irrigation;
    }
}

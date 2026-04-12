
public class Climate {
    int climateId;
    String type;
    double temperature;
    int humidity;
    boolean raining;

    public Climate(){}

    public Climate(int climateId,String type,double temperature,int humidity,boolean raining){
        this.climateId=climateId;
        this.type=type;
        this.temperature=temperature;
        this.humidity=humidity;
        this.raining=raining;
    }
}

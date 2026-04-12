
public class Weather {

    Climate climate;

    public Weather(){}

    public Weather(Climate climate){
        this.climate=climate;
    }

    public void createClimate(Climate climate){
        this.climate=climate;
    }

    public void getDetails(){
        System.out.println("Climate Id : "+climate.climateId);
        System.out.println("Type : "+climate.type);
        System.out.println("Temperature : "+climate.temperature);
        System.out.println("Humidity : "+climate.humidity);
        System.out.println("Raining : "+climate.raining);
    }
}

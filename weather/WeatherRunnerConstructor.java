
public class WeatherRunnerConstructor {
    public static void main(String[] args) {

        Weather w1=new Weather(new Climate(1,"Sunny",32.5,40,false));
        w1.getDetails();

        Weather w2=new Weather(new Climate(2,"Cloudy",28.0,60,false));
        w2.getDetails();

        Weather w3=new Weather(new Climate(3,"Rainy",24.5,85,true));
        w3.getDetails();
    }
}

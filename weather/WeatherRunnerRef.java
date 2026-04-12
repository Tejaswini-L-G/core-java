
public class WeatherRunnerRef {

    public static void main(String[] args) {

        Climate climateOne=new Climate();
        climateOne.climateId=1;
        climateOne.type="Sunny";
        climateOne.temperature=32.5;
        climateOne.humidity=40;
        climateOne.raining=false;

        Climate climateTwo=new Climate();
        climateTwo.climateId=2;
        climateTwo.type="Cloudy";
        climateTwo.temperature=28.0;
        climateTwo.humidity=60;
        climateTwo.raining=false;

        Climate climateThree=new Climate();
        climateThree.climateId=3;
        climateThree.type="Rainy";
        climateThree.temperature=24.5;
        climateThree.humidity=85;
        climateThree.raining=true;

        Weather weatherOne=new Weather();
        weatherOne.climate=climateOne;
        weatherOne.getDetails();

        Weather weatherTwo=new Weather();
        weatherTwo.climate=climateTwo;
        weatherTwo.getDetails();

        Weather weatherThree=new Weather();
        weatherThree.climate=climateThree;
        weatherThree.getDetails();
    }
}

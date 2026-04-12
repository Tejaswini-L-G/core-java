
public class MapRunnerRef {

    public static void main(String[] args) {

        Location locationOne=new Location();
        locationOne.locationId=1;
        locationOne.city="Bangalore";
        locationOne.state="Karnataka";
        locationOne.latitude=12.9716;
        locationOne.longitude=77.5946;

        Location locationTwo=new Location();
        locationTwo.locationId=2;
        locationTwo.city="Mysore";
        locationTwo.state="Karnataka";
        locationTwo.latitude=12.2958;
        locationTwo.longitude=76.6394;

        Location locationThree=new Location();
        locationThree.locationId=3;
        locationThree.city="Chennai";
        locationThree.state="Tamil Nadu";
        locationThree.latitude=13.0827;
        locationThree.longitude=80.2707;

        Map mapOne=new Map();
        mapOne.location=locationOne;
        mapOne.getDetails();

        Map mapTwo=new Map();
        mapTwo.location=locationTwo;
        mapTwo.getDetails();

        Map mapThree=new Map();
        mapThree.location=locationThree;
        mapThree.getDetails();
    }
}

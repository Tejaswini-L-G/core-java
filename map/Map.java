
public class Map {

    Location location;

    public Map(){}

    public Map(Location location){
        this.location=location;
    }

    public void createLocation(Location location){
        this.location=location;
    }

    public void getDetails(){
        System.out.println("Location Id : "+location.locationId);
        System.out.println("City : "+location.city);
        System.out.println("State : "+location.state);
        System.out.println("Latitude : "+location.latitude);
        System.out.println("Longitude : "+location.longitude);
    }
}

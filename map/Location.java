
public class Location {
    int locationId;
    String city;
    String state;
    double latitude;
    double longitude;

    public Location(){}

    public Location(int locationId,String city,String state,double latitude,double longitude){
        this.locationId=locationId;
        this.city=city;
        this.state=state;
        this.latitude=latitude;
        this.longitude=longitude;
    }
}

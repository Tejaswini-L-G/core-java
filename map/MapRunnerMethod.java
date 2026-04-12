
public class MapRunnerMethod {
    public static void main(String[] args) {

        Location location=
        new Location(3,"Chennai","Tamil Nadu",13.0827,80.2707);

        Map map=new Map();
        map.createLocation(location);

        map.getDetails();
    }
}

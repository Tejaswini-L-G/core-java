
public class MapRunnerConstructor {
    public static void main(String[] args) {

        Location location=
        new Location(2,"Mysore","Karnataka",12.2958,76.6394);

        Map map=new Map(location);

        map.getDetails();
    }
}

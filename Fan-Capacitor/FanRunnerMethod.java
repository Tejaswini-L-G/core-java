
public class FanRunnerMethod {

    public static void main(String[] args) {

        Capacitor capacitor=
        new Capacitor(103,"Crompton",2.25,"Wall Fan",1);

        Fan fan=new Fan();
        fan.createCapacitor(capacitor);

        fan.getDetails();
    }
}

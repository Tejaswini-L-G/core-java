
public class FanRunnerConstructor {

    public static void main(String[] args) {

        Capacitor capacitor=
        new Capacitor(102,"Bajaj",3.15,"Table Fan",3);

        Fan fan=new Fan(capacitor);

        fan.getDetails();
    }
}

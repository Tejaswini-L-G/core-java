
public class FanRunnerRef {

    public static void main(String[] args) {

        Capacitor capacitor=new Capacitor();
        capacitor.capacitorId=101;
        capacitor.brand="Usha";
        capacitor.voltage=2.5;
        capacitor.type="Ceiling Fan";
        capacitor.warranty=2;

        Fan fan=new Fan();
        fan.capacitor=capacitor;

        fan.getDetails();
    }
}

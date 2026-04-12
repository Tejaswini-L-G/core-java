
public class Fan {

    Capacitor capacitor;

    public Fan(){}

    public Fan(Capacitor capacitor){
        this.capacitor=capacitor;
    }

    public void createCapacitor(Capacitor capacitor){
        this.capacitor=capacitor;
    }

    public void getDetails(){
        System.out.println("Capacitor Id : "+capacitor.capacitorId);
        System.out.println("Brand : "+capacitor.brand);
        System.out.println("Voltage : "+capacitor.voltage);
        System.out.println("Type : "+capacitor.type);
        System.out.println("Warranty : "+capacitor.warranty);
    }
}

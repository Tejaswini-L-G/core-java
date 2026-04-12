
public class Capacitor {

    int capacitorId;
    String brand;
    double voltage;
    String type;
    int warranty;

    public Capacitor(){}

    public Capacitor(int capacitorId,String brand,double voltage,String type,int warranty){
        this.capacitorId=capacitorId;
        this.brand=brand;
        this.voltage=voltage;
        this.type=type;
        this.warranty=warranty;
    }
}

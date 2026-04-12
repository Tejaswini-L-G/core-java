
public class TrafficRunnerMethod {
    public static void main(String[] args) {

        TrafficSignal t1=new TrafficSignal();
        t1.createCop(new Cop(1,"Ramesh","Morning",5,"Silk Board"));
        t1.getDetails();

        TrafficSignal t2=new TrafficSignal();
        t2.createCop(new Cop(2,"Suresh","Evening",7,"BTM"));
        t2.getDetails();

        TrafficSignal t3=new TrafficSignal();
        t3.createCop(new Cop(3,"Mahesh","Night",4,"Marathahalli"));
        t3.getDetails();
    }
}

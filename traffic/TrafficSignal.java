
public class TrafficSignal {

    Cop cop;

    public TrafficSignal(){}

    public TrafficSignal(Cop cop){
        this.cop=cop;
    }

    public void createCop(Cop cop){
        this.cop=cop;
    }

    public void getDetails(){
        System.out.println("Cop Id : "+cop.copId);
        System.out.println("Name : "+cop.name);
        System.out.println("Shift : "+cop.shift);
        System.out.println("Experience : "+cop.experience);
        System.out.println("Location : "+cop.location);
    }
}

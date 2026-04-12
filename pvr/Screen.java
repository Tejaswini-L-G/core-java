
public class Screen {
    int screenId;
    String type;
    int capacity;
    boolean is3D;
    double price;

    public Screen(){}

    public Screen(int screenId,String type,int capacity,boolean is3D,double price){
        this.screenId=screenId;
        this.type=type;
        this.capacity=capacity;
        this.is3D=is3D;
        this.price=price;
    }
}

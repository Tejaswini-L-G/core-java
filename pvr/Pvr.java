
public class Pvr {

    Screen screen;

    public Pvr(){}

    public Pvr(Screen screen){
        this.screen=screen;
    }

    public void createScreen(Screen screen){
        this.screen=screen;
    }

    public void getDetails(){
        System.out.println("Screen Id : "+screen.screenId);
        System.out.println("Type : "+screen.type);
        System.out.println("Capacity : "+screen.capacity);
        System.out.println("3D : "+screen.is3D);
        System.out.println("Price : "+screen.price);
    }
}


public class PvrRunnerRef {

    public static void main(String[] args) {

        Screen screenOne=new Screen();
        screenOne.screenId=1;
        screenOne.type="IMAX";
        screenOne.capacity=250;
        screenOne.is3D=true;
        screenOne.price=350;

        Screen screenTwo=new Screen();
        screenTwo.screenId=2;
        screenTwo.type="4K";
        screenTwo.capacity=180;
        screenTwo.is3D=false;
        screenTwo.price=250;

        Screen screenThree=new Screen();
        screenThree.screenId=3;
        screenThree.type="Dolby";
        screenThree.capacity=200;
        screenThree.is3D=true;
        screenThree.price=300;

        Pvr pvrOne=new Pvr();
        pvrOne.screen=screenOne;
        pvrOne.getDetails();

        Pvr pvrTwo=new Pvr();
        pvrTwo.screen=screenTwo;
        pvrTwo.getDetails();

        Pvr pvrThree=new Pvr();
        pvrThree.screen=screenThree;
        pvrThree.getDetails();
    }
}

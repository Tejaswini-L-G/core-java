
public class PvrRunnerMethod {

    public static void main(String[] args) {

        Pvr pvrOne=new Pvr();
        pvrOne.createScreen(new Screen(1,"IMAX",250,true,350));
        pvrOne.getDetails();

        Pvr pvrTwo=new Pvr();
        pvrTwo.createScreen(new Screen(2,"4K",180,false,250));
        pvrTwo.getDetails();

        Pvr pvrThree=new Pvr();
        pvrThree.createScreen(new Screen(3,"Dolby",200,true,300));
        pvrThree.getDetails();
    }
}

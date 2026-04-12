
public class PvrRunnerConstructor {

    public static void main(String[] args) {

        Pvr pvrOne=new Pvr(new Screen(1,"IMAX",250,true,350));
        pvrOne.getDetails();

        Pvr pvrTwo=new Pvr(new Screen(2,"4K",180,false,250));
        pvrTwo.getDetails();

        Pvr pvrThree=new Pvr(new Screen(3,"Dolby",200,true,300));
        pvrThree.getDetails();
    }
}

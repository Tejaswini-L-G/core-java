
public class PrisonRunnerMethod {
    public static void main(String[] args) {

        Prison p1=new Prison();
        p1.createCriminal(new Criminal(1,"Raju","Robbery",5,false));
        p1.getDetails();

        Prison p2=new Prison();
        p2.createCriminal(new Criminal(2,"Kiran","Fraud",3,false));
        p2.getDetails();

        Prison p3=new Prison();
        p3.createCriminal(new Criminal(3,"Mahesh","Murder",14,true));
        p3.getDetails();
    }
}

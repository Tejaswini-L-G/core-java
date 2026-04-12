
public class IplRunnerMethod {

    public static void main(String[] args) {

        Ipl iplOne = new Ipl();
        iplOne.createRcb(
        new Rcb(18,"Virat Kohli","Batsman",18,true));
        iplOne.getDetails();

        Ipl iplTwo = new Ipl();
        iplTwo.createRcb(
        new Rcb(17,"ABD","Batsman",17,false));
        iplTwo.getDetails();

        Ipl iplThree = new Ipl();
        iplThree.createRcb(
        new Rcb(33,"Siraj","Bowler",13,true));
        iplThree.getDetails();
    }
}

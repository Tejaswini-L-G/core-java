
public class IplRunnerConstructor {

    public static void main(String[] args) {

        Ipl iplOne =
        new Ipl(new Rcb(18,"Virat Kohli","Batsman",18,true));
        iplOne.getDetails();

        Ipl iplTwo =
        new Ipl(new Rcb(17,"ABD","Batsman",17,false));
        iplTwo.getDetails();

        Ipl iplThree =
        new Ipl(new Rcb(33,"Siraj","Bowler",13,true));
        iplThree.getDetails();
    }
}


public class IplRunnerRef {

    public static void main(String[] args) {

        Rcb playerOne = new Rcb();
        playerOne.playerId = 18;
        playerOne.name = "Virat Kohli";
        playerOne.role = "Batsman";
        playerOne.jerseyNumber = 18;
        playerOne.playing = true;

        Rcb playerTwo = new Rcb();
        playerTwo.playerId = 17;
        playerTwo.name = "ABD";
        playerTwo.role = "Batsman";
        playerTwo.jerseyNumber = 17;
        playerTwo.playing = false;

        Rcb playerThree = new Rcb();
        playerThree.playerId = 33;
        playerThree.name = "Siraj";
        playerThree.role = "Bowler";
        playerThree.jerseyNumber = 13;
        playerThree.playing = true;

        Ipl iplOne = new Ipl();
        iplOne.rcb = playerOne;
        iplOne.getDetails();

        Ipl iplTwo = new Ipl();
        iplTwo.rcb = playerTwo;
        iplTwo.getDetails();

        Ipl iplThree = new Ipl();
        iplThree.rcb = playerThree;
        iplThree.getDetails();
    }
}

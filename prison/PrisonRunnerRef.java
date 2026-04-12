
public class PrisonRunnerRef {

    public static void main(String[] args) {

        Criminal criminalOne=new Criminal();
        criminalOne.criminalId=1;
        criminalOne.name="Raju";
        criminalOne.crime="Robbery";
        criminalOne.years=5;
        criminalOne.highRisk=false;

        Criminal criminalTwo=new Criminal();
        criminalTwo.criminalId=2;
        criminalTwo.name="Kiran";
        criminalTwo.crime="Fraud";
        criminalTwo.years=3;
        criminalTwo.highRisk=false;

        Criminal criminalThree=new Criminal();
        criminalThree.criminalId=3;
        criminalThree.name="Mahesh";
        criminalThree.crime="Murder";
        criminalThree.years=14;
        criminalThree.highRisk=true;

        Prison prisonOne=new Prison();
        prisonOne.criminal=criminalOne;
        prisonOne.getDetails();

        Prison prisonTwo=new Prison();
        prisonTwo.criminal=criminalTwo;
        prisonTwo.getDetails();

        Prison prisonThree=new Prison();
        prisonThree.criminal=criminalThree;
        prisonThree.getDetails();
    }
}

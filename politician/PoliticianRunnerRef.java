
public class PoliticianRunnerRef {

    public static void main(String[] args) {

        Voter voterOne=new Voter();
        voterOne.voterId=1;
        voterOne.name="Ravi";
        voterOne.age=30;
        voterOne.constituency="Bangalore South";
        voterOne.voted=true;

        Voter voterTwo=new Voter();
        voterTwo.voterId=2;
        voterTwo.name="Anu";
        voterTwo.age=28;
        voterTwo.constituency="BTM";
        voterTwo.voted=false;

        Voter voterThree=new Voter();
        voterThree.voterId=3;
        voterThree.name="Kiran";
        voterThree.age=40;
        voterThree.constituency="Jayanagar";
        voterThree.voted=true;

        Politician politicianOne=new Politician();
        politicianOne.voter=voterOne;
        politicianOne.getDetails();

        Politician politicianTwo=new Politician();
        politicianTwo.voter=voterTwo;
        politicianTwo.getDetails();

        Politician politicianThree=new Politician();
        politicianThree.voter=voterThree;
        politicianThree.getDetails();
    }
}

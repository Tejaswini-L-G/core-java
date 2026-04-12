
public class PoliticianRunnerMethod {
    public static void main(String[] args) {

        Politician p1=new Politician();
        p1.createVoter(new Voter(1,"Ravi",30,"Bangalore South",true));
        p1.getDetails();

        Politician p2=new Politician();
        p2.createVoter(new Voter(2,"Anu",28,"BTM",false));
        p2.getDetails();

        Politician p3=new Politician();
        p3.createVoter(new Voter(3,"Kiran",40,"Jayanagar",true));
        p3.getDetails();
    }
}

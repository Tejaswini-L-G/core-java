
public class PoliticianRunnerConstructor {
    public static void main(String[] args) {

        Politician p1=new Politician(new Voter(1,"Ravi",30,"Bangalore South",true));
        p1.getDetails();

        Politician p2=new Politician(new Voter(2,"Anu",28,"BTM",false));
        p2.getDetails();

        Politician p3=new Politician(new Voter(3,"Kiran",40,"Jayanagar",true));
        p3.getDetails();
    }
}

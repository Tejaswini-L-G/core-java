
public class Politician {

    Voter voter;

    public Politician(){}

    public Politician(Voter voter){
        this.voter=voter;
    }

    public void createVoter(Voter voter){
        this.voter=voter;
    }

    public void getDetails(){
        System.out.println("Voter Id : "+voter.voterId);
        System.out.println("Name : "+voter.name);
        System.out.println("Age : "+voter.age);
        System.out.println("Constituency : "+voter.constituency);
        System.out.println("Voted : "+voter.voted);
    }
}

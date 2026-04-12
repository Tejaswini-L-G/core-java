
public class Voter {
    int voterId;
    String name;
    int age;
    String constituency;
    boolean voted;

    public Voter(){}

    public Voter(int voterId,String name,int age,String constituency,boolean voted){
        this.voterId=voterId;
        this.name=name;
        this.age=age;
        this.constituency=constituency;
        this.voted=voted;
    }
}

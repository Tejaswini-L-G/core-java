
public class DeadBody {

    int deadBodyId;
    String name;
    int age;
    String cause;
    boolean identified;

    public DeadBody(){}

    public DeadBody(int deadBodyId,String name,int age,String cause,boolean identified){
        this.deadBodyId=deadBodyId;
        this.name=name;
        this.age=age;
        this.cause=cause;
        this.identified=identified;
    }
}

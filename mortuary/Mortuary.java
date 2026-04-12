
public class Mortuary {

    DeadBody deadBody;

    public Mortuary(){}

    public Mortuary(DeadBody deadBody){
        this.deadBody=deadBody;
    }

    public void createDeadBody(DeadBody deadBody){
        this.deadBody=deadBody;
    }

    public void getDetails(){
        System.out.println("DeadBody Id : "+deadBody.deadBodyId);
        System.out.println("Name : "+deadBody.name);
        System.out.println("Age : "+deadBody.age);
        System.out.println("Cause : "+deadBody.cause);
        System.out.println("Identified : "+deadBody.identified);
    }
}

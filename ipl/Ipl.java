
public class Ipl {

    Rcb rcb;

    public Ipl(){}

    public Ipl(Rcb rcb){
        this.rcb=rcb;
    }

    public void createRcb(Rcb rcb){
        this.rcb=rcb;
    }

    public void getDetails(){
        System.out.println("Player Id : "+rcb.playerId);
        System.out.println("Name : "+rcb.name);
        System.out.println("Role : "+rcb.role);
        System.out.println("Jersey : "+rcb.jerseyNumber);
        System.out.println("Playing : "+rcb.playing);
    }
}


public class Prison {

    Criminal criminal;

    public Prison(){}

    public Prison(Criminal criminal){
        this.criminal=criminal;
    }

    public void createCriminal(Criminal criminal){
        this.criminal=criminal;
    }

    public void getDetails(){
        System.out.println("Criminal Id : "+criminal.criminalId);
        System.out.println("Name : "+criminal.name);
        System.out.println("Crime : "+criminal.crime);
        System.out.println("Years : "+criminal.years);
        System.out.println("High Risk : "+criminal.highRisk);
    }
}

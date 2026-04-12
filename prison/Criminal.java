
public class Criminal {
    int criminalId;
    String name;
    String crime;
    int years;
    boolean highRisk;

    public Criminal(){}

    public Criminal(int criminalId,String name,String crime,int years,boolean highRisk){
        this.criminalId=criminalId;
        this.name=name;
        this.crime=crime;
        this.years=years;
        this.highRisk=highRisk;
    }
}

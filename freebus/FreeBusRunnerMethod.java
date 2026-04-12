
public class FreeBusRunnerMethod {
    public static void main(String[] args) {

        FreeBusTravel f1=new FreeBusTravel();
        f1.createAadhaar(
        new Aadhaar(123456789012L,"Lakshmi",35,"Female",true));
        f1.getDetails();

        FreeBusTravel f2=new FreeBusTravel();
        f2.createAadhaar(
        new Aadhaar(234567890123L,"Radha",42,"Female",true));
        f2.getDetails();

        FreeBusTravel f3=new FreeBusTravel();
        f3.createAadhaar(
        new Aadhaar(345678901234L,"Meena",29,"Female",false));
        f3.getDetails();
    }
}


public class FreeBusRunnerRef {

    public static void main(String[] args) {

        Aadhaar aadhaarOne=new Aadhaar();
        aadhaarOne.aadhaarId=123456789012L;
        aadhaarOne.name="Lakshmi";
        aadhaarOne.age=35;
        aadhaarOne.gender="Female";
        aadhaarOne.eligible=true;

        Aadhaar aadhaarTwo=new Aadhaar();
        aadhaarTwo.aadhaarId=234567890123L;
        aadhaarTwo.name="Radha";
        aadhaarTwo.age=42;
        aadhaarTwo.gender="Female";
        aadhaarTwo.eligible=true;

        Aadhaar aadhaarThree=new Aadhaar();
        aadhaarThree.aadhaarId=345678901234L;
        aadhaarThree.name="Meena";
        aadhaarThree.age=29;
        aadhaarThree.gender="Female";
        aadhaarThree.eligible=false;

        FreeBusTravel travelOne=new FreeBusTravel();
        travelOne.aadhaar=aadhaarOne;
        travelOne.getDetails();

        FreeBusTravel travelTwo=new FreeBusTravel();
        travelTwo.aadhaar=aadhaarTwo;
        travelTwo.getDetails();

        FreeBusTravel travelThree=new FreeBusTravel();
        travelThree.aadhaar=aadhaarThree;
        travelThree.getDetails();
    }
}

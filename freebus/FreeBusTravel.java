
public class FreeBusTravel {

    Aadhaar aadhaar;

    public FreeBusTravel(){}

    public FreeBusTravel(Aadhaar aadhaar){
        this.aadhaar=aadhaar;
    }

    public void createAadhaar(Aadhaar aadhaar){
        this.aadhaar=aadhaar;
    }

    public void getDetails(){
        System.out.println("Aadhaar Id : "+aadhaar.aadhaarId);
        System.out.println("Name : "+aadhaar.name);
        System.out.println("Age : "+aadhaar.age);
        System.out.println("Gender : "+aadhaar.gender);
        System.out.println("Eligible : "+aadhaar.eligible);
    }
}

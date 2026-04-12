
public class Aadhaar {
    long aadhaarId;
    String name;
    int age;
    String gender;
    boolean eligible;

    public Aadhaar(){}

    public Aadhaar(long aadhaarId,String name,int age,String gender,boolean eligible){
        this.aadhaarId=aadhaarId;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.eligible=eligible;
    }
}

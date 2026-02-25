class PharmaceuticalCompany {

    static String companyName;
    static String medicineName;
    static String medicineType;
    static String dosage;
    static String expiryDate;
    static int price;
    static int quantity;
    static int rating;

    public static boolean createMedicine(
            String company,
            String medicine,
            String type,
            String dose,
            String expiry,
            int medicinePrice,
            int medicineQuantity,
            int medicineRating){

        boolean created=false;

        boolean c=false,m=false,t=false,d=false,e=false,p=false,q=false,r=false;

        if(company!=null&&!company.isEmpty()){ companyName=company; c=true; }
        else System.out.println("Company required");

        if(medicine!=null&&!medicine.isEmpty()){ medicineName=medicine; m=true; }
        else System.out.println("Medicine name required");

        if(type!=null&&!type.isEmpty()){ medicineType=type; t=true; }
        else System.out.println("Type required");

        if(dose!=null&&!dose.isEmpty()){ dosage=dose; d=true; }
        else System.out.println("Dosage required");

        if(expiry!=null&&!expiry.isEmpty()){ expiryDate=expiry; e=true; }
        else System.out.println("Expiry required");

        if(medicinePrice>0){ price=medicinePrice; p=true; }
        else System.out.println("Invalid price");

        if(medicineQuantity>0){ quantity=medicineQuantity; q=true; }
        else System.out.println("Invalid quantity");

        if(medicineRating>0){ rating=medicineRating; r=true; }
        else System.out.println("Invalid rating");

        if(c&&m&&t&&d&&e&&p&&q&&r)
            created=true;
        else System.out.println("Medicine not created");

        return created;
    }

    public static void getMedicine(){

        System.out.println("Company : "+companyName);
        System.out.println("Medicine : "+medicineName);
        System.out.println("Type : "+medicineType);
        System.out.println("Dosage : "+dosage);
        System.out.println("Expiry : "+expiryDate);
        System.out.println("Price : "+price);
        System.out.println("Quantity : "+quantity);
        System.out.println("Rating : "+rating);
    }
}
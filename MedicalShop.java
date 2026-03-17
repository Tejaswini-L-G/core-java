class MedicalShop {
    String shopName, location, ownerName, licenseNo, category, type, timing, contact, services, supplier;
    int rating, staffCount;
    double revenue, area;
    boolean isOpen24hrs, hasDelivery;
    String registration, specialization, city, state;

    MedicalShop(){
        this("HealthCare","MainRoad","OwnerA","LIC123","Pharmacy","Retail","24hrs","1234567890","All","MedSup",
             5,10,500000.0,1000.0,true,true,"Reg1","General","Bangalore","Karnataka");
    }

    MedicalShop(String shopName,String location,String ownerName,String licenseNo,String category,String type,
                String timing,String contact,String services,String supplier,int rating,int staffCount,
                double revenue,double area,boolean isOpen24hrs,boolean hasDelivery,String registration,
                String specialization,String city,String state){
        this.shopName=shopName; this.location=location; this.ownerName=ownerName;
        this.licenseNo=licenseNo; this.category=category; this.type=type;
        this.timing=timing; this.contact=contact; this.services=services;
        this.supplier=supplier; this.rating=rating; this.staffCount=staffCount;
        this.revenue=revenue; this.area=area; this.isOpen24hrs=isOpen24hrs;
        this.hasDelivery=hasDelivery; this.registration=registration;
        this.specialization=specialization; this.city=city; this.state=state;
    }

    MedicalShop(String shopName,double revenue){
        this(shopName,"CityCenter","OwnerB","LIC456","Pharmacy","Wholesale","12hrs","9876543210","Basic","LocalSup",
             4,5,revenue,800.0,false,true,"Reg2","General","Mysore","Karnataka");
    }

    void getDetails(){
        System.out.println("Shop: "+shopName+" Revenue: "+revenue);
    }
}
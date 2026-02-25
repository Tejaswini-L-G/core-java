class PsFive {

    static String brandName;
    static String edition;
    static String color;
    static String storageType;
    static int storageSize;
    static int controllerCount;
    static int price;
    static int warrantyYears;

    public static boolean createPsFive(String brand, String ed, String clr,
                                       String type, int storage,
                                       int controllers, int cost,
                                       int warranty) {

        boolean isCreated = false;

        boolean bValid=false,eValid=false,cValid=false,tValid=false;
        boolean sValid=false,conValid=false,pValid=false,wValid=false;

        if(brand!=null && !brand.isEmpty()){ brandName=brand; bValid=true; }
        else System.out.println("Brand required");

        if(ed!=null && !ed.isEmpty()){ edition=ed; eValid=true; }
        else System.out.println("Edition required");

        if(clr!=null && !clr.isEmpty()){ color=clr; cValid=true; }
        else System.out.println("Color required");

        if(type!=null && !type.isEmpty()){ storageType=type; tValid=true; }
        else System.out.println("Storage type required");

        if(storage>0){ storageSize=storage; sValid=true; }
        else System.out.println("Invalid storage");

        if(controllers>0){ controllerCount=controllers; conValid=true; }
        else System.out.println("Invalid controller count");

        if(cost>0){ price=cost; pValid=true; }
        else System.out.println("Invalid price");

        if(warranty>0){ warrantyYears=warranty; wValid=true; }
        else System.out.println("Invalid warranty");

        if(bValid&&eValid&&cValid&&tValid&&sValid&&conValid&&pValid&&wValid)
            isCreated=true;
        else System.out.println("PsFive not created");

        return isCreated;
    }

    public static void getPsFiveDetails(){
        System.out.println("Brand Name : "+brandName);
        System.out.println("Edition : "+edition);
        System.out.println("Color : "+color);
        System.out.println("Storage Type : "+storageType);
        System.out.println("Storage Size : "+storageSize);
        System.out.println("Controller Count : "+controllerCount);
        System.out.println("Price : "+price);
        System.out.println("Warranty Years : "+warrantyYears);
    }
}
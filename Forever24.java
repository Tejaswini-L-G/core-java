class Forever24 {

    static String brandName;
    static String clothType;
    static String color;
    static String size;
    static String material;
    static String gender;
    static String pattern;
    static String season;
    static int price;
    static int discount;
    static int stock;
    static int rating;

    public static boolean createCloth(String brand,String type,
                                      String clothColor,String clothSize,
                                      String clothMaterial,String clothGender,
                                      String clothPattern,String clothSeason,
                                      int clothPrice,int clothDiscount,
                                      int clothStock,int clothRating){

        boolean isCreated=false;

        boolean b=false,t=false,c=false,s=false,m=false,g=false,p=false,se=false;
        boolean pr=false,d=false,st=false,r=false;

        if(brand!=null&&!brand.isEmpty()){ brandName=brand; b=true; }
        else System.out.println("Brand required");

        if(type!=null&&!type.isEmpty()){ clothType=type; t=true; }
        else System.out.println("Type required");

        if(clothColor!=null&&!clothColor.isEmpty()){ color=clothColor; c=true; }
        else System.out.println("Color required");

        if(clothSize!=null&&!clothSize.isEmpty()){ size=clothSize; s=true; }
        else System.out.println("Size required");

        if(clothMaterial!=null&&!clothMaterial.isEmpty()){ material=clothMaterial; m=true; }
        else System.out.println("Material required");

        if(clothGender!=null&&!clothGender.isEmpty()){ gender=clothGender; g=true; }
        else System.out.println("Gender required");

        if(clothPattern!=null&&!clothPattern.isEmpty()){ pattern=clothPattern; p=true; }
        else System.out.println("Pattern required");

        if(clothSeason!=null&&!clothSeason.isEmpty()){ season=clothSeason; se=true; }
        else System.out.println("Season required");

        if(clothPrice>0){ price=clothPrice; pr=true; }
        else System.out.println("Invalid price");

        if(clothDiscount>=0){ discount=clothDiscount; d=true; }
        else System.out.println("Invalid discount");

        if(clothStock>0){ stock=clothStock; st=true; }
        else System.out.println("Invalid stock");

        if(clothRating>0){ rating=clothRating; r=true; }
        else System.out.println("Invalid rating");

        if(b&&t&&c&&s&&m&&g&&p&&se&&pr&&d&&st&&r)
            isCreated=true;
        else System.out.println("Cloth not created");

        return isCreated;
    }

    public static void getCloth(){

        System.out.println("Brand : "+brandName);
        System.out.println("Type : "+clothType);
        System.out.println("Color : "+color);
        System.out.println("Size : "+size);
        System.out.println("Material : "+material);
        System.out.println("Gender : "+gender);
        System.out.println("Pattern : "+pattern);
        System.out.println("Season : "+season);
        System.out.println("Price : "+price);
        System.out.println("Discount : "+discount);
        System.out.println("Stock : "+stock);
        System.out.println("Rating : "+rating);
    }
}
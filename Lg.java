class Lg {

    static String brandName;
    static String type;
    static String color;
    static String modelName;
    static int capacityLiters;
    static int price;
    static int warrantyYears;
    static int energyRating;
    static int shelves;
    static int doors;

    public static boolean createrefrigerator(
            String brand,String fridgeType,String fridgeColor,
            String model,int capacity,int fridgePrice,
            int warranty,int rating,int shelfCount,int doorCount){

        boolean created=false;

        boolean b=false,t=false,c=false,m=false,cap=false,p=false,w=false,r=false,s=false,d=false;

        if(brand!=null&&!brand.isEmpty()){ brandName=brand; b=true; }
        else System.out.println("Brand required");

        if(fridgeType!=null&&!fridgeType.isEmpty()){ type=fridgeType; t=true; }
        else System.out.println("Type required");

        if(fridgeColor!=null&&!fridgeColor.isEmpty()){ color=fridgeColor; c=true; }
        else System.out.println("Color required");

        if(model!=null&&!model.isEmpty()){ modelName=model; m=true; }
        else System.out.println("Model required");

        if(capacity>0){ capacityLiters=capacity; cap=true; }
        else System.out.println("Invalid capacity");

        if(fridgePrice>0){ price=fridgePrice; p=true; }
        else System.out.println("Invalid price");

        if(warranty>0){ warrantyYears=warranty; w=true; }
        else System.out.println("Invalid warranty");

        if(rating>0){ energyRating=rating; r=true; }
        else System.out.println("Invalid rating");

        if(shelfCount>0){ shelves=shelfCount; s=true; }
        else System.out.println("Invalid shelves");

        if(doorCount>0){ doors=doorCount; d=true; }
        else System.out.println("Invalid doors");

        if(b&&t&&c&&m&&cap&&p&&w&&r&&s&&d)
            created=true;
        else System.out.println("Refrigerator not created");

        return created;
    }

    public static void getRefrigeratorDetails(){

        System.out.println("Brand : "+brandName);
        System.out.println("Type : "+type);
        System.out.println("Color : "+color);
        System.out.println("Model : "+modelName);
        System.out.println("Capacity : "+capacityLiters);
        System.out.println("Price : "+price);
        System.out.println("Warranty : "+warrantyYears);
        System.out.println("Energy Rating : "+energyRating);
        System.out.println("Shelves : "+shelves);
        System.out.println("Doors : "+doors);
    }
}
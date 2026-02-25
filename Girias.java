class Girias {

    static String brandName;
    static String washingType;
    static String color;
    static String modelName;
    static int capacityKg;
    static int price;
    static int warrantyYears;
    static int spinSpeedRpm;
    static int energyRating;
    static int washPrograms;

    public static boolean createWashingMachine(
            String brand,
            String type,
            String machineColor,
            String model,
            int capacity,
            int machinePrice,
            int warranty,
            int rpm,
            int rating,
            int programs) {

        boolean isCreated = false;

        boolean brandValid=false,typeValid=false,colorValid=false,modelValid=false;
        boolean capacityValid=false,priceValid=false,warrantyValid=false;
        boolean rpmValid=false,ratingValid=false,programValid=false;

        if(brand!=null&&!brand.isEmpty()){ brandName=brand; brandValid=true; }
        else System.out.println("Brand required");

        if(type!=null&&!type.isEmpty()){ washingType=type; typeValid=true; }
        else System.out.println("Type required");

        if(machineColor!=null&&!machineColor.isEmpty()){ color=machineColor; colorValid=true; }
        else System.out.println("Color required");

        if(model!=null&&!model.isEmpty()){ modelName=model; modelValid=true; }
        else System.out.println("Model required");

        if(capacity>0){ capacityKg=capacity; capacityValid=true; }
        else System.out.println("Invalid capacity");

        if(machinePrice>0){ price=machinePrice; priceValid=true; }
        else System.out.println("Invalid price");

        if(warranty>0){ warrantyYears=warranty; warrantyValid=true; }
        else System.out.println("Invalid warranty");

        if(rpm>0){ spinSpeedRpm=rpm; rpmValid=true; }
        else System.out.println("Invalid rpm");

        if(rating>0){ energyRating=rating; ratingValid=true; }
        else System.out.println("Invalid rating");

        if(programs>0){ washPrograms=programs; programValid=true; }
        else System.out.println("Invalid programs");

        if(brandValid&&typeValid&&colorValid&&modelValid&&capacityValid
                &&priceValid&&warrantyValid&&rpmValid&&ratingValid&&programValid)
            isCreated=true;
        else System.out.println("Washing machine not created");

        return isCreated;
    }

    public static void getDetails(){

        System.out.println("Brand : "+brandName);
        System.out.println("Type : "+washingType);
        System.out.println("Color : "+color);
        System.out.println("Model : "+modelName);
        System.out.println("Capacity : "+capacityKg);
        System.out.println("Price : "+price);
        System.out.println("Warranty : "+warrantyYears);
        System.out.println("RPM : "+spinSpeedRpm);
        System.out.println("Energy Rating : "+energyRating);
        System.out.println("Programs : "+washPrograms);
    }
}
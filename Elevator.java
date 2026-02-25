class Elevator {

    static String brandName;
    static String type;
    static String buildingName;
    static int totalFloors;
    static int capacityPersons;
    static int speed;
    static int warrantyYears;

    public static boolean createElevator(String brand,
                                         String elevatorType,
                                         String building,
                                         int floors,
                                         int capacity,
                                         int elevatorSpeed,
                                         int warranty){

        boolean created=false;

        boolean b=false,t=false,bu=false,f=false,c=false,s=false,w=false;

        if(brand!=null&&!brand.isEmpty()){ brandName=brand; b=true; }
        else System.out.println("Brand required");

        if(elevatorType!=null&&!elevatorType.isEmpty()){ type=elevatorType; t=true; }
        else System.out.println("Type required");

        if(building!=null&&!building.isEmpty()){ buildingName=building; bu=true; }
        else System.out.println("Building required");

        if(floors>0){ totalFloors=floors; f=true; }
        else System.out.println("Invalid floors");

        if(capacity>0){ capacityPersons=capacity; c=true; }
        else System.out.println("Invalid capacity");

        if(elevatorSpeed>0){ speed=elevatorSpeed; s=true; }
        else System.out.println("Invalid speed");

        if(warranty>0){ warrantyYears=warranty; w=true; }
        else System.out.println("Invalid warranty");

        if(b&&t&&bu&&f&&c&&s&&w) created=true;
        else System.out.println("Elevator not created");

        return created;
    }

    public static void getDetails(){

        System.out.println("Brand : "+brandName);
        System.out.println("Type : "+type);
        System.out.println("Building : "+buildingName);
        System.out.println("Floors : "+totalFloors);
        System.out.println("Capacity : "+capacityPersons);
        System.out.println("Speed : "+speed);
        System.out.println("Warranty : "+warrantyYears);
    }
}
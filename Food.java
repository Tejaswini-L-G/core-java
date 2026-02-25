class Food {

    static String foodName;
    static String foodType;
    static String cuisine;
    static String taste;
    static String category;

    public static boolean createFood(String name,
                                     String type,
                                     String cuisineName,
                                     String foodTaste,
                                     String foodCategory){

        boolean isCreated=false;

        boolean nameValid=false,typeValid=false,cuisineValid=false;
        boolean tasteValid=false,categoryValid=false;

        if(name!=null&&!name.isEmpty()){ foodName=name; nameValid=true; }
        else System.out.println("Food name required");

        if(type!=null&&!type.isEmpty()){ foodType=type; typeValid=true; }
        else System.out.println("Food type required");

        if(cuisineName!=null&&!cuisineName.isEmpty()){ cuisine=cuisineName; cuisineValid=true; }
        else System.out.println("Cuisine required");

        if(foodTaste!=null&&!foodTaste.isEmpty()){ taste=foodTaste; tasteValid=true; }
        else System.out.println("Taste required");

        if(foodCategory!=null&&!foodCategory.isEmpty()){ category=foodCategory; categoryValid=true; }
        else System.out.println("Category required");

        if(nameValid&&typeValid&&cuisineValid&&tasteValid&&categoryValid)
            isCreated=true;
        else System.out.println("Food not created");

        return isCreated;
    }

    public static void getFoodDetails(){

        System.out.println("Food Name : "+foodName);
        System.out.println("Food Type : "+foodType);
        System.out.println("Cuisine : "+cuisine);
        System.out.println("Taste : "+taste);
        System.out.println("Category : "+category);
    }
}
class BunRunner {

    public static void main(String[] args) {

        String[] flavorsOne={"Milk","Butter"};
        String[] ingredientsOne={"Flour","Sugar"};

        String[] flavorsTwo={"Chocolate","Cream"};
        String[] ingredientsTwo={"Flour","Cocoa"};

        String[] flavorsThree={"Garlic","Cheese"};
        String[] ingredientsThree={"Flour","Garlic"};

        String[] flavorsFour={"Honey","Fruit"};
        String[] ingredientsFour={"Flour","Honey"};


        Bun bunOne=new Bun();
        bunOne.name="Milk Bun";
        bunOne.price=20;
        bunOne.brand="BakeFresh";
        bunOne.bakeryName="City Bakery";
        bunOne.shape="Round";
        bunOne.expiryDate="2 Days";
        bunOne.flavors=flavorsOne;
        bunOne.ingredients=ingredientsOne;

        System.out.println("Bun One Details");
        System.out.println("Name: "+bunOne.name);
        System.out.println("Price: "+bunOne.price);
        System.out.println("Brand: "+bunOne.brand);
        System.out.println("Bakery Name: "+bunOne.bakeryName);
        System.out.println("Shape: "+bunOne.shape);
        System.out.println("Expiry: "+bunOne.expiryDate);

        System.out.println("Available Flavors:");
        for(String flavor : bunOne.flavors){
            System.out.println(flavor);
        }

        System.out.println("Ingredients Used:");
        for(String ingredient : bunOne.ingredients){
            System.out.println(ingredient);
        }


        Bun bunTwo=new Bun();
        bunTwo.name="Chocolate Bun";
        bunTwo.price=25;
        bunTwo.brand="SweetBake";
        bunTwo.bakeryName="Metro Bakery";
        bunTwo.shape="Oval";
        bunTwo.expiryDate="3 Days";
        bunTwo.flavors=flavorsTwo;
        bunTwo.ingredients=ingredientsTwo;

        System.out.println("\nBun Two Details");
        System.out.println("Name: "+bunTwo.name);
        System.out.println("Price: "+bunTwo.price);
        System.out.println("Brand: "+bunTwo.brand);
        System.out.println("Bakery Name: "+bunTwo.bakeryName);
        System.out.println("Shape: "+bunTwo.shape);
        System.out.println("Expiry: "+bunTwo.expiryDate);

        System.out.println("Available Flavors:");
        for(String flavor : bunTwo.flavors){
            System.out.println(flavor);
        }

        System.out.println("Ingredients Used:");
        for(String ingredient : bunTwo.ingredients){
            System.out.println(ingredient);
        }


        Bun bunThree=new Bun();
        bunThree.name="Garlic Bun";
        bunThree.price=30;
        bunThree.brand="DailyBake";
        bunThree.bakeryName="Town Bakery";
        bunThree.shape="Round";
        bunThree.expiryDate="2 Days";
        bunThree.flavors=flavorsThree;
        bunThree.ingredients=ingredientsThree;

        System.out.println("\nBun Three Details");
        System.out.println("Name: "+bunThree.name);
        System.out.println("Price: "+bunThree.price);
        System.out.println("Brand: "+bunThree.brand);
        System.out.println("Bakery Name: "+bunThree.bakeryName);
        System.out.println("Shape: "+bunThree.shape);
        System.out.println("Expiry: "+bunThree.expiryDate);

        System.out.println("Available Flavors:");
        for(String flavor : bunThree.flavors){
            System.out.println(flavor);
        }

        System.out.println("Ingredients Used:");
        for(String ingredient : bunThree.ingredients){
            System.out.println(ingredient);
        }


        Bun bunFour=new Bun();
        bunFour.name="Honey Bun";
        bunFour.price=28;
        bunFour.brand="BakeHouse";
        bunFour.bakeryName="Central Bakery";
        bunFour.shape="Square";
        bunFour.expiryDate="3 Days";
        bunFour.flavors=flavorsFour;
        bunFour.ingredients=ingredientsFour;

        System.out.println("\nBun Four Details");
        System.out.println("Name: "+bunFour.name);
        System.out.println("Price: "+bunFour.price);
        System.out.println("Brand: "+bunFour.brand);
        System.out.println("Bakery Name: "+bunFour.bakeryName);
        System.out.println("Shape: "+bunFour.shape);
        System.out.println("Expiry: "+bunFour.expiryDate);

        System.out.println("Available Flavors:");
        for(String flavor : bunFour.flavors){
            System.out.println(flavor);
        }

        System.out.println("Ingredients Used:");
        for(String ingredient : bunFour.ingredients){
            System.out.println(ingredient);
        }

    }
}
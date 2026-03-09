class AirConditionerRunner {

    public static void main(String[] args) {

        String[] colorsOne={"White","Silver"};
        String[] modesOne={"Cool","Dry"};

        String[] colorsTwo={"Black","Grey"};
        String[] modesTwo={"Cool","Fan"};

        String[] colorsThree={"Blue","White"};
        String[] modesThree={"Turbo","Cool"};

        String[] colorsFour={"Golden","White"};
        String[] modesFour={"Sleep","Cool"};


        AirConditioner acOne=new AirConditioner();
        acOne.brand="LG";
        acOne.model="LG123";
        acOne.price=35000;
        acOne.type="Split";
        acOne.weight=40;
        acOne.warranty=5;
        acOne.colors=colorsOne;
        acOne.modes=modesOne;

        System.out.println("Air Conditioner One Details");
        System.out.println("Brand: "+acOne.brand);
        System.out.println("Model: "+acOne.model);
        System.out.println("Price: "+acOne.price);
        System.out.println("Type: "+acOne.type);
        System.out.println("Weight: "+acOne.weight);
        System.out.println("Warranty: "+acOne.warranty);

        System.out.println("Available Colors:");
        for(String color : acOne.colors){
            System.out.println(color);
        }

        System.out.println("Available Modes:");
        for(String mode : acOne.modes){
            System.out.println(mode);
        }

        AirConditioner acTwo=new AirConditioner();
        acTwo.brand="Samsung";
        acTwo.model="S456";
        acTwo.price=40000;
        acTwo.type="Split";
        acTwo.weight=42;
        acTwo.warranty=5;
        acTwo.colors=colorsTwo;
        acTwo.modes=modesTwo;

        System.out.println("\nAir Conditioner Two Details");
        System.out.println("Brand: "+acTwo.brand);
        System.out.println("Model: "+acTwo.model);
        System.out.println("Price: "+acTwo.price);
        System.out.println("Type: "+acTwo.type);
        System.out.println("Weight: "+acTwo.weight);
        System.out.println("Warranty: "+acTwo.warranty);

        System.out.println("Available Colors:");
        for(String color : acTwo.colors){
            System.out.println(color);
        }

        System.out.println("Available Modes:");
        for(String mode : acTwo.modes){
            System.out.println(mode);
        }

        AirConditioner acThree=new AirConditioner();
        acThree.brand="Voltas";
        acThree.model="V789";
        acThree.price=30000;
        acThree.type="Window";
        acThree.weight=38;
        acThree.warranty=4;
        acThree.colors=colorsThree;
        acThree.modes=modesThree;

        System.out.println("\nAir Conditioner Three Details");
        System.out.println("Brand: "+acThree.brand);
        System.out.println("Model: "+acThree.model);
        System.out.println("Price: "+acThree.price);
        System.out.println("Type: "+acThree.type);
        System.out.println("Weight: "+acThree.weight);
        System.out.println("Warranty: "+acThree.warranty);

        System.out.println("Available Colors:");
        for(String color : acThree.colors){
            System.out.println(color);
        }

        System.out.println("Available Modes:");
        for(String mode : acThree.modes){
            System.out.println(mode);
        }

        AirConditioner acFour=new AirConditioner();
        acFour.brand="Daikin";
        acFour.model="D555";
        acFour.price=45000;
        acFour.type="Split";
        acFour.weight=41;
        acFour.warranty=6;
        acFour.colors=colorsFour;
        acFour.modes=modesFour;

        System.out.println("\nAir Conditioner Four Details");
        System.out.println("Brand: "+acFour.brand);
        System.out.println("Model: "+acFour.model);
        System.out.println("Price: "+acFour.price);
        System.out.println("Type: "+acFour.type);
        System.out.println("Weight: "+acFour.weight);
        System.out.println("Warranty: "+acFour.warranty);

        System.out.println("Available Colors:");
        for(String color : acFour.colors){
            System.out.println(color);
        }

        System.out.println("Available Modes:");
        for(String mode : acFour.modes){
            System.out.println(mode);
        }

    }
}
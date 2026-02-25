class Forever24Executor {

    public static void main(String[] args) {

        boolean clothValid;

        System.out.println("Scenario 1");
        clothValid = Forever24.createCloth(
                "Forever24","T-Shirt","Black","M",
                "Cotton","Men","Plain","Summer",
                799,10,50,5);
        if(clothValid) Forever24.getCloth();

        System.out.println("\nScenario 2");
        clothValid = Forever24.createCloth(
                "","Shirt","Blue","L",
                "Cotton","Men","Striped","Summer",
                999,15,40,4);
        if(clothValid) Forever24.getCloth();

        System.out.println("\nScenario 3");
        clothValid = Forever24.createCloth(
                "Zara","","White","M",
                "Linen","Women","Plain","Summer",
                1499,20,30,5);
        if(clothValid) Forever24.getCloth();

        System.out.println("\nScenario 4");
        clothValid = Forever24.createCloth(
                "H&M","Jacket","","XL",
                "Denim","Men","Solid","Winter",
                1999,25,20,4);
        if(clothValid) Forever24.getCloth();

        System.out.println("\nScenario 5");
        clothValid = Forever24.createCloth(
                "Puma","Track Pant","Grey","",
                "Polyester","Men","Sport","All Season",
                1299,10,35,4);
        if(clothValid) Forever24.getCloth();

        System.out.println("\nScenario 6");
        clothValid = Forever24.createCloth(
                "Nike","Hoodie","Black","L",
                "Fleece","Men","Solid","Winter",
                0,15,25,5);
        if(clothValid) Forever24.getCloth();

        System.out.println("\nScenario 7");
        clothValid = Forever24.createCloth(
                "Adidas","Shorts","Blue","M",
                "Cotton","Men","Sport","Summer",
                899,10,0,4);
        if(clothValid) Forever24.getCloth();

        System.out.println("\nScenario 8");
        clothValid = Forever24.createCloth(
                "Levis","Jeans","Blue","32",
                "Denim","Men","Slim","All Season",
                1799,20,60,5);
        if(clothValid) Forever24.getCloth();
    }
}
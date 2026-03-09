class HappyDentRunner {

    public static void main(String[] args) {

        String[] ingredientsOne={"Sugar","Mint"};
        String[] packsOne={"Small Pack","Medium Pack"};

        String[] ingredientsTwo={"Sugar","Fruit"};
        String[] packsTwo={"Medium Pack","Large Pack"};

        String[] ingredientsThree={"Sugar","Bubble Mint"};
        String[] packsThree={"Small Pack","Family Pack"};

        String[] ingredientsFour={"Sugar","Strong Mint"};
        String[] packsFour={"Pocket Pack","Family Pack"};


        HappyDent happyDentOne=new HappyDent();
        happyDentOne.name="HappyDent White";
        happyDentOne.price=10;
        happyDentOne.flavor="Mint";
        happyDentOne.weight=20;
        happyDentOne.brand="Perfetti";
        happyDentOne.expiryDate="12 Months";
        happyDentOne.ingredients=ingredientsOne;
        happyDentOne.packTypes=packsOne;

        System.out.println("HappyDent One Details");
        System.out.println("Name: "+happyDentOne.name);
        System.out.println("Price: "+happyDentOne.price);
        System.out.println("Flavor: "+happyDentOne.flavor);
        System.out.println("Weight: "+happyDentOne.weight+" grams");
        System.out.println("Brand: "+happyDentOne.brand);
        System.out.println("Expiry: "+happyDentOne.expiryDate);

        System.out.println("Ingredients:");
        for(String ingredient : happyDentOne.ingredients){
            System.out.println(ingredient);
        }

        System.out.println("Available Pack Types:");
        for(String packType : happyDentOne.packTypes){
            System.out.println(packType);
        }

    }
}
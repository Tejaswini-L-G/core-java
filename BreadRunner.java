class BreadRunner {

    public static void main(String[] args) {

        String[] flavorsOne={"Milk","Butter"};
        String[] sizesOne={"Small","Medium"};

        String[] flavorsTwo={"Chocolate","Cream"};
        String[] sizesTwo={"Medium","Large"};

        String[] flavorsThree={"Garlic","Cheese"};
        String[] sizesThree={"Small","Large"};

        String[] flavorsFour={"Honey","Fruit"};
        String[] sizesFour={"Medium","Extra Large"};


        Bread breadOne=new Bread();
        breadOne.type="White Bread";
        breadOne.outlet="Local Bakery";
        breadOne.ingredient="Wheat Flour";
        breadOne.shape="Rectangle";
        breadOne.price=40;
        breadOne.brand="Britannia";
        breadOne.flavors=flavorsOne;
        breadOne.sizes=sizesOne;

        System.out.println("Bread One Details");
        System.out.println("Type: "+breadOne.type);
        System.out.println("Outlet: "+breadOne.outlet);
        System.out.println("Ingredient: "+breadOne.ingredient);
        System.out.println("Shape: "+breadOne.shape);
        System.out.println("Price: "+breadOne.price);
        System.out.println("Brand: "+breadOne.brand);

        System.out.println("Available Flavors:");
        for(String flavor : breadOne.flavors){
            System.out.println(flavor);
        }

        System.out.println("Available Sizes:");
        for(String size : breadOne.sizes){
            System.out.println(size);
        }

    }
}
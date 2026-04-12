
public class IceCreamRunnerRef {

    public static void main(String[] args) {

        Flavour flavourOne = new Flavour();
        flavourOne.flavourId = 1;
        flavourOne.name = "Chocolate";
        flavourOne.brand = "Amul";
        flavourOne.price = 60;
        flavourOne.sugarFree = false;

        Flavour flavourTwo = new Flavour();
        flavourTwo.flavourId = 2;
        flavourTwo.name = "Vanilla";
        flavourTwo.brand = "Kwality Walls";
        flavourTwo.price = 55;
        flavourTwo.sugarFree = false;

        Flavour flavourThree = new Flavour();
        flavourThree.flavourId = 3;
        flavourThree.name = "Strawberry";
        flavourThree.brand = "Arun";
        flavourThree.price = 50;
        flavourThree.sugarFree = true;

        IceCream iceCreamOne = new IceCream();
        iceCreamOne.flavour = flavourOne;
        iceCreamOne.getDetails();

        IceCream iceCreamTwo = new IceCream();
        iceCreamTwo.flavour = flavourTwo;
        iceCreamTwo.getDetails();

        IceCream iceCreamThree = new IceCream();
        iceCreamThree.flavour = flavourThree;
        iceCreamThree.getDetails();
    }
}

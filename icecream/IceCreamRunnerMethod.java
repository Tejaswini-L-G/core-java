
public class IceCreamRunnerMethod {

    public static void main(String[] args) {

        IceCream iceCreamOne = new IceCream();
        iceCreamOne.createFlavour(
        new Flavour(1,"Chocolate","Amul",60,false));
        iceCreamOne.getDetails();

        IceCream iceCreamTwo = new IceCream();
        iceCreamTwo.createFlavour(
        new Flavour(2,"Vanilla","Kwality Walls",55,false));
        iceCreamTwo.getDetails();

        IceCream iceCreamThree = new IceCream();
        iceCreamThree.createFlavour(
        new Flavour(3,"Strawberry","Arun",50,true));
        iceCreamThree.getDetails();
    }
}

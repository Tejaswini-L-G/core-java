
public class IceCreamRunnerConstructor {

    public static void main(String[] args) {

        IceCream iceCreamOne =
        new IceCream(new Flavour(1,"Chocolate","Amul",60,false));
        iceCreamOne.getDetails();

        IceCream iceCreamTwo =
        new IceCream(new Flavour(2,"Vanilla","Kwality Walls",55,false));
        iceCreamTwo.getDetails();

        IceCream iceCreamThree =
        new IceCream(new Flavour(3,"Strawberry","Arun",50,true));
        iceCreamThree.getDetails();
    }
}

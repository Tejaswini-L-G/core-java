
public class GardenRunnerRef {

    public static void main(String[] args) {

        Flower flowerOne=new Flower();
        flowerOne.flowerId=1;
        flowerOne.name="Rose";
        flowerOne.color="Red";
        flowerOne.price=20;
        flowerOne.fragrance=true;

        Flower flowerTwo=new Flower();
        flowerTwo.flowerId=2;
        flowerTwo.name="Jasmine";
        flowerTwo.color="White";
        flowerTwo.price=15;
        flowerTwo.fragrance=true;

        Flower flowerThree=new Flower();
        flowerThree.flowerId=3;
        flowerThree.name="Lily";
        flowerThree.color="Pink";
        flowerThree.price=25;
        flowerThree.fragrance=false;

        Garden gardenOne=new Garden();
        gardenOne.flower=flowerOne;
        gardenOne.getDetails();

        Garden gardenTwo=new Garden();
        gardenTwo.flower=flowerTwo;
        gardenTwo.getDetails();

        Garden gardenThree=new Garden();
        gardenThree.flower=flowerThree;
        gardenThree.getDetails();
    }
}

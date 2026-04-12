
public class GardenRunnerConstructor {
    public static void main(String[] args) {

        Flower flower=
        new Flower(2,"Jasmine","White",15,true);

        Garden garden=new Garden(flower);

        garden.getDetails();
    }
}


public class GardenRunnerMethod {
    public static void main(String[] args) {

        Flower flower=
        new Flower(3,"Lily","Pink",25,false);

        Garden garden=new Garden();
        garden.createFlower(flower);

        garden.getDetails();
    }
}

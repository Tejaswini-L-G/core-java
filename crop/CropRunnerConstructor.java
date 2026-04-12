
public class CropRunnerConstructor {
    public static void main(String[] args) {

        Crop cropOne=new Crop(new Season(1,"Kharif",4,"Rainy",true));
        cropOne.getDetails();

        Crop cropTwo=new Crop(new Season(2,"Rabi",5,"Winter",false));
        cropTwo.getDetails();

        Crop cropThree=new Crop(new Season(3,"Zaid",2,"Summer",true));
        cropThree.getDetails();
    }
}

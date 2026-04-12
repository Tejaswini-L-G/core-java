
public class CropRunnerRef {

    public static void main(String[] args) {

        Season seasonOne=new Season();
        seasonOne.seasonId=1;
        seasonOne.name="Kharif";
        seasonOne.durationMonths=4;
        seasonOne.climate="Rainy";
        seasonOne.irrigation=true;

        Season seasonTwo=new Season();
        seasonTwo.seasonId=2;
        seasonTwo.name="Rabi";
        seasonTwo.durationMonths=5;
        seasonTwo.climate="Winter";
        seasonTwo.irrigation=false;

        Season seasonThree=new Season();
        seasonThree.seasonId=3;
        seasonThree.name="Zaid";
        seasonThree.durationMonths=2;
        seasonThree.climate="Summer";
        seasonThree.irrigation=true;

        Crop cropOne=new Crop();
        cropOne.season=seasonOne;
        cropOne.getDetails();

        Crop cropTwo=new Crop();
        cropTwo.season=seasonTwo;
        cropTwo.getDetails();

        Crop cropThree=new Crop();
        cropThree.season=seasonThree;
        cropThree.getDetails();
    }
}

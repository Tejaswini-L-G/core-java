
public class Crop {

    Season season;

    public Crop(){}

    public Crop(Season season){
        this.season=season;
    }

    public void createSeason(Season season){
        this.season=season;
    }

    public void getDetails(){
        System.out.println("Season Id : "+season.seasonId);
        System.out.println("Name : "+season.name);
        System.out.println("Duration : "+season.durationMonths);
        System.out.println("Climate : "+season.climate);
        System.out.println("Irrigation : "+season.irrigation);
    }
}

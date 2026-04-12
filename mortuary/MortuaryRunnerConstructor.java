
public class MortuaryRunnerConstructor {

    public static void main(String[] args) {

        Mortuary mortuaryOne =
        new Mortuary(new DeadBody(1,"Unknown",45,"Accident",false));
        mortuaryOne.getDetails();

        Mortuary mortuaryTwo =
        new Mortuary(new DeadBody(2,"Ramesh",60,"Heart Attack",true));
        mortuaryTwo.getDetails();

        Mortuary mortuaryThree =
        new Mortuary(new DeadBody(3,"Suresh",35,"Poison",true));
        mortuaryThree.getDetails();
    }
}


public class MortuaryRunnerRef {

    public static void main(String[] args) {

        DeadBody deadBodyOne = new DeadBody();
        deadBodyOne.deadBodyId = 1;
        deadBodyOne.name = "Unknown";
        deadBodyOne.age = 45;
        deadBodyOne.cause = "Accident";
        deadBodyOne.identified = false;

        DeadBody deadBodyTwo = new DeadBody();
        deadBodyTwo.deadBodyId = 2;
        deadBodyTwo.name = "Ramesh";
        deadBodyTwo.age = 60;
        deadBodyTwo.cause = "Heart Attack";
        deadBodyTwo.identified = true;

        DeadBody deadBodyThree = new DeadBody();
        deadBodyThree.deadBodyId = 3;
        deadBodyThree.name = "Suresh";
        deadBodyThree.age = 35;
        deadBodyThree.cause = "Poison";
        deadBodyThree.identified = true;

        Mortuary mortuaryOne = new Mortuary();
        mortuaryOne.deadBody = deadBodyOne;
        mortuaryOne.getDetails();

        Mortuary mortuaryTwo = new Mortuary();
        mortuaryTwo.deadBody = deadBodyTwo;
        mortuaryTwo.getDetails();

        Mortuary mortuaryThree = new Mortuary();
        mortuaryThree.deadBody = deadBodyThree;
        mortuaryThree.getDetails();
    }
}

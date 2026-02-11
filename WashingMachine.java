class WashingMachine {

    static boolean washingStatus;

    static boolean onOrOff() {

        if (washingStatus == false) {
            washingStatus = true;
            System.out.println("The washing machine is on");
        } else {
            washingStatus = false;
            System.out.println("The washing machine is off");
        }

        return washingStatus;
    }
}

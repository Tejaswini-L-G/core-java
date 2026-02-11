class Fan {

    static boolean fanStatus;

    static boolean onOrOff() {

        if (fanStatus == false) {
            fanStatus = true;
            System.out.println("The fan is on");
        } else {
            fanStatus = false;
            System.out.println("The fan is off");
        }

        return fanStatus;
    }
}
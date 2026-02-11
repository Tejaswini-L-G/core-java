class AC {

    static boolean coolingState;

    static boolean onOrOff() {

        if (coolingState == false) {
            coolingState = true;
            System.out.println("The AC is on");
        } else {
            coolingState = false;
            System.out.println("The AC is off");
        }

        return coolingState;
    }
}

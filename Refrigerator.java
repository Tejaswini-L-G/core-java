class Refrigerator {

    static boolean coolingMode;

    static boolean onOrOff() {

        if (coolingMode == false) {
            coolingMode = true;
            System.out.println("The refrigerator is on");
        } else {
            coolingMode = false;
            System.out.println("The refrigerator is off");
        }

        return coolingMode;
    }
}
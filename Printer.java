class Printer {

    static boolean printerReady;

    static boolean onOrOff() {

        if (printerReady == false) {
            printerReady = true;
            System.out.println("The printer is on");
        } else {
            printerReady = false;
            System.out.println("The printer is off");
        }

        return printerReady;
    }
}
class Laptop {

    static boolean laptopPower;

    static boolean onOrOff() {

        if (laptopPower == false) {
            laptopPower = true;
            System.out.println("The laptop is on");
        } else {
            laptopPower = false;
            System.out.println("The laptop is off");
        }

        return laptopPower;
    }
}
class Television {

    static boolean tvPower;

    static boolean onOrOff() {

        if (tvPower == false) {
            tvPower = true;
            System.out.println("The television is on");
        } else {
            tvPower = false;
            System.out.println("The television is off");
        }

        return tvPower;
    }
}
class Mobile {

    static boolean mobileState;

    static boolean onOrOff() {

        if (mobileState == false) {
            mobileState = true;
            System.out.println("The mobile is on");
        } else {
            mobileState = false;
            System.out.println("The mobile is off");
        }

        return mobileState;
    }
}
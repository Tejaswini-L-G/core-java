class Speaker {

    static boolean speakerActive;

    static boolean onOrOff() {

        if (speakerActive == false) {
            speakerActive = true;
            System.out.println("The speaker is on");
        } else {
            speakerActive = false;
            System.out.println("The speaker is off");
        }

        return speakerActive;
    }
}

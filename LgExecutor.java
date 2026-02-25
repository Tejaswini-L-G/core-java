class LgExecutor {

    public static void main(String[] args) {

        boolean refrigeratorValid;

        System.out.println("Scenario 1");
        refrigeratorValid = Lg.createrefrigerator(
                "LG","Double Door","Silver","GL-T402",
                360,45000,1,5,4,2);
        if(refrigeratorValid) Lg.getRefrigeratorDetails();

        System.out.println("\nScenario 2");
        refrigeratorValid = Lg.createrefrigerator(
                "","Single Door","White","GL-B201",
                190,20000,1,4,3,1);
        if(refrigeratorValid) Lg.getRefrigeratorDetails();

        System.out.println("\nScenario 3");
        refrigeratorValid = Lg.createrefrigerator(
                "Samsung","","Black","RT28",
                280,32000,1,5,3,2);
        if(refrigeratorValid) Lg.getRefrigeratorDetails();

        System.out.println("\nScenario 4");
        refrigeratorValid = Lg.createrefrigerator(
                "Whirlpool","Double Door","","WRD",
                340,38000,1,5,4,2);
        if(refrigeratorValid) Lg.getRefrigeratorDetails();

        System.out.println("\nScenario 5");
        refrigeratorValid = Lg.createrefrigerator(
                "Haier","Side By Side","Silver","HSR",
                0,70000,1,5,5,2);
        if(refrigeratorValid) Lg.getRefrigeratorDetails();

        System.out.println("\nScenario 6");
        refrigeratorValid = Lg.createrefrigerator(
                "Godrej","Single Door","Red","GDE",
                210,0,1,4,3,1);
        if(refrigeratorValid) Lg.getRefrigeratorDetails();

        System.out.println("\nScenario 7");
        refrigeratorValid = Lg.createrefrigerator(
                "Panasonic","Double Door","Grey","NR",
                300,35000,0,5,4,2);
        if(refrigeratorValid) Lg.getRefrigeratorDetails();

        System.out.println("\nScenario 8");
        refrigeratorValid = Lg.createrefrigerator(
                "Bosch","Side By Side","Silver","BSH",
                500,90000,2,5,6,2);
        if(refrigeratorValid) Lg.getRefrigeratorDetails();
    }
}
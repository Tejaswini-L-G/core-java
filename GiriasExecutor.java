class GiriasExecutor {

    public static void main(String[] args) {

        boolean washingMachineValid;

        System.out.println("Scenario 1");
        washingMachineValid = Girias.createWashingMachine(
                "LG","Front Load","White","FHM1207",
                7,35000,2,1200,5,10);
        if(washingMachineValid) Girias.getDetails();

        System.out.println("\nScenario 2");
        washingMachineValid = Girias.createWashingMachine(
                "","Top Load","Grey","TL900",
                6,25000,2,1000,4,8);
        if(washingMachineValid) Girias.getDetails();

        System.out.println("\nScenario 3");
        washingMachineValid = Girias.createWashingMachine(
                "Samsung","","Black","WM600",
                8,40000,3,1400,5,12);
        if(washingMachineValid) Girias.getDetails();

        System.out.println("\nScenario 4");
        washingMachineValid = Girias.createWashingMachine(
                "Bosch","Front Load","","BX700",
                7,38000,2,1200,5,10);
        if(washingMachineValid) Girias.getDetails();

        System.out.println("\nScenario 5");
        washingMachineValid = Girias.createWashingMachine(
                "IFB","Front Load","White","",
                6,32000,2,1100,4,9);
        if(washingMachineValid) Girias.getDetails();

        System.out.println("\nScenario 6");
        washingMachineValid = Girias.createWashingMachine(
                "Whirlpool","Top Load","Silver","WT700",
                0,28000,2,900,4,7);
        if(washingMachineValid) Girias.getDetails();

        System.out.println("\nScenario 7");
        washingMachineValid = Girias.createWashingMachine(
                "Panasonic","Front Load","Grey","PN800",
                7,36000,0,1200,5,10);
        if(washingMachineValid) Girias.getDetails();

        System.out.println("\nScenario 8");
        washingMachineValid = Girias.createWashingMachine(
                "Haier","Top Load","White","HR650",
                6,26000,2,1000,4,8);
        if(washingMachineValid) Girias.getDetails();
    }
}
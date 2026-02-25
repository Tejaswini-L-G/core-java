class ElevatorExecutor {

    public static void main(String[] args) {

        boolean elevatorValid;

        System.out.println("Scenario 1");
        elevatorValid = Elevator.createElevator(
                "Otis","Passenger","Sky Tower",
                20,12,2,5);
        if(elevatorValid) Elevator.getDetails();

        System.out.println("\nScenario 2");
        elevatorValid = Elevator.createElevator(
                "","Passenger","Sky Tower",
                20,12,2,5);
        if(elevatorValid) Elevator.getDetails();

        System.out.println("\nScenario 3");
        elevatorValid = Elevator.createElevator(
                "Kone","","City Mall",
                10,8,2,5);
        if(elevatorValid) Elevator.getDetails();

        System.out.println("\nScenario 4");
        elevatorValid = Elevator.createElevator(
                "Schindler","Passenger","",
                15,10,2,5);
        if(elevatorValid) Elevator.getDetails();

        System.out.println("\nScenario 5");
        elevatorValid = Elevator.createElevator(
                "Thyssen","Passenger","Tech Park",
                0,10,2,5);
        if(elevatorValid) Elevator.getDetails();

        System.out.println("\nScenario 6");
        elevatorValid = Elevator.createElevator(
                "Otis","Freight","Warehouse",
                8,0,1,5);
        if(elevatorValid) Elevator.getDetails();

        System.out.println("\nScenario 7");
        elevatorValid = Elevator.createElevator(
                "Kone","Passenger","Hospital",
                12,10,0,5);
        if(elevatorValid) Elevator.getDetails();

        System.out.println("\nScenario 8");
        elevatorValid = Elevator.createElevator(
                "Schindler","Passenger","Airport",
                25,15,3,6);
        if(elevatorValid) Elevator.getDetails();
    }
}
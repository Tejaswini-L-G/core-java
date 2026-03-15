
class Universe {

    int universeId;
    String galaxyName;
    int galaxyCount;
    String discoveredBy;
    String observationTool;

    Earth earth;

    public void getUniverseDetails(){

        System.out.println("Universe Id: " + this.universeId);
        System.out.println("Galaxy Name: " + this.galaxyName);
        System.out.println("Galaxy Count: " + this.galaxyCount);
        System.out.println("Discovered By: " + this.discoveredBy);
        System.out.println("Observation Tool: " + this.observationTool);

        this.earth.getEarthDetails();
    }
}

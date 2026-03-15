
class Rythms {

    int eventId;
    String festivalName;
    String location;
    int participants;
    String organizer;

    MusicInstrument instrument;

    public void getRythmsDetails(){

        System.out.println("Event Id: " + this.eventId);
        System.out.println("Festival Name: " + this.festivalName);
        System.out.println("Location: " + this.location);
        System.out.println("Participants: " + this.participants);
        System.out.println("Organizer: " + this.organizer);

        this.instrument.getInstrumentDetails();
    }
}

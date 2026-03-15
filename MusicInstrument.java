
class MusicInstrument {

    int instrumentId;
    String instrumentName;
    String type;
    String origin;
    int popularityRank;

    public void getInstrumentDetails(){

        System.out.println("Instrument Id: " + this.instrumentId);
        System.out.println("Instrument Name: " + this.instrumentName);
        System.out.println("Type: " + this.type);
        System.out.println("Origin: " + this.origin);
        System.out.println("Popularity Rank: " + this.popularityRank);
    }
}

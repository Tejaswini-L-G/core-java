
class MusicInstrument {

    int instrumentId;
    String instrumentName;
    String type;
    String origin;
    int popularityRank;
	
	 public MusicInstrument() {}

    public MusicInstrument(int instrumentId, String instrumentName, String type, String origin, int popularityRank) {
        this.instrumentId = instrumentId;
        this.instrumentName = instrumentName;
        this.type = type;
        this.origin = origin;
        this.popularityRank = popularityRank;
    }


    public void getInstrumentDetails(){

        System.out.println("Instrument Id: " + this.instrumentId);
        System.out.println("Instrument Name: " + this.instrumentName);
        System.out.println("Type: " + this.type);
        System.out.println("Origin: " + this.origin);
        System.out.println("Popularity Rank: " + this.popularityRank);
    }
}

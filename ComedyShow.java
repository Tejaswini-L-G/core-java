class ComedyShow {
    String showName, platform, language, genre, host, location, timing, sponsor, category, format;
    int duration, rating;
    double ticketPrice, budget;
    boolean isLive, isFamilyFriendly;
    String season, releaseDate, producer, channel;

    ComedyShow(){
        this("LOL Show","Netflix","English","Comedy","Host1","Studio","8PM","BrandX","Entertainment","Standup",
             60,5,500.0,1000000.0,true,true,"S1","2025","ProducerX","ChannelX");
    }

    ComedyShow(String showName,String platform,String language,String genre,String host,String location,
               String timing,String sponsor,String category,String format,int duration,int rating,
               double ticketPrice,double budget,boolean isLive,boolean isFamilyFriendly,
               String season,String releaseDate,String producer,String channel){
        this.showName=showName; this.platform=platform; this.language=language; this.genre=genre;
        this.host=host; this.location=location; this.timing=timing;
        this.sponsor=sponsor; this.category=category; this.format=format;
        this.duration=duration; this.rating=rating; this.ticketPrice=ticketPrice; this.budget=budget;
        this.isLive=isLive; this.isFamilyFriendly=isFamilyFriendly;
        this.season=season; this.releaseDate=releaseDate; this.producer=producer; this.channel=channel;
    }

    ComedyShow(String showName,double ticketPrice){
        this(showName,"YouTube","Hindi","Comedy","Host2","Stage","9PM","BrandY","Entertainment","Standup",
             45,4,ticketPrice,500000.0,true,true,"S2","2024","ProducerY","ChannelY");
    }

    void getDetails(){
        System.out.println("Show: "+showName+" Ticket: "+ticketPrice);
    }
}
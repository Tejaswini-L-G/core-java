
class Channel {

    int channelId;
    String channelName;
    String category;
    String language;
    String country;
	
	 public Channel() {}

    public Channel(int channelId, String channelName, String category, String language, String country) {
        this.channelId = channelId;
        this.channelName = channelName;
        this.category = category;
        this.language = language;
        this.country = country;
    }

    public void getChannelDetails(){

        System.out.println("Channel Id: " + this.channelId);
        System.out.println("Channel Name: " + this.channelName);
        System.out.println("Category: " + this.category);
        System.out.println("Language: " + this.language);
        System.out.println("Country: " + this.country);
    }
}

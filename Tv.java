
class Tv {

    int tvId;
    String brand;
    String type;
    int screenSize;
    String resolution;

    Channel channel;
	
	 public Tv() {}

    public Tv(int tvId, String brand, String type, int screenSize, String resolution, Channel channel) {
        this.tvId = tvId;
        this.brand = brand;
        this.type = type;
        this.screenSize = screenSize;
        this.resolution = resolution;
        this.channel = channel;
    }

    public void getTvDetails(){

        System.out.println("TV Id: " + this.tvId);
        System.out.println("Brand: " + this.brand);
        System.out.println("Type: " + this.type);
        System.out.println("Screen Size: " + this.screenSize);
        System.out.println("Resolution: " + this.resolution);

        this.channel.getChannelDetails();
    }
}

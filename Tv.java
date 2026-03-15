
class Tv {

    int tvId;
    String brand;
    String type;
    int screenSize;
    String resolution;

    Channel channel;

    public void getTvDetails(){

        System.out.println("TV Id: " + this.tvId);
        System.out.println("Brand: " + this.brand);
        System.out.println("Type: " + this.type);
        System.out.println("Screen Size: " + this.screenSize);
        System.out.println("Resolution: " + this.resolution);

        this.channel.getChannelDetails();
    }
}

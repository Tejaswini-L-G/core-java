class TvRunner {

    public static void main(String[] args) {
		
		 Channel ch = new Channel(1, "Star Sports", "Sports", "English", "India");
        Tv tv = new Tv(101, "Samsung", "Smart", 55, "4K", ch);
        tv.getTvDetails();

        Tv tv1 = new Tv();
        Channel channel1 = new Channel();

        tv1.tvId = 90;
        tv1.brand = "Samsung";
        tv1.type = "Smart TV";
        tv1.screenSize = 55;
        tv1.resolution = "4K";

        channel1.channelId = 9001;
        channel1.channelName = "Star Sports";
        channel1.category = "Sports";
        channel1.language = "English";
        channel1.country = "India";

        tv1.channel = channel1;
        tv1.getTvDetails();

        System.out.println("----------------------");

        Tv tv2 = new Tv();
        Channel channel2 = new Channel();

        tv2.tvId = 90;
        tv2.brand = "Samsung";
        tv2.type = "Smart TV";
        tv2.screenSize = 55;
        tv2.resolution = "4K";

        channel2.channelId = 9002;
        channel2.channelName = "Sony Entertainment";
        channel2.category = "Entertainment";
        channel2.language = "Hindi";
        channel2.country = "India";

        tv2.channel = channel2;
        tv2.getTvDetails();

        System.out.println("----------------------");

        Tv tv3 = new Tv();
        Channel channel3 = new Channel();

        tv3.tvId = 90;
        tv3.brand = "Samsung";
        tv3.type = "Smart TV";
        tv3.screenSize = 55;
        tv3.resolution = "4K";

        channel3.channelId = 9003;
        channel3.channelName = "Discovery Channel";
        channel3.category = "Documentary";
        channel3.language = "English";
        channel3.country = "USA";

        tv3.channel = channel3;
        tv3.getTvDetails();

        System.out.println("----------------------");

        Tv tv4 = new Tv();
        Channel channel4 = new Channel();

        tv4.tvId = 90;
        tv4.brand = "Samsung";
        tv4.type = "Smart TV";
        tv4.screenSize = 55;
        tv4.resolution = "4K";

        channel4.channelId = 9004;
        channel4.channelName = "National Geographic";
        channel4.category = "Documentary";
        channel4.language = "English";
        channel4.country = "USA";

        tv4.channel = channel4;
        tv4.getTvDetails();

        System.out.println("----------------------");

        Tv tv5 = new Tv();
        Channel channel5 = new Channel();

        tv5.tvId = 90;
        tv5.brand = "Samsung";
        tv5.type = "Smart TV";
        tv5.screenSize = 55;
        tv5.resolution = "4K";

        channel5.channelId = 9005;
        channel5.channelName = "Cartoon Network";
        channel5.category = "Kids";
        channel5.language = "English";
        channel5.country = "USA";

        tv5.channel = channel5;
        tv5.getTvDetails();

        System.out.println("----------------------");

        Tv tv6 = new Tv();
        Channel channel6 = new Channel();

        tv6.tvId = 90;
        tv6.brand = "Samsung";
        tv6.type = "Smart TV";
        tv6.screenSize = 55;
        tv6.resolution = "4K";

        channel6.channelId = 9006;
        channel6.channelName = "Pogo";
        channel6.category = "Kids";
        channel6.language = "Hindi";
        channel6.country = "India";

        tv6.channel = channel6;
        tv6.getTvDetails();

        System.out.println("----------------------");

        Tv tv7 = new Tv();
        Channel channel7 = new Channel();

        tv7.tvId = 90;
        tv7.brand = "Samsung";
        tv7.type = "Smart TV";
        tv7.screenSize = 55;
        tv7.resolution = "4K";

        channel7.channelId = 9007;
        channel7.channelName = "Animal Planet";
        channel7.category = "Documentary";
        channel7.language = "English";
        channel7.country = "USA";

        tv7.channel = channel7;
        tv7.getTvDetails();

        System.out.println("----------------------");

        Tv tv8 = new Tv();
        Channel channel8 = new Channel();

        tv8.tvId = 90;
        tv8.brand = "Samsung";
        tv8.type = "Smart TV";
        tv8.screenSize = 55;
        tv8.resolution = "4K";

        channel8.channelId = 9008;
        channel8.channelName = "HBO";
        channel8.category = "Movies";
        channel8.language = "English";
        channel8.country = "USA";

        tv8.channel = channel8;
        tv8.getTvDetails();

        System.out.println("----------------------");

        Tv tv9 = new Tv();
        Channel channel9 = new Channel();

        tv9.tvId = 90;
        tv9.brand = "Samsung";
        tv9.type = "Smart TV";
        tv9.screenSize = 55;
        tv9.resolution = "4K";

        channel9.channelId = 9009;
        channel9.channelName = "Zee TV";
        channel9.category = "Entertainment";
        channel9.language = "Hindi";
        channel9.country = "India";

        tv9.channel = channel9;
        tv9.getTvDetails();

        System.out.println("----------------------");

        Tv tv10 = new Tv();
        Channel channel10 = new Channel();

        tv10.tvId = 90;
        tv10.brand = "Samsung";
        tv10.type = "Smart TV";
        tv10.screenSize = 55;
        tv10.resolution = "4K";

        channel10.channelId = 9010;
        channel10.channelName = "Colors";
        channel10.category = "Entertainment";
        channel10.language = "Hindi";
        channel10.country = "India";

        tv10.channel = channel10;
        tv10.getTvDetails();

        System.out.println("----------------------");

        Tv tv11 = new Tv();
        Channel channel11 = new Channel();

        tv11.tvId = 90;
        tv11.brand = "Samsung";
        tv11.type = "Smart TV";
        tv11.screenSize = 55;
        tv11.resolution = "4K";

        channel11.channelId = 9011;
        channel11.channelName = "Sun TV";
        channel11.category = "Entertainment";
        channel11.language = "Tamil";
        channel11.country = "India";

        tv11.channel = channel11;
        tv11.getTvDetails();

        System.out.println("----------------------");

        Tv tv12 = new Tv();
        Channel channel12 = new Channel();

        tv12.tvId = 90;
        tv12.brand = "Samsung";
        tv12.type = "Smart TV";
        tv12.screenSize = 55;
        tv12.resolution = "4K";

        channel12.channelId = 9012;
        channel12.channelName = "Star Vijay";
        channel12.category = "Entertainment";
        channel12.language = "Tamil";
        channel12.country = "India";

        tv12.channel = channel12;
        tv12.getTvDetails();

        System.out.println("----------------------");

        Tv tv13 = new Tv();
        Channel channel13 = new Channel();

        tv13.tvId = 90;
        tv13.brand = "Samsung";
        tv13.type = "Smart TV";
        tv13.screenSize = 55;
        tv13.resolution = "4K";

        channel13.channelId = 9013;
        channel13.channelName = "ETV Kannada";
        channel13.category = "Entertainment";
        channel13.language = "Kannada";
        channel13.country = "India";

        tv13.channel = channel13;
        tv13.getTvDetails();

        System.out.println("----------------------");

        Tv tv14 = new Tv();
        Channel channel14 = new Channel();

        tv14.tvId = 90;
        tv14.brand = "Samsung";
        tv14.type = "Smart TV";
        tv14.screenSize = 55;
        tv14.resolution = "4K";

        channel14.channelId = 9014;
        channel14.channelName = "TV9";
        channel14.category = "News";
        channel14.language = "Kannada";
        channel14.country = "India";

        tv14.channel = channel14;
        tv14.getTvDetails();

        System.out.println("----------------------");

        Tv tv15 = new Tv();
        Channel channel15 = new Channel();

        tv15.tvId = 90;
        tv15.brand = "Samsung";
        tv15.type = "Smart TV";
        tv15.screenSize = 55;
        tv15.resolution = "4K";

        channel15.channelId = 9015;
        channel15.channelName = "NDTV";
        channel15.category = "News";
        channel15.language = "English";
        channel15.country = "India";

        tv15.channel = channel15;
        tv15.getTvDetails();

        System.out.println("----------------------");

        Tv tv16 = new Tv();
        Channel channel16 = new Channel();

        tv16.tvId = 90;
        tv16.brand = "Samsung";
        tv16.type = "Smart TV";
        tv16.screenSize = 55;
        tv16.resolution = "4K";

        channel16.channelId = 9016;
        channel16.channelName = "CNN";
        channel16.category = "News";
        channel16.language = "English";
        channel16.country = "USA";

        tv16.channel = channel16;
        tv16.getTvDetails();

        System.out.println("----------------------");

        Tv tv17 = new Tv();
        Channel channel17 = new Channel();

        tv17.tvId = 90;
        tv17.brand = "Samsung";
        tv17.type = "Smart TV";
        tv17.screenSize = 55;
        tv17.resolution = "4K";

        channel17.channelId = 9017;
        channel17.channelName = "BBC";
        channel17.category = "News";
        channel17.language = "English";
        channel17.country = "UK";

        tv17.channel = channel17;
        tv17.getTvDetails();

        System.out.println("----------------------");

        Tv tv18 = new Tv();
        Channel channel18 = new Channel();

        tv18.tvId = 90;
        tv18.brand = "Samsung";
        tv18.type = "Smart TV";
        tv18.screenSize = 55;
        tv18.resolution = "4K";

        channel18.channelId = 9018;
        channel18.channelName = "Star Movies";
        channel18.category = "Movies";
        channel18.language = "English";
        channel18.country = "India";

        tv18.channel = channel18;
        tv18.getTvDetails();

        System.out.println("----------------------");

        Tv tv19 = new Tv();
        Channel channel19 = new Channel();

        tv19.tvId = 90;
        tv19.brand = "Samsung";
        tv19.type = "Smart TV";
        tv19.screenSize = 55;
        tv19.resolution = "4K";

        channel19.channelId = 9019;
        channel19.channelName = "Sony Max";
        channel19.category = "Movies";
        channel19.language = "Hindi";
        channel19.country = "India";

        tv19.channel = channel19;
        tv19.getTvDetails();

        System.out.println("----------------------");

        Tv tv20 = new Tv();
        Channel channel20 = new Channel();

        tv20.tvId = 90;
        tv20.brand = "Samsung";
        tv20.type = "Smart TV";
        tv20.screenSize = 55;
        tv20.resolution = "4K";

        channel20.channelId = 9020;
        channel20.channelName = "Nickelodeon";
        channel20.category = "Kids";
        channel20.language = "English";
        channel20.country = "USA";

        tv20.channel = channel20;
        tv20.getTvDetails();

        System.out.println("----------------------");
    }
}
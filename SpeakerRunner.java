class SpeakerRunner {
    public static void main(String[] args) {

        Speaker speaker1 = new Speaker(1501);
        System.out.println(speaker1.speakerId);

        Speaker speaker2 = new Speaker("JBL",1501);
        System.out.println(speaker2.brand);

        Speaker speaker3 = new Speaker("Flip6","JBL");
        System.out.println(speaker3.model);

        Speaker speaker4 = new Speaker(8999.0,"Flip6");
        System.out.println(speaker4.price);

        Speaker speaker5 = new Speaker(30,8999.0);
        System.out.println(speaker5.power);

        Speaker speaker6 = new Speaker(4800,30);
        System.out.println(speaker6.battery);

        Speaker speaker7 = new Speaker("Black",4800);
        System.out.println(speaker7.color);

        Speaker speaker8 = new Speaker("Bluetooth","Black");
        System.out.println(speaker8.type);

        Speaker speaker9 = new Speaker(0.55,"Bluetooth");
        System.out.println(speaker9.weight);

        Speaker speaker10 = new Speaker(10,0.55);
        System.out.println(speaker10.range);

        Speaker speaker11 = new Speaker("USA",10);
        System.out.println(speaker11.origin);

        Speaker speaker12 = new Speaker(1,"USA");
        System.out.println(speaker12.warranty);

    }
}

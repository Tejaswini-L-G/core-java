class TabletRunner {
    public static void main(String[] args) {

        Tablet tablet1 = new Tablet(1801);
        System.out.println(tablet1.tabletId);

        Tablet tablet2 = new Tablet("Samsung",1801);
        System.out.println(tablet2.brand);

        Tablet tablet3 = new Tablet("GalaxyTabS7","Samsung");
        System.out.println(tablet3.model);

        Tablet tablet4 = new Tablet(55000.0,"GalaxyTabS7");
        System.out.println(tablet4.price);

        Tablet tablet5 = new Tablet(8,55000.0);
        System.out.println(tablet5.ramGB);

        Tablet tablet6 = new Tablet(256,8);
        System.out.println(tablet6.storageGB);

        Tablet tablet7 = new Tablet("Black",256);
        System.out.println(tablet7.color);

        Tablet tablet8 = new Tablet("Snapdragon865","Black");
        System.out.println(tablet8.processor);

        Tablet tablet9 = new Tablet(11.0,"Snapdragon865");
        System.out.println(tablet9.screenSize);

        Tablet tablet10 = new Tablet(8000,11.0);
        System.out.println(tablet10.batteryMah);

        Tablet tablet11 = new Tablet("Android",8000);
        System.out.println(tablet11.os);

        Tablet tablet12 = new Tablet(2,"Android");
        System.out.println(tablet12.warranty);

    }
}

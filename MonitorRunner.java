class MonitorRunner {
    public static void main(String[] args) {

        Monitor monitor1 = new Monitor(1001);
        System.out.println(monitor1.monitorId);

        Monitor monitor2 = new Monitor("Samsung",1001);
        System.out.println(monitor2.brand);

        Monitor monitor3 = new Monitor("OdysseyG5","Samsung");
        System.out.println(monitor3.model);

        Monitor monitor4 = new Monitor(22000.0,"OdysseyG5");
        System.out.println(monitor4.price);

        Monitor monitor5 = new Monitor(144,22000.0);
        System.out.println(monitor5.refreshRate);

        Monitor monitor6 = new Monitor(2560,144);
        System.out.println(monitor6.resolution);

        Monitor monitor7 = new Monitor("IPS",2560);
        System.out.println(monitor7.panelType);

        Monitor monitor8 = new Monitor("Black","IPS");
        System.out.println(monitor8.color);

        Monitor monitor9 = new Monitor(27.0,"Black");
        System.out.println(monitor9.screenSize);

        Monitor monitor10 = new Monitor(4,27.0);
        System.out.println(monitor10.ports);

        Monitor monitor11 = new Monitor("SouthKorea",4);
        System.out.println(monitor11.origin);

        Monitor monitor12 = new Monitor(3,"SouthKorea");
        System.out.println(monitor12.warranty);

    }
}

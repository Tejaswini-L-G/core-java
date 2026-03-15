class PrinterRunner {
    public static void main(String[] args) {

        Printer printer1 = new Printer(701);
        System.out.println(printer1.printerId);

        Printer printer2 = new Printer("HP",701);
        System.out.println(printer2.brand);

        Printer printer3 = new Printer("Laser","HP");
        System.out.println(printer3.type);

        Printer printer4 = new Printer(15000.0,"Laser");
        System.out.println(printer4.price);

        Printer printer5 = new Printer(20,15000.0);
        System.out.println(printer5.printSpeed);

        Printer printer6 = new Printer(1200,20);
        System.out.println(printer6.resolution);

        Printer printer7 = new Printer("Color",1200);
        System.out.println(printer7.colorMode);

        Printer printer8 = new Printer("WiFi","Color");
        System.out.println(printer8.connectionType);

        Printer printer9 = new Printer(6500.0,"WiFi");
        System.out.println(printer9.weight);

        Printer printer10 = new Printer(250,6500.0);
        System.out.println(printer10.paperCapacity);

        Printer printer11 = new Printer("USA",250);
        System.out.println(printer11.origin);

        Printer printer12 = new Printer(1,"USA");
        System.out.println(printer12.warranty);

    }
}

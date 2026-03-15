class BottleRunner {
    public static void main(String[] args) {

        Bottle bottle1 = new Bottle(201);
        System.out.println(bottle1.bottleId);

        Bottle bottle2 = new Bottle("Milton",201);
        System.out.println(bottle2.brand);

        Bottle bottle3 = new Bottle("Steel","Milton");
        System.out.println(bottle3.material);

        Bottle bottle4 = new Bottle(450.0,"Steel");
        System.out.println(bottle4.price);

        Bottle bottle5 = new Bottle(1000,450.0);
        System.out.println(bottle5.capacity);

        Bottle bottle6 = new Bottle(300,1000);
        System.out.println(bottle6.weight);

        Bottle bottle7 = new Bottle("Silver",300);
        System.out.println(bottle7.color);

        Bottle bottle8 = new Bottle("ScrewCap","Silver");
        System.out.println(bottle8.capType);

        Bottle bottle9 = new Bottle(28.5,"ScrewCap");
        System.out.println(bottle9.height);

        Bottle bottle10 = new Bottle(7,28.5);
        System.out.println(bottle10.diameter);

        Bottle bottle11 = new Bottle("India",7);
        System.out.println(bottle11.origin);

        Bottle bottle12 = new Bottle(2,"India");
        System.out.println(bottle12.warranty);

    }
}

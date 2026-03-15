class LampRunner {
    public static void main(String[] args) {

        Lamp lamp1 = new Lamp(1401);
        System.out.println(lamp1.lampId);

        Lamp lamp2 = new Lamp("Philips",1401);
        System.out.println(lamp2.brand);

        Lamp lamp3 = new Lamp("LEDDesk","Philips");
        System.out.println(lamp3.type);

        Lamp lamp4 = new Lamp(1500.0,"LEDDesk");
        System.out.println(lamp4.price);

        Lamp lamp5 = new Lamp(9,1500.0);
        System.out.println(lamp5.power);

        Lamp lamp6 = new Lamp(800,9);
        System.out.println(lamp6.brightness);

        Lamp lamp7 = new Lamp("White",800);
        System.out.println(lamp7.color);

        Lamp lamp8 = new Lamp("Plastic","White");
        System.out.println(lamp8.material);

        Lamp lamp9 = new Lamp(35.0,"Plastic");
        System.out.println(lamp9.height);

        Lamp lamp10 = new Lamp(3,35.0);
        System.out.println(lamp10.modes);

        Lamp lamp11 = new Lamp("Netherlands",3);
        System.out.println(lamp11.origin);

        Lamp lamp12 = new Lamp(2,"Netherlands");
        System.out.println(lamp12.warranty);

    }
}

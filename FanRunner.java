class FanRunner {
    public static void main(String[] args) {

        Fan fan1 = new Fan(501);
        System.out.println(fan1.fanId);

        Fan fan2 = new Fan("Usha",501);
        System.out.println(fan2.brand);

        Fan fan3 = new Fan("Ceiling","Usha");
        System.out.println(fan3.type);

        Fan fan4 = new Fan(3200.0,"Ceiling");
        System.out.println(fan4.price);

        Fan fan5 = new Fan(5,3200.0);
        System.out.println(fan5.speedLevels);

        Fan fan6 = new Fan(75,5);
        System.out.println(fan6.power);

        Fan fan7 = new Fan("White",75);
        System.out.println(fan7.color);

        Fan fan8 = new Fan("Metal","White");
        System.out.println(fan8.material);

        Fan fan9 = new Fan(48.0,"Metal");
        System.out.println(fan9.bladeSize);

        Fan fan10 = new Fan(3,48.0);
        System.out.println(fan10.blades);

        Fan fan11 = new Fan("India",3);
        System.out.println(fan11.origin);

        Fan fan12 = new Fan(2,"India");
        System.out.println(fan12.warranty);

    }
}

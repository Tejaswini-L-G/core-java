class MouseRunner {
    public static void main(String[] args) {

        Mouse mouse1 = new Mouse(901);
        System.out.println(mouse1.mouseId);

        Mouse mouse2 = new Mouse("Logitech",901);
        System.out.println(mouse2.brand);

        Mouse mouse3 = new Mouse("Wireless","Logitech");
        System.out.println(mouse3.type);

        Mouse mouse4 = new Mouse(1200.0,"Wireless");
        System.out.println(mouse4.price);

        Mouse mouse5 = new Mouse(1600,1200.0);
        System.out.println(mouse5.dpi);

        Mouse mouse6 = new Mouse(6,1600);
        System.out.println(mouse6.buttons);

        Mouse mouse7 = new Mouse("Black",6);
        System.out.println(mouse7.color);

        Mouse mouse8 = new Mouse("Bluetooth","Black");
        System.out.println(mouse8.connectionType);

        Mouse mouse9 = new Mouse(85.0,"Bluetooth");
        System.out.println(mouse9.weight);

        Mouse mouse10 = new Mouse(12,85.0);
        System.out.println(mouse10.batteryLife);

        Mouse mouse11 = new Mouse("China",12);
        System.out.println(mouse11.origin);

        Mouse mouse12 = new Mouse(1,"China");
        System.out.println(mouse12.warranty);

    }
}

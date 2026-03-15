class KeyboardRunner {
    public static void main(String[] args) {

        Keyboard keyboard1 = new Keyboard(801);
        System.out.println(keyboard1.keyboardId);

        Keyboard keyboard2 = new Keyboard("Logitech",801);
        System.out.println(keyboard2.brand);

        Keyboard keyboard3 = new Keyboard("Mechanical","Logitech");
        System.out.println(keyboard3.type);

        Keyboard keyboard4 = new Keyboard(3500.0,"Mechanical");
        System.out.println(keyboard4.price);

        Keyboard keyboard5 = new Keyboard(104,3500.0);
        System.out.println(keyboard5.keys);

        Keyboard keyboard6 = new Keyboard(800,104);
        System.out.println(keyboard6.weight);

        Keyboard keyboard7 = new Keyboard("Black",800);
        System.out.println(keyboard7.color);

        Keyboard keyboard8 = new Keyboard("USB","Black");
        System.out.println(keyboard8.connectionType);

        Keyboard keyboard9 = new Keyboard(45.0,"USB");
        System.out.println(keyboard9.length);

        Keyboard keyboard10 = new Keyboard(5,45.0);
        System.out.println(keyboard10.backlightLevels);

        Keyboard keyboard11 = new Keyboard("Switzerland",5);
        System.out.println(keyboard11.origin);

        Keyboard keyboard12 = new Keyboard(2,"Switzerland");
        System.out.println(keyboard12.warranty);

    }
}

class EraserRunner {
    public static void main(String[] args) {

        Eraser eraser1 = new Eraser(2501);
        System.out.println(eraser1.eraserId);

        Eraser eraser2 = new Eraser("Nataraj",2501);
        System.out.println(eraser2.brand);

        Eraser eraser3 = new Eraser("Rubber","Nataraj");
        System.out.println(eraser3.material);

        Eraser eraser4 = new Eraser(3.0,"Rubber");
        System.out.println(eraser4.price);

        Eraser eraser5 = new Eraser(40,3.0);
        System.out.println(eraser5.lengthMm);

        Eraser eraser6 = new Eraser(20,40);
        System.out.println(eraser6.widthMm);

        Eraser eraser7 = new Eraser("White",20);
        System.out.println(eraser7.color);

        Eraser eraser8 = new Eraser("Soft","White");
        System.out.println(eraser8.type);

        Eraser eraser9 = new Eraser(5.0,"Soft");
        System.out.println(eraser9.weight);

        Eraser eraser10 = new Eraser(1,5.0);
        System.out.println(eraser10.pieces);

        Eraser eraser11 = new Eraser("India",1);
        System.out.println(eraser11.origin);

        Eraser eraser12 = new Eraser(100,"India");
        System.out.println(eraser12.stock);

    }
}

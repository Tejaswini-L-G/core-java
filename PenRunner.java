class PenRunner {
    public static void main(String[] args) {

        Pen pen1 = new Pen(101);
        System.out.println(pen1.penId);

        Pen pen2 = new Pen("Cello",101);
        System.out.println(pen2.brand);

        Pen pen3 = new Pen("Blue","Cello");
        System.out.println(pen3.inkColor);

        Pen pen4 = new Pen(10.5,"Blue");
        System.out.println(pen4.price);

        Pen pen5 = new Pen(14,10.5);
        System.out.println(pen5.length);

        Pen pen6 = new Pen(8,14);
        System.out.println(pen6.weight);

        Pen pen7 = new Pen("BallPen",8);
        System.out.println(pen7.type);

        Pen pen8 = new Pen("Plastic","BallPen");
        System.out.println(pen8.material);

        Pen pen9 = new Pen(0.7,"Plastic");
        System.out.println(pen9.tipSize);

        Pen pen10 = new Pen(80,0.7);
        System.out.println(pen10.inkLevel);

        Pen pen11 = new Pen("India",80);
        System.out.println(pen11.origin);

        Pen pen12 = new Pen(1,"India");
        System.out.println(pen12.warranty);

    }
}

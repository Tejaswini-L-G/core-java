class PencilRunner {
    public static void main(String[] args) {

        Pencil pencil1 = new Pencil(2301);
        System.out.println(pencil1.pencilId);

        Pencil pencil2 = new Pencil("Apsara",2301);
        System.out.println(pencil2.brand);

        Pencil pencil3 = new Pencil("HB","Apsara");
        System.out.println(pencil3.type);

        Pencil pencil4 = new Pencil(5.0,"HB");
        System.out.println(pencil4.price);

        Pencil pencil5 = new Pencil(18,5.0);
        System.out.println(pencil5.lengthCm);

        Pencil pencil6 = new Pencil(10,18);
        System.out.println(pencil6.weightG);

        Pencil pencil7 = new Pencil("Yellow",10);
        System.out.println(pencil7.color);

        Pencil pencil8 = new Pencil("Wood","Yellow");
        System.out.println(pencil8.material);

        Pencil pencil9 = new Pencil(0.5,"Wood");
        System.out.println(pencil9.tipSize);

        Pencil pencil10 = new Pencil(2,0.5);
        System.out.println(pencil10.hardness);

        Pencil pencil11 = new Pencil("India",2);
        System.out.println(pencil11.origin);

        Pencil pencil12 = new Pencil(10,"India");
        System.out.println(pencil12.packSize);

    }
}

class CupRunner {
    public static void main(String[] args) {

        Cup cup1 = new Cup(2101);
        System.out.println(cup1.cupId);

        Cup cup2 = new Cup("Tupperware",2101);
        System.out.println(cup2.brand);

        Cup cup3 = new Cup("Plastic","Tupperware");
        System.out.println(cup3.material);

        Cup cup4 = new Cup(250.0,"Plastic");
        System.out.println(cup4.price);

        Cup cup5 = new Cup(350,250.0);
        System.out.println(cup5.capacityMl);

        Cup cup6 = new Cup(10,350);
        System.out.println(cup6.heightCm);

        Cup cup7 = new Cup("Red",10);
        System.out.println(cup7.color);

        Cup cup8 = new Cup("TeaCup","Red");
        System.out.println(cup8.type);

        Cup cup9 = new Cup(0.2,"TeaCup");
        System.out.println(cup9.weight);

        Cup cup10 = new Cup(75,0.2);
        System.out.println(cup10.diameterMm);

        Cup cup11 = new Cup("India",75);
        System.out.println(cup11.origin);

        Cup cup12 = new Cup(1,"India");
        System.out.println(cup12.warranty);

    }
}

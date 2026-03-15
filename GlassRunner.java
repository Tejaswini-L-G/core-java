class GlassRunner {
    public static void main(String[] args) {

        Glass glass1 = new Glass(2001);
        System.out.println(glass1.glassId);

        Glass glass2 = new Glass("Ocean",2001);
        System.out.println(glass2.brand);

        Glass glass3 = new Glass("Crystal","Ocean");
        System.out.println(glass3.material);

        Glass glass4 = new Glass(350.0,"Crystal");
        System.out.println(glass4.price);

        Glass glass5 = new Glass(300,350.0);
        System.out.println(glass5.capacityMl);

        Glass glass6 = new Glass(12,300);
        System.out.println(glass6.heightCm);

        Glass glass7 = new Glass("Transparent",12);
        System.out.println(glass7.color);

        Glass glass8 = new Glass("Drinking","Transparent");
        System.out.println(glass8.type);

        Glass glass9 = new Glass(0.3,"Drinking");
        System.out.println(glass9.weight);

        Glass glass10 = new Glass(70,0.3);
        System.out.println(glass10.diameterMm);

        Glass glass11 = new Glass("Thailand",70);
        System.out.println(glass11.origin);

        Glass glass12 = new Glass(1,"Thailand");
        System.out.println(glass12.warranty);

    }
}

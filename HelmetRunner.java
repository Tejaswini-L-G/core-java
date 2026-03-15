class HelmetRunner {
    public static void main(String[] args) {

        Helmet helmet1 = new Helmet(1301);
        System.out.println(helmet1.helmetId);

        Helmet helmet2 = new Helmet("Vega",1301);
        System.out.println(helmet2.brand);

        Helmet helmet3 = new Helmet("FullFace","Vega");
        System.out.println(helmet3.type);

        Helmet helmet4 = new Helmet(1800.0,"FullFace");
        System.out.println(helmet4.price);

        Helmet helmet5 = new Helmet(58,1800.0);
        System.out.println(helmet5.size);

        Helmet helmet6 = new Helmet(1400,58);
        System.out.println(helmet6.weight);

        Helmet helmet7 = new Helmet("Black",1400);
        System.out.println(helmet7.color);

        Helmet helmet8 = new Helmet("ABS","Black");
        System.out.println(helmet8.material);

        Helmet helmet9 = new Helmet(12.5,"ABS");
        System.out.println(helmet9.visorSize);

        Helmet helmet10 = new Helmet(6,12.5);
        System.out.println(helmet10.vents);

        Helmet helmet11 = new Helmet("India",6);
        System.out.println(helmet11.origin);

        Helmet helmet12 = new Helmet(1,"India");
        System.out.println(helmet12.warranty);

    }
}

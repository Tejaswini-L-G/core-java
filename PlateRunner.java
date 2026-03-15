class PlateRunner {
    public static void main(String[] args) {

        Plate plate1 = new Plate(2201);
        System.out.println(plate1.plateId);

        Plate plate2 = new Plate("Corelle",2201);
        System.out.println(plate2.brand);

        Plate plate3 = new Plate("Ceramic","Corelle");
        System.out.println(plate3.material);

        Plate plate4 = new Plate(600.0,"Ceramic");
        System.out.println(plate4.price);

        Plate plate5 = new Plate(28,600.0);
        System.out.println(plate5.diameterCm);

        Plate plate6 = new Plate(500,28);
        System.out.println(plate6.weightG);

        Plate plate7 = new Plate("White",500);
        System.out.println(plate7.color);

        Plate plate8 = new Plate("Round","White");
        System.out.println(plate8.shape);

        Plate plate9 = new Plate(3.5,"Round");
        System.out.println(plate9.thicknessMm);

        Plate plate10 = new Plate(6,3.5);
        System.out.println(plate10.pieces);

        Plate plate11 = new Plate("USA",6);
        System.out.println(plate11.origin);

        Plate plate12 = new Plate(2,"USA");
        System.out.println(plate12.warranty);

    }
}

class TourismAngadiRunner {

    public static void main(String[] args) {
		
		 Package p = new Package(1, "Goa", 3, 8000, "Bus");
        TourismAngadi t = new TourismAngadi(101, "TourismAngadi", "Bangalore", 2018, "Team", p);
        t.getTourismDetails();

        TourismAngadi tourism1 = new TourismAngadi();
        Package package1 = new Package();

        tourism1.platformId = 101;
        tourism1.companyName = "Tourism Angadi";
        tourism1.headquarters = "Bangalore";
        tourism1.foundedYear = 2018;
        tourism1.founder = "Travel Group";

        package1.packageId = 10001;
        package1.destination = "Goa Beach";
        package1.days = 3;
        package1.price = 8500;
        package1.transport = "Bus";

        tourism1.pkg = package1;
        tourism1.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism2 = new TourismAngadi();
        Package package2 = new Package();

        tourism2.platformId = 101;
        tourism2.companyName = "Tourism Angadi";
        tourism2.headquarters = "Bangalore";
        tourism2.foundedYear = 2018;
        tourism2.founder = "Travel Group";

        package2.packageId = 10002;
        package2.destination = "Manali Hills";
        package2.days = 5;
        package2.price = 12000;
        package2.transport = "Flight";

        tourism2.pkg = package2;
        tourism2.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism3 = new TourismAngadi();
        Package package3 = new Package();

        tourism3.platformId = 101;
        tourism3.companyName = "Tourism Angadi";
        tourism3.headquarters = "Bangalore";
        tourism3.foundedYear = 2018;
        tourism3.founder = "Travel Group";

        package3.packageId = 10003;
        package3.destination = "Kerala Backwaters";
        package3.days = 4;
        package3.price = 15000;
        package3.transport = "Train";

        tourism3.pkg = package3;
        tourism3.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism4 = new TourismAngadi();
        Package package4 = new Package();

        tourism4.platformId = 101;
        tourism4.companyName = "Tourism Angadi";
        tourism4.headquarters = "Bangalore";
        tourism4.foundedYear = 2018;
        tourism4.founder = "Travel Group";

        package4.packageId = 10004;
        package4.destination = "Ooty Hills";
        package4.days = 3;
        package4.price = 9000;
        package4.transport = "Bus";

        tourism4.pkg = package4;
        tourism4.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism5 = new TourismAngadi();
        Package package5 = new Package();

        tourism5.platformId = 101;
        tourism5.companyName = "Tourism Angadi";
        tourism5.headquarters = "Bangalore";
        tourism5.foundedYear = 2018;
        tourism5.founder = "Travel Group";

        package5.packageId = 10005;
        package5.destination = "Mysore Palace";
        package5.days = 2;
        package5.price = 5000;
        package5.transport = "Bus";

        tourism5.pkg = package5;
        tourism5.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism6 = new TourismAngadi();
        Package package6 = new Package();

        tourism6.platformId = 101;
        tourism6.companyName = "Tourism Angadi";
        tourism6.headquarters = "Bangalore";
        tourism6.foundedYear = 2018;
        tourism6.founder = "Travel Group";

        package6.packageId = 10006;
        package6.destination = "Kashmir Valley";
        package6.days = 6;
        package6.price = 25000;
        package6.transport = "Flight";

        tourism6.pkg = package6;
        tourism6.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism7 = new TourismAngadi();
        Package package7 = new Package();

        tourism7.platformId = 101;
        tourism7.companyName = "Tourism Angadi";
        tourism7.headquarters = "Bangalore";
        tourism7.foundedYear = 2018;
        tourism7.founder = "Travel Group";

        package7.packageId = 10007;
        package7.destination = "Andaman Islands";
        package7.days = 5;
        package7.price = 28000;
        package7.transport = "Flight";

        tourism7.pkg = package7;
        tourism7.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism8 = new TourismAngadi();
        Package package8 = new Package();

        tourism8.platformId = 101;
        tourism8.companyName = "Tourism Angadi";
        tourism8.headquarters = "Bangalore";
        tourism8.foundedYear = 2018;
        tourism8.founder = "Travel Group";

        package8.packageId = 10008;
        package8.destination = "Jaipur Heritage";
        package8.days = 3;
        package8.price = 11000;
        package8.transport = "Train";

        tourism8.pkg = package8;
        tourism8.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism9 = new TourismAngadi();
        Package package9 = new Package();

        tourism9.platformId = 101;
        tourism9.companyName = "Tourism Angadi";
        tourism9.headquarters = "Bangalore";
        tourism9.foundedYear = 2018;
        tourism9.founder = "Travel Group";

        package9.packageId = 10009;
        package9.destination = "Darjeeling Hills";
        package9.days = 4;
        package9.price = 14000;
        package9.transport = "Train";

        tourism9.pkg = package9;
        tourism9.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism10 = new TourismAngadi();
        Package package10 = new Package();

        tourism10.platformId = 101;
        tourism10.companyName = "Tourism Angadi";
        tourism10.headquarters = "Bangalore";
        tourism10.foundedYear = 2018;
        tourism10.founder = "Travel Group";

        package10.packageId = 10010;
        package10.destination = "Leh Ladakh";
        package10.days = 7;
        package10.price = 30000;
        package10.transport = "Flight";

        tourism10.pkg = package10;
        tourism10.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism11 = new TourismAngadi();
        Package package11 = new Package();

        tourism11.platformId = 101;
        tourism11.companyName = "Tourism Angadi";
        tourism11.headquarters = "Bangalore";
        tourism11.foundedYear = 2018;
        tourism11.founder = "Travel Group";

        package11.packageId = 10011;
        package11.destination = "Rishikesh Adventure";
        package11.days = 3;
        package11.price = 9500;
        package11.transport = "Bus";

        tourism11.pkg = package11;
        tourism11.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism12 = new TourismAngadi();
        Package package12 = new Package();

        tourism12.platformId = 101;
        tourism12.companyName = "Tourism Angadi";
        tourism12.headquarters = "Bangalore";
        tourism12.foundedYear = 2018;
        tourism12.founder = "Travel Group";

        package12.packageId = 10012;
        package12.destination = "Coorg Coffee Hills";
        package12.days = 3;
        package12.price = 8800;
        package12.transport = "Bus";

        tourism12.pkg = package12;
        tourism12.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism13 = new TourismAngadi();
        Package package13 = new Package();

        tourism13.platformId = 101;
        tourism13.companyName = "Tourism Angadi";
        tourism13.headquarters = "Bangalore";
        tourism13.foundedYear = 2018;
        tourism13.founder = "Travel Group";

        package13.packageId = 10013;
        package13.destination = "Hampi Heritage";
        package13.days = 2;
        package13.price = 6500;
        package13.transport = "Bus";

        tourism13.pkg = package13;
        tourism13.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism14 = new TourismAngadi();
        Package package14 = new Package();

        tourism14.platformId = 101;
        tourism14.companyName = "Tourism Angadi";
        tourism14.headquarters = "Bangalore";
        tourism14.foundedYear = 2018;
        tourism14.founder = "Travel Group";

        package14.packageId = 10014;
        package14.destination = "Kodaikanal Lake";
        package14.days = 3;
        package14.price = 9700;
        package14.transport = "Bus";

        tourism14.pkg = package14;
        tourism14.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism15 = new TourismAngadi();
        Package package15 = new Package();

        tourism15.platformId = 101;
        tourism15.companyName = "Tourism Angadi";
        tourism15.headquarters = "Bangalore";
        tourism15.foundedYear = 2018;
        tourism15.founder = "Travel Group";

        package15.packageId = 10015;
        package15.destination = "Varanasi Temple Tour";
        package15.days = 3;
        package15.price = 12000;
        package15.transport = "Train";

        tourism15.pkg = package15;
        tourism15.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism16 = new TourismAngadi();
        Package package16 = new Package();

        tourism16.platformId = 101;
        tourism16.companyName = "Tourism Angadi";
        tourism16.headquarters = "Bangalore";
        tourism16.foundedYear = 2018;
        tourism16.founder = "Travel Group";

        package16.packageId = 10016;
        package16.destination = "Shimla Snow Trip";
        package16.days = 4;
        package16.price = 16000;
        package16.transport = "Train";

        tourism16.pkg = package16;
        tourism16.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism17 = new TourismAngadi();
        Package package17 = new Package();

        tourism17.platformId = 101;
        tourism17.companyName = "Tourism Angadi";
        tourism17.headquarters = "Bangalore";
        tourism17.foundedYear = 2018;
        tourism17.founder = "Travel Group";

        package17.packageId = 10017;
        package17.destination = "Udaipur Royal Tour";
        package17.days = 3;
        package17.price = 13500;
        package17.transport = "Train";

        tourism17.pkg = package17;
        tourism17.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism18 = new TourismAngadi();
        Package package18 = new Package();

        tourism18.platformId = 101;
        tourism18.companyName = "Tourism Angadi";
        tourism18.headquarters = "Bangalore";
        tourism18.foundedYear = 2018;
        tourism18.founder = "Travel Group";

        package18.packageId = 10018;
        package18.destination = "Agra Taj Visit";
        package18.days = 2;
        package18.price = 7000;
        package18.transport = "Train";

        tourism18.pkg = package18;
        tourism18.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism19 = new TourismAngadi();
        Package package19 = new Package();

        tourism19.platformId = 101;
        tourism19.companyName = "Tourism Angadi";
        tourism19.headquarters = "Bangalore";
        tourism19.foundedYear = 2018;
        tourism19.founder = "Travel Group";

        package19.packageId = 10019;
        package19.destination = "Sikkim Mountain Tour";
        package19.days = 5;
        package19.price = 21000;
        package19.transport = "Flight";

        tourism19.pkg = package19;
        tourism19.getTourismDetails();

        System.out.println("----------------------");

        TourismAngadi tourism20 = new TourismAngadi();
        Package package20 = new Package();

        tourism20.platformId = 101;
        tourism20.companyName = "Tourism Angadi";
        tourism20.headquarters = "Bangalore";
        tourism20.foundedYear = 2018;
        tourism20.founder = "Travel Group";

        package20.packageId = 10020;
        package20.destination = "Pondicherry Beach";
        package20.days = 3;
        package20.price = 9200;
        package20.transport = "Bus";

        tourism20.pkg = package20;
        tourism20.getTourismDetails();

        System.out.println("----------------------");
    }
}
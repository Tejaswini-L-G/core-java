class WonderlaRunner {

    public static void main(String[] args) {
		
		LazyPool pool = new LazyPool(1, "Wave Pool", "Fresh", 5, "Relax Ride");
        Wonderla park = new Wonderla(101, "Wonderla Park", "Bangalore", 60, "2005", pool);
        park.getWonderlaDetails();

        Wonderla park1 = new Wonderla();
        LazyPool pool1 = new LazyPool();

        park1.parkId = 10;
        park1.parkLocation = "Wonderla Amusement Park";
        park1.parkCity = "Bangalore";
        park1.totalRides = 60;
        park1.openingYear = "2005";

        pool1.poolId = 6001;
        pool1.poolName = "Wave Rider Pool";
        pool1.waterType = "Fresh Water";
        pool1.depth = 5;
        pool1.attraction = "Relax Ride";

        park1.lazyPool = pool1;
        park1.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park2 = new Wonderla();
        LazyPool pool2 = new LazyPool();

        park2.parkId = 10;
        park2.parkLocation = "Wonderla Amusement Park";
        park2.parkCity = "Bangalore";
        park2.totalRides = 60;
        park2.openingYear = "2005";

        pool2.poolId = 6002;
        pool2.poolName = "River Cruise Pool";
        pool2.waterType = "Fresh Water";
        pool2.depth = 5;
        pool2.attraction = "Relax Ride";

        park2.lazyPool = pool2;
        park2.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park3 = new Wonderla();
        LazyPool pool3 = new LazyPool();

        park3.parkId = 10;
        park3.parkLocation = "Wonderla Amusement Park";
        park3.parkCity = "Bangalore";
        park3.totalRides = 60;
        park3.openingYear = "2005";

        pool3.poolId = 6003;
        pool3.poolName = "Adventure Float Pool";
        pool3.waterType = "Fresh Water";
        pool3.depth = 5;
        pool3.attraction = "Relax Ride";

        park3.lazyPool = pool3;
        park3.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park4 = new Wonderla();
        LazyPool pool4 = new LazyPool();

        park4.parkId = 10;
        park4.parkLocation = "Wonderla Amusement Park";
        park4.parkCity = "Bangalore";
        park4.totalRides = 60;
        park4.openingYear = "2005";

        pool4.poolId = 6004;
        pool4.poolName = "Family Relax Pool";
        pool4.waterType = "Fresh Water";
        pool4.depth = 5;
        pool4.attraction = "Relax Ride";

        park4.lazyPool = pool4;
        park4.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park5 = new Wonderla();
        LazyPool pool5 = new LazyPool();

        park5.parkId = 10;
        park5.parkLocation = "Wonderla Amusement Park";
        park5.parkCity = "Bangalore";
        park5.totalRides = 60;
        park5.openingYear = "2005";

        pool5.poolId = 6005;
        pool5.poolName = "Island Lazy Pool";
        pool5.waterType = "Fresh Water";
        pool5.depth = 5;
        pool5.attraction = "Relax Ride";

        park5.lazyPool = pool5;
        park5.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park6 = new Wonderla();
        LazyPool pool6 = new LazyPool();

        park6.parkId = 10;
        park6.parkLocation = "Wonderla Amusement Park";
        park6.parkCity = "Bangalore";
        park6.totalRides = 60;
        park6.openingYear = "2005";

        pool6.poolId = 6006;
        pool6.poolName = "Tropical Drift Pool";
        pool6.waterType = "Fresh Water";
        pool6.depth = 5;
        pool6.attraction = "Relax Ride";

        park6.lazyPool = pool6;
        park6.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park7 = new Wonderla();
        LazyPool pool7 = new LazyPool();

        park7.parkId = 10;
        park7.parkLocation = "Wonderla Amusement Park";
        park7.parkCity = "Bangalore";
        park7.totalRides = 60;
        park7.openingYear = "2005";

        pool7.poolId = 6007;
        pool7.poolName = "Blue Lagoon Pool";
        pool7.waterType = "Fresh Water";
        pool7.depth = 5;
        pool7.attraction = "Relax Ride";

        park7.lazyPool = pool7;
        park7.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park8 = new Wonderla();
        LazyPool pool8 = new LazyPool();

        park8.parkId = 10;
        park8.parkLocation = "Wonderla Amusement Park";
        park8.parkCity = "Bangalore";
        park8.totalRides = 60;
        park8.openingYear = "2005";

        pool8.poolId = 6008;
        pool8.poolName = "Aqua Circle Pool";
        pool8.waterType = "Fresh Water";
        pool8.depth = 5;
        pool8.attraction = "Relax Ride";

        park8.lazyPool = pool8;
        park8.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park9 = new Wonderla();
        LazyPool pool9 = new LazyPool();

        park9.parkId = 10;
        park9.parkLocation = "Wonderla Amusement Park";
        park9.parkCity = "Bangalore";
        park9.totalRides = 60;
        park9.openingYear = "2005";

        pool9.poolId = 6009;
        pool9.poolName = "Palm Drift Pool";
        pool9.waterType = "Fresh Water";
        pool9.depth = 5;
        pool9.attraction = "Relax Ride";

        park9.lazyPool = pool9;
        park9.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park10 = new Wonderla();
        LazyPool pool10 = new LazyPool();

        park10.parkId = 10;
        park10.parkLocation = "Wonderla Amusement Park";
        park10.parkCity = "Bangalore";
        park10.totalRides = 60;
        park10.openingYear = "2005";

        pool10.poolId = 6010;
        pool10.poolName = "Cascade Pool";
        pool10.waterType = "Fresh Water";
        pool10.depth = 5;
        pool10.attraction = "Relax Ride";

        park10.lazyPool = pool10;
        park10.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park11 = new Wonderla();
        LazyPool pool11 = new LazyPool();

        park11.parkId = 10;
        park11.parkLocation = "Wonderla Amusement Park";
        park11.parkCity = "Bangalore";
        park11.totalRides = 60;
        park11.openingYear = "2005";

        pool11.poolId = 6011;
        pool11.poolName = "Water Trail Pool";
        pool11.waterType = "Fresh Water";
        pool11.depth = 5;
        pool11.attraction = "Relax Ride";

        park11.lazyPool = pool11;
        park11.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park12 = new Wonderla();
        LazyPool pool12 = new LazyPool();

        park12.parkId = 10;
        park12.parkLocation = "Wonderla Amusement Park";
        park12.parkCity = "Bangalore";
        park12.totalRides = 60;
        park12.openingYear = "2005";

        pool12.poolId = 6012;
        pool12.poolName = "Holiday Float Pool";
        pool12.waterType = "Fresh Water";
        pool12.depth = 5;
        pool12.attraction = "Relax Ride";

        park12.lazyPool = pool12;
        park12.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park13 = new Wonderla();
        LazyPool pool13 = new LazyPool();

        park13.parkId = 10;
        park13.parkLocation = "Wonderla Amusement Park";
        park13.parkCity = "Bangalore";
        park13.totalRides = 60;
        park13.openingYear = "2005";

        pool13.poolId = 6013;
        pool13.poolName = "Resort Drift Pool";
        pool13.waterType = "Fresh Water";
        pool13.depth = 5;
        pool13.attraction = "Relax Ride";

        park13.lazyPool = pool13;
        park13.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park14 = new Wonderla();
        LazyPool pool14 = new LazyPool();

        park14.parkId = 10;
        park14.parkLocation = "Wonderla Amusement Park";
        park14.parkCity = "Bangalore";
        park14.totalRides = 60;
        park14.openingYear = "2005";

        pool14.poolId = 6014;
        pool14.poolName = "Crystal Lazy Pool";
        pool14.waterType = "Fresh Water";
        pool14.depth = 5;
        pool14.attraction = "Relax Ride";

        park14.lazyPool = pool14;
        park14.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park15 = new Wonderla();
        LazyPool pool15 = new LazyPool();

        park15.parkId = 10;
        park15.parkLocation = "Wonderla Amusement Park";
        park15.parkCity = "Bangalore";
        park15.totalRides = 60;
        park15.openingYear = "2005";

        pool15.poolId = 6015;
        pool15.poolName = "Sunset Float Pool";
        pool15.waterType = "Fresh Water";
        pool15.depth = 5;
        pool15.attraction = "Relax Ride";

        park15.lazyPool = pool15;
        park15.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park16 = new Wonderla();
        LazyPool pool16 = new LazyPool();

        park16.parkId = 10;
        park16.parkLocation = "Wonderla Amusement Park";
        park16.parkCity = "Bangalore";
        park16.totalRides = 60;
        park16.openingYear = "2005";

        pool16.poolId = 6016;
        pool16.poolName = "Paradise Drift Pool";
        pool16.waterType = "Fresh Water";
        pool16.depth = 5;
        pool16.attraction = "Relax Ride";

        park16.lazyPool = pool16;
        park16.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park17 = new Wonderla();
        LazyPool pool17 = new LazyPool();

        park17.parkId = 10;
        park17.parkLocation = "Wonderla Amusement Park";
        park17.parkCity = "Bangalore";
        park17.totalRides = 60;
        park17.openingYear = "2005";

        pool17.poolId = 6017;
        pool17.poolName = "Ocean Calm Pool";
        pool17.waterType = "Fresh Water";
        pool17.depth = 5;
        pool17.attraction = "Relax Ride";

        park17.lazyPool = pool17;
        park17.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park18 = new Wonderla();
        LazyPool pool18 = new LazyPool();

        park18.parkId = 10;
        park18.parkLocation = "Wonderla Amusement Park";
        park18.parkCity = "Bangalore";
        park18.totalRides = 60;
        park18.openingYear = "2005";

        pool18.poolId = 6018;
        pool18.poolName = "Lagoon Ride Pool";
        pool18.waterType = "Fresh Water";
        pool18.depth = 5;
        pool18.attraction = "Relax Ride";

        park18.lazyPool = pool18;
        park18.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park19 = new Wonderla();
        LazyPool pool19 = new LazyPool();

        park19.parkId = 10;
        park19.parkLocation = "Wonderla Amusement Park";
        park19.parkCity = "Bangalore";
        park19.totalRides = 60;
        park19.openingYear = "2005";

        pool19.poolId = 6019;
        pool19.poolName = "Splash Float Pool";
        pool19.waterType = "Fresh Water";
        pool19.depth = 5;
        pool19.attraction = "Relax Ride";

        park19.lazyPool = pool19;
        park19.getWonderlaDetails();

        System.out.println("-----------------------");

        Wonderla park20 = new Wonderla();
        LazyPool pool20 = new LazyPool();

        park20.parkId = 10;
        park20.parkLocation = "Wonderla Amusement Park";
        park20.parkCity = "Bangalore";
        park20.totalRides = 60;
        park20.openingYear = "2005";

        pool20.poolId = 6020;
        pool20.poolName = "Summer Lazy Pool";
        pool20.waterType = "Fresh Water";
        pool20.depth = 5;
        pool20.attraction = "Relax Ride";

        park20.lazyPool = pool20;
        park20.getWonderlaDetails();

        System.out.println("-----------------------");
    }
}
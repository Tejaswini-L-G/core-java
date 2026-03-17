class CCDRunner {

    public static void main(String[] args) {
		
		 Coffee c = new Coffee(1, "Cappuccino", "Arabica", 180, "Medium");
        CCD cafe = new CCD(101, "CCD", "Bangalore", 1996, "Siddhartha", c);
        cafe.getCafeDetails();

        CCD cafe1 = new CCD();
        Coffee coffee1 = new Coffee();

        cafe1.cafeId = 300;
        cafe1.cafeName = "Cafe Coffee Day";
        cafe1.city = "Bangalore";
        cafe1.establishedYear = 1996;
        cafe1.founder = "V.G. Siddhartha";

        coffee1.coffeeId = 15001;
        coffee1.coffeeName = "Cappuccino";
        coffee1.beanType = "Arabica";
        coffee1.price = 180;
        coffee1.size = "Medium";

        cafe1.coffee = coffee1;
        cafe1.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe2 = new CCD();
        Coffee coffee2 = new Coffee();

        cafe2.cafeId = 300;
        cafe2.cafeName = "Cafe Coffee Day";
        cafe2.city = "Bangalore";
        cafe2.establishedYear = 1996;
        cafe2.founder = "V.G. Siddhartha";

        coffee2.coffeeId = 15002;
        coffee2.coffeeName = "Espresso";
        coffee2.beanType = "Arabica";
        coffee2.price = 150;
        coffee2.size = "Small";

        cafe2.coffee = coffee2;
        cafe2.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe3 = new CCD();
        Coffee coffee3 = new Coffee();

        cafe3.cafeId = 300;
        cafe3.cafeName = "Cafe Coffee Day";
        cafe3.city = "Bangalore";
        cafe3.establishedYear = 1996;
        cafe3.founder = "V.G. Siddhartha";

        coffee3.coffeeId = 15003;
        coffee3.coffeeName = "Latte";
        coffee3.beanType = "Arabica";
        coffee3.price = 200;
        coffee3.size = "Large";

        cafe3.coffee = coffee3;
        cafe3.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe4 = new CCD();
        Coffee coffee4 = new Coffee();

        cafe4.cafeId = 300;
        cafe4.cafeName = "Cafe Coffee Day";
        cafe4.city = "Bangalore";
        cafe4.establishedYear = 1996;
        cafe4.founder = "V.G. Siddhartha";

        coffee4.coffeeId = 15004;
        coffee4.coffeeName = "Mocha";
        coffee4.beanType = "Robusta";
        coffee4.price = 210;
        coffee4.size = "Large";

        cafe4.coffee = coffee4;
        cafe4.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe5 = new CCD();
        Coffee coffee5 = new Coffee();

        cafe5.cafeId = 300;
        cafe5.cafeName = "Cafe Coffee Day";
        cafe5.city = "Bangalore";
        cafe5.establishedYear = 1996;
        cafe5.founder = "V.G. Siddhartha";

        coffee5.coffeeId = 15005;
        coffee5.coffeeName = "Americano";
        coffee5.beanType = "Arabica";
        coffee5.price = 170;
        coffee5.size = "Medium";

        cafe5.coffee = coffee5;
        cafe5.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe6 = new CCD();
        Coffee coffee6 = new Coffee();

        cafe6.cafeId = 300;
        cafe6.cafeName = "Cafe Coffee Day";
        cafe6.city = "Bangalore";
        cafe6.establishedYear = 1996;
        cafe6.founder = "V.G. Siddhartha";

        coffee6.coffeeId = 15006;
        coffee6.coffeeName = "Cold Coffee";
        coffee6.beanType = "Arabica";
        coffee6.price = 220;
        coffee6.size = "Large";

        cafe6.coffee = coffee6;
        cafe6.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe7 = new CCD();
        Coffee coffee7 = new Coffee();

        cafe7.cafeId = 300;
        cafe7.cafeName = "Cafe Coffee Day";
        cafe7.city = "Bangalore";
        cafe7.establishedYear = 1996;
        cafe7.founder = "V.G. Siddhartha";

        coffee7.coffeeId = 15007;
        coffee7.coffeeName = "Caramel Latte";
        coffee7.beanType = "Arabica";
        coffee7.price = 230;
        coffee7.size = "Large";

        cafe7.coffee = coffee7;
        cafe7.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe8 = new CCD();
        Coffee coffee8 = new Coffee();

        cafe8.cafeId = 300;
        cafe8.cafeName = "Cafe Coffee Day";
        cafe8.city = "Bangalore";
        cafe8.establishedYear = 1996;
        cafe8.founder = "V.G. Siddhartha";

        coffee8.coffeeId = 15008;
        coffee8.coffeeName = "Vanilla Latte";
        coffee8.beanType = "Arabica";
        coffee8.price = 225;
        coffee8.size = "Large";

        cafe8.coffee = coffee8;
        cafe8.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe9 = new CCD();
        Coffee coffee9 = new Coffee();

        cafe9.cafeId = 300;
        cafe9.cafeName = "Cafe Coffee Day";
        cafe9.city = "Bangalore";
        cafe9.establishedYear = 1996;
        cafe9.founder = "V.G. Siddhartha";

        coffee9.coffeeId = 15009;
        coffee9.coffeeName = "Hazelnut Cappuccino";
        coffee9.beanType = "Arabica";
        coffee9.price = 240;
        coffee9.size = "Medium";

        cafe9.coffee = coffee9;
        cafe9.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe10 = new CCD();
        Coffee coffee10 = new Coffee();

        cafe10.cafeId = 300;
        cafe10.cafeName = "Cafe Coffee Day";
        cafe10.city = "Bangalore";
        cafe10.establishedYear = 1996;
        cafe10.founder = "V.G. Siddhartha";

        coffee10.coffeeId = 15010;
        coffee10.coffeeName = "Iced Americano";
        coffee10.beanType = "Robusta";
        coffee10.price = 190;
        coffee10.size = "Large";

        cafe10.coffee = coffee10;
        cafe10.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe11 = new CCD();
        Coffee coffee11 = new Coffee();

        cafe11.cafeId = 300;
        cafe11.cafeName = "Cafe Coffee Day";
        cafe11.city = "Bangalore";
        cafe11.establishedYear = 1996;
        cafe11.founder = "V.G. Siddhartha";

        coffee11.coffeeId = 15011;
        coffee11.coffeeName = "Irish Coffee";
        coffee11.beanType = "Arabica";
        coffee11.price = 260;
        coffee11.size = "Medium";

        cafe11.coffee = coffee11;
        cafe11.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe12 = new CCD();
        Coffee coffee12 = new Coffee();

        cafe12.cafeId = 300;
        cafe12.cafeName = "Cafe Coffee Day";
        cafe12.city = "Bangalore";
        cafe12.establishedYear = 1996;
        cafe12.founder = "V.G. Siddhartha";

        coffee12.coffeeId = 15012;
        coffee12.coffeeName = "Chocolate Mocha";
        coffee12.beanType = "Robusta";
        coffee12.price = 250;
        coffee12.size = "Large";

        cafe12.coffee = coffee12;
        cafe12.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe13 = new CCD();
        Coffee coffee13 = new Coffee();

        cafe13.cafeId = 300;
        cafe13.cafeName = "Cafe Coffee Day";
        cafe13.city = "Bangalore";
        cafe13.establishedYear = 1996;
        cafe13.founder = "V.G. Siddhartha";

        coffee13.coffeeId = 15013;
        coffee13.coffeeName = "Classic Brew";
        coffee13.beanType = "Arabica";
        coffee13.price = 160;
        coffee13.size = "Medium";

        cafe13.coffee = coffee13;
        cafe13.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe14 = new CCD();
        Coffee coffee14 = new Coffee();

        cafe14.cafeId = 300;
        cafe14.cafeName = "Cafe Coffee Day";
        cafe14.city = "Bangalore";
        cafe14.establishedYear = 1996;
        cafe14.founder = "V.G. Siddhartha";

        coffee14.coffeeId = 15014;
        coffee14.coffeeName = "Strong Espresso";
        coffee14.beanType = "Robusta";
        coffee14.price = 170;
        coffee14.size = "Small";

        cafe14.coffee = coffee14;
        cafe14.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe15 = new CCD();
        Coffee coffee15 = new Coffee();

        cafe15.cafeId = 300;
        cafe15.cafeName = "Cafe Coffee Day";
        cafe15.city = "Bangalore";
        cafe15.establishedYear = 1996;
        cafe15.founder = "V.G. Siddhartha";

        coffee15.coffeeId = 15015;
        coffee15.coffeeName = "Filter Coffee";
        coffee15.beanType = "Arabica";
        coffee15.price = 140;
        coffee15.size = "Medium";

        cafe15.coffee = coffee15;
        cafe15.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe16 = new CCD();
        Coffee coffee16 = new Coffee();

        cafe16.cafeId = 300;
        cafe16.cafeName = "Cafe Coffee Day";
        cafe16.city = "Bangalore";
        cafe16.establishedYear = 1996;
        cafe16.founder = "V.G. Siddhartha";

        coffee16.coffeeId = 15016;
        coffee16.coffeeName = "Almond Latte";
        coffee16.beanType = "Arabica";
        coffee16.price = 235;
        coffee16.size = "Large";

        cafe16.coffee = coffee16;
        cafe16.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe17 = new CCD();
        Coffee coffee17 = new Coffee();

        cafe17.cafeId = 300;
        cafe17.cafeName = "Cafe Coffee Day";
        cafe17.city = "Bangalore";
        cafe17.establishedYear = 1996;
        cafe17.founder = "V.G. Siddhartha";

        coffee17.coffeeId = 15017;
        coffee17.coffeeName = "Butterscotch Latte";
        coffee17.beanType = "Arabica";
        coffee17.price = 240;
        coffee17.size = "Large";

        cafe17.coffee = coffee17;
        cafe17.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe18 = new CCD();
        Coffee coffee18 = new Coffee();

        cafe18.cafeId = 300;
        cafe18.cafeName = "Cafe Coffee Day";
        cafe18.city = "Bangalore";
        cafe18.establishedYear = 1996;
        cafe18.founder = "V.G. Siddhartha";

        coffee18.coffeeId = 15018;
        coffee18.coffeeName = "Coconut Latte";
        coffee18.beanType = "Arabica";
        coffee18.price = 245;
        coffee18.size = "Large";

        cafe18.coffee = coffee18;
        cafe18.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe19 = new CCD();
        Coffee coffee19 = new Coffee();

        cafe19.cafeId = 300;
        cafe19.cafeName = "Cafe Coffee Day";
        cafe19.city = "Bangalore";
        cafe19.establishedYear = 1996;
        cafe19.founder = "V.G. Siddhartha";

        coffee19.coffeeId = 15019;
        coffee19.coffeeName = "Dark Roast Brew";
        coffee19.beanType = "Robusta";
        coffee19.price = 200;
        coffee19.size = "Medium";

        cafe19.coffee = coffee19;
        cafe19.getCafeDetails();

        System.out.println("----------------------");

        CCD cafe20 = new CCD();
        Coffee coffee20 = new Coffee();

        cafe20.cafeId = 300;
        cafe20.cafeName = "Cafe Coffee Day";
        cafe20.city = "Bangalore";
        cafe20.establishedYear = 1996;
        cafe20.founder = "V.G. Siddhartha";

        coffee20.coffeeId = 15020;
        coffee20.coffeeName = "Premium Arabica Brew";
        coffee20.beanType = "Arabica";
        coffee20.price = 260;
        coffee20.size = "Large";

        cafe20.coffee = coffee20;
        cafe20.getCafeDetails();

        System.out.println("----------------------");
    }
}
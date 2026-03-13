class CoffeeRunner {

    public static void main(String[] args) {

        System.out.println("----- Default Constructor Objects -----");

        Coffee nescafeCoffee = new Coffee();
        nescafeCoffee.brand="Nescafe";
        nescafeCoffee.price=120;

        Coffee bruCoffee = new Coffee();
        bruCoffee.brand="Bru";
        bruCoffee.price=110;

        Coffee continentalCoffee = new Coffee();
        continentalCoffee.brand="Continental";
        continentalCoffee.price=150;

        Coffee sunriseCoffee = new Coffee();
        sunriseCoffee.brand="Sunrise";
        sunriseCoffee.price=100;

        Coffee davidoffCoffee = new Coffee();
        davidoffCoffee.brand="Davidoff";
        davidoffCoffee.price=450;

        Coffee costaCoffee = new Coffee();
        costaCoffee.brand="Costa";
        costaCoffee.price=300;

        Coffee starbucksCoffee = new Coffee();
        starbucksCoffee.brand="Starbucks";
        starbucksCoffee.price=400;

        Coffee lavazzaCoffee = new Coffee();
        lavazzaCoffee.brand="Lavazza";
        lavazzaCoffee.price=350;

        Coffee blueTokaiCoffee = new Coffee();
        blueTokaiCoffee.brand="Blue Tokai";
        blueTokaiCoffee.price=370;

        Coffee filterCoffee = new Coffee();
        filterCoffee.brand="Filter Coffee";
        filterCoffee.price=90;

        Coffee arabicaCoffee = new Coffee();
        arabicaCoffee.brand="Arabica";
        arabicaCoffee.price=200;

        Coffee robustaCoffee = new Coffee();
        robustaCoffee.brand="Robusta";
        robustaCoffee.price=180;

        Coffee classicCoffee = new Coffee();
        classicCoffee.brand="Classic";
        classicCoffee.price=140;

        Coffee strongCoffee = new Coffee();
        strongCoffee.brand="Strong";
        strongCoffee.price=160;

        Coffee mildCoffee = new Coffee();
        mildCoffee.brand="Mild";
        mildCoffee.price=130;

        Coffee premiumCoffee = new Coffee();
        premiumCoffee.brand="Premium";
        premiumCoffee.price=420;

        Coffee organicCoffee = new Coffee();
        organicCoffee.brand="Organic";
        organicCoffee.price=380;

        Coffee instantCoffee = new Coffee();
        instantCoffee.brand="Instant";
        instantCoffee.price=150;

        Coffee groundCoffee = new Coffee();
        groundCoffee.brand="Ground";
        groundCoffee.price=170;

        Coffee coldBrewCoffee = new Coffee();
        coldBrewCoffee.brand="Cold Brew";
        coldBrewCoffee.price=220;

        Coffee caramelCoffee = new Coffee();
        caramelCoffee.brand="Caramel";
        caramelCoffee.price=210;

        Coffee mochaCoffee = new Coffee();
        mochaCoffee.brand="Mocha";
        mochaCoffee.price=230;

        Coffee vanillaCoffee = new Coffee();
        vanillaCoffee.brand="Vanilla";
        vanillaCoffee.price=200;

        Coffee hazelnutCoffee = new Coffee();
        hazelnutCoffee.brand="Hazelnut";
        hazelnutCoffee.price=240;

        Coffee chocolateCoffee = new Coffee();
        chocolateCoffee.brand="Chocolate";
        chocolateCoffee.price=250;


        System.out.println("Coffee Brand: "+nescafeCoffee.brand+" Price:"+nescafeCoffee.price);
        System.out.println("Coffee Brand: "+bruCoffee.brand+" Price:"+bruCoffee.price);
        System.out.println("Coffee Brand: "+continentalCoffee.brand+" Price:"+continentalCoffee.price);
        System.out.println("Coffee Brand: "+sunriseCoffee.brand+" Price:"+sunriseCoffee.price);
        System.out.println("Coffee Brand: "+davidoffCoffee.brand+" Price:"+davidoffCoffee.price);
        System.out.println("Coffee Brand: "+costaCoffee.brand+" Price:"+costaCoffee.price);
        System.out.println("Coffee Brand: "+starbucksCoffee.brand+" Price:"+starbucksCoffee.price);
        System.out.println("Coffee Brand: "+lavazzaCoffee.brand+" Price:"+lavazzaCoffee.price);
        System.out.println("Coffee Brand: "+blueTokaiCoffee.brand+" Price:"+blueTokaiCoffee.price);
        System.out.println("Coffee Brand: "+filterCoffee.brand+" Price:"+filterCoffee.price);
        System.out.println("Coffee Brand: "+arabicaCoffee.brand+" Price:"+arabicaCoffee.price);
        System.out.println("Coffee Brand: "+robustaCoffee.brand+" Price:"+robustaCoffee.price);
        System.out.println("Coffee Brand: "+classicCoffee.brand+" Price:"+classicCoffee.price);
        System.out.println("Coffee Brand: "+strongCoffee.brand+" Price:"+strongCoffee.price);
        System.out.println("Coffee Brand: "+mildCoffee.brand+" Price:"+mildCoffee.price);
        System.out.println("Coffee Brand: "+premiumCoffee.brand+" Price:"+premiumCoffee.price);
        System.out.println("Coffee Brand: "+organicCoffee.brand+" Price:"+organicCoffee.price);
        System.out.println("Coffee Brand: "+instantCoffee.brand+" Price:"+instantCoffee.price);
        System.out.println("Coffee Brand: "+groundCoffee.brand+" Price:"+groundCoffee.price);
        System.out.println("Coffee Brand: "+coldBrewCoffee.brand+" Price:"+coldBrewCoffee.price);
        System.out.println("Coffee Brand: "+caramelCoffee.brand+" Price:"+caramelCoffee.price);
        System.out.println("Coffee Brand: "+mochaCoffee.brand+" Price:"+mochaCoffee.price);
        System.out.println("Coffee Brand: "+vanillaCoffee.brand+" Price:"+vanillaCoffee.price);
        System.out.println("Coffee Brand: "+hazelnutCoffee.brand+" Price:"+hazelnutCoffee.price);
        System.out.println("Coffee Brand: "+chocolateCoffee.brand+" Price:"+chocolateCoffee.price);



        System.out.println("----- Parameterized Constructor Objects -----");

        Coffee italianCoffee = new Coffee("Italian Roast",300);
        Coffee frenchCoffee = new Coffee("French Roast",320);
        Coffee colombianCoffee = new Coffee("Colombian",310);
        Coffee brazilianCoffee = new Coffee("Brazilian",305);
        Coffee ethiopianCoffee = new Coffee("Ethiopian",315);

        Coffee kenyanCoffee = new Coffee("Kenyan",295);
        Coffee guatemalaCoffee = new Coffee("Guatemala",290);
        Coffee peruCoffee = new Coffee("Peru",285);
        Coffee costaRicaCoffee = new Coffee("Costa Rica",300);
        Coffee mexicoCoffee = new Coffee("Mexico",280);

        Coffee sumatraCoffee = new Coffee("Sumatra",330);
        Coffee javaCoffee = new Coffee("Java",310);
        Coffee baliCoffee = new Coffee("Bali",320);
        Coffee indiaCoffee = new Coffee("Indian",275);
        Coffee vietnamCoffee = new Coffee("Vietnam",260);

        Coffee houseBlendCoffee = new Coffee("House Blend",240);
        Coffee darkRoastCoffee = new Coffee("Dark Roast",270);
        Coffee mediumRoastCoffee = new Coffee("Medium Roast",255);
        Coffee lightRoastCoffee = new Coffee("Light Roast",245);
        Coffee espressoCoffee = new Coffee("Espresso",290);


        System.out.println("Coffee Brand: "+italianCoffee.brand+" Price:"+italianCoffee.price);
        System.out.println("Coffee Brand: "+frenchCoffee.brand+" Price:"+frenchCoffee.price);
        System.out.println("Coffee Brand: "+colombianCoffee.brand+" Price:"+colombianCoffee.price);
        System.out.println("Coffee Brand: "+brazilianCoffee.brand+" Price:"+brazilianCoffee.price);
        System.out.println("Coffee Brand: "+ethiopianCoffee.brand+" Price:"+ethiopianCoffee.price);
        System.out.println("Coffee Brand: "+kenyanCoffee.brand+" Price:"+kenyanCoffee.price);
        System.out.println("Coffee Brand: "+guatemalaCoffee.brand+" Price:"+guatemalaCoffee.price);
        System.out.println("Coffee Brand: "+peruCoffee.brand+" Price:"+peruCoffee.price);
        System.out.println("Coffee Brand: "+costaRicaCoffee.brand+" Price:"+costaRicaCoffee.price);
        System.out.println("Coffee Brand: "+mexicoCoffee.brand+" Price:"+mexicoCoffee.price);
        System.out.println("Coffee Brand: "+sumatraCoffee.brand+" Price:"+sumatraCoffee.price);
        System.out.println("Coffee Brand: "+javaCoffee.brand+" Price:"+javaCoffee.price);
        System.out.println("Coffee Brand: "+baliCoffee.brand+" Price:"+baliCoffee.price);
        System.out.println("Coffee Brand: "+indiaCoffee.brand+" Price:"+indiaCoffee.price);
        System.out.println("Coffee Brand: "+vietnamCoffee.brand+" Price:"+vietnamCoffee.price);
        System.out.println("Coffee Brand: "+houseBlendCoffee.brand+" Price:"+houseBlendCoffee.price);
        System.out.println("Coffee Brand: "+darkRoastCoffee.brand+" Price:"+darkRoastCoffee.price);
        System.out.println("Coffee Brand: "+mediumRoastCoffee.brand+" Price:"+mediumRoastCoffee.price);
        System.out.println("Coffee Brand: "+lightRoastCoffee.brand+" Price:"+lightRoastCoffee.price);
        System.out.println("Coffee Brand: "+espressoCoffee.brand+" Price:"+espressoCoffee.price);

    }
}
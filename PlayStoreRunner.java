class PlayStoreRunner {

    public static void main(String[] args) {
		
		 Application app = new Application(1, "WhatsApp", "Communication", 4.5, "Meta");
        PlayStore store = new PlayStore(101, "Google", "Android", 3000000, "California", app);
        store.getPlayStoreDetails();

        PlayStore store1 = new PlayStore();
        Application app1 = new Application();

        store1.storeId = 500;
        store1.company = "Google";
        store1.platform = "Android";
        store1.totalApps = 3000000;
        store1.headquarters = "California";

        app1.appId = 2001;
        app1.appName = "WhatsApp";
        app1.category = "Communication";
        app1.rating = 4.5;
        app1.developer = "Meta";

        store1.application = app1;
        store1.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store2 = new PlayStore();
        Application app2 = new Application();

        store2.storeId = 500;
        store2.company = "Google";
        store2.platform = "Android";
        store2.totalApps = 3000000;
        store2.headquarters = "California";

        app2.appId = 2002;
        app2.appName = "Instagram";
        app2.category = "Social";
        app2.rating = 4.6;
        app2.developer = "Meta";

        store2.application = app2;
        store2.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store3 = new PlayStore();
        Application app3 = new Application();

        store3.storeId = 500;
        store3.company = "Google";
        store3.platform = "Android";
        store3.totalApps = 3000000;
        store3.headquarters = "California";

        app3.appId = 2003;
        app3.appName = "YouTube";
        app3.category = "Video";
        app3.rating = 4.7;
        app3.developer = "Google";

        store3.application = app3;
        store3.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store4 = new PlayStore();
        Application app4 = new Application();

        store4.storeId = 500;
        store4.company = "Google";
        store4.platform = "Android";
        store4.totalApps = 3000000;
        store4.headquarters = "California";

        app4.appId = 2004;
        app4.appName = "Spotify";
        app4.category = "Music";
        app4.rating = 4.4;
        app4.developer = "Spotify";

        store4.application = app4;
        store4.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store5 = new PlayStore();
        Application app5 = new Application();

        store5.storeId = 500;
        store5.company = "Google";
        store5.platform = "Android";
        store5.totalApps = 3000000;
        store5.headquarters = "California";

        app5.appId = 2005;
        app5.appName = "Amazon";
        app5.category = "Shopping";
        app5.rating = 4.3;
        app5.developer = "Amazon";

        store5.application = app5;
        store5.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store6 = new PlayStore();
        Application app6 = new Application();

        store6.storeId = 500;
        store6.company = "Google";
        store6.platform = "Android";
        store6.totalApps = 3000000;
        store6.headquarters = "California";

        app6.appId = 2006;
        app6.appName = "Flipkart";
        app6.category = "Shopping";
        app6.rating = 4.2;
        app6.developer = "Flipkart";

        store6.application = app6;
        store6.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store7 = new PlayStore();
        Application app7 = new Application();

        store7.storeId = 500;
        store7.company = "Google";
        store7.platform = "Android";
        store7.totalApps = 3000000;
        store7.headquarters = "California";

        app7.appId = 2007;
        app7.appName = "Google Maps";
        app7.category = "Navigation";
        app7.rating = 4.6;
        app7.developer = "Google";

        store7.application = app7;
        store7.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store8 = new PlayStore();
        Application app8 = new Application();

        store8.storeId = 500;
        store8.company = "Google";
        store8.platform = "Android";
        store8.totalApps = 3000000;
        store8.headquarters = "California";

        app8.appId = 2008;
        app8.appName = "Snapchat";
        app8.category = "Social";
        app8.rating = 4.1;
        app8.developer = "Snap";

        store8.application = app8;
        store8.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store9 = new PlayStore();
        Application app9 = new Application();

        store9.storeId = 500;
        store9.company = "Google";
        store9.platform = "Android";
        store9.totalApps = 3000000;
        store9.headquarters = "California";

        app9.appId = 2009;
        app9.appName = "LinkedIn";
        app9.category = "Business";
        app9.rating = 4.3;
        app9.developer = "Microsoft";

        store9.application = app9;
        store9.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store10 = new PlayStore();
        Application app10 = new Application();

        store10.storeId = 500;
        store10.company = "Google";
        store10.platform = "Android";
        store10.totalApps = 3000000;
        store10.headquarters = "California";

        app10.appId = 2010;
        app10.appName = "Netflix";
        app10.category = "Entertainment";
        app10.rating = 4.4;
        app10.developer = "Netflix";

        store10.application = app10;
        store10.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store11 = new PlayStore();
        Application app11 = new Application();

        store11.storeId = 500;
        store11.company = "Google";
        store11.platform = "Android";
        store11.totalApps = 3000000;
        store11.headquarters = "California";

        app11.appId = 2011;
        app11.appName = "Hotstar";
        app11.category = "Streaming";
        app11.rating = 4.2;
        app11.developer = "Disney";

        store11.application = app11;
        store11.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store12 = new PlayStore();
        Application app12 = new Application();

        store12.storeId = 500;
        store12.company = "Google";
        store12.platform = "Android";
        store12.totalApps = 3000000;
        store12.headquarters = "California";

        app12.appId = 2012;
        app12.appName = "Zomato";
        app12.category = "Food";
        app12.rating = 4.1;
        app12.developer = "Zomato";

        store12.application = app12;
        store12.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store13 = new PlayStore();
        Application app13 = new Application();

        store13.storeId = 500;
        store13.company = "Google";
        store13.platform = "Android";
        store13.totalApps = 3000000;
        store13.headquarters = "California";

        app13.appId = 2013;
        app13.appName = "Swiggy";
        app13.category = "Food";
        app13.rating = 4.2;
        app13.developer = "Swiggy";

        store13.application = app13;
        store13.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store14 = new PlayStore();
        Application app14 = new Application();

        store14.storeId = 500;
        store14.company = "Google";
        store14.platform = "Android";
        store14.totalApps = 3000000;
        store14.headquarters = "California";

        app14.appId = 2014;
        app14.appName = "Telegram";
        app14.category = "Communication";
        app14.rating = 4.5;
        app14.developer = "Telegram";

        store14.application = app14;
        store14.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store15 = new PlayStore();
        Application app15 = new Application();

        store15.storeId = 500;
        store15.company = "Google";
        store15.platform = "Android";
        store15.totalApps = 3000000;
        store15.headquarters = "California";

        app15.appId = 2015;
        app15.appName = "Uber";
        app15.category = "Transport";
        app15.rating = 4.3;
        app15.developer = "Uber";

        store15.application = app15;
        store15.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store16 = new PlayStore();
        Application app16 = new Application();

        store16.storeId = 500;
        store16.company = "Google";
        store16.platform = "Android";
        store16.totalApps = 3000000;
        store16.headquarters = "California";

        app16.appId = 2016;
        app16.appName = "Ola";
        app16.category = "Transport";
        app16.rating = 4.1;
        app16.developer = "Ola";

        store16.application = app16;
        store16.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store17 = new PlayStore();
        Application app17 = new Application();

        store17.storeId = 500;
        store17.company = "Google";
        store17.platform = "Android";
        store17.totalApps = 3000000;
        store17.headquarters = "California";

        app17.appId = 2017;
        app17.appName = "Paytm";
        app17.category = "Finance";
        app17.rating = 4.2;
        app17.developer = "Paytm";

        store17.application = app17;
        store17.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store18 = new PlayStore();
        Application app18 = new Application();

        store18.storeId = 500;
        store18.company = "Google";
        store18.platform = "Android";
        store18.totalApps = 3000000;
        store18.headquarters = "California";

        app18.appId = 2018;
        app18.appName = "PhonePe";
        app18.category = "Finance";
        app18.rating = 4.4;
        app18.developer = "PhonePe";

        store18.application = app18;
        store18.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store19 = new PlayStore();
        Application app19 = new Application();

        store19.storeId = 500;
        store19.company = "Google";
        store19.platform = "Android";
        store19.totalApps = 3000000;
        store19.headquarters = "California";

        app19.appId = 2019;
        app19.appName = "Duolingo";
        app19.category = "Education";
        app19.rating = 4.7;
        app19.developer = "Duolingo";

        store19.application = app19;
        store19.getPlayStoreDetails();

        System.out.println("----------------------");

        PlayStore store20 = new PlayStore();
        Application app20 = new Application();

        store20.storeId = 500;
        store20.company = "Google";
        store20.platform = "Android";
        store20.totalApps = 3000000;
        store20.headquarters = "California";

        app20.appId = 2020;
        app20.appName = "Coursera";
        app20.category = "Education";
        app20.rating = 4.6;
        app20.developer = "Coursera";

        store20.application = app20;
        store20.getPlayStoreDetails();

        System.out.println("----------------------");
    }
}
class MuseumRunner {

    public static void main(String[] args) {
		
		 Diamond d = new Diamond(1, "Kohinoor", "India", 105.6, "Colorless");
        Museum m = new Museum(101, "National Museum", "Delhi", 1949, "Board", d);
        m.getMuseumDetails();

        Museum museum1 = new Museum();
        Diamond diamond1 = new Diamond();

        museum1.museumId = 500;
        museum1.museumName = "National History Museum";
        museum1.city = "London";
        museum1.establishedYear = 1881;
        museum1.curator = "Heritage Board";

        diamond1.diamondId = 12001;
        diamond1.diamondName = "Koh-i-Noor";
        diamond1.originCountry = "India";
        diamond1.carat = 105.6;
        diamond1.color = "Colorless";

        museum1.diamond = diamond1;
        museum1.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum2 = new Museum();
        Diamond diamond2 = new Diamond();

        museum2.museumId = 500;
        museum2.museumName = "National History Museum";
        museum2.city = "London";
        museum2.establishedYear = 1881;
        museum2.curator = "Heritage Board";

        diamond2.diamondId = 12002;
        diamond2.diamondName = "Hope Diamond";
        diamond2.originCountry = "USA";
        diamond2.carat = 45.5;
        diamond2.color = "Blue";

        museum2.diamond = diamond2;
        museum2.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum3 = new Museum();
        Diamond diamond3 = new Diamond();

        museum3.museumId = 500;
        museum3.museumName = "National History Museum";
        museum3.city = "London";
        museum3.establishedYear = 1881;
        museum3.curator = "Heritage Board";

        diamond3.diamondId = 12003;
        diamond3.diamondName = "Cullinan";
        diamond3.originCountry = "South Africa";
        diamond3.carat = 3106;
        diamond3.color = "Colorless";

        museum3.diamond = diamond3;
        museum3.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum4 = new Museum();
        Diamond diamond4 = new Diamond();

        museum4.museumId = 500;
        museum4.museumName = "National History Museum";
        museum4.city = "London";
        museum4.establishedYear = 1881;
        museum4.curator = "Heritage Board";

        diamond4.diamondId = 12004;
        diamond4.diamondName = "Regent Diamond";
        diamond4.originCountry = "France";
        diamond4.carat = 140.5;
        diamond4.color = "White";

        museum4.diamond = diamond4;
        museum4.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum5 = new Museum();
        Diamond diamond5 = new Diamond();

        museum5.museumId = 500;
        museum5.museumName = "National History Museum";
        museum5.city = "London";
        museum5.establishedYear = 1881;
        museum5.curator = "Heritage Board";

        diamond5.diamondId = 12005;
        diamond5.diamondName = "Orlov Diamond";
        diamond5.originCountry = "Russia";
        diamond5.carat = 189.6;
        diamond5.color = "White";

        museum5.diamond = diamond5;
        museum5.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum6 = new Museum();
        Diamond diamond6 = new Diamond();

        museum6.museumId = 500;
        museum6.museumName = "National History Museum";
        museum6.city = "London";
        museum6.establishedYear = 1881;
        museum6.curator = "Heritage Board";

        diamond6.diamondId = 12006;
        diamond6.diamondName = "Sancy Diamond";
        diamond6.originCountry = "France";
        diamond6.carat = 55.2;
        diamond6.color = "Pale Yellow";

        museum6.diamond = diamond6;
        museum6.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum7 = new Museum();
        Diamond diamond7 = new Diamond();

        museum7.museumId = 500;
        museum7.museumName = "National History Museum";
        museum7.city = "London";
        museum7.establishedYear = 1881;
        museum7.curator = "Heritage Board";

        diamond7.diamondId = 12007;
        diamond7.diamondName = "Pink Star";
        diamond7.originCountry = "Hong Kong";
        diamond7.carat = 59.6;
        diamond7.color = "Pink";

        museum7.diamond = diamond7;
        museum7.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum8 = new Museum();
        Diamond diamond8 = new Diamond();

        museum8.museumId = 500;
        museum8.museumName = "National History Museum";
        museum8.city = "London";
        museum8.establishedYear = 1881;
        museum8.curator = "Heritage Board";

        diamond8.diamondId = 12008;
        diamond8.diamondName = "Dresden Green";
        diamond8.originCountry = "Germany";
        diamond8.carat = 41;
        diamond8.color = "Green";

        museum8.diamond = diamond8;
        museum8.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum9 = new Museum();
        Diamond diamond9 = new Diamond();

        museum9.museumId = 500;
        museum9.museumName = "National History Museum";
        museum9.city = "London";
        museum9.establishedYear = 1881;
        museum9.curator = "Heritage Board";

        diamond9.diamondId = 12009;
        diamond9.diamondName = "Taylor Burton";
        diamond9.originCountry = "USA";
        diamond9.carat = 69.4;
        diamond9.color = "White";

        museum9.diamond = diamond9;
        museum9.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum10 = new Museum();
        Diamond diamond10 = new Diamond();

        museum10.museumId = 500;
        museum10.museumName = "National History Museum";
        museum10.city = "London";
        museum10.establishedYear = 1881;
        museum10.curator = "Heritage Board";

        diamond10.diamondId = 12010;
        diamond10.diamondName = "Golden Jubilee";
        diamond10.originCountry = "Thailand";
        diamond10.carat = 545.7;
        diamond10.color = "Golden";

        museum10.diamond = diamond10;
        museum10.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum11 = new Museum();
        Diamond diamond11 = new Diamond();

        museum11.museumId = 500;
        museum11.museumName = "National History Museum";
        museum11.city = "London";
        museum11.establishedYear = 1881;
        museum11.curator = "Heritage Board";

        diamond11.diamondId = 12011;
        diamond11.diamondName = "Blue Moon";
        diamond11.originCountry = "USA";
        diamond11.carat = 12.03;
        diamond11.color = "Blue";

        museum11.diamond = diamond11;
        museum11.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum12 = new Museum();
        Diamond diamond12 = new Diamond();

        museum12.museumId = 500;
        museum12.museumName = "National History Museum";
        museum12.city = "London";
        museum12.establishedYear = 1881;
        museum12.curator = "Heritage Board";

        diamond12.diamondId = 12012;
        diamond12.diamondName = "Graff Pink";
        diamond12.originCountry = "UK";
        diamond12.carat = 24.8;
        diamond12.color = "Pink";

        museum12.diamond = diamond12;
        museum12.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum13 = new Museum();
        Diamond diamond13 = new Diamond();

        museum13.museumId = 500;
        museum13.museumName = "National History Museum";
        museum13.city = "London";
        museum13.establishedYear = 1881;
        museum13.curator = "Heritage Board";

        diamond13.diamondId = 12013;
        diamond13.diamondName = "Centenary Diamond";
        diamond13.originCountry = "South Africa";
        diamond13.carat = 273.9;
        diamond13.color = "Colorless";

        museum13.diamond = diamond13;
        museum13.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum14 = new Museum();
        Diamond diamond14 = new Diamond();

        museum14.museumId = 500;
        museum14.museumName = "National History Museum";
        museum14.city = "London";
        museum14.establishedYear = 1881;
        museum14.curator = "Heritage Board";

        diamond14.diamondId = 12014;
        diamond14.diamondName = "De Beers Diamond";
        diamond14.originCountry = "South Africa";
        diamond14.carat = 234.5;
        diamond14.color = "White";

        museum14.diamond = diamond14;
        museum14.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum15 = new Museum();
        Diamond diamond15 = new Diamond();

        museum15.museumId = 500;
        museum15.museumName = "National History Museum";
        museum15.city = "London";
        museum15.establishedYear = 1881;
        museum15.curator = "Heritage Board";

        diamond15.diamondId = 12015;
        diamond15.diamondName = "Red Cross Diamond";
        diamond15.originCountry = "UK";
        diamond15.carat = 205;
        diamond15.color = "Yellow";

        museum15.diamond = diamond15;
        museum15.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum16 = new Museum();
        Diamond diamond16 = new Diamond();

        museum16.museumId = 500;
        museum16.museumName = "National History Museum";
        museum16.city = "London";
        museum16.establishedYear = 1881;
        museum16.curator = "Heritage Board";

        diamond16.diamondId = 12016;
        diamond16.diamondName = "Earth Star";
        diamond16.originCountry = "South Africa";
        diamond16.carat = 111.6;
        diamond16.color = "Brown";

        museum16.diamond = diamond16;
        museum16.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum17 = new Museum();
        Diamond diamond17 = new Diamond();

        museum17.museumId = 500;
        museum17.museumName = "National History Museum";
        museum17.city = "London";
        museum17.establishedYear = 1881;
        museum17.curator = "Heritage Board";

        diamond17.diamondId = 12017;
        diamond17.diamondName = "Spirit of Grisogono";
        diamond17.originCountry = "Switzerland";
        diamond17.carat = 312.2;
        diamond17.color = "Black";

        museum17.diamond = diamond17;
        museum17.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum18 = new Museum();
        Diamond diamond18 = new Diamond();

        museum18.museumId = 500;
        museum18.museumName = "National History Museum";
        museum18.city = "London";
        museum18.establishedYear = 1881;
        museum18.curator = "Heritage Board";

        diamond18.diamondId = 12018;
        diamond18.diamondName = "Ocean Dream";
        diamond18.originCountry = "Japan";
        diamond18.carat = 5.5;
        diamond18.color = "Blue Green";

        museum18.diamond = diamond18;
        museum18.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum19 = new Museum();
        Diamond diamond19 = new Diamond();

        museum19.museumId = 500;
        museum19.museumName = "National History Museum";
        museum19.city = "London";
        museum19.establishedYear = 1881;
        museum19.curator = "Heritage Board";

        diamond19.diamondId = 12019;
        diamond19.diamondName = "Wittelsbach Diamond";
        diamond19.originCountry = "Germany";
        diamond19.carat = 35.6;
        diamond19.color = "Blue";

        museum19.diamond = diamond19;
        museum19.getMuseumDetails();

        System.out.println("----------------------");

        Museum museum20 = new Museum();
        Diamond diamond20 = new Diamond();

        museum20.museumId = 500;
        museum20.museumName = "National History Museum";
        museum20.city = "London";
        museum20.establishedYear = 1881;
        museum20.curator = "Heritage Board";

        diamond20.diamondId = 12020;
        diamond20.diamondName = "Millennium Star";
        diamond20.originCountry = "UK";
        diamond20.carat = 203.04;
        diamond20.color = "Colorless";

        museum20.diamond = diamond20;
        museum20.getMuseumDetails();

        System.out.println("----------------------");
    }
}
class BigDaddyRunner {

    public static void main(String[] args) {
		
		Casino c = new Casino(1, "Poker", "Card", 6, "High");
        BigDaddy b = new BigDaddy(101, "Big Daddy", "Goa", 2016, "Delta", c);
        b.getBigDaddyDetails();

        BigDaddy ship1 = new BigDaddy();
        Casino casino1 = new Casino();

        ship1.shipId = 900;
        ship1.casinoName = "Big Daddy Casino";
        ship1.location = "Goa";
        ship1.establishedYear = 2016;
        ship1.owner = "Delta Corp";

        casino1.tableId = 25001;
        casino1.gameName = "Roulette";
        casino1.gameType = "Wheel Game";
        casino1.maxPlayers = 8;
        casino1.popularity = "High";

        ship1.casino = casino1;
        ship1.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship2 = new BigDaddy();
        Casino casino2 = new Casino();

        ship2.shipId = 900;
        ship2.casinoName = "Big Daddy Casino";
        ship2.location = "Goa";
        ship2.establishedYear = 2016;
        ship2.owner = "Delta Corp";

        casino2.tableId = 25002;
        casino2.gameName = "Blackjack";
        casino2.gameType = "Card Game";
        casino2.maxPlayers = 7;
        casino2.popularity = "Very High";

        ship2.casino = casino2;
        ship2.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship3 = new BigDaddy();
        Casino casino3 = new Casino();

        ship3.shipId = 900;
        ship3.casinoName = "Big Daddy Casino";
        ship3.location = "Goa";
        ship3.establishedYear = 2016;
        ship3.owner = "Delta Corp";

        casino3.tableId = 25003;
        casino3.gameName = "Poker";
        casino3.gameType = "Card Game";
        casino3.maxPlayers = 9;
        casino3.popularity = "Very High";

        ship3.casino = casino3;
        ship3.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship4 = new BigDaddy();
        Casino casino4 = new Casino();

        ship4.shipId = 900;
        ship4.casinoName = "Big Daddy Casino";
        ship4.location = "Goa";
        ship4.establishedYear = 2016;
        ship4.owner = "Delta Corp";

        casino4.tableId = 25004;
        casino4.gameName = "Baccarat";
        casino4.gameType = "Card Game";
        casino4.maxPlayers = 6;
        casino4.popularity = "High";

        ship4.casino = casino4;
        ship4.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship5 = new BigDaddy();
        Casino casino5 = new Casino();

        ship5.shipId = 900;
        ship5.casinoName = "Big Daddy Casino";
        ship5.location = "Goa";
        ship5.establishedYear = 2016;
        ship5.owner = "Delta Corp";

        casino5.tableId = 25005;
        casino5.gameName = "Teen Patti";
        casino5.gameType = "Card Game";
        casino5.maxPlayers = 6;
        casino5.popularity = "High";

        ship5.casino = casino5;
        ship5.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship6 = new BigDaddy();
        Casino casino6 = new Casino();

        ship6.shipId = 900;
        ship6.casinoName = "Big Daddy Casino";
        ship6.location = "Goa";
        ship6.establishedYear = 2016;
        ship6.owner = "Delta Corp";

        casino6.tableId = 25006;
        casino6.gameName = "Slot Machine";
        casino6.gameType = "Machine Game";
        casino6.maxPlayers = 1;
        casino6.popularity = "Very High";

        ship6.casino = casino6;
        ship6.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship7 = new BigDaddy();
        Casino casino7 = new Casino();

        ship7.shipId = 900;
        ship7.casinoName = "Big Daddy Casino";
        ship7.location = "Goa";
        ship7.establishedYear = 2016;
        ship7.owner = "Delta Corp";

        casino7.tableId = 25007;
        casino7.gameName = "Texas Holdem";
        casino7.gameType = "Card Game";
        casino7.maxPlayers = 9;
        casino7.popularity = "Very High";

        ship7.casino = casino7;
        ship7.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship8 = new BigDaddy();
        Casino casino8 = new Casino();

        ship8.shipId = 900;
        ship8.casinoName = "Big Daddy Casino";
        ship8.location = "Goa";
        ship8.establishedYear = 2016;
        ship8.owner = "Delta Corp";

        casino8.tableId = 25008;
        casino8.gameName = "Caribbean Stud";
        casino8.gameType = "Card Game";
        casino8.maxPlayers = 5;
        casino8.popularity = "Medium";

        ship8.casino = casino8;
        ship8.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship9 = new BigDaddy();
        Casino casino9 = new Casino();

        ship9.shipId = 900;
        ship9.casinoName = "Big Daddy Casino";
        ship9.location = "Goa";
        ship9.establishedYear = 2016;
        ship9.owner = "Delta Corp";

        casino9.tableId = 25009;
        casino9.gameName = "Andar Bahar";
        casino9.gameType = "Card Game";
        casino9.maxPlayers = 6;
        casino9.popularity = "High";

        ship9.casino = casino9;
        ship9.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship10 = new BigDaddy();
        Casino casino10 = new Casino();

        ship10.shipId = 900;
        ship10.casinoName = "Big Daddy Casino";
        ship10.location = "Goa";
        ship10.establishedYear = 2016;
        ship10.owner = "Delta Corp";

        casino10.tableId = 25010;
        casino10.gameName = "Craps";
        casino10.gameType = "Dice Game";
        casino10.maxPlayers = 10;
        casino10.popularity = "Medium";

        ship10.casino = casino10;
        ship10.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship11 = new BigDaddy();
        Casino casino11 = new Casino();

        ship11.shipId = 900;
        ship11.casinoName = "Big Daddy Casino";
        ship11.location = "Goa";
        ship11.establishedYear = 2016;
        ship11.owner = "Delta Corp";

        casino11.tableId = 25011;
        casino11.gameName = "Keno";
        casino11.gameType = "Lottery Game";
        casino11.maxPlayers = 20;
        casino11.popularity = "Medium";

        ship11.casino = casino11;
        ship11.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship12 = new BigDaddy();
        Casino casino12 = new Casino();

        ship12.shipId = 900;
        ship12.casinoName = "Big Daddy Casino";
        ship12.location = "Goa";
        ship12.establishedYear = 2016;
        ship12.owner = "Delta Corp";

        casino12.tableId = 25012;
        casino12.gameName = "Sic Bo";
        casino12.gameType = "Dice Game";
        casino12.maxPlayers = 6;
        casino12.popularity = "Medium";

        ship12.casino = casino12;
        ship12.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship13 = new BigDaddy();
        Casino casino13 = new Casino();

        ship13.shipId = 900;
        ship13.casinoName = "Big Daddy Casino";
        ship13.location = "Goa";
        ship13.establishedYear = 2016;
        ship13.owner = "Delta Corp";

        casino13.tableId = 25013;
        casino13.gameName = "Pai Gow Poker";
        casino13.gameType = "Card Game";
        casino13.maxPlayers = 7;
        casino13.popularity = "Medium";

        ship13.casino = casino13;
        ship13.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship14 = new BigDaddy();
        Casino casino14 = new Casino();

        ship14.shipId = 900;
        ship14.casinoName = "Big Daddy Casino";
        ship14.location = "Goa";
        ship14.establishedYear = 2016;
        ship14.owner = "Delta Corp";

        casino14.tableId = 25014;
        casino14.gameName = "Three Card Poker";
        casino14.gameType = "Card Game";
        casino14.maxPlayers = 6;
        casino14.popularity = "High";

        ship14.casino = casino14;
        ship14.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship15 = new BigDaddy();
        Casino casino15 = new Casino();

        ship15.shipId = 900;
        ship15.casinoName = "Big Daddy Casino";
        ship15.location = "Goa";
        ship15.establishedYear = 2016;
        ship15.owner = "Delta Corp";

        casino15.tableId = 25015;
        casino15.gameName = "Video Poker";
        casino15.gameType = "Machine Game";
        casino15.maxPlayers = 1;
        casino15.popularity = "Medium";

        ship15.casino = casino15;
        ship15.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship16 = new BigDaddy();
        Casino casino16 = new Casino();

        ship16.shipId = 900;
        ship16.casinoName = "Big Daddy Casino";
        ship16.location = "Goa";
        ship16.establishedYear = 2016;
        ship16.owner = "Delta Corp";

        casino16.tableId = 25016;
        casino16.gameName = "Mini Roulette";
        casino16.gameType = "Wheel Game";
        casino16.maxPlayers = 6;
        casino16.popularity = "Medium";

        ship16.casino = casino16;
        ship16.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship17 = new BigDaddy();
        Casino casino17 = new Casino();

        ship17.shipId = 900;
        ship17.casinoName = "Big Daddy Casino";
        ship17.location = "Goa";
        ship17.establishedYear = 2016;
        ship17.owner = "Delta Corp";

        casino17.tableId = 25017;
        casino17.gameName = "Casino War";
        casino17.gameType = "Card Game";
        casino17.maxPlayers = 2;
        casino17.popularity = "Low";

        ship17.casino = casino17;
        ship17.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship18 = new BigDaddy();
        Casino casino18 = new Casino();

        ship18.shipId = 900;
        ship18.casinoName = "Big Daddy Casino";
        ship18.location = "Goa";
        ship18.establishedYear = 2016;
        ship18.owner = "Delta Corp";

        casino18.tableId = 25018;
        casino18.gameName = "Dragon Tiger";
        casino18.gameType = "Card Game";
        casino18.maxPlayers = 2;
        casino18.popularity = "High";

        ship18.casino = casino18;
        ship18.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship19 = new BigDaddy();
        Casino casino19 = new Casino();

        ship19.shipId = 900;
        ship19.casinoName = "Big Daddy Casino";
        ship19.location = "Goa";
        ship19.establishedYear = 2016;
        ship19.owner = "Delta Corp";

        casino19.tableId = 25019;
        casino19.gameName = "Lucky 7";
        casino19.gameType = "Dice Game";
        casino19.maxPlayers = 6;
        casino19.popularity = "Medium";

        ship19.casino = casino19;
        ship19.getBigDaddyDetails();

        System.out.println("----------------------");

        BigDaddy ship20 = new BigDaddy();
        Casino casino20 = new Casino();

        ship20.shipId = 900;
        ship20.casinoName = "Big Daddy Casino";
        ship20.location = "Goa";
        ship20.establishedYear = 2016;
        ship20.owner = "Delta Corp";

        casino20.tableId = 25020;
        casino20.gameName = "Money Wheel";
        casino20.gameType = "Wheel Game";
        casino20.maxPlayers = 8;
        casino20.popularity = "Medium";

        ship20.casino = casino20;
        ship20.getBigDaddyDetails();

        System.out.println("----------------------");
    }
}
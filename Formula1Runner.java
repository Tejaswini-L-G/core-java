class Formula1Runner {

    public static void main(String[] args) {
		
		 Franchise f = new Franchise(1, "Ferrari", "Italy", "Vasseur", 16);
        Formula1 f1 = new Formula1(2024, "FIA", 10, "Rolex", "Abu Dhabi", f);
        f1.getFormula1Details();

        Formula1 f11 = new Formula1();
        Franchise team1 = new Franchise();

        f11.championshipYear = 2024;
        f11.organizer = "FIA";
        f11.totalTeams = 10;
        f11.titleSponsor = "Rolex";
        f11.finalRaceCity = "Abu Dhabi";

        team1.teamId = 20001;
        team1.teamName = "Mercedes";
        team1.country = "Germany";
        team1.teamPrincipal = "Toto Wolff";
        team1.championships = 8;

        f11.franchise = team1;
        f11.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f12 = new Formula1();
        Franchise team2 = new Franchise();

        f12.championshipYear = 2024;
        f12.organizer = "FIA";
        f12.totalTeams = 10;
        f12.titleSponsor = "Rolex";
        f12.finalRaceCity = "Abu Dhabi";

        team2.teamId = 20002;
        team2.teamName = "Red Bull Racing";
        team2.country = "Austria";
        team2.teamPrincipal = "Christian Horner";
        team2.championships = 6;

        f12.franchise = team2;
        f12.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f13 = new Formula1();
        Franchise team3 = new Franchise();

        f13.championshipYear = 2024;
        f13.organizer = "FIA";
        f13.totalTeams = 10;
        f13.titleSponsor = "Rolex";
        f13.finalRaceCity = "Abu Dhabi";

        team3.teamId = 20003;
        team3.teamName = "Ferrari";
        team3.country = "Italy";
        team3.teamPrincipal = "Fred Vasseur";
        team3.championships = 16;

        f13.franchise = team3;
        f13.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f14 = new Formula1();
        Franchise team4 = new Franchise();

        f14.championshipYear = 2024;
        f14.organizer = "FIA";
        f14.totalTeams = 10;
        f14.titleSponsor = "Rolex";
        f14.finalRaceCity = "Abu Dhabi";

        team4.teamId = 20004;
        team4.teamName = "McLaren";
        team4.country = "UK";
        team4.teamPrincipal = "Andrea Stella";
        team4.championships = 8;

        f14.franchise = team4;
        f14.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f15 = new Formula1();
        Franchise team5 = new Franchise();

        f15.championshipYear = 2024;
        f15.organizer = "FIA";
        f15.totalTeams = 10;
        f15.titleSponsor = "Rolex";
        f15.finalRaceCity = "Abu Dhabi";

        team5.teamId = 20005;
        team5.teamName = "Alpine";
        team5.country = "France";
        team5.teamPrincipal = "Bruno Famin";
        team5.championships = 2;

        f15.franchise = team5;
        f15.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f16 = new Formula1();
        Franchise team6 = new Franchise();

        f16.championshipYear = 2024;
        f16.organizer = "FIA";
        f16.totalTeams = 10;
        f16.titleSponsor = "Rolex";
        f16.finalRaceCity = "Abu Dhabi";

        team6.teamId = 20006;
        team6.teamName = "Aston Martin";
        team6.country = "UK";
        team6.teamPrincipal = "Mike Krack";
        team6.championships = 0;

        f16.franchise = team6;
        f16.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f17 = new Formula1();
        Franchise team7 = new Franchise();

        f17.championshipYear = 2024;
        f17.organizer = "FIA";
        f17.totalTeams = 10;
        f17.titleSponsor = "Rolex";
        f17.finalRaceCity = "Abu Dhabi";

        team7.teamId = 20007;
        team7.teamName = "Williams";
        team7.country = "UK";
        team7.teamPrincipal = "James Vowles";
        team7.championships = 9;

        f17.franchise = team7;
        f17.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f18 = new Formula1();
        Franchise team8 = new Franchise();

        f18.championshipYear = 2024;
        f18.organizer = "FIA";
        f18.totalTeams = 10;
        f18.titleSponsor = "Rolex";
        f18.finalRaceCity = "Abu Dhabi";

        team8.teamId = 20008;
        team8.teamName = "AlphaTauri";
        team8.country = "Italy";
        team8.teamPrincipal = "Franz Tost";
        team8.championships = 0;

        f18.franchise = team8;
        f18.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f19 = new Formula1();
        Franchise team9 = new Franchise();

        f19.championshipYear = 2024;
        f19.organizer = "FIA";
        f19.totalTeams = 10;
        f19.titleSponsor = "Rolex";
        f19.finalRaceCity = "Abu Dhabi";

        team9.teamId = 20009;
        team9.teamName = "Alfa Romeo";
        team9.country = "Switzerland";
        team9.teamPrincipal = "Alessandro Alunni";
        team9.championships = 0;

        f19.franchise = team9;
        f19.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f110 = new Formula1();
        Franchise team10 = new Franchise();

        f110.championshipYear = 2024;
        f110.organizer = "FIA";
        f110.totalTeams = 10;
        f110.titleSponsor = "Rolex";
        f110.finalRaceCity = "Abu Dhabi";

        team10.teamId = 20010;
        team10.teamName = "Haas";
        team10.country = "USA";
        team10.teamPrincipal = "Guenther Steiner";
        team10.championships = 0;

        f110.franchise = team10;
        f110.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f111 = new Formula1();
        Franchise team11 = new Franchise();

        f111.championshipYear = 2024;
        f111.organizer = "FIA";
        f111.totalTeams = 10;
        f111.titleSponsor = "Rolex";
        f111.finalRaceCity = "Abu Dhabi";

        team11.teamId = 20011;
        team11.teamName = "Lotus";
        team11.country = "UK";
        team11.teamPrincipal = "Eric Boullier";
        team11.championships = 7;

        f111.franchise = team11;
        f111.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f112 = new Formula1();
        Franchise team12 = new Franchise();

        f112.championshipYear = 2024;
        f112.organizer = "FIA";
        f112.totalTeams = 10;
        f112.titleSponsor = "Rolex";
        f112.finalRaceCity = "Abu Dhabi";

        team12.teamId = 20012;
        team12.teamName = "Renault";
        team12.country = "France";
        team12.teamPrincipal = "Cyril Abiteboul";
        team12.championships = 2;

        f112.franchise = team12;
        f112.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f113 = new Formula1();
        Franchise team13 = new Franchise();

        f113.championshipYear = 2024;
        f113.organizer = "FIA";
        f113.totalTeams = 10;
        f113.titleSponsor = "Rolex";
        f113.finalRaceCity = "Abu Dhabi";

        team13.teamId = 20013;
        team13.teamName = "Brawn GP";
        team13.country = "UK";
        team13.teamPrincipal = "Ross Brawn";
        team13.championships = 1;

        f113.franchise = team13;
        f113.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f114 = new Formula1();
        Franchise team14 = new Franchise();

        f114.championshipYear = 2024;
        f114.organizer = "FIA";
        f114.totalTeams = 10;
        f114.titleSponsor = "Rolex";
        f114.finalRaceCity = "Abu Dhabi";

        team14.teamId = 20014;
        team14.teamName = "Toro Rosso";
        team14.country = "Italy";
        team14.teamPrincipal = "Franz Tost";
        team14.championships = 0;

        f114.franchise = team14;
        f114.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f115 = new Formula1();
        Franchise team15 = new Franchise();

        f115.championshipYear = 2024;
        f115.organizer = "FIA";
        f115.totalTeams = 10;
        f115.titleSponsor = "Rolex";
        f115.finalRaceCity = "Abu Dhabi";

        team15.teamId = 20015;
        team15.teamName = "Force India";
        team15.country = "India";
        team15.teamPrincipal = "Vijay Mallya";
        team15.championships = 0;

        f115.franchise = team15;
        f115.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f116 = new Formula1();
        Franchise team16 = new Franchise();

        f116.championshipYear = 2024;
        f116.organizer = "FIA";
        f116.totalTeams = 10;
        f116.titleSponsor = "Rolex";
        f116.finalRaceCity = "Abu Dhabi";

        team16.teamId = 20016;
        team16.teamName = "Jaguar";
        team16.country = "UK";
        team16.teamPrincipal = "Tony Purnell";
        team16.championships = 0;

        f116.franchise = team16;
        f116.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f117 = new Formula1();
        Franchise team17 = new Franchise();

        f117.championshipYear = 2024;
        f117.organizer = "FIA";
        f117.totalTeams = 10;
        f117.titleSponsor = "Rolex";
        f117.finalRaceCity = "Abu Dhabi";

        team17.teamId = 20017;
        team17.teamName = "Benetton";
        team17.country = "Italy";
        team17.teamPrincipal = "Flavio Briatore";
        team17.championships = 2;

        f117.franchise = team17;
        f117.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f118 = new Formula1();
        Franchise team18 = new Franchise();

        f118.championshipYear = 2024;
        f118.organizer = "FIA";
        f118.totalTeams = 10;
        f118.titleSponsor = "Rolex";
        f118.finalRaceCity = "Abu Dhabi";

        team18.teamId = 20018;
        team18.teamName = "Tyrell";
        team18.country = "UK";
        team18.teamPrincipal = "Ken Tyrrell";
        team18.championships = 0;

        f118.franchise = team18;
        f118.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f119 = new Formula1();
        Franchise team19 = new Franchise();

        f119.championshipYear = 2024;
        f119.organizer = "FIA";
        f119.totalTeams = 10;
        f119.titleSponsor = "Rolex";
        f119.finalRaceCity = "Abu Dhabi";

        team19.teamId = 20019;
        team19.teamName = "Brabham";
        team19.country = "UK";
        team19.teamPrincipal = "Bernie Ecclestone";
        team19.championships = 2;

        f119.franchise = team19;
        f119.getFormula1Details();

        System.out.println("----------------------");

        Formula1 f120 = new Formula1();
        Franchise team20 = new Franchise();

        f120.championshipYear = 2024;
        f120.organizer = "FIA";
        f120.totalTeams = 10;
        f120.titleSponsor = "Rolex";
        f120.finalRaceCity = "Abu Dhabi";

        team20.teamId = 20020;
        team20.teamName = "Sauber";
        team20.country = "Switzerland";
        team20.teamPrincipal = "Peter Sauber";
        team20.championships = 0;

        f120.franchise = team20;
        f120.getFormula1Details();

        System.out.println("----------------------");
    }
}
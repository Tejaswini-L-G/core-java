class CricketRunner {

    public static void main(String[] args) {

        System.out.println("----- Default Constructor Objects -----");

        Cricket indiaTeam = new Cricket();
        indiaTeam.teamName="India"; indiaTeam.captain="Rohit"; indiaTeam.viceCaptain="Hardik"; indiaTeam.players=11; indiaTeam.format="ODI"; indiaTeam.stadium="Wankhede"; indiaTeam.country="India"; indiaTeam.overs=50; indiaTeam.wickets=10; indiaTeam.runs=320; indiaTeam.runRate=6.4; indiaTeam.coach="Dravid"; indiaTeam.sponsor="BYJUS"; indiaTeam.jerseyColor="Blue"; indiaTeam.ranking=1; indiaTeam.matchesPlayed=100; indiaTeam.matchesWon=70; indiaTeam.matchesLost=30; indiaTeam.points=140; indiaTeam.league="ICC";

        Cricket australiaTeam = new Cricket();
        australiaTeam.teamName="Australia"; australiaTeam.captain="Cummins"; australiaTeam.viceCaptain="Smith"; australiaTeam.players=11; australiaTeam.format="Test"; australiaTeam.stadium="MCG"; australiaTeam.country="Australia"; australiaTeam.overs=90; australiaTeam.wickets=10; australiaTeam.runs=350; australiaTeam.runRate=3.8; australiaTeam.coach="McDonald"; australiaTeam.sponsor="Qantas"; australiaTeam.jerseyColor="Yellow"; australiaTeam.ranking=2; australiaTeam.matchesPlayed=90; australiaTeam.matchesWon=60; australiaTeam.matchesLost=30; australiaTeam.points=120; australiaTeam.league="ICC";

        Cricket englandTeam = new Cricket();
        englandTeam.teamName="England"; englandTeam.captain="Buttler"; englandTeam.viceCaptain="Root"; englandTeam.players=11; englandTeam.format="T20"; englandTeam.stadium="Lords"; englandTeam.country="England"; englandTeam.overs=20; englandTeam.wickets=10; englandTeam.runs=210; englandTeam.runRate=10.5; englandTeam.coach="Mott"; englandTeam.sponsor="Natwest"; englandTeam.jerseyColor="Red"; englandTeam.ranking=3; englandTeam.matchesPlayed=80; englandTeam.matchesWon=50; englandTeam.matchesLost=30; englandTeam.points=100; englandTeam.league="ICC";

        Cricket pakistanTeam = new Cricket();
        pakistanTeam.teamName="Pakistan"; pakistanTeam.captain="Babar"; pakistanTeam.viceCaptain="Rizwan"; pakistanTeam.players=11; pakistanTeam.format="ODI"; pakistanTeam.stadium="Karachi"; pakistanTeam.country="Pakistan"; pakistanTeam.overs=50; pakistanTeam.wickets=10; pakistanTeam.runs=280; pakistanTeam.runRate=5.6; pakistanTeam.coach="Kirsten"; pakistanTeam.sponsor="Pepsi"; pakistanTeam.jerseyColor="Green"; pakistanTeam.ranking=4; pakistanTeam.matchesPlayed=85; pakistanTeam.matchesWon=45; pakistanTeam.matchesLost=40; pakistanTeam.points=90; pakistanTeam.league="ICC";

        Cricket newZealandTeam = new Cricket();
        newZealandTeam.teamName="NewZealand"; newZealandTeam.captain="Williamson"; newZealandTeam.viceCaptain="Latham"; newZealandTeam.players=11; newZealandTeam.format="Test"; newZealandTeam.stadium="Auckland"; newZealandTeam.country="NZ"; newZealandTeam.overs=90; newZealandTeam.wickets=10; newZealandTeam.runs=310; newZealandTeam.runRate=3.4; newZealandTeam.coach="Stead"; newZealandTeam.sponsor="ANZ"; newZealandTeam.jerseyColor="Black"; newZealandTeam.ranking=5; newZealandTeam.matchesPlayed=75; newZealandTeam.matchesWon=40; newZealandTeam.matchesLost=35; newZealandTeam.points=80; newZealandTeam.league="ICC";

        Cricket southAfricaTeam = new Cricket();
        southAfricaTeam.teamName="SouthAfrica"; southAfricaTeam.captain="Markram"; southAfricaTeam.viceCaptain="Miller"; southAfricaTeam.players=11; southAfricaTeam.format="T20"; southAfricaTeam.stadium="CapeTown"; southAfricaTeam.country="SA"; southAfricaTeam.overs=20; southAfricaTeam.wickets=10; southAfricaTeam.runs=205; southAfricaTeam.runRate=10.2; southAfricaTeam.coach="Boucher"; southAfricaTeam.sponsor="Castle"; southAfricaTeam.jerseyColor="Green"; southAfricaTeam.ranking=6; southAfricaTeam.matchesPlayed=70; southAfricaTeam.matchesWon=35; southAfricaTeam.matchesLost=35; southAfricaTeam.points=70; southAfricaTeam.league="ICC";

        Cricket sriLankaTeam = new Cricket();
        sriLankaTeam.teamName="SriLanka"; sriLankaTeam.captain="Shanaka"; sriLankaTeam.viceCaptain="Mendis"; sriLankaTeam.players=11; sriLankaTeam.format="ODI"; sriLankaTeam.stadium="Colombo"; sriLankaTeam.country="SL"; sriLankaTeam.overs=50; sriLankaTeam.wickets=10; sriLankaTeam.runs=260; sriLankaTeam.runRate=5.2; sriLankaTeam.coach="Silverwood"; sriLankaTeam.sponsor="Dialog"; sriLankaTeam.jerseyColor="Blue"; sriLankaTeam.ranking=7; sriLankaTeam.matchesPlayed=65; sriLankaTeam.matchesWon=30; sriLankaTeam.matchesLost=35; sriLankaTeam.points=60; sriLankaTeam.league="ICC";

        Cricket bangladeshTeam = new Cricket();
        bangladeshTeam.teamName="Bangladesh"; bangladeshTeam.captain="Shanto"; bangladeshTeam.viceCaptain="Shakib"; bangladeshTeam.players=11; bangladeshTeam.format="ODI"; bangladeshTeam.stadium="Dhaka"; bangladeshTeam.country="Bangladesh"; bangladeshTeam.overs=50; bangladeshTeam.wickets=10; bangladeshTeam.runs=250; bangladeshTeam.runRate=5.0; bangladeshTeam.coach="Hathurusingha"; bangladeshTeam.sponsor="Daraz"; bangladeshTeam.jerseyColor="Green"; bangladeshTeam.ranking=8; bangladeshTeam.matchesPlayed=60; bangladeshTeam.matchesWon=28; bangladeshTeam.matchesLost=32; bangladeshTeam.points=56; bangladeshTeam.league="ICC";

        Cricket afghanistanTeam = new Cricket();
        afghanistanTeam.teamName="Afghanistan"; afghanistanTeam.captain="Rashid"; afghanistanTeam.viceCaptain="Nabi"; afghanistanTeam.players=11; afghanistanTeam.format="T20"; afghanistanTeam.stadium="Kabul"; afghanistanTeam.country="Afghanistan"; afghanistanTeam.overs=20; afghanistanTeam.wickets=10; afghanistanTeam.runs=195; afghanistanTeam.runRate=9.8; afghanistanTeam.coach="Trott"; afghanistanTeam.sponsor="Etisalat"; afghanistanTeam.jerseyColor="Blue"; afghanistanTeam.ranking=9; afghanistanTeam.matchesPlayed=55; afghanistanTeam.matchesWon=25; afghanistanTeam.matchesLost=30; afghanistanTeam.points=50; afghanistanTeam.league="ICC";

        Cricket irelandTeam = new Cricket();
        irelandTeam.teamName="Ireland"; irelandTeam.captain="Balbirnie"; irelandTeam.viceCaptain="Tector"; irelandTeam.players=11; irelandTeam.format="ODI"; irelandTeam.stadium="Dublin"; irelandTeam.country="Ireland"; irelandTeam.overs=50; irelandTeam.wickets=10; irelandTeam.runs=240; irelandTeam.runRate=4.8; irelandTeam.coach="White"; irelandTeam.sponsor="Guinness"; irelandTeam.jerseyColor="Green"; irelandTeam.ranking=10; irelandTeam.matchesPlayed=50; irelandTeam.matchesWon=22; irelandTeam.matchesLost=28; irelandTeam.points=44; irelandTeam.league="ICC";

        Cricket canadaTeam = new Cricket();
        canadaTeam.teamName="Canada"; canadaTeam.captain="Dhaliwal"; canadaTeam.viceCaptain="Patel"; canadaTeam.players=11; canadaTeam.format="ODI"; canadaTeam.stadium="Toronto"; canadaTeam.country="Canada"; canadaTeam.overs=50; canadaTeam.wickets=10; canadaTeam.runs=220; canadaTeam.runRate=4.4; canadaTeam.coach="Pubudu"; canadaTeam.sponsor="Maple"; canadaTeam.jerseyColor="Red"; canadaTeam.ranking=11; canadaTeam.matchesPlayed=45; canadaTeam.matchesWon=20; canadaTeam.matchesLost=25; canadaTeam.points=40; canadaTeam.league="ICC";

        Cricket nepalTeam = new Cricket();
        nepalTeam.teamName="Nepal"; nepalTeam.captain="RohitPaudel"; nepalTeam.viceCaptain="Airee"; nepalTeam.players=11; nepalTeam.format="T20"; nepalTeam.stadium="Kathmandu"; nepalTeam.country="Nepal"; nepalTeam.overs=20; nepalTeam.wickets=10; nepalTeam.runs=180; nepalTeam.runRate=9.0; nepalTeam.coach="Monty"; nepalTeam.sponsor="Yeti"; nepalTeam.jerseyColor="Red"; nepalTeam.ranking=12; nepalTeam.matchesPlayed=40; nepalTeam.matchesWon=18; nepalTeam.matchesLost=22; nepalTeam.points=36; nepalTeam.league="ICC";

        Cricket namibiaTeam = new Cricket();
        namibiaTeam.teamName="Namibia"; namibiaTeam.captain="Erasmus"; namibiaTeam.viceCaptain="Smit"; namibiaTeam.players=11; namibiaTeam.format="T20"; namibiaTeam.stadium="Windhoek"; namibiaTeam.country="Namibia"; namibiaTeam.overs=20; namibiaTeam.wickets=10; namibiaTeam.runs=175; namibiaTeam.runRate=8.7; namibiaTeam.coach="DeBruyn"; namibiaTeam.sponsor="NamPower"; namibiaTeam.jerseyColor="Blue"; namibiaTeam.ranking=13; namibiaTeam.matchesPlayed=38; namibiaTeam.matchesWon=17; namibiaTeam.matchesLost=21; namibiaTeam.points=34; namibiaTeam.league="ICC";

        Cricket omanTeam = new Cricket();
        omanTeam.teamName="Oman"; omanTeam.captain="Zeeshan"; omanTeam.viceCaptain="Jatinder"; omanTeam.players=11; omanTeam.format="T20"; omanTeam.stadium="Muscat"; omanTeam.country="Oman"; omanTeam.overs=20; omanTeam.wickets=10; omanTeam.runs=170; omanTeam.runRate=8.5; omanTeam.coach="Duleep"; omanTeam.sponsor="OmanAir"; omanTeam.jerseyColor="Red"; omanTeam.ranking=14; omanTeam.matchesPlayed=35; omanTeam.matchesWon=15; omanTeam.matchesLost=20; omanTeam.points=30; omanTeam.league="ICC";

        Cricket uaeTeam = new Cricket();
        uaeTeam.teamName="UAE"; uaeTeam.captain="Waseem"; uaeTeam.viceCaptain="Mustafa"; uaeTeam.players=11; uaeTeam.format="T20"; uaeTeam.stadium="Dubai"; uaeTeam.country="UAE"; uaeTeam.overs=20; uaeTeam.wickets=10; uaeTeam.runs=165; uaeTeam.runRate=8.2; uaeTeam.coach="Robin"; uaeTeam.sponsor="Emirates"; uaeTeam.jerseyColor="Blue"; uaeTeam.ranking=15; uaeTeam.matchesPlayed=34; uaeTeam.matchesWon=14; uaeTeam.matchesLost=20; uaeTeam.points=28; uaeTeam.league="ICC";

        Cricket zimbabweTeam = new Cricket();
        zimbabweTeam.teamName="Zimbabwe"; zimbabweTeam.captain="Ervine"; zimbabweTeam.viceCaptain="Raza"; zimbabweTeam.players=11; zimbabweTeam.format="ODI"; zimbabweTeam.stadium="Harare"; zimbabweTeam.country="Zimbabwe"; zimbabweTeam.overs=50; zimbabweTeam.wickets=10; zimbabweTeam.runs=260; zimbabweTeam.runRate=5.2; zimbabweTeam.coach="Houghton"; zimbabweTeam.sponsor="ZimBank"; zimbabweTeam.jerseyColor="Red"; zimbabweTeam.ranking=16; zimbabweTeam.matchesPlayed=60; zimbabweTeam.matchesWon=25; zimbabweTeam.matchesLost=35; zimbabweTeam.points=50; zimbabweTeam.league="ICC";

        Cricket scotlandTeam = new Cricket();
        scotlandTeam.teamName="Scotland"; scotlandTeam.captain="Berrington"; scotlandTeam.viceCaptain="Coetzer"; scotlandTeam.players=11; scotlandTeam.format="ODI"; scotlandTeam.stadium="Edinburgh"; scotlandTeam.country="Scotland"; scotlandTeam.overs=50; scotlandTeam.wickets=10; scotlandTeam.runs=245; scotlandTeam.runRate=4.9; scotlandTeam.coach="Shane"; scotlandTeam.sponsor="Saltire"; scotlandTeam.jerseyColor="Purple"; scotlandTeam.ranking=17; scotlandTeam.matchesPlayed=55; scotlandTeam.matchesWon=24; scotlandTeam.matchesLost=31; scotlandTeam.points=48; scotlandTeam.league="ICC";

        Cricket netherlandsTeam = new Cricket();
        netherlandsTeam.teamName="Netherlands"; netherlandsTeam.captain="Edwards"; netherlandsTeam.viceCaptain="Ackermann"; netherlandsTeam.players=11; netherlandsTeam.format="ODI"; netherlandsTeam.stadium="Amsterdam"; netherlandsTeam.country="Netherlands"; netherlandsTeam.overs=50; netherlandsTeam.wickets=10; netherlandsTeam.runs=255; netherlandsTeam.runRate=5.1; netherlandsTeam.coach="Ryan"; netherlandsTeam.sponsor="KLM"; netherlandsTeam.jerseyColor="Orange"; netherlandsTeam.ranking=18; netherlandsTeam.matchesPlayed=58; netherlandsTeam.matchesWon=26; netherlandsTeam.matchesLost=32; netherlandsTeam.points=52; netherlandsTeam.league="ICC";

        Cricket usaTeam = new Cricket();
        usaTeam.teamName="USA"; usaTeam.captain="Monank"; usaTeam.viceCaptain="Patel"; usaTeam.players=11; usaTeam.format="T20"; usaTeam.stadium="Florida"; usaTeam.country="USA"; usaTeam.overs=20; usaTeam.wickets=10; usaTeam.runs=185; usaTeam.runRate=9.2; usaTeam.coach="Stuart"; usaTeam.sponsor="Pepsi"; usaTeam.jerseyColor="Blue"; usaTeam.ranking=19; usaTeam.matchesPlayed=40; usaTeam.matchesWon=18; usaTeam.matchesLost=22; usaTeam.points=36; usaTeam.league="ICC";

        Cricket italyTeam = new Cricket();
        italyTeam.teamName="Italy"; italyTeam.captain="Cricketi"; italyTeam.viceCaptain="Marco"; italyTeam.players=11; italyTeam.format="T20"; italyTeam.stadium="Rome"; italyTeam.country="Italy"; italyTeam.overs=20; italyTeam.wickets=10; italyTeam.runs=170; italyTeam.runRate=8.4; italyTeam.coach="Gianni"; italyTeam.sponsor="RomaBank"; italyTeam.jerseyColor="Blue"; italyTeam.ranking=20; italyTeam.matchesPlayed=30; italyTeam.matchesWon=12; italyTeam.matchesLost=18; italyTeam.points=24; italyTeam.league="ICC";

        Cricket kenyaTeam = new Cricket();
        kenyaTeam.teamName="Kenya"; kenyaTeam.captain="Odoyo"; kenyaTeam.viceCaptain="Patel"; kenyaTeam.players=11; kenyaTeam.format="ODI"; kenyaTeam.stadium="Nairobi"; kenyaTeam.country="Kenya"; kenyaTeam.overs=50; kenyaTeam.wickets=10; kenyaTeam.runs=240; kenyaTeam.runRate=4.8; kenyaTeam.coach="Otieno"; kenyaTeam.sponsor="Safari"; kenyaTeam.jerseyColor="Green"; kenyaTeam.ranking=21; kenyaTeam.matchesPlayed=45; kenyaTeam.matchesWon=20; kenyaTeam.matchesLost=25; kenyaTeam.points=40; kenyaTeam.league="ICC";

        Cricket malaysiaTeam = new Cricket();
        malaysiaTeam.teamName="Malaysia"; malaysiaTeam.captain="Singh"; malaysiaTeam.viceCaptain="Ali"; malaysiaTeam.players=11; malaysiaTeam.format="T20"; malaysiaTeam.stadium="KualaLumpur"; malaysiaTeam.country="Malaysia"; malaysiaTeam.overs=20; malaysiaTeam.wickets=10; malaysiaTeam.runs=175; malaysiaTeam.runRate=8.7; malaysiaTeam.coach="Rahman"; malaysiaTeam.sponsor="Petronas"; malaysiaTeam.jerseyColor="Yellow"; malaysiaTeam.ranking=22; malaysiaTeam.matchesPlayed=35; malaysiaTeam.matchesWon=15; malaysiaTeam.matchesLost=20; malaysiaTeam.points=30; malaysiaTeam.league="ICC";

        Cricket singaporeTeam = new Cricket();
        singaporeTeam.teamName="Singapore"; singaporeTeam.captain="David"; singaporeTeam.viceCaptain="Manpreet"; singaporeTeam.players=11; singaporeTeam.format="T20"; singaporeTeam.stadium="SingaporeStadium"; singaporeTeam.country="Singapore"; singaporeTeam.overs=20; singaporeTeam.wickets=10; singaporeTeam.runs=168; singaporeTeam.runRate=8.3; singaporeTeam.coach="Tan"; singaporeTeam.sponsor="LionBank"; singaporeTeam.jerseyColor="Red"; singaporeTeam.ranking=23; singaporeTeam.matchesPlayed=30; singaporeTeam.matchesWon=13; singaporeTeam.matchesLost=17; singaporeTeam.points=26; singaporeTeam.league="ICC";

        Cricket thailandTeam = new Cricket();
        thailandTeam.teamName="Thailand"; thailandTeam.captain="Chan"; thailandTeam.viceCaptain="Somchai"; thailandTeam.players=11; thailandTeam.format="T20"; thailandTeam.stadium="Bangkok"; thailandTeam.country="Thailand"; thailandTeam.overs=20; thailandTeam.wickets=10; thailandTeam.runs=160; thailandTeam.runRate=8.0; thailandTeam.coach="Suriya"; thailandTeam.sponsor="ThaiBank"; thailandTeam.jerseyColor="Blue"; thailandTeam.ranking=24; thailandTeam.matchesPlayed=28; thailandTeam.matchesWon=11; thailandTeam.matchesLost=17; thailandTeam.points=22; thailandTeam.league="ICC";

        Cricket germanyTeam = new Cricket();
        germanyTeam.teamName="Germany"; germanyTeam.captain="Bavaria"; germanyTeam.viceCaptain="Hans"; germanyTeam.players=11; germanyTeam.format="T20"; germanyTeam.stadium="Berlin"; germanyTeam.country="Germany"; germanyTeam.overs=20; germanyTeam.wickets=10; germanyTeam.runs=165; germanyTeam.runRate=8.1; germanyTeam.coach="Klaus"; germanyTeam.sponsor="Deutsche"; germanyTeam.jerseyColor="Black"; germanyTeam.ranking=25; germanyTeam.matchesPlayed=28; germanyTeam.matchesWon=12; germanyTeam.matchesLost=16; germanyTeam.points=24; germanyTeam.league="ICC";

        System.out.println("Cricket: "+indiaTeam.teamName+" "+indiaTeam.captain+" "+indiaTeam.format+" "+indiaTeam.stadium);
        System.out.println("Cricket: "+australiaTeam.teamName+" "+australiaTeam.captain+" "+australiaTeam.format+" "+australiaTeam.stadium);
        System.out.println("Cricket: "+englandTeam.teamName+" "+englandTeam.captain+" "+englandTeam.format+" "+englandTeam.stadium);
        System.out.println("Cricket: "+pakistanTeam.teamName+" "+pakistanTeam.captain+" "+pakistanTeam.format+" "+pakistanTeam.stadium);
        System.out.println("Cricket: "+newZealandTeam.teamName+" "+newZealandTeam.captain+" "+newZealandTeam.format+" "+newZealandTeam.stadium);
        System.out.println("Cricket: "+southAfricaTeam.teamName+" "+southAfricaTeam.captain+" "+southAfricaTeam.format+" "+southAfricaTeam.stadium);
        System.out.println("Cricket: "+sriLankaTeam.teamName+" "+sriLankaTeam.captain+" "+sriLankaTeam.format+" "+sriLankaTeam.stadium);
        System.out.println("Cricket: "+bangladeshTeam.teamName+" "+bangladeshTeam.captain+" "+bangladeshTeam.format+" "+bangladeshTeam.stadium);
        System.out.println("Cricket: "+afghanistanTeam.teamName+" "+afghanistanTeam.captain+" "+afghanistanTeam.format+" "+afghanistanTeam.stadium);
        System.out.println("Cricket: "+irelandTeam.teamName+" "+irelandTeam.captain+" "+irelandTeam.format+" "+irelandTeam.stadium);
        System.out.println("Cricket: "+canadaTeam.teamName+" "+canadaTeam.captain+" "+canadaTeam.format+" "+canadaTeam.stadium);
        System.out.println("Cricket: "+nepalTeam.teamName+" "+nepalTeam.captain+" "+nepalTeam.format+" "+nepalTeam.stadium);
        System.out.println("Cricket: "+namibiaTeam.teamName+" "+namibiaTeam.captain+" "+namibiaTeam.format+" "+namibiaTeam.stadium);
        System.out.println("Cricket: "+omanTeam.teamName+" "+omanTeam.captain+" "+omanTeam.format+" "+omanTeam.stadium);
        System.out.println("Cricket: "+uaeTeam.teamName+" "+uaeTeam.captain+" "+uaeTeam.format+" "+uaeTeam.stadium);
        System.out.println("Cricket: "+zimbabweTeam.teamName+" "+zimbabweTeam.captain+" "+zimbabweTeam.format+" "+zimbabweTeam.stadium);
        System.out.println("Cricket: "+scotlandTeam.teamName+" "+scotlandTeam.captain+" "+scotlandTeam.format+" "+scotlandTeam.stadium);
        System.out.println("Cricket: "+netherlandsTeam.teamName+" "+netherlandsTeam.captain+" "+netherlandsTeam.format+" "+netherlandsTeam.stadium);
        System.out.println("Cricket: "+usaTeam.teamName+" "+usaTeam.captain+" "+usaTeam.format+" "+usaTeam.stadium);
        System.out.println("Cricket: "+italyTeam.teamName+" "+italyTeam.captain+" "+italyTeam.format+" "+italyTeam.stadium);
        System.out.println("Cricket: "+kenyaTeam.teamName+" "+kenyaTeam.captain+" "+kenyaTeam.format+" "+kenyaTeam.stadium);
        System.out.println("Cricket: "+malaysiaTeam.teamName+" "+malaysiaTeam.captain+" "+malaysiaTeam.format+" "+malaysiaTeam.stadium);
        System.out.println("Cricket: "+singaporeTeam.teamName+" "+singaporeTeam.captain+" "+singaporeTeam.format+" "+singaporeTeam.stadium);
        System.out.println("Cricket: "+thailandTeam.teamName+" "+thailandTeam.captain+" "+thailandTeam.format+" "+thailandTeam.stadium);
        System.out.println("Cricket: "+germanyTeam.teamName+" "+germanyTeam.captain+" "+germanyTeam.format+" "+germanyTeam.stadium);

        System.out.println("----- Parameterized Constructor Objects -----");

        Cricket match1 = new Cricket("India","Rohit","Hardik",11,"T20","Delhi","India",20,10,200,10.0,"Dravid","BYJUS","Blue",1,100,70,30,140,"ICC");
        Cricket match2 = new Cricket("Australia","Cummins","Smith",11,"ODI","Sydney","Australia",50,10,310,6.2,"McDonald","Qantas","Yellow",2,90,60,30,120,"ICC");
        Cricket match3 = new Cricket("England","Buttler","Root",11,"T20","London","England",20,10,210,10.5,"Mott","Natwest","Red",3,80,50,30,100,"ICC");
        Cricket match4 = new Cricket("Pakistan","Babar","Rizwan",11,"ODI","Lahore","Pakistan",50,10,280,5.6,"Kirsten","Pepsi","Green",4,85,45,40,90,"ICC");
        Cricket match5 = new Cricket("NewZealand","Williamson","Latham",11,"Test","Auckland","NZ",90,10,320,3.4,"Stead","ANZ","Black",5,75,40,35,80,"ICC");
        Cricket match6 = new Cricket("SouthAfrica","Markram","Miller",11,"T20","CapeTown","SA",20,10,205,10.2,"Boucher","Castle","Green",6,70,35,35,70,"ICC");
        Cricket match7 = new Cricket("SriLanka","Shanaka","Mendis",11,"ODI","Colombo","SL",50,10,260,5.2,"Silverwood","Dialog","Blue",7,65,30,35,60,"ICC");
        Cricket match8 = new Cricket("Bangladesh","Shanto","Shakib",11,"ODI","Dhaka","Bangladesh",50,10,250,5.0,"Hathurusingha","Daraz","Green",8,60,28,32,56,"ICC");
        Cricket match9 = new Cricket("Afghanistan","Rashid","Nabi",11,"T20","Kabul","Afghanistan",20,10,195,9.8,"Trott","Etisalat","Blue",9,55,25,30,50,"ICC");
        Cricket match10 = new Cricket("Ireland","Balbirnie","Tector",11,"ODI","Dublin","Ireland",50,10,240,4.8,"White","Guinness","Green",10,50,22,28,44,"ICC");
        Cricket match11 = new Cricket("India","Rohit","Gill",11,"Test","Mumbai","India",90,10,350,3.9,"Dravid","Dream11","Blue",1,120,80,40,160,"ICC");
        Cricket match12 = new Cricket("Australia","Cummins","Warner",11,"T20","Melbourne","Australia",20,10,210,10.3,"McDonald","Qantas","Yellow",2,110,70,40,140,"ICC");
        Cricket match13 = new Cricket("England","Root","Stokes",11,"Test","Manchester","England",90,10,330,3.6,"Mott","Natwest","Red",3,100,60,40,120,"ICC");
        Cricket match14 = new Cricket("Pakistan","Babar","Shaheen",11,"T20","Karachi","Pakistan",20,10,205,10.1,"Kirsten","Pepsi","Green",4,95,55,40,110,"ICC");
        Cricket match15 = new Cricket("NewZealand","Williamson","Mitchell",11,"ODI","Wellington","NZ",50,10,300,6.0,"Stead","ANZ","Black",5,90,50,40,100,"ICC");
        Cricket match16 = new Cricket("SouthAfrica","Markram","Rabada",11,"ODI","Johannesburg","SA",50,10,295,5.9,"Boucher","Castle","Green",6,85,45,40,90,"ICC");
        Cricket match17 = new Cricket("SriLanka","Shanaka","Hasaranga",11,"T20","Kandy","SL",20,10,198,9.9,"Silverwood","Dialog","Blue",7,80,40,40,80,"ICC");
        Cricket match18 = new Cricket("Bangladesh","Shanto","Rahim",11,"Test","Chittagong","Bangladesh",90,10,310,3.5,"Hathurusingha","Daraz","Green",8,75,35,40,70,"ICC");
        Cricket match19 = new Cricket("Afghanistan","Rashid","Gurbaz",11,"ODI","Kabul","Afghanistan",50,10,270,5.4,"Trott","Etisalat","Blue",9,70,30,40,60,"ICC");
        Cricket match20 = new Cricket("Ireland","Balbirnie","Adair",11,"T20","Dublin","Ireland",20,10,190,9.5,"White","Guinness","Green",10,65,28,37,56,"ICC");

        System.out.println("Cricket: "+match1.teamName+" "+match1.captain+" "+match1.format+" "+match1.stadium);
        System.out.println("Cricket: "+match2.teamName+" "+match2.captain+" "+match2.format+" "+match2.stadium);
        System.out.println("Cricket: "+match3.teamName+" "+match3.captain+" "+match3.format+" "+match3.stadium);
        System.out.println("Cricket: "+match4.teamName+" "+match4.captain+" "+match4.format+" "+match4.stadium);
        System.out.println("Cricket: "+match5.teamName+" "+match5.captain+" "+match5.format+" "+match5.stadium);
        System.out.println("Cricket: "+match6.teamName+" "+match6.captain+" "+match6.format+" "+match6.stadium);
        System.out.println("Cricket: "+match7.teamName+" "+match7.captain+" "+match7.format+" "+match7.stadium);
        System.out.println("Cricket: "+match8.teamName+" "+match8.captain+" "+match8.format+" "+match8.stadium);
        System.out.println("Cricket: "+match9.teamName+" "+match9.captain+" "+match9.format+" "+match9.stadium);
        System.out.println("Cricket: "+match10.teamName+" "+match10.captain+" "+match10.format+" "+match10.stadium);
        System.out.println("Cricket: "+match11.teamName+" "+match11.captain+" "+match11.format+" "+match11.stadium);
        System.out.println("Cricket: "+match12.teamName+" "+match12.captain+" "+match12.format+" "+match12.stadium);
        System.out.println("Cricket: "+match13.teamName+" "+match13.captain+" "+match13.format+" "+match13.stadium);
        System.out.println("Cricket: "+match14.teamName+" "+match14.captain+" "+match14.format+" "+match14.stadium);
        System.out.println("Cricket: "+match15.teamName+" "+match15.captain+" "+match15.format+" "+match15.stadium);
        System.out.println("Cricket: "+match16.teamName+" "+match16.captain+" "+match16.format+" "+match16.stadium);
        System.out.println("Cricket: "+match17.teamName+" "+match17.captain+" "+match17.format+" "+match17.stadium);
        System.out.println("Cricket: "+match18.teamName+" "+match18.captain+" "+match18.format+" "+match18.stadium);
        System.out.println("Cricket: "+match19.teamName+" "+match19.captain+" "+match19.format+" "+match19.stadium);
        System.out.println("Cricket: "+match20.teamName+" "+match20.captain+" "+match20.format+" "+match20.stadium);

    }
}
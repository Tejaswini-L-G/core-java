class LinkedInRunner {

    public static void main(String[] args) {
		
		Profile p = new Profile(1, "Sundar Pichai", "CEO", "Google", 20);
        LinkedIn l = new LinkedIn(101, "LinkedIn", "California", 2003, "Reid Hoffman", p);
        l.getLinkedInDetails();

        LinkedIn linkedIn1 = new LinkedIn();
        Profile profile1 = new Profile();

        linkedIn1.platformId = 200;
        linkedIn1.company = "LinkedIn";
        linkedIn1.headquarters = "California";
        linkedIn1.foundedYear = 2003;
        linkedIn1.founder = "Reid Hoffman";

        profile1.profileId = 5001;
        profile1.name = "Satya Nadella";
        profile1.designation = "CEO";
        profile1.company = "Microsoft";
        profile1.experienceYears = 30;

        linkedIn1.profile = profile1;
        linkedIn1.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn2 = new LinkedIn();
        Profile profile2 = new Profile();

        linkedIn2.platformId = 200;
        linkedIn2.company = "LinkedIn";
        linkedIn2.headquarters = "California";
        linkedIn2.foundedYear = 2003;
        linkedIn2.founder = "Reid Hoffman";

        profile2.profileId = 5002;
        profile2.name = "Sundar Pichai";
        profile2.designation = "CEO";
        profile2.company = "Google";
        profile2.experienceYears = 25;

        linkedIn2.profile = profile2;
        linkedIn2.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn3 = new LinkedIn();
        Profile profile3 = new Profile();

        linkedIn3.platformId = 200;
        linkedIn3.company = "LinkedIn";
        linkedIn3.headquarters = "California";
        linkedIn3.foundedYear = 2003;
        linkedIn3.founder = "Reid Hoffman";

        profile3.profileId = 5003;
        profile3.name = "Mark Zuckerberg";
        profile3.designation = "CEO";
        profile3.company = "Meta";
        profile3.experienceYears = 20;

        linkedIn3.profile = profile3;
        linkedIn3.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn4 = new LinkedIn();
        Profile profile4 = new Profile();

        linkedIn4.platformId = 200;
        linkedIn4.company = "LinkedIn";
        linkedIn4.headquarters = "California";
        linkedIn4.foundedYear = 2003;
        linkedIn4.founder = "Reid Hoffman";

        profile4.profileId = 5004;
        profile4.name = "Elon Musk";
        profile4.designation = "CEO";
        profile4.company = "Tesla";
        profile4.experienceYears = 22;

        linkedIn4.profile = profile4;
        linkedIn4.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn5 = new LinkedIn();
        Profile profile5 = new Profile();

        linkedIn5.platformId = 200;
        linkedIn5.company = "LinkedIn";
        linkedIn5.headquarters = "California";
        linkedIn5.foundedYear = 2003;
        linkedIn5.founder = "Reid Hoffman";

        profile5.profileId = 5005;
        profile5.name = "Tim Cook";
        profile5.designation = "CEO";
        profile5.company = "Apple";
        profile5.experienceYears = 28;

        linkedIn5.profile = profile5;
        linkedIn5.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn6 = new LinkedIn();
        Profile profile6 = new Profile();

        linkedIn6.platformId = 200;
        linkedIn6.company = "LinkedIn";
        linkedIn6.headquarters = "California";
        linkedIn6.foundedYear = 2003;
        linkedIn6.founder = "Reid Hoffman";

        profile6.profileId = 5006;
        profile6.name = "Shantanu Narayen";
        profile6.designation = "CEO";
        profile6.company = "Adobe";
        profile6.experienceYears = 27;

        linkedIn6.profile = profile6;
        linkedIn6.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn7 = new LinkedIn();
        Profile profile7 = new Profile();

        linkedIn7.platformId = 200;
        linkedIn7.company = "LinkedIn";
        linkedIn7.headquarters = "California";
        linkedIn7.foundedYear = 2003;
        linkedIn7.founder = "Reid Hoffman";

        profile7.profileId = 5007;
        profile7.name = "Arvind Krishna";
        profile7.designation = "CEO";
        profile7.company = "IBM";
        profile7.experienceYears = 32;

        linkedIn7.profile = profile7;
        linkedIn7.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn8 = new LinkedIn();
        Profile profile8 = new Profile();

        linkedIn8.platformId = 200;
        linkedIn8.company = "LinkedIn";
        linkedIn8.headquarters = "California";
        linkedIn8.foundedYear = 2003;
        linkedIn8.founder = "Reid Hoffman";

        profile8.profileId = 5008;
        profile8.name = "Andy Jassy";
        profile8.designation = "CEO";
        profile8.company = "Amazon";
        profile8.experienceYears = 25;

        linkedIn8.profile = profile8;
        linkedIn8.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn9 = new LinkedIn();
        Profile profile9 = new Profile();

        linkedIn9.platformId = 200;
        linkedIn9.company = "LinkedIn";
        linkedIn9.headquarters = "California";
        linkedIn9.foundedYear = 2003;
        linkedIn9.founder = "Reid Hoffman";

        profile9.profileId = 5009;
        profile9.name = "Susan Wojcicki";
        profile9.designation = "Executive";
        profile9.company = "YouTube";
        profile9.experienceYears = 20;

        linkedIn9.profile = profile9;
        linkedIn9.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn10 = new LinkedIn();
        Profile profile10 = new Profile();

        linkedIn10.platformId = 200;
        linkedIn10.company = "LinkedIn";
        linkedIn10.headquarters = "California";
        linkedIn10.foundedYear = 2003;
        linkedIn10.founder = "Reid Hoffman";

        profile10.profileId = 5010;
        profile10.name = "Reed Hastings";
        profile10.designation = "CEO";
        profile10.company = "Netflix";
        profile10.experienceYears = 30;

        linkedIn10.profile = profile10;
        linkedIn10.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn11 = new LinkedIn();
        Profile profile11 = new Profile();

        linkedIn11.platformId = 200;
        linkedIn11.company = "LinkedIn";
        linkedIn11.headquarters = "California";
        linkedIn11.foundedYear = 2003;
        linkedIn11.founder = "Reid Hoffman";

        profile11.profileId = 5011;
        profile11.name = "Brian Chesky";
        profile11.designation = "CEO";
        profile11.company = "Airbnb";
        profile11.experienceYears = 18;

        linkedIn11.profile = profile11;
        linkedIn11.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn12 = new LinkedIn();
        Profile profile12 = new Profile();

        linkedIn12.platformId = 200;
        linkedIn12.company = "LinkedIn";
        linkedIn12.headquarters = "California";
        linkedIn12.foundedYear = 2003;
        linkedIn12.founder = "Reid Hoffman";

        profile12.profileId = 5012;
        profile12.name = "Jack Dorsey";
        profile12.designation = "Founder";
        profile12.company = "Twitter";
        profile12.experienceYears = 20;

        linkedIn12.profile = profile12;
        linkedIn12.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn13 = new LinkedIn();
        Profile profile13 = new Profile();

        linkedIn13.platformId = 200;
        linkedIn13.company = "LinkedIn";
        linkedIn13.headquarters = "California";
        linkedIn13.foundedYear = 2003;
        linkedIn13.founder = "Reid Hoffman";

        profile13.profileId = 5013;
        profile13.name = "Daniel Ek";
        profile13.designation = "CEO";
        profile13.company = "Spotify";
        profile13.experienceYears = 18;

        linkedIn13.profile = profile13;
        linkedIn13.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn14 = new LinkedIn();
        Profile profile14 = new Profile();

        linkedIn14.platformId = 200;
        linkedIn14.company = "LinkedIn";
        linkedIn14.headquarters = "California";
        linkedIn14.foundedYear = 2003;
        linkedIn14.founder = "Reid Hoffman";

        profile14.profileId = 5014;
        profile14.name = "Dara Khosrowshahi";
        profile14.designation = "CEO";
        profile14.company = "Uber";
        profile14.experienceYears = 24;

        linkedIn14.profile = profile14;
        linkedIn14.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn15 = new LinkedIn();
        Profile profile15 = new Profile();

        linkedIn15.platformId = 200;
        linkedIn15.company = "LinkedIn";
        linkedIn15.headquarters = "California";
        linkedIn15.foundedYear = 2003;
        linkedIn15.founder = "Reid Hoffman";

        profile15.profileId = 5015;
        profile15.name = "Jensen Huang";
        profile15.designation = "CEO";
        profile15.company = "Nvidia";
        profile15.experienceYears = 30;

        linkedIn15.profile = profile15;
        linkedIn15.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn16 = new LinkedIn();
        Profile profile16 = new Profile();

        linkedIn16.platformId = 200;
        linkedIn16.company = "LinkedIn";
        linkedIn16.headquarters = "California";
        linkedIn16.foundedYear = 2003;
        linkedIn16.founder = "Reid Hoffman";

        profile16.profileId = 5016;
        profile16.name = "Lisa Su";
        profile16.designation = "CEO";
        profile16.company = "AMD";
        profile16.experienceYears = 26;

        linkedIn16.profile = profile16;
        linkedIn16.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn17 = new LinkedIn();
        Profile profile17 = new Profile();

        linkedIn17.platformId = 200;
        linkedIn17.company = "LinkedIn";
        linkedIn17.headquarters = "California";
        linkedIn17.foundedYear = 2003;
        linkedIn17.founder = "Reid Hoffman";

        profile17.profileId = 5017;
        profile17.name = "Parag Agrawal";
        profile17.designation = "Engineer";
        profile17.company = "Twitter";
        profile17.experienceYears = 12;

        linkedIn17.profile = profile17;
        linkedIn17.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn18 = new LinkedIn();
        Profile profile18 = new Profile();

        linkedIn18.platformId = 200;
        linkedIn18.company = "LinkedIn";
        linkedIn18.headquarters = "California";
        linkedIn18.foundedYear = 2003;
        linkedIn18.founder = "Reid Hoffman";

        profile18.profileId = 5018;
        profile18.name = "Kevin Systrom";
        profile18.designation = "Founder";
        profile18.company = "Instagram";
        profile18.experienceYears = 15;

        linkedIn18.profile = profile18;
        linkedIn18.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn19 = new LinkedIn();
        Profile profile19 = new Profile();

        linkedIn19.platformId = 200;
        linkedIn19.company = "LinkedIn";
        linkedIn19.headquarters = "California";
        linkedIn19.foundedYear = 2003;
        linkedIn19.founder = "Reid Hoffman";

        profile19.profileId = 5019;
        profile19.name = "Jan Koum";
        profile19.designation = "Founder";
        profile19.company = "WhatsApp";
        profile19.experienceYears = 18;

        linkedIn19.profile = profile19;
        linkedIn19.getLinkedInDetails();

        System.out.println("------------------------");

        LinkedIn linkedIn20 = new LinkedIn();
        Profile profile20 = new Profile();

        linkedIn20.platformId = 200;
        linkedIn20.company = "LinkedIn";
        linkedIn20.headquarters = "California";
        linkedIn20.foundedYear = 2003;
        linkedIn20.founder = "Reid Hoffman";

        profile20.profileId = 5020;
        profile20.name = "Melanie Perkins";
        profile20.designation = "CEO";
        profile20.company = "Canva";
        profile20.experienceYears = 14;

        linkedIn20.profile = profile20;
        linkedIn20.getLinkedInDetails();

        System.out.println("------------------------");
    }
}
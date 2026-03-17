class TrainRunner {

    public static void main(String[] args) {
		
		
		Boggy boggy = new Boggy(101, "Sleeper", 72, "Blue", "AC");

        Train train = new Train(
                1,
                "Shatabdi Express",
                "Bangalore",
                "Mysore",
                18,
                boggy
        );

        train.getTrainDetails();


        Train train1 = new Train();
        Boggy boggy1 = new Boggy();
        train1.trainId = 101;
        train1.trainName = "Express1";
        train1.source = "Bangalore";
        train1.destination = "Mysore";
        train1.totalCoaches = 12;

        boggy1.boggyId = 201;
        boggy1.boggyType = "Sleeper";
        boggy1.seatCount = 72;
        boggy1.boggyColor = "Blue";
        boggy1.boggyClass = "AC";

        train1.boggy = boggy1;
        train1.getTrainDetails();

        System.out.println("----------------");

        Train train2 = new Train();
        Boggy boggy2 = new Boggy();
        train2.trainId = 102;
        train2.trainName = "Express2";
        train2.source = "Delhi";
        train2.destination = "Mumbai";
        train2.totalCoaches = 14;

        boggy2.boggyId = 202;
        boggy2.boggyType = "General";
        boggy2.seatCount = 90;
        boggy2.boggyColor = "Green";
        boggy2.boggyClass = "Non AC";

        train2.boggy = boggy2;
        train2.getTrainDetails();

        System.out.println("----------------");

        Train train3 = new Train();
        Boggy boggy3 = new Boggy();
        train3.trainId = 103;
        train3.trainName = "Express3";
        train3.source = "Chennai";
        train3.destination = "Hyderabad";
        train3.totalCoaches = 16;

        boggy3.boggyId = 203;
        boggy3.boggyType = "Sleeper";
        boggy3.seatCount = 72;
        boggy3.boggyColor = "Red";
        boggy3.boggyClass = "AC";

        train3.boggy = boggy3;
        train3.getTrainDetails();

        System.out.println("----------------");

        Train train4 = new Train();
        Boggy boggy4 = new Boggy();
        train4.trainId = 104;
        train4.trainName = "Express4";
        train4.source = "Kolkata";
        train4.destination = "Delhi";
        train4.totalCoaches = 15;

        boggy4.boggyId = 204;
        boggy4.boggyType = "ChairCar";
        boggy4.seatCount = 60;
        boggy4.boggyColor = "Blue";
        boggy4.boggyClass = "AC";

        train4.boggy = boggy4;
        train4.getTrainDetails();

        System.out.println("----------------");

        Train train5 = new Train();
        Boggy boggy5 = new Boggy();
        train5.trainId = 105;
        train5.trainName = "Express5";
        train5.source = "Pune";
        train5.destination = "Goa";
        train5.totalCoaches = 10;

        boggy5.boggyId = 205;
        boggy5.boggyType = "Sleeper";
        boggy5.seatCount = 72;
        boggy5.boggyColor = "Yellow";
        boggy5.boggyClass = "AC";

        train5.boggy = boggy5;
        train5.getTrainDetails();

        System.out.println("----------------");

        Train train6 = new Train();
        Boggy boggy6 = new Boggy();
        train6.trainId = 106;
        train6.trainName = "Express6";
        train6.source = "Bhopal";
        train6.destination = "Indore";
        train6.totalCoaches = 9;

        boggy6.boggyId = 206;
        boggy6.boggyType = "General";
        boggy6.seatCount = 90;
        boggy6.boggyColor = "Green";
        boggy6.boggyClass = "Non AC";

        train6.boggy = boggy6;
        train6.getTrainDetails();

        System.out.println("----------------");

        Train train7 = new Train();
        Boggy boggy7 = new Boggy();
        train7.trainId = 107;
        train7.trainName = "Express7";
        train7.source = "Jaipur";
        train7.destination = "Udaipur";
        train7.totalCoaches = 11;

        boggy7.boggyId = 207;
        boggy7.boggyType = "ChairCar";
        boggy7.seatCount = 60;
        boggy7.boggyColor = "White";
        boggy7.boggyClass = "AC";

        train7.boggy = boggy7;
        train7.getTrainDetails();

        System.out.println("----------------");

        Train train8 = new Train();
        Boggy boggy8 = new Boggy();
        train8.trainId = 108;
        train8.trainName = "Express8";
        train8.source = "Ahmedabad";
        train8.destination = "Surat";
        train8.totalCoaches = 8;

        boggy8.boggyId = 208;
        boggy8.boggyType = "Sleeper";
        boggy8.seatCount = 72;
        boggy8.boggyColor = "Blue";
        boggy8.boggyClass = "AC";

        train8.boggy = boggy8;
        train8.getTrainDetails();

        System.out.println("----------------");

        Train train9 = new Train();
        Boggy boggy9 = new Boggy();
        train9.trainId = 109;
        train9.trainName = "Express9";
        train9.source = "Lucknow";
        train9.destination = "Kanpur";
        train9.totalCoaches = 7;

        boggy9.boggyId = 209;
        boggy9.boggyType = "General";
        boggy9.seatCount = 90;
        boggy9.boggyColor = "Grey";
        boggy9.boggyClass = "Non AC";

        train9.boggy = boggy9;
        train9.getTrainDetails();

        System.out.println("----------------");

        Train train10 = new Train();
        Boggy boggy10 = new Boggy();
        train10.trainId = 110;
        train10.trainName = "Express10";
        train10.source = "Patna";
        train10.destination = "Varanasi";
        train10.totalCoaches = 12;

        boggy10.boggyId = 210;
        boggy10.boggyType = "Sleeper";
        boggy10.seatCount = 72;
        boggy10.boggyColor = "Blue";
        boggy10.boggyClass = "AC";

        train10.boggy = boggy10;
        train10.getTrainDetails();

                System.out.println("----------------");

        Train train11 = new Train();
        Boggy boggy11 = new Boggy();
        train11.trainId = 111;
        train11.trainName = "Express11";
        train11.source = "Nagpur";
        train11.destination = "Pune";
        train11.totalCoaches = 13;

        boggy11.boggyId = 211;
        boggy11.boggyType = "Sleeper";
        boggy11.seatCount = 72;
        boggy11.boggyColor = "Blue";
        boggy11.boggyClass = "AC";

        train11.boggy = boggy11;
        train11.getTrainDetails();

        System.out.println("----------------");

        Train train12 = new Train();
        Boggy boggy12 = new Boggy();
        train12.trainId = 112;
        train12.trainName = "Express12";
        train12.source = "Chandigarh";
        train12.destination = "Amritsar";
        train12.totalCoaches = 10;

        boggy12.boggyId = 212;
        boggy12.boggyType = "ChairCar";
        boggy12.seatCount = 60;
        boggy12.boggyColor = "White";
        boggy12.boggyClass = "AC";

        train12.boggy = boggy12;
        train12.getTrainDetails();

        System.out.println("----------------");

        Train train13 = new Train();
        Boggy boggy13 = new Boggy();
        train13.trainId = 113;
        train13.trainName = "Express13";
        train13.source = "Coimbatore";
        train13.destination = "Chennai";
        train13.totalCoaches = 14;

        boggy13.boggyId = 213;
        boggy13.boggyType = "Sleeper";
        boggy13.seatCount = 72;
        boggy13.boggyColor = "Red";
        boggy13.boggyClass = "AC";

        train13.boggy = boggy13;
        train13.getTrainDetails();

        System.out.println("----------------");

        Train train14 = new Train();
        Boggy boggy14 = new Boggy();
        train14.trainId = 114;
        train14.trainName = "Express14";
        train14.source = "Madurai";
        train14.destination = "Trichy";
        train14.totalCoaches = 9;

        boggy14.boggyId = 214;
        boggy14.boggyType = "General";
        boggy14.seatCount = 90;
        boggy14.boggyColor = "Green";
        boggy14.boggyClass = "Non AC";

        train14.boggy = boggy14;
        train14.getTrainDetails();

        System.out.println("----------------");

        Train train15 = new Train();
        Boggy boggy15 = new Boggy();
        train15.trainId = 115;
        train15.trainName = "Express15";
        train15.source = "Hubli";
        train15.destination = "Bangalore";
        train15.totalCoaches = 12;

        boggy15.boggyId = 215;
        boggy15.boggyType = "Sleeper";
        boggy15.seatCount = 72;
        boggy15.boggyColor = "Blue";
        boggy15.boggyClass = "AC";

        train15.boggy = boggy15;
        train15.getTrainDetails();

        System.out.println("----------------");

        Train train16 = new Train();
        Boggy boggy16 = new Boggy();
        train16.trainId = 116;
        train16.trainName = "Express16";
        train16.source = "Mangalore";
        train16.destination = "Udupi";
        train16.totalCoaches = 8;

        boggy16.boggyId = 216;
        boggy16.boggyType = "ChairCar";
        boggy16.seatCount = 60;
        boggy16.boggyColor = "Yellow";
        boggy16.boggyClass = "AC";

        train16.boggy = boggy16;
        train16.getTrainDetails();

        System.out.println("----------------");

        Train train17 = new Train();
        Boggy boggy17 = new Boggy();
        train17.trainId = 117;
        train17.trainName = "Express17";
        train17.source = "Salem";
        train17.destination = "Erode";
        train17.totalCoaches = 7;

        boggy17.boggyId = 217;
        boggy17.boggyType = "General";
        boggy17.seatCount = 90;
        boggy17.boggyColor = "Grey";
        boggy17.boggyClass = "Non AC";

        train17.boggy = boggy17;
        train17.getTrainDetails();

        System.out.println("----------------");

        Train train18 = new Train();
        Boggy boggy18 = new Boggy();
        train18.trainId = 118;
        train18.trainName = "Express18";
        train18.source = "Kochi";
        train18.destination = "Trivandrum";
        train18.totalCoaches = 10;

        boggy18.boggyId = 218;
        boggy18.boggyType = "Sleeper";
        boggy18.seatCount = 72;
        boggy18.boggyColor = "Blue";
        boggy18.boggyClass = "AC";

        train18.boggy = boggy18;
        train18.getTrainDetails();

        System.out.println("----------------");

        Train train19 = new Train();
        Boggy boggy19 = new Boggy();
        train19.trainId = 119;
        train19.trainName = "Express19";
        train19.source = "Vizag";
        train19.destination = "Vijayawada";
        train19.totalCoaches = 11;

        boggy19.boggyId = 219;
        boggy19.boggyType = "Sleeper";
        boggy19.seatCount = 72;
        boggy19.boggyColor = "Blue";
        boggy19.boggyClass = "AC";

        train19.boggy = boggy19;
        train19.getTrainDetails();

        System.out.println("----------------");

        Train train20 = new Train();
        Boggy boggy20 = new Boggy();
        train20.trainId = 120;
        train20.trainName = "Express20";
        train20.source = "Guntur";
        train20.destination = "Nellore";
        train20.totalCoaches = 9;

        boggy20.boggyId = 220;
        boggy20.boggyType = "General";
        boggy20.seatCount = 90;
        boggy20.boggyColor = "Green";
        boggy20.boggyClass = "Non AC";

        train20.boggy = boggy20;
        train20.getTrainDetails();

    }

}
class PlaystoreExecutor {

    public static void main(String[] args) {

        boolean appValid;

        System.out.println("Scenario 1");
        appValid = Playstore.createApp(
                "WhatsApp", "Meta", "Communication",
                "2.24.1", 85, 500000000, 5);
        if (appValid) Playstore.getAppDetails();

        System.out.println("\nScenario 2");
        appValid = Playstore.createApp(
                "", "Google", "Productivity",
                "1.0", 25, 1000000, 4);
        if (appValid) Playstore.getAppDetails();

        System.out.println("\nScenario 3");
        appValid = Playstore.createApp(
                "Instagram", "", "Social",
                "3.1", 120, 300000000, 5);
        if (appValid) Playstore.getAppDetails();

        System.out.println("\nScenario 4");
        appValid = Playstore.createApp(
                "Spotify", "Spotify Ltd", "",
                "8.9", 95, 200000000, 5);
        if (appValid) Playstore.getAppDetails();

        System.out.println("\nScenario 5");
        appValid = Playstore.createApp(
                "Zoom", "Zoom Inc", "Communication",
                "", 60, 100000000, 4);
        if (appValid) Playstore.getAppDetails();

        System.out.println("\nScenario 6");
        appValid = Playstore.createApp(
                "Snapchat", "Snap Inc", "Social",
                "12.0", 0, 150000000, 4);
        if (appValid) Playstore.getAppDetails();

        System.out.println("\nScenario 7");
        appValid = Playstore.createApp(
                "Telegram", "Telegram FZ", "Communication",
                "10.2", 70, 0, 5);
        if (appValid) Playstore.getAppDetails();

        System.out.println("\nScenario 8");
        appValid = Playstore.createApp(
                "YouTube", "Google", "Entertainment",
                "19.5", 130, 1000000000, 5);
        if (appValid) Playstore.getAppDetails();
    }
}
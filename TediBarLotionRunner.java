class TediBarLotionRunner {
    public static void main(String[] args) {

        TediBarLotion babyLotion = new TediBarLotion();
        TediBarLotion premiumLotion = new TediBarLotion("Tedibar Plus", 350);
        TediBarLotion dailyLotion = new TediBarLotion();
        TediBarLotion herbalLotion = new TediBarLotion("HerbalCare", 400);
        TediBarLotion softLotion = new TediBarLotion();

        babyLotion.getDetails();
        premiumLotion.getDetails();
        dailyLotion.getDetails();
        herbalLotion.getDetails();
        softLotion.getDetails();
    }
}
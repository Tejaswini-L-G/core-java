class LionDatesRunner{
    public static void main(String[] args){
        LionDates premiumDates=new LionDates();
        LionDates giftDates=new LionDates("RoyalDates",500);
        LionDates dailyDates=new LionDates();
        LionDates organicDates=new LionDates("OrganicDates",700);
        LionDates bulkDates=new LionDates();

        premiumDates.getDetails();
        giftDates.getDetails();
        dailyDates.getDetails();
        organicDates.getDetails();
        bulkDates.getDetails();
    }
}
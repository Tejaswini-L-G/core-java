class BedSheetRunner{
    public static void main(String[] args){
        BedSheet homeSheet=new BedSheet();
        BedSheet luxurySheet=new BedSheet("DDecor",2500);
        BedSheet guestSheet=new BedSheet();
        BedSheet silkSheet=new BedSheet("SilkHome",3000);
        BedSheet cottonSheet=new BedSheet();

        homeSheet.getDetails();
        luxurySheet.getDetails();
        guestSheet.getDetails();
        silkSheet.getDetails();
        cottonSheet.getDetails();
    }
}
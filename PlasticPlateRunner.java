class PlasticPlateRunner{
    public static void main(String[] args){
        PlasticPlate homePlate=new PlasticPlate();
        PlasticPlate partyPlate=new PlasticPlate("PartyServe",300);
        PlasticPlate dailyPlate=new PlasticPlate();
        PlasticPlate premiumPlate=new PlasticPlate("PremiumServe",500);
        PlasticPlate travelPlate=new PlasticPlate();

        homePlate.getDetails();
        partyPlate.getDetails();
        dailyPlate.getDetails();
        premiumPlate.getDetails();
        travelPlate.getDetails();
    }
}
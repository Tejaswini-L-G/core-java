class MedicalShopRunner{
    public static void main(String[] args){
        MedicalShop mainShop=new MedicalShop();
        MedicalShop cityShop=new MedicalShop("CityMed",300000);
        MedicalShop ruralShop=new MedicalShop();
        MedicalShop premiumShop=new MedicalShop("PremiumMed",700000);
        MedicalShop smallShop=new MedicalShop();

        mainShop.getDetails();
        cityShop.getDetails();
        ruralShop.getDetails();
        premiumShop.getDetails();
        smallShop.getDetails();
    }
}
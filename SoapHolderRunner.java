class SoapHolderRunner{
    public static void main(String[] args){
        SoapHolder homeHolder=new SoapHolder();
        SoapHolder steelHolder=new SoapHolder("SteelPro",300);
        SoapHolder travelHolder=new SoapHolder();
        SoapHolder premiumHolder=new SoapHolder("LuxHold",500);
        SoapHolder basicHolder=new SoapHolder();

        homeHolder.getDetails();
        steelHolder.getDetails();
        travelHolder.getDetails();
        premiumHolder.getDetails();
        basicHolder.getDetails();
    }
}
class CombRunner{
    public static void main(String[] args){
        Comb dailyComb=new Comb();
        Comb premiumComb=new Comb("VegaPro",100);
        Comb travelComb=new Comb();
        Comb woodenComb=new Comb("WoodComb",150);
        Comb stylingComb=new Comb();

        dailyComb.getDetails();
        premiumComb.getDetails();
        travelComb.getDetails();
        woodenComb.getDetails();
        stylingComb.getDetails();
    }
}
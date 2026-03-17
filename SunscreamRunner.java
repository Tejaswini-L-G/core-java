class SunscreamRunner{
    public static void main(String[] args){
        Sunscream dailyCream=new Sunscream();
        Sunscream premiumCream=new Sunscream("Lakme",500);
        Sunscream travelCream=new Sunscream();
        Sunscream gelCream=new Sunscream("Lotus",400);
        Sunscream sportCream=new Sunscream();

        dailyCream.getDetails();
        premiumCream.getDetails();
        travelCream.getDetails();
        gelCream.getDetails();
        sportCream.getDetails();
    }
}
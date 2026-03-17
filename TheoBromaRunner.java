class TheoBromaRunner{
    public static void main(String[] args){
        TheoBroma birthdayCake=new TheoBroma();
        TheoBroma pastryOrder=new TheoBroma("TheoBroma",300);
        TheoBroma customCake=new TheoBroma();
        TheoBroma chocolateCake=new TheoBroma("TheoBromaSpecial",1000);
        TheoBroma snackOrder=new TheoBroma();

        birthdayCake.getDetails();
        pastryOrder.getDetails();
        customCake.getDetails();
        chocolateCake.getDetails();
        snackOrder.getDetails();
    }
}
class PsFiveExecutor {

    public static void main(String[] args) {

        boolean psFiveValid;

        psFiveValid = PsFive.createPsFive("Sony","Digital","White","SSD",825,1,50000,1);
        if(psFiveValid) PsFive.getPsFiveDetails();

        psFiveValid = PsFive.createPsFive("","Disc","Black","SSD",1000,2,60000,1);
        if(psFiveValid) PsFive.getPsFiveDetails();

        psFiveValid = PsFive.createPsFive("Sony","Slim","White","SSD",0,2,55000,1);
        if(psFiveValid) PsFive.getPsFiveDetails();
    }
}
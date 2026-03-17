class PaperCupsRunner{
    public static void main(String[] args){
        PaperCups teaCups=new PaperCups();
        PaperCups coffeeCups=new PaperCups("CafeCup",200);
        PaperCups partyCups=new PaperCups();
        PaperCups ecoCups=new PaperCups("EcoPlus",250);
        PaperCups travelCups=new PaperCups();

        teaCups.getDetails();
        coffeeCups.getDetails();
        partyCups.getDetails();
        ecoCups.getDetails();
        travelCups.getDetails();
    }
}
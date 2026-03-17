class ComedyShowRunner{
    public static void main(String[] args){
        ComedyShow liveShow=new ComedyShow();
        ComedyShow onlineShow=new ComedyShow("FunNight",300);
        ComedyShow weekendShow=new ComedyShow();
        ComedyShow premiumShow=new ComedyShow("VIPComedy",800);
        ComedyShow clubShow=new ComedyShow();

        liveShow.getDetails();
        onlineShow.getDetails();
        weekendShow.getDetails();
        premiumShow.getDetails();
        clubShow.getDetails();
    }
}
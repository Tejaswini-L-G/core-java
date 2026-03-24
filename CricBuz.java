class CricBuz {
    private String teamNames[] = new String[8];
    int index;

    public boolean addTeamnames(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<8){
                teamNames[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getTeamnames(){
        System.out.println("CricBuz Data:");
        for(String item:teamNames){if(item!=null)System.out.println(item);}
    }
}

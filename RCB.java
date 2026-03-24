class RCB {
    private String playerNames[] = new String[15];
    int index;

    public boolean addPlayernames(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<15){
                playerNames[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getPlayernames(){
        System.out.println("RCB Data:");
        for(String item:playerNames){if(item!=null)System.out.println(item);}
    }
}

class State {
    private String highwayNames[] = new String[9];
    int index;

    public boolean addHighwaynames(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<9){
                highwayNames[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getHighwaynames(){
        System.out.println("State Data:");
        for(String item:highwayNames){if(item!=null)System.out.println(item);}
    }
}

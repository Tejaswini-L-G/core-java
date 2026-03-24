class Museum {
    private String historicalMonuments[] = new String[16];
    int index;

    public boolean addHistoricalmonuments(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<16){
                historicalMonuments[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getHistoricalmonuments(){
        System.out.println("Museum Data:");
        for(String item:historicalMonuments){if(item!=null)System.out.println(item);}
    }
}

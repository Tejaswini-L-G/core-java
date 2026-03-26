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
	
	public String getHistoricalMonumentsByIndex(int index){
    String name=null;
    if(index<historicalMonuments.length){
        name=historicalMonuments[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByHistoricalMonuments(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:historicalMonuments){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Monument not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}
}

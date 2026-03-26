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
	
	public String getHighwayNamesByIndex(int index){
    String name=null;
    if(index<highwayNames.length){
        name=highwayNames[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByHighwayNames(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:highwayNames){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Highway not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}
}

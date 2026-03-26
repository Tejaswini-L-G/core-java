class Television {
    private String channelNames[] = new String[17];
    int index;

    public boolean addChannelnames(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<17){
                channelNames[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getChannelnames(){
        System.out.println("Television Data:");
        for(String item:channelNames){if(item!=null)System.out.println(item);}
    }
	
	public String getChannelNamesByIndex(int index){
    String name=null;
    if(index<channelNames.length){
        name=channelNames[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByChannelNames(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:channelNames){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Channel not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}
}

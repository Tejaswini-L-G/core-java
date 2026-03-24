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
}

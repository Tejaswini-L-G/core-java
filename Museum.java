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

public boolean updateHistoricalMonuments(String existingName,String updatedName){
    boolean isUpdated=false;
    if(updatedName!=null && !updatedName.isEmpty()){
        for(int index=0; index<historicalMonuments.length; index++){
            if(historicalMonuments[index]==existingName){
                historicalMonuments[index]=updatedName;
                isUpdated=true;
            }
        }
        if(!isUpdated){
            System.out.println(existingName+" is not found");
        }
    }else{
        System.out.println("Provide valid name for update");
    }
    return isUpdated;
}

public boolean deleteHistoricalMonuments(String name){
    boolean isDeleted=false;

    if(name!=null && !name.isEmpty()){
        for(int index=0; index<historicalMonuments.length; index++){
            if(historicalMonuments[index]!=null && historicalMonuments[index]==name){
                historicalMonuments[index]=null;
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted){
            System.out.println(name+" is not found");
        }
    }else{
        System.out.println("Provide valid name");
    }
    return isDeleted;
}
}

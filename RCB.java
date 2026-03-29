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
	
	public String getPlayerNamesByIndex(int index){
    String name=null;
    if(index<playerNames.length){
        name=playerNames[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByPlayerNames(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:playerNames){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Player not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}

public boolean updatePlayerNames(String existingName,String updatedName){
    boolean isUpdated=false;
    if(updatedName!=null && !updatedName.isEmpty()){
        for(int index=0; index<playerNames.length; index++){
            if(playerNames[index]==existingName){
                playerNames[index]=updatedName;
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

public boolean deletePlayerNames(String name){
    boolean isDeleted=false;

    if(name!=null && !name.isEmpty()){
        for(int index=0; index<playerNames.length; index++){
            if(playerNames[index]!=null && playerNames[index]==name){
                playerNames[index]=null;
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

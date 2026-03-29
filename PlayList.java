class PlayList {
    private String songNames[] = new String[15];
    int index;

    public boolean addSongnames(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<15){
                songNames[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getSongnames(){
        System.out.println("PlayList Data:");
        for(String item:songNames){if(item!=null)System.out.println(item);}
    }
	
	public String getSongNamesByIndex(int index){
    String name=null;
    if(index<songNames.length){
        name=songNames[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexBySongNames(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:songNames){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Song not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}

public boolean updateSongNames(String existingName,String updatedName){
    boolean isUpdated=false;

    if(updatedName!=null && !updatedName.isEmpty()){
        for(int index=0; index<songNames.length; index++){
            if(songNames[index]==existingName){
                songNames[index]=updatedName;
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

public boolean deleteSongNames(String name){
    boolean isDeleted=false;

    if(name!=null && !name.isEmpty()){
        for(int index=0; index<songNames.length; index++){
            if(songNames[index]!=null && songNames[index]==name){
                songNames[index]=null;
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

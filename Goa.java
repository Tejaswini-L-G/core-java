class Goa {
    private String beachNames[] = new String[19];
    int index;

    public boolean addBeachnames(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<19){
                beachNames[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getBeachnames(){
        System.out.println("Goa Data:");
        for(String item:beachNames){if(item!=null)System.out.println(item);}
    }
	
	public String getBeachNamesByIndex(int index){
    String name=null;
    if(index<beachNames.length){
        name=beachNames[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByBeachNames(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:beachNames){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Beach not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}

public boolean updateBeachNames(String existingName,String updatedName){
    boolean isUpdated=false;
    if(updatedName!=null && !updatedName.isEmpty()){
        for(int index=0; index<beachNames.length; index++){
            if(beachNames[index]==existingName){
                beachNames[index]=updatedName;
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

public boolean deleteBeachNames(String name){
    boolean isDeleted=false;

    if(name!=null && !name.isEmpty()){
        for(int index=0; index<beachNames.length; index++){
            if(beachNames[index]!=null && beachNames[index]==name){
                beachNames[index]=null;
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

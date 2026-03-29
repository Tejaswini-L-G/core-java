class Architect {
    private String interiorDesignNames[] = new String[11];
    int index;

    public boolean addInteriordesignnames(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<11){
                interiorDesignNames[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getInteriordesignnames(){
        System.out.println("Architect Data:");
        for(String item:interiorDesignNames){if(item!=null)System.out.println(item);}
    }
	
	public String getInteriorDesignNamesByIndex(int index){
    String name=null;
    if(index<interiorDesignNames.length){
        name=interiorDesignNames[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByInteriorDesignNames(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:interiorDesignNames){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Design not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}

public boolean updateInteriorDesignNames(String existingName,String updatedName){
    boolean isUpdated=false;
    if(updatedName!=null && !updatedName.isEmpty()){
        for(int index=0; index<interiorDesignNames.length; index++){
            if(interiorDesignNames[index]==existingName){
                interiorDesignNames[index]=updatedName;
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

public boolean deleteInteriorDesignNames(String name){
    boolean isDeleted=false;

    if(name!=null && !name.isEmpty()){
        for(int index=0; index<interiorDesignNames.length; index++){
            if(interiorDesignNames[index]!=null && interiorDesignNames[index]==name){
                interiorDesignNames[index]=null;
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

class PetShop {
    private String petAccessories[] = new String[20];
    int index;

    public boolean addPetaccessories(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<20){
                petAccessories[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getPetaccessories(){
        System.out.println("PetShop Data:");
        for(String item:petAccessories){if(item!=null)System.out.println(item);}
    }
	
	public String getPetAccessoriesByIndex(int index){
    String name=null;
    if(index<petAccessories.length){
        name=petAccessories[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByPetAccessories(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:petAccessories){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Accessory not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}

public boolean updatePetAccessories(String existingName,String updatedName){
    boolean isUpdated=false;
    if(updatedName!=null && !updatedName.isEmpty()){
        for(int index=0; index<petAccessories.length; index++){
            if(petAccessories[index]==existingName){
                petAccessories[index]=updatedName;
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

public boolean deletePetAccessories(String name){
    boolean isDeleted=false;

    if(name!=null && !name.isEmpty()){
        for(int index=0; index<petAccessories.length; index++){
            if(petAccessories[index]!=null && petAccessories[index]==name){
                petAccessories[index]=null;
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

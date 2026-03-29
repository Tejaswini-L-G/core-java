class Phonepe {
    private String insuranceNames[] = new String[27];
    int index;

    public boolean addInsurancenames(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<27){
                insuranceNames[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getInsurancenames(){
        System.out.println("Phonepe Data:");
        for(String item:insuranceNames){if(item!=null)System.out.println(item);}
    }
	
	public String getInsuranceNamesByIndex(int index){
    String name=null;
    if(index<insuranceNames.length){
        name=insuranceNames[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByInsuranceNames(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:insuranceNames){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Insurance not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}

public boolean updateInsuranceNames(String existingName,String updatedName){
    boolean isUpdated=false;

    if(updatedName!=null && !updatedName.isEmpty()){
        for(int index=0; index<insuranceNames.length; index++){
            if(insuranceNames[index]==existingName){
                insuranceNames[index]=updatedName;
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

public boolean deleteInsuranceNames(String name){
    boolean isDeleted=false;

    if(name!=null && !name.isEmpty()){
        for(int index=0; index<insuranceNames.length; index++){
            if(insuranceNames[index]!=null && insuranceNames[index]==name){
                insuranceNames[index]=null;
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

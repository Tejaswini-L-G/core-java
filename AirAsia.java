class AirAsia {
    private String passengers[] = new String[30];
    int index;

    public boolean addPassengers(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<30){
                passengers[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getPassengers(){
        System.out.println("AirAsia Data:");
        for(String item:passengers){if(item!=null)System.out.println(item);}
    }
	
	public String getPassengersByIndex(int index){
    String name=null;
    if(index<passengers.length){
        name=passengers[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByPassengers(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:passengers){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Passenger not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}

public boolean updatePassengers(String existingName,String updatedName){
    boolean isUpdated=false;
    if(updatedName!=null && !updatedName.isEmpty()){
        for(int index=0; index<passengers.length; index++){
            if(passengers[index]==existingName){
                passengers[index]=updatedName;
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

public boolean deletePassengers(String name){
    boolean isDeleted=false;

    if(name!=null && !name.isEmpty()){
        for(int index=0; index<passengers.length; index++){
            if(passengers[index]!=null && passengers[index]==name){
                passengers[index]=null;
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

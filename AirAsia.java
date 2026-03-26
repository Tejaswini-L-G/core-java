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
}

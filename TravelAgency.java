class TravelAgency {
    private String places[] = new String[17];
    int index;

    public boolean addPlaces(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<17){
                places[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getPlaces(){
        System.out.println("TravelAgency Data:");
        for(String item:places){if(item!=null)System.out.println(item);}
    }
	
	public String getPlacesByIndex(int index){
    String name=null;
    if(index<places.length){
        name=places[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByPlaces(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:places){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Place not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}
}

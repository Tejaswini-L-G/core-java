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
}

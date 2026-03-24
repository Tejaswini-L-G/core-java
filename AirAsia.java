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
}

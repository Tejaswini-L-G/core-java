class ElectricalShop {
    private String appliances[] = new String[20];
    int index;

    public boolean addAppliances(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<20){
                appliances[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getAppliances(){
        System.out.println("ElectricalShop Data:");
        for(String item:appliances){if(item!=null)System.out.println(item);}
    }
}

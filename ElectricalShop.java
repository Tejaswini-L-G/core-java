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
	
	public String getAppliancesByIndex(int index){
    String name=null;
    if(index<appliances.length){
        name=appliances[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByAppliances(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:appliances){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Appliance not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}
}

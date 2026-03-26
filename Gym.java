class Gym {
    private String equipments[] = new String[16];
    int index;

    public boolean addEquipments(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<16){
                equipments[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getEquipments(){
        System.out.println("Gym Data:");
        for(String item:equipments){if(item!=null)System.out.println(item);}
    }
	
	public String getEquipmentsByIndex(int index){
    String name=null;
    if(index<equipments.length){
        name=equipments[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByEquipments(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:equipments){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Equipment not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}
}

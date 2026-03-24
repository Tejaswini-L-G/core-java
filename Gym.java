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
}

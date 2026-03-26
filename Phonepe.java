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
}

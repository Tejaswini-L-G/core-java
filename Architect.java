class Architect {
    private String interiorDesignNames[] = new String[11];
    int index;

    public boolean addInteriordesignnames(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<11){
                interiorDesignNames[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getInteriordesignnames(){
        System.out.println("Architect Data:");
        for(String item:interiorDesignNames){if(item!=null)System.out.println(item);}
    }
	
	public String getInteriorDesignNamesByIndex(int index){
    String name=null;
    if(index<interiorDesignNames.length){
        name=interiorDesignNames[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByInteriorDesignNames(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:interiorDesignNames){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Design not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}
}

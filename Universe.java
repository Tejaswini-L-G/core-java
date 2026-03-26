class Universe {
    private String galaxies[] = new String[17];
    int index;

    public boolean addGalaxies(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<17){
                galaxies[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getGalaxies(){
        System.out.println("Universe Data:");
        for(String item:galaxies){if(item!=null)System.out.println(item);}
    }
	
	public String getGalaxiesByIndex(int index){
    String name=null;
    if(index<galaxies.length){
        name=galaxies[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByGalaxies(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:galaxies){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Galaxy not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}
}

class Wonderla {
    private String waterGames[] = new String[22];
    int index;

    public boolean addWatergames(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<22){
                waterGames[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getWatergames(){
        System.out.println("Wonderla Data:");
        for(String item:waterGames){if(item!=null)System.out.println(item);}
    }
	
	public String getWaterGamesByIndex(int index){
    String name=null;
    if(index<waterGames.length){
        name=waterGames[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByWaterGames(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:waterGames){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Game not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}
}

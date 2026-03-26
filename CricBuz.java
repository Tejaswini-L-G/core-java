class CricBuz {
    private String teamNames[] = new String[8];
    int index;

    public boolean addTeamnames(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<teamNames.length){
                teamNames[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getTeamnames(){
        System.out.println("CricBuz Data:");
        for(String item:teamNames){
			if(item!=null) System.out.println(item);
			}
    }
	public String getTeamNamesByIndex(int index){
    String name=null;
    if(index<teamNames.length){
        name=teamNames[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByTeamNames(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:teamNames){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Team not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}
}

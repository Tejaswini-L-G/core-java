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
}

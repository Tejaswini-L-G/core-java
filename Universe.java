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
}

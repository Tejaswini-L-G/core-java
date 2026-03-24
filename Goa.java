class Goa {
    private String beachNames[] = new String[19];
    int index;

    public boolean addBeachnames(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<19){
                beachNames[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getBeachnames(){
        System.out.println("Goa Data:");
        for(String item:beachNames){if(item!=null)System.out.println(item);}
    }
}

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
}

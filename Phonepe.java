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
}

class ECommerce {
    private String productNames[] = new String[26];
    int index;

    public boolean addProductnames(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<26){
                productNames[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getProductnames(){
        System.out.println("ECommerce Data:");
        for(String item:productNames){if(item!=null)System.out.println(item);}
    }
}

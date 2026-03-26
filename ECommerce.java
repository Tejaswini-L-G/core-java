class ECommerce {
    private String productNames[] = new String[26];
    int index;

    public boolean addProductnames(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<productNames.length){
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
	
	public String getProductNamesByIndex(int index){
    String name=null;
    if(index<productNames.length){
        name=productNames[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByProductNames(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:productNames){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Product not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}
}

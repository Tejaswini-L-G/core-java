class Netflix {
    private String webSeries[] = new String[18];
    int index;

    public boolean addWebseries(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<18){
                webSeries[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getWebseries(){
        System.out.println("Netflix Data:");
        for(String item:webSeries){if(item!=null)System.out.println(item);}
    }
	
	public String getWebSeriesByIndex(int index){
    String name=null;
    if(index<webSeries.length){
        name=webSeries[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByWebSeries(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:webSeries){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Web series not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}

public boolean updateWebSeries(String existingName,String updatedName){
    boolean isUpdated=false;

    if(updatedName!=null && !updatedName.isEmpty()){
        for(int index=0; index<webSeries.length; index++){
            if(webSeries[index]==existingName){
                webSeries[index]=updatedName;
                isUpdated=true;
            }
        }
        if(!isUpdated){
            System.out.println(existingName+" is not found");
        }
    }else{
        System.out.println("Provide valid name for update");
    }
    return isUpdated;
}

public boolean deleteWebSeries(String name){
    boolean isDeleted=false;

    if(name!=null && !name.isEmpty()){
        for(int index=0; index<webSeries.length; index++){
            if(webSeries[index]!=null && webSeries[index]==name){
                webSeries[index]=null;
                isDeleted=true;
                break;
            }
        }
        if(!isDeleted){
            System.out.println(name+" is not found");
        }
    }else{
        System.out.println("Provide valid name");
    }
    return isDeleted;
}
}

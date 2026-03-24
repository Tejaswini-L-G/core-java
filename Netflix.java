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
}

class Government {
    private String competitiveExamNames[] = new String[9];
    int index;

    public boolean addCompetitiveexamnames(String value) {
        boolean isAdded=false;
        if(value!=null && !value.isEmpty()){
            if(index<9){
                competitiveExamNames[index]=value;
                index++;
                isAdded=true;
            }else{System.out.println("Array full");}
        }else{System.out.println("Invalid input");}
        return isAdded;
    }

    public void getCompetitiveexamnames(){
        System.out.println("Government Data:");
        for(String item:competitiveExamNames){if(item!=null)System.out.println(item);}
    }
}

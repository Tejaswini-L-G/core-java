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
	
	public String getCompetitiveExamNamesByIndex(int index){
    String name=null;
    if(index<competitiveExamNames.length){
        name=competitiveExamNames[index];
    }else{
        System.out.println("Invalid index value "+index);
    }
    return name;
}

public int getIndexByCompetitiveExamNames(String name){
    int index=0;
    if(name!=null && !name.isEmpty()){
        for(String item:competitiveExamNames){
            if(name.equals(item)){
                return index;
            }
            index++;
        }
        System.out.println("Exam not found");
    }else{
        System.out.println("Provide valid name");
    }
    return 0;
}

public boolean updateCompetitiveExamNames(String existingName,String updatedName){
    boolean isUpdated=false;
    if(updatedName!=null && !updatedName.isEmpty()){
        for(int index=0; index<competitiveExamNames.length; index++){
            if(competitiveExamNames[index]==existingName){
                competitiveExamNames[index]=updatedName;
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

public boolean deleteCompetitiveExamNames(String name){
    boolean isDeleted=false;

    if(name!=null && !name.isEmpty()){
        for(int index=0; index<competitiveExamNames.length; index++){
            if(competitiveExamNames[index]!=null && competitiveExamNames[index]==name){
                competitiveExamNames[index]=null;
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

class Petroleum{

   private String petroleumTypes[] = new String[10];
   int index;

   public boolean addPetroleum(String name){
     boolean isAdded=false;
     if(name!=null && !name.isEmpty()){
         if(index<petroleumTypes.length){
            petroleumTypes[index]=name;
            index++;
            isAdded=true;
         } else {
            System.out.println("The Array is full");
         }
     } else {
         System.out.println("Please provide valid name");
     }
     return isAdded;
   }

   public void getPetroleum(){
       System.out.println("The available Petroleum data are");
       for(String item:petroleumTypes){
           if(item!=null) System.out.println(item);
       }
   }

   public String getPetroleumByIndex(int index){
       String name=null;
       if(index<petroleumTypes.length){
           name=petroleumTypes[index];
       } else {
           System.out.println("Invalid index value "+index);
       }
       return name;
   }

   public int getIndexByPetroleum(String name){
       int index=0;
       if(name!=null && !name.isEmpty()){
           for(String item:petroleumTypes){
               if(name==item){
                   return index;
               }
               index++;
           }
           System.out.println(name+" not found");
       } else {
           System.out.println("Provide valid name");
       }
       return 0;
   }

   public boolean updatePetroleum(String oldName,String newName){
       boolean isUpdated=false;
       if(newName!=null && !newName.isEmpty()){
           for(int i=0;i<petroleumTypes.length;i++){
               if(petroleumTypes[i]==oldName){
                   petroleumTypes[i]=newName;
                   isUpdated=true;
               }
           }
           if(!isUpdated){
               System.out.println(oldName+" is not found");
           }
       } else {
           System.out.println("Provide valid name for update");
       }
       return isUpdated;
   }

   public boolean deletePetroleum(String name){
       boolean isDeleted=false;
       if(name!=null && !name.isEmpty()){
           for(int i=0;i<petroleumTypes.length;i++){
               if(petroleumTypes[i]!=null && petroleumTypes[i]==name){
                   petroleumTypes[i]=null;
                   isDeleted=true;
                   break;
               }
           }
           if(!isDeleted){
               System.out.println(name+" is not found");
           }
       } else {
           System.out.println("Provide valid name");
       }
       return isDeleted;
   }
}

class Steel{

   private String steelTypes[] = new String[10];
   int index;

   public boolean addSteel(String name){
     boolean isAdded=false;
     if(name!=null && !name.isEmpty()){
         if(index<steelTypes.length){
            steelTypes[index]=name;
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

   public void getSteel(){
       System.out.println("The available Steel data are");
       for(String item:steelTypes){
           if(item!=null) System.out.println(item);
       }
   }

   public String getSteelByIndex(int index){
       String name=null;
       if(index<steelTypes.length){
           name=steelTypes[index];
       } else {
           System.out.println("Invalid index value "+index);
       }
       return name;
   }

   public int getIndexBySteel(String name){
       int index=0;
       if(name!=null && !name.isEmpty()){
           for(String item:steelTypes){
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

   public boolean updateSteel(String oldName,String newName){
       boolean isUpdated=false;
       if(newName!=null && !newName.isEmpty()){
           for(int i=0;i<steelTypes.length;i++){
               if(steelTypes[i]==oldName){
                   steelTypes[i]=newName;
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

   public boolean deleteSteel(String name){
       boolean isDeleted=false;
       if(name!=null && !name.isEmpty()){
           for(int i=0;i<steelTypes.length;i++){
               if(steelTypes[i]!=null && steelTypes[i]==name){
                   steelTypes[i]=null;
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

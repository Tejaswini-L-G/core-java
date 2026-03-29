class Bed{

   private String bedTypes[] = new String[10];
   int index;

   public boolean addBed(String name){
     boolean isAdded=false;
     if(name!=null && !name.isEmpty()){
         if(index<bedTypes.length){
            bedTypes[index]=name;
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

   public void getBed(){
       System.out.println("The available Bed data are");
       for(String item:bedTypes){
           if(item!=null) System.out.println(item);
       }
   }

   public String getBedByIndex(int index){
       String name=null;
       if(index<bedTypes.length){
           name=bedTypes[index];
       } else {
           System.out.println("Invalid index value "+index);
       }
       return name;
   }

   public int getIndexByBed(String name){
       int index=0;
       if(name!=null && !name.isEmpty()){
           for(String item:bedTypes){
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

   public boolean updateBed(String oldName,String newName){
       boolean isUpdated=false;
       if(newName!=null && !newName.isEmpty()){
           for(int i=0;i<bedTypes.length;i++){
               if(bedTypes[i]==oldName){
                   bedTypes[i]=newName;
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

   public boolean deleteBed(String name){
       boolean isDeleted=false;
       if(name!=null && !name.isEmpty()){
           for(int i=0;i<bedTypes.length;i++){
               if(bedTypes[i]!=null && bedTypes[i]==name){
                   bedTypes[i]=null;
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

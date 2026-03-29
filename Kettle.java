class Kettle{

   private String kettleTypes[] = new String[10];
   int index;

   public boolean addKettle(String name){
     boolean isAdded=false;
     if(name!=null && !name.isEmpty()){
         if(index<kettleTypes.length){
            kettleTypes[index]=name;
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

   public void getKettle(){
       System.out.println("The available Kettle data are");
       for(String item:kettleTypes){
           if(item!=null) System.out.println(item);
       }
   }

   public String getKettleByIndex(int index){
       String name=null;
       if(index<kettleTypes.length){
           name=kettleTypes[index];
       } else {
           System.out.println("Invalid index value "+index);
       }
       return name;
   }

   public int getIndexByKettle(String name){
       int index=0;
       if(name!=null && !name.isEmpty()){
           for(String item:kettleTypes){
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

   public boolean updateKettle(String oldName,String newName){
       boolean isUpdated=false;
       if(newName!=null && !newName.isEmpty()){
           for(int i=0;i<kettleTypes.length;i++){
               if(kettleTypes[i]==oldName){
                   kettleTypes[i]=newName;
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

   public boolean deleteKettle(String name){
       boolean isDeleted=false;
       if(name!=null && !name.isEmpty()){
           for(int i=0;i<kettleTypes.length;i++){
               if(kettleTypes[i]!=null && kettleTypes[i]==name){
                   kettleTypes[i]=null;
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

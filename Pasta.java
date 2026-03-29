class Pasta{

   private String pastaNames[] = new String[10];
   int index;

   public boolean addPasta(String name){
     boolean isAdded=false;
     if(name!=null && !name.isEmpty()){
         if(index<pastaNames.length){
            pastaNames[index]=name;
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

   public void getPasta(){
       System.out.println("The available Pasta data are");
       for(String item:pastaNames){
           if(item!=null) System.out.println(item);
       }
   }

   public String getPastaByIndex(int index){
       String name=null;
       if(index<pastaNames.length){
           name=pastaNames[index];
       } else {
           System.out.println("Invalid index value "+index);
       }
       return name;
   }

   public int getIndexByPasta(String name){
       int index=0;
       if(name!=null && !name.isEmpty()){
           for(String item:pastaNames){
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

   public boolean updatePasta(String oldName,String newName){
       boolean isUpdated=false;
       if(newName!=null && !newName.isEmpty()){
           for(int i=0;i<pastaNames.length;i++){
               if(pastaNames[i]==oldName){
                   pastaNames[i]=newName;
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

   public boolean deletePasta(String name){
       boolean isDeleted=false;
       if(name!=null && !name.isEmpty()){
           for(int i=0;i<pastaNames.length;i++){
               if(pastaNames[i]!=null && pastaNames[i]==name){
                   pastaNames[i]=null;
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

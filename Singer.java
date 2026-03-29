class Singer{

   private String singerNames[] = new String[10];
   int index;

   public boolean addSinger(String name){
     boolean isAdded=false;
     if(name!=null && !name.isEmpty()){
         if(index<singerNames.length){
            singerNames[index]=name;
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

   public void getSinger(){
       System.out.println("The available Singer data are");
       for(String item:singerNames){
           if(item!=null) System.out.println(item);
       }
   }

   public String getSingerByIndex(int index){
       String name=null;
       if(index<singerNames.length){
           name=singerNames[index];
       } else {
           System.out.println("Invalid index value "+index);
       }
       return name;
   }

   public int getIndexBySinger(String name){
       int index=0;
       if(name!=null && !name.isEmpty()){
           for(String item:singerNames){
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

   public boolean updateSinger(String oldName,String newName){
       boolean isUpdated=false;
       if(newName!=null && !newName.isEmpty()){
           for(int i=0;i<singerNames.length;i++){
               if(singerNames[i]==oldName){
                   singerNames[i]=newName;
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

   public boolean deleteSinger(String name){
       boolean isDeleted=false;
       if(name!=null && !name.isEmpty()){
           for(int i=0;i<singerNames.length;i++){
               if(singerNames[i]!=null && singerNames[i]==name){
                   singerNames[i]=null;
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

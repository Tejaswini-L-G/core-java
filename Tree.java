class Tree{

   private String treeNames[] = new String[10];
   int index;

   public boolean addTree(String name){
     boolean isAdded=false;
     if(name!=null && !name.isEmpty()){
         if(index<treeNames.length){
            treeNames[index]=name;
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

   public void getTree(){
       System.out.println("The available Tree data are");
       for(String item:treeNames){
           if(item!=null) System.out.println(item);
       }
   }

   public String getTreeByIndex(int index){
       String name=null;
       if(index<treeNames.length){
           name=treeNames[index];
       } else {
           System.out.println("Invalid index value "+index);
       }
       return name;
   }

   public int getIndexByTree(String name){
       int index=0;
       if(name!=null && !name.isEmpty()){
           for(String item:treeNames){
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

   public boolean updateTree(String oldName,String newName){
       boolean isUpdated=false;
       if(newName!=null && !newName.isEmpty()){
           for(int i=0;i<treeNames.length;i++){
               if(treeNames[i]==oldName){
                   treeNames[i]=newName;
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

   public boolean deleteTree(String name){
       boolean isDeleted=false;
       if(name!=null && !name.isEmpty()){
           for(int i=0;i<treeNames.length;i++){
               if(treeNames[i]!=null && treeNames[i]==name){
                   treeNames[i]=null;
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

class Cylinder{

   private String cylinderNames[] = new String[10];
   int index;

   public boolean addCylinder(String name){
     boolean isAdded=false;
     if(name!=null && !name.isEmpty()){
         if(index<cylinderNames.length){
            cylinderNames[index]=name;
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

   public void getCylinder(){
       System.out.println("The available Cylinder data are");
       for(String item:cylinderNames){
           if(item!=null) System.out.println(item);
       }
   }

   public String getCylinderByIndex(int index){
       String name=null;
       if(index<cylinderNames.length){
           name=cylinderNames[index];
       } else {
           System.out.println("Invalid index value "+index);
       }
       return name;
   }

   public int getIndexByCylinder(String name){
       int index=0;
       if(name!=null && !name.isEmpty()){
           for(String item:cylinderNames){
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

   public boolean updateCylinder(String oldName,String newName){
       boolean isUpdated=false;
       if(newName!=null && !newName.isEmpty()){
           for(int i=0;i<cylinderNames.length;i++){
               if(cylinderNames[i]==oldName){
                   cylinderNames[i]=newName;
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

   public boolean deleteCylinder(String name){
       boolean isDeleted=false;
       if(name!=null && !name.isEmpty()){
           for(int i=0;i<cylinderNames.length;i++){
               if(cylinderNames[i]!=null && cylinderNames[i]==name){
                   cylinderNames[i]=null;
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

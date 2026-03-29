class Turbine{

   private String turbineTypes[] = new String[10];
   int index;

   public boolean addTurbine(String name){
     boolean isAdded=false;
     if(name!=null && !name.isEmpty()){
         if(index<turbineTypes.length){
            turbineTypes[index]=name;
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

   public void getTurbine(){
       System.out.println("The available Turbine data are");
       for(String item:turbineTypes){
           if(item!=null) System.out.println(item);
       }
   }

   public String getTurbineByIndex(int index){
       String name=null;
       if(index<turbineTypes.length){
           name=turbineTypes[index];
       } else {
           System.out.println("Invalid index value "+index);
       }
       return name;
   }

   public int getIndexByTurbine(String name){
       int index=0;
       if(name!=null && !name.isEmpty()){
           for(String item:turbineTypes){
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

   public boolean updateTurbine(String oldName,String newName){
       boolean isUpdated=false;
       if(newName!=null && !newName.isEmpty()){
           for(int i=0;i<turbineTypes.length;i++){
               if(turbineTypes[i]==oldName){
                   turbineTypes[i]=newName;
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

   public boolean deleteTurbine(String name){
       boolean isDeleted=false;
       if(name!=null && !name.isEmpty()){
           for(int i=0;i<turbineTypes.length;i++){
               if(turbineTypes[i]!=null && turbineTypes[i]==name){
                   turbineTypes[i]=null;
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

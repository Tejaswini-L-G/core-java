class Radio{
   static boolean isConnected;
   
   static boolean onOrOff(){
      if(isConnected==false){
	     isConnected=true;
		 System.out.println("The radio is on");
		 
	  }
	  else if(isConnected==true){
	     isConnected=false;
		 System.out.println("The radio is off");
		 
	  }
	  return isConnected;
   
   
   }


}
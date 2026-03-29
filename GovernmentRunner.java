class GovernmentRunner{
 public static void main(String[] args){
  Government manager=new Government();
  manager.addCompetitiveexamnames("UPSC");
  manager.addCompetitiveexamnames("SSC");
  manager.addCompetitiveexamnames("IBPS");
  manager.addCompetitiveexamnames("RRB");
  manager.addCompetitiveexamnames("NEET");
  manager.addCompetitiveexamnames("JEE");
  manager.addCompetitiveexamnames("GATE");
  manager.addCompetitiveexamnames("CAT");
  manager.addCompetitiveexamnames("NDA");
  manager.getCompetitiveexamnames();
  
  int index=0;
System.out.println("The exam at position "+index+" is "+ government.getCompetitiveExamNamesByIndex(index));

String name="UPSC";
int result = government.getIndexByCompetitiveExamNames(name);

if(result != 0 ){
    System.out.println("The Position of " + name + " is " + result);
}

System.out.println("--------------------------");
boolean isUpdated = government.updateCompetitiveExamNames("UPSC","UPSC Civil Services");
System.out.println("The updation is " + isUpdated);
government.getCompetitiveExamNames();

System.out.println("--------------------------");
boolean isDeleted = government.deleteCompetitiveExamNames("UPSC");
System.out.println("The deletion is " + isDeleted);
government.getCompetitiveExamNames();
 }
}

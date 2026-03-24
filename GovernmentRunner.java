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
 }
}

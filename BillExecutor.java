class BillExecutor{

   public static void main(String[] args){
   
   Bill firstBill=new Bill();
    firstBill.billId=1;
    firstBill.billAmount=234.9;
    firstBill.isFinalBill=true;
    firstBill.isLatestBill=true;
    firstBill.billInvoiceNo="Art123";
    firstBill.billDueDate="2-3-26";
    firstBill.billIssueDate="3-4-26";
    firstBill.isBillOverDue=false;
    System.out.println("The bill id is "+firstbill.billId);
	System.out.println("The bill amount is "+firstbill.billAmount);
	System.out.println("The bill due date is "+firstbill.billDueDate);
	System.out.println("The bill issue date is "+firstbill.billIssueDate);
	System.out.println("The bill  is latest "+firstbill.isLatestBill);
	System.out.println("The bill  is final "+firstbill.isFinalBill);
	System.out.println("The bill  is over due date "+firstbill.isBillOverDue);
	
   
   }
}
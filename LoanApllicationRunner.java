public class LoanApplicationRunner {

    public static void main(String[] args) {

        LoanApplication homeLoanTejaswini = new LoanApplication();
        homeLoanTejaswini.setApplicationId(1);
        homeLoanTejaswini.setApplicantName("Tejaswini");
        homeLoanTejaswini.setLoanAmount(2500000);
        homeLoanTejaswini.setLoanType("Home Loan");
        homeLoanTejaswini.setBankName("SBI");
        homeLoanTejaswini.setStatus("Approved");
        homeLoanTejaswini.setAppliedDate("01-01-2026");

        LoanApplication carLoanRahul = new LoanApplication();
        carLoanRahul.setApplicationId(2);
        carLoanRahul.setApplicantName("Rahul");
        carLoanRahul.setLoanAmount(800000);
        carLoanRahul.setLoanType("Car Loan");
        carLoanRahul.setBankName("HDFC");
        carLoanRahul.setStatus("Pending");
        carLoanRahul.setAppliedDate("02-01-2026");

        LoanApplication educationLoanAnanya = new LoanApplication();
        educationLoanAnanya.setApplicationId(3);
        educationLoanAnanya.setApplicantName("Ananya");
        educationLoanAnanya.setLoanAmount(1200000);
        educationLoanAnanya.setLoanType("Education Loan");
        educationLoanAnanya.setBankName("ICICI");
        educationLoanAnanya.setStatus("Approved");
        educationLoanAnanya.setAppliedDate("03-01-2026");

        LoanApplication personalLoanKiran = new LoanApplication();
        personalLoanKiran.setApplicationId(4);
        personalLoanKiran.setApplicantName("Kiran");
        personalLoanKiran.setLoanAmount(300000);
        personalLoanKiran.setLoanType("Personal Loan");
        personalLoanKiran.setBankName("Axis");
        personalLoanKiran.setStatus("Rejected");
        personalLoanKiran.setAppliedDate("04-01-2026");

        LoanApplication goldLoanPriya = new LoanApplication();
        goldLoanPriya.setApplicationId(5);
        goldLoanPriya.setApplicantName("Priya");
        goldLoanPriya.setLoanAmount(200000);
        goldLoanPriya.setLoanType("Gold Loan");
        goldLoanPriya.setBankName("Canara");
        goldLoanPriya.setStatus("Approved");
        goldLoanPriya.setAppliedDate("05-01-2026");

        LoanApplication businessLoanArjun = new LoanApplication();
        businessLoanArjun.setApplicationId(6);
        businessLoanArjun.setApplicantName("Arjun");
        businessLoanArjun.setLoanAmount(5000000);
        businessLoanArjun.setLoanType("Business Loan");
        businessLoanArjun.setBankName("SBI");
        businessLoanArjun.setStatus("Pending");
        businessLoanArjun.setAppliedDate("06-01-2026");

        LoanApplication homeLoanSneha = new LoanApplication();
        homeLoanSneha.setApplicationId(7);
        homeLoanSneha.setApplicantName("Sneha");
        homeLoanSneha.setLoanAmount(3000000);
        homeLoanSneha.setLoanType("Home Loan");
        homeLoanSneha.setBankName("HDFC");
        homeLoanSneha.setStatus("Approved");
        homeLoanSneha.setAppliedDate("07-01-2026");

        LoanApplication carLoanVikram = new LoanApplication();
        carLoanVikram.setApplicationId(8);
        carLoanVikram.setApplicantName("Vikram");
        carLoanVikram.setLoanAmount(900000);
        carLoanVikram.setLoanType("Car Loan");
        carLoanVikram.setBankName("ICICI");
        carLoanVikram.setStatus("Approved");
        carLoanVikram.setAppliedDate("08-01-2026");

        LoanApplication personalLoanDivya = new LoanApplication();
        personalLoanDivya.setApplicationId(9);
        personalLoanDivya.setApplicantName("Divya");
        personalLoanDivya.setLoanAmount(250000);
        personalLoanDivya.setLoanType("Personal Loan");
        personalLoanDivya.setBankName("Axis");
        personalLoanDivya.setStatus("Pending");
        personalLoanDivya.setAppliedDate("09-01-2026");

        LoanApplication educationLoanManoj = new LoanApplication();
        educationLoanManoj.setApplicationId(10);
        educationLoanManoj.setApplicantName("Manoj");
        educationLoanManoj.setLoanAmount(1000000);
        educationLoanManoj.setLoanType("Education Loan");
        educationLoanManoj.setBankName("SBI");
        educationLoanManoj.setStatus("Approved");
        educationLoanManoj.setAppliedDate("10-01-2026");

        LoanApplication personalLoanRohit = new LoanApplication();
        personalLoanRohit.setApplicationId(11);
        personalLoanRohit.setApplicantName("Rohit");
        personalLoanRohit.setLoanAmount(400000);
        personalLoanRohit.setLoanType("Personal Loan");
        personalLoanRohit.setBankName("HDFC");
        personalLoanRohit.setStatus("Approved");
        personalLoanRohit.setAppliedDate("11-01-2026");

        LoanApplication carLoanPooja = new LoanApplication();
        carLoanPooja.setApplicationId(12);
        carLoanPooja.setApplicantName("Pooja");
        carLoanPooja.setLoanAmount(600000);
        carLoanPooja.setLoanType("Car Loan");
        carLoanPooja.setBankName("ICICI");
        carLoanPooja.setStatus("Pending");
        carLoanPooja.setAppliedDate("12-01-2026");

        LoanApplication businessLoanRamesh = new LoanApplication();
        businessLoanRamesh.setApplicationId(13);
        businessLoanRamesh.setApplicantName("Ramesh");
        businessLoanRamesh.setLoanAmount(700000);
        businessLoanRamesh.setLoanType("Business Loan");
        businessLoanRamesh.setBankName("SBI");
        businessLoanRamesh.setStatus("Approved");
        businessLoanRamesh.setAppliedDate("13-01-2026");

        LoanApplication goldLoanLakshmi = new LoanApplication();
        goldLoanLakshmi.setApplicationId(14);
        goldLoanLakshmi.setApplicantName("Lakshmi");
        goldLoanLakshmi.setLoanAmount(350000);
        goldLoanLakshmi.setLoanType("Gold Loan");
        goldLoanLakshmi.setBankName("Canara");
        goldLoanLakshmi.setStatus("Approved");
        goldLoanLakshmi.setAppliedDate("14-01-2026");

        LoanApplication homeLoanSuresh = new LoanApplication();
        homeLoanSuresh.setApplicationId(15);
        homeLoanSuresh.setApplicantName("Suresh");
        homeLoanSuresh.setLoanAmount(2000000);
        homeLoanSuresh.setLoanType("Home Loan");
        homeLoanSuresh.setBankName("Axis");
        homeLoanSuresh.setStatus("Rejected");
        homeLoanSuresh.setAppliedDate("15-01-2026");

        LoanApplication personalLoanMeena = new LoanApplication();
        personalLoanMeena.setApplicationId(16);
        personalLoanMeena.setApplicantName("Meena");
        personalLoanMeena.setLoanAmount(300000);
        personalLoanMeena.setLoanType("Personal Loan");
        personalLoanMeena.setBankName("SBI");
        personalLoanMeena.setStatus("Approved");
        personalLoanMeena.setAppliedDate("16-01-2026");

        LoanApplication carLoanAjay = new LoanApplication();
        carLoanAjay.setApplicationId(17);
        carLoanAjay.setApplicantName("Ajay");
        carLoanAjay.setLoanAmount(850000);
        carLoanAjay.setLoanType("Car Loan");
        carLoanAjay.setBankName("HDFC");
        carLoanAjay.setStatus("Approved");
        carLoanAjay.setAppliedDate("17-01-2026");

        LoanApplication educationLoanNisha = new LoanApplication();
        educationLoanNisha.setApplicationId(18);
        educationLoanNisha.setApplicantName("Nisha");
        educationLoanNisha.setLoanAmount(900000);
        educationLoanNisha.setLoanType("Education Loan");
        educationLoanNisha.setBankName("ICICI");
        educationLoanNisha.setStatus("Pending");
        educationLoanNisha.setAppliedDate("18-01-2026");

        LoanApplication businessLoanDeepak = new LoanApplication();
        businessLoanDeepak.setApplicationId(19);
        businessLoanDeepak.setApplicantName("Deepak");
        businessLoanDeepak.setLoanAmount(1500000);
        businessLoanDeepak.setLoanType("Business Loan");
        businessLoanDeepak.setBankName("Axis");
        businessLoanDeepak.setStatus("Approved");
        businessLoanDeepak.setAppliedDate("19-01-2026");

        LoanApplication goldLoanKavya = new LoanApplication();
        goldLoanKavya.setApplicationId(20);
        goldLoanKavya.setApplicantName("Kavya");
        goldLoanKavya.setLoanAmount(180000);
        goldLoanKavya.setLoanType("Gold Loan");
        goldLoanKavya.setBankName("Canara");
        goldLoanKavya.setStatus("Approved");
        goldLoanKavya.setAppliedDate("20-01-2026");

        LoanApplication personalLoanHarish = new LoanApplication();
        personalLoanHarish.setApplicationId(21);
        personalLoanHarish.setApplicantName("Harish");
        personalLoanHarish.setLoanAmount(270000);
        personalLoanHarish.setLoanType("Personal Loan");
        personalLoanHarish.setBankName("SBI");
        personalLoanHarish.setStatus("Rejected");
        personalLoanHarish.setAppliedDate("21-01-2026");

        LoanApplication carLoanSwathi = new LoanApplication();
        carLoanSwathi.setApplicationId(22);
        carLoanSwathi.setApplicantName("Swathi");
        carLoanSwathi.setLoanAmount(750000);
        carLoanSwathi.setLoanType("Car Loan");
        carLoanSwathi.setBankName("HDFC");
        carLoanSwathi.setStatus("Approved");
        carLoanSwathi.setAppliedDate("22-01-2026");

        LoanApplication homeLoanVenu = new LoanApplication();
        homeLoanVenu.setApplicationId(23);
        homeLoanVenu.setApplicantName("Venu");
        homeLoanVenu.setLoanAmount(2200000);
        homeLoanVenu.setLoanType("Home Loan");
        homeLoanVenu.setBankName("ICICI");
        homeLoanVenu.setStatus("Approved");
        homeLoanVenu.setAppliedDate("23-01-2026");

        LoanApplication personalLoanAnil = new LoanApplication();
        personalLoanAnil.setApplicationId(24);
        personalLoanAnil.setApplicantName("Anil");
        personalLoanAnil.setLoanAmount(260000);
        personalLoanAnil.setLoanType("Personal Loan");
        personalLoanAnil.setBankName("Axis");
        personalLoanAnil.setStatus("Pending");
        personalLoanAnil.setAppliedDate("24-01-2026");

        LoanApplication goldLoanGeetha = new LoanApplication();
        goldLoanGeetha.setApplicationId(25);
        goldLoanGeetha.setApplicantName("Geetha");
        goldLoanGeetha.setLoanAmount(210000);
        goldLoanGeetha.setLoanType("Gold Loan");
        goldLoanGeetha.setBankName("Canara");
        goldLoanGeetha.setStatus("Approved");
        goldLoanGeetha.setAppliedDate("25-01-2026");

        LoanApplication businessLoanRavi = new LoanApplication();
        businessLoanRavi.setApplicationId(26);
        businessLoanRavi.setApplicantName("Ravi");
        businessLoanRavi.setLoanAmount(1800000);
        businessLoanRavi.setLoanType("Business Loan");
        businessLoanRavi.setBankName("SBI");
        businessLoanRavi.setStatus("Approved");
        businessLoanRavi.setAppliedDate("26-01-2026");

        LoanApplication homeLoanBhavana = new LoanApplication();
        homeLoanBhavana.setApplicationId(27);
        homeLoanBhavana.setApplicantName("Bhavana");
        homeLoanBhavana.setLoanAmount(2400000);
        homeLoanBhavana.setLoanType("Home Loan");
        homeLoanBhavana.setBankName("HDFC");
        homeLoanBhavana.setStatus("Pending");
        homeLoanBhavana.setAppliedDate("27-01-2026");

        LoanApplication carLoanKarthik = new LoanApplication();
        carLoanKarthik.setApplicationId(28);
        carLoanKarthik.setApplicantName("Karthik");
        carLoanKarthik.setLoanAmount(950000);
        carLoanKarthik.setLoanType("Car Loan");
        carLoanKarthik.setBankName("ICICI");
        carLoanKarthik.setStatus("Approved");
        carLoanKarthik.setAppliedDate("28-01-2026");

        LoanApplication educationLoanShreya = new LoanApplication();
        educationLoanShreya.setApplicationId(29);
        educationLoanShreya.setApplicantName("Shreya");
        educationLoanShreya.setLoanAmount(1100000);
        educationLoanShreya.setLoanType("Education Loan");
        educationLoanShreya.setBankName("Axis");
        educationLoanShreya.setStatus("Approved");
        educationLoanShreya.setAppliedDate("29-01-2026");


        System.out.println("------ LOAN DETAILS ------");

System.out.println(homeLoanTejaswini.getApplicationId()+" | "+homeLoanTejaswini.getApplicantName()+" | "+homeLoanTejaswini.getLoanAmount()+" | "+homeLoanTejaswini.getLoanType()+" | "+homeLoanTejaswini.getBankName()+" | "+homeLoanTejaswini.getStatus()+" | "+homeLoanTejaswini.getAppliedDate());

System.out.println(carLoanRahul.getApplicationId()+" | "+carLoanRahul.getApplicantName()+" | "+carLoanRahul.getLoanAmount()+" | "+carLoanRahul.getLoanType()+" | "+carLoanRahul.getBankName()+" | "+carLoanRahul.getStatus()+" | "+carLoanRahul.getAppliedDate());

System.out.println(educationLoanAnanya.getApplicationId()+" | "+educationLoanAnanya.getApplicantName()+" | "+educationLoanAnanya.getLoanAmount()+" | "+educationLoanAnanya.getLoanType()+" | "+educationLoanAnanya.getBankName()+" | "+educationLoanAnanya.getStatus()+" | "+educationLoanAnanya.getAppliedDate());

System.out.println(personalLoanKiran.getApplicationId()+" | "+personalLoanKiran.getApplicantName()+" | "+personalLoanKiran.getLoanAmount()+" | "+personalLoanKiran.getLoanType()+" | "+personalLoanKiran.getBankName()+" | "+personalLoanKiran.getStatus()+" | "+personalLoanKiran.getAppliedDate());

System.out.println(goldLoanPriya.getApplicationId()+" | "+goldLoanPriya.getApplicantName()+" | "+goldLoanPriya.getLoanAmount()+" | "+goldLoanPriya.getLoanType()+" | "+goldLoanPriya.getBankName()+" | "+goldLoanPriya.getStatus()+" | "+goldLoanPriya.getAppliedDate());

System.out.println(businessLoanArjun.getApplicationId()+" | "+businessLoanArjun.getApplicantName()+" | "+businessLoanArjun.getLoanAmount()+" | "+businessLoanArjun.getLoanType()+" | "+businessLoanArjun.getBankName()+" | "+businessLoanArjun.getStatus()+" | "+businessLoanArjun.getAppliedDate());

System.out.println(homeLoanSneha.getApplicationId()+" | "+homeLoanSneha.getApplicantName()+" | "+homeLoanSneha.getLoanAmount()+" | "+homeLoanSneha.getLoanType()+" | "+homeLoanSneha.getBankName()+" | "+homeLoanSneha.getStatus()+" | "+homeLoanSneha.getAppliedDate());

System.out.println(carLoanVikram.getApplicationId()+" | "+carLoanVikram.getApplicantName()+" | "+carLoanVikram.getLoanAmount()+" | "+carLoanVikram.getLoanType()+" | "+carLoanVikram.getBankName()+" | "+carLoanVikram.getStatus()+" | "+carLoanVikram.getAppliedDate());

System.out.println(personalLoanDivya.getApplicationId()+" | "+personalLoanDivya.getApplicantName()+" | "+personalLoanDivya.getLoanAmount()+" | "+personalLoanDivya.getLoanType()+" | "+personalLoanDivya.getBankName()+" | "+personalLoanDivya.getStatus()+" | "+personalLoanDivya.getAppliedDate());

System.out.println(educationLoanManoj.getApplicationId()+" | "+educationLoanManoj.getApplicantName()+" | "+educationLoanManoj.getLoanAmount()+" | "+educationLoanManoj.getLoanType()+" | "+educationLoanManoj.getBankName()+" | "+educationLoanManoj.getStatus()+" | "+educationLoanManoj.getAppliedDate());

System.out.println(personalLoanRohit.getApplicationId()+" | "+personalLoanRohit.getApplicantName()+" | "+personalLoanRohit.getLoanAmount()+" | "+personalLoanRohit.getLoanType()+" | "+personalLoanRohit.getBankName()+" | "+personalLoanRohit.getStatus()+" | "+personalLoanRohit.getAppliedDate());

System.out.println(carLoanPooja.getApplicationId()+" | "+carLoanPooja.getApplicantName()+" | "+carLoanPooja.getLoanAmount()+" | "+carLoanPooja.getLoanType()+" | "+carLoanPooja.getBankName()+" | "+carLoanPooja.getStatus()+" | "+carLoanPooja.getAppliedDate());

System.out.println(businessLoanRamesh.getApplicationId()+" | "+businessLoanRamesh.getApplicantName()+" | "+businessLoanRamesh.getLoanAmount()+" | "+businessLoanRamesh.getLoanType()+" | "+businessLoanRamesh.getBankName()+" | "+businessLoanRamesh.getStatus()+" | "+businessLoanRamesh.getAppliedDate());

System.out.println(goldLoanLakshmi.getApplicationId()+" | "+goldLoanLakshmi.getApplicantName()+" | "+goldLoanLakshmi.getLoanAmount()+" | "+goldLoanLakshmi.getLoanType()+" | "+goldLoanLakshmi.getBankName()+" | "+goldLoanLakshmi.getStatus()+" | "+goldLoanLakshmi.getAppliedDate());

System.out.println(homeLoanSuresh.getApplicationId()+" | "+homeLoanSuresh.getApplicantName()+" | "+homeLoanSuresh.getLoanAmount()+" | "+homeLoanSuresh.getLoanType()+" | "+homeLoanSuresh.getBankName()+" | "+homeLoanSuresh.getStatus()+" | "+homeLoanSuresh.getAppliedDate());

System.out.println(personalLoanMeena.getApplicationId()+" | "+personalLoanMeena.getApplicantName()+" | "+personalLoanMeena.getLoanAmount()+" | "+personalLoanMeena.getLoanType()+" | "+personalLoanMeena.getBankName()+" | "+personalLoanMeena.getStatus()+" | "+personalLoanMeena.getAppliedDate());

System.out.println(carLoanAjay.getApplicationId()+" | "+carLoanAjay.getApplicantName()+" | "+carLoanAjay.getLoanAmount()+" | "+carLoanAjay.getLoanType()+" | "+carLoanAjay.getBankName()+" | "+carLoanAjay.getStatus()+" | "+carLoanAjay.getAppliedDate());

System.out.println(educationLoanNisha.getApplicationId()+" | "+educationLoanNisha.getApplicantName()+" | "+educationLoanNisha.getLoanAmount()+" | "+educationLoanNisha.getLoanType()+" | "+educationLoanNisha.getBankName()+" | "+educationLoanNisha.getStatus()+" | "+educationLoanNisha.getAppliedDate());

System.out.println(businessLoanDeepak.getApplicationId()+" | "+businessLoanDeepak.getApplicantName()+" | "+businessLoanDeepak.getLoanAmount()+" | "+businessLoanDeepak.getLoanType()+" | "+businessLoanDeepak.getBankName()+" | "+businessLoanDeepak.getStatus()+" | "+businessLoanDeepak.getAppliedDate());

System.out.println(goldLoanKavya.getApplicationId()+" | "+goldLoanKavya.getApplicantName()+" | "+goldLoanKavya.getLoanAmount()+" | "+goldLoanKavya.getLoanType()+" | "+goldLoanKavya.getBankName()+" | "+goldLoanKavya.getStatus()+" | "+goldLoanKavya.getAppliedDate());

System.out.println(personalLoanHarish.getApplicationId()+" | "+personalLoanHarish.getApplicantName()+" | "+personalLoanHarish.getLoanAmount()+" | "+personalLoanHarish.getLoanType()+" | "+personalLoanHarish.getBankName()+" | "+personalLoanHarish.getStatus()+" | "+personalLoanHarish.getAppliedDate());

System.out.println(carLoanSwathi.getApplicationId()+" | "+carLoanSwathi.getApplicantName()+" | "+carLoanSwathi.getLoanAmount()+" | "+carLoanSwathi.getLoanType()+" | "+carLoanSwathi.getBankName()+" | "+carLoanSwathi.getStatus()+" | "+carLoanSwathi.getAppliedDate());

System.out.println(homeLoanVenu.getApplicationId()+" | "+homeLoanVenu.getApplicantName()+" | "+homeLoanVenu.getLoanAmount()+" | "+homeLoanVenu.getLoanType()+" | "+homeLoanVenu.getBankName()+" | "+homeLoanVenu.getStatus()+" | "+homeLoanVenu.getAppliedDate());

System.out.println(personalLoanAnil.getApplicationId()+" | "+personalLoanAnil.getApplicantName()+" | "+personalLoanAnil.getLoanAmount()+" | "+personalLoanAnil.getLoanType()+" | "+personalLoanAnil.getBankName()+" | "+personalLoanAnil.getStatus()+" | "+personalLoanAnil.getAppliedDate());

System.out.println(goldLoanGeetha.getApplicationId()+" | "+goldLoanGeetha.getApplicantName()+" | "+goldLoanGeetha.getLoanAmount()+" | "+goldLoanGeetha.getLoanType()+" | "+goldLoanGeetha.getBankName()+" | "+goldLoanGeetha.getStatus()+" | "+goldLoanGeetha.getAppliedDate());

System.out.println(businessLoanRavi.getApplicationId()+" | "+businessLoanRavi.getApplicantName()+" | "+businessLoanRavi.getLoanAmount()+" | "+businessLoanRavi.getLoanType()+" | "+businessLoanRavi.getBankName()+" | "+businessLoanRavi.getStatus()+" | "+businessLoanRavi.getAppliedDate());

System.out.println(homeLoanBhavana.getApplicationId()+" | "+homeLoanBhavana.getApplicantName()+" | "+homeLoanBhavana.getLoanAmount()+" | "+homeLoanBhavana.getLoanType()+" | "+homeLoanBhavana.getBankName()+" | "+homeLoanBhavana.getStatus()+" | "+homeLoanBhavana.getAppliedDate());

System.out.println(carLoanKarthik.getApplicationId()+" | "+carLoanKarthik.getApplicantName()+" | "+carLoanKarthik.getLoanAmount()+" | "+carLoanKarthik.getLoanType()+" | "+carLoanKarthik.getBankName()+" | "+carLoanKarthik.getStatus()+" | "+carLoanKarthik.getAppliedDate());

System.out.println(educationLoanShreya.getApplicationId()+" | "+educationLoanShreya.getApplicantName()+" | "+educationLoanShreya.getLoanAmount()+" | "+educationLoanShreya.getLoanType()+" | "+educationLoanShreya.getBankName()+" | "+educationLoanShreya.getStatus()+" | "+educationLoanShreya.getAppliedDate());
    }
}